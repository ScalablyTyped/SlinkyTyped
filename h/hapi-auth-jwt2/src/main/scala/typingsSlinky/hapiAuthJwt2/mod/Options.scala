package typingsSlinky.hapiAuthJwt2.mod

import typingsSlinky.hapiHapi.mod.Request
import typingsSlinky.hapiHapi.mod.ResponseObject
import typingsSlinky.hapiHapi.mod.ResponseToolkit
import typingsSlinky.jsonwebtoken.mod.VerifyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options passed to `hapi.auth.strategy` when this plugin is used
  */
@js.native
trait Options extends js.Object {
  /**
    * Set to `true` to allow the `payloadFunc` to attempt to extract the token from
    * POST bodies
    * @default false
    */
  var attemptToExtractTokenInPayload: js.UndefOr[Boolean] = js.native
  /**
    * Set to `true` to receive the complete token (`decoded.header`,
    * `decoded.payload` and `decoded.signature`) as decoded argument to key
    * lookup and `verifyFunc` callbacks (*not `validateFunc`*)
    * @default false
    */
  var complete: js.UndefOr[Boolean] = js.native
  /**
    * If you prefer to set your own cookie key or your project has a cookie
    * called 'token' for another purpose, you can set a custom key for your
    * cookie by setting `options.cookieKey='yourkeyhere'`. To disable cookies
    * set cookieKey to `false` or ''.
    * @default 'token'
    */
  var cookieKey: js.UndefOr[String | Boolean] = js.native
  /**
    * Custom token extraction function used to allow consumers to pull tokens from
    * sources not foreseen by the module, for example... YAR
    * @default false
    */
  var customExtractionFunc: js.UndefOr[js.Function1[/* request */ Request, String]] = js.native
  /**
    *
    * @param ctx called when an error has been raised.
    * It provides an extension point to allow the host the ability to customise the error messages returned.
    */
  var errorFunc: js.UndefOr[js.Function1[/* ctx */ ErrorContext, ErrorContext]] = js.native
  /**
    * If you want to set a custom key for your header token use the
    * `headerKey` option. To disable header token set headerKey to `false` or
    * ''.
    * @default 'authorization'
    */
  var headerKey: js.UndefOr[String | Boolean] = js.native
  /**
    * The secret key used to check the signature of the token *or* a *key lookup function*
    */
  var key: js.UndefOr[
    String | js.Array[String] | (js.Function1[/* decodedToken */ js.Any, js.Promise[typingsSlinky.hapiAuthJwt2.anon.ExtraInfo]])
  ] = js.native
  /**
    * If you want to set a custom key for your payload token use the
    * `payloadKey` option. To disable payload token set payloadKey to `false` or
    * ''.
    * @default 'token'
    */
  var payloadKey: js.UndefOr[String | Boolean] = js.native
  /**
    * function called to decorate the response with authentication headers
    * before the response headers or payload is written
    *
    * @param request the Request object
    * @param reply is called if an error occurred
    */
  var responseFunc: js.UndefOr[
    js.Function2[
      /* request */ Request, 
      /* reply */ js.Function2[/* err */ js.Any, /* response */ ResponseObject, Unit], 
      Unit
    ]
  ] = js.native
  /**
    * Allow custom token type, e.g. `Authorization: <tokenType> 12345678`
    */
  var tokenType: js.UndefOr[String] = js.native
  /**
    * If you prefer to pass your token via url, simply add a token url
    * parameter to your request or use a custom parameter by setting `urlKey.
    * To disable the url parameter set urlKey to `false` or ''.
    * @default 'token'
    */
  var urlKey: js.UndefOr[String | Boolean] = js.native
  /**
    * Settings to define how tokens are verified by the jsonwebtoken library
    */
  var verifyOptions: js.UndefOr[VerifyOptions] = js.native
  /**
    * The function which is run once the Token has been decoded
    *
    * @param decoded the *decoded* and *verified* JWT received from the client in *request.headers.authorization*
    * @param request the original *request* received from the client
    */
  def validate(decoded: js.Object, request: Request, tk: ResponseToolkit): ValidationResult | js.Promise[ValidationResult] = js.native
}

object Options {
  @scala.inline
  def apply(validate: (js.Object, Request, ResponseToolkit) => ValidationResult | js.Promise[ValidationResult]): Options = {
    val __obj = js.Dynamic.literal(validate = js.Any.fromFunction3(validate))
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValidate(value: (js.Object, Request, ResponseToolkit) => ValidationResult | js.Promise[ValidationResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAttemptToExtractTokenInPayload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attemptToExtractTokenInPayload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttemptToExtractTokenInPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attemptToExtractTokenInPayload")(js.undefined)
        ret
    }
    @scala.inline
    def withComplete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withCookieKey(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookieKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieKey")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomExtractionFunc(value: /* request */ Request => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customExtractionFunc")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomExtractionFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customExtractionFunc")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorFunc(value: /* ctx */ ErrorContext => ErrorContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorFunc")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutErrorFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorFunc")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderKey(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerKey")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyFunction1(value: /* decodedToken */ js.Any => js.Promise[typingsSlinky.hapiAuthJwt2.anon.ExtraInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKey(
      value: String | js.Array[String] | (js.Function1[/* decodedToken */ js.Any, js.Promise[typingsSlinky.hapiAuthJwt2.anon.ExtraInfo]])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withPayloadKey(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloadKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayloadKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloadKey")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseFunc(
      value: (/* request */ Request, /* reply */ js.Function2[/* err */ js.Any, /* response */ ResponseObject, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseFunc")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutResponseFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseFunc")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenType")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlKey(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlKey")(js.undefined)
        ret
    }
    @scala.inline
    def withVerifyOptions(value: VerifyOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerifyOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyOptions")(js.undefined)
        ret
    }
  }
  
}

