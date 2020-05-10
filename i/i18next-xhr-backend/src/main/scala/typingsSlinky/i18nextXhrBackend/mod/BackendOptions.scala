package typingsSlinky.i18nextXhrBackend.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackendOptions extends js.Object {
  /**
    * path to post missing resources
    */
  var addPath: js.UndefOr[String] = js.native
  /**
    * define a custom xhr function
    * can be used to support XDomainRequest in IE 8 and 9
    */
  var ajax: js.UndefOr[
    js.Function5[
      /* url */ String, 
      /* options */ this.type, 
      /* callback */ AjaxRequestCallback, 
      /* data */ js.Object | String, 
      /* cache */ Boolean, 
      Unit
    ]
  ] = js.native
  /**
    * your backend server supports multiLoading
    * locales/resources.json?lng=de+en&ns=ns1+ns2
    * set loadPath: '/locales/resources.json?lng={{lng}}&ns={{ns}}' to adapt to multiLoading
    */
  var allowMultiLoading: js.UndefOr[Boolean] = js.native
  /**
    * allow cross domain requests
    */
  var crossDomain: js.UndefOr[Boolean] = js.native
  /**
    * @see https://github.com/i18next/i18next-xhr-backend/blob/281c7e235e1157b33122adacef1957252e5700f1/src/ajax.js#L52
    */
  var customHeaders: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * path where resources get loaded from, or a function
    * returning a path:
    * function(lngs, namespaces) { return customPath; }
    * the returned path will interpolate lng, ns if provided like giving a static path
    */
  var loadPath: js.UndefOr[LoadPathOption] = js.native
  /**
    * parse data after it has been fetched
    * in example use https://www.npmjs.com/package/json5
    * here it removes the letter a from the json (bad idea)
    */
  var parse: js.UndefOr[js.Function1[/* data */ String, String]] = js.native
  /**
    * parse data before it has been sent by addPath
    */
  var parsePayload: js.UndefOr[
    js.Function3[
      /* namespace */ String, 
      /* key */ String, 
      /* fallbackValue */ js.UndefOr[String], 
      StringDictionary[_]
    ]
  ] = js.native
  /**
    * adds parameters to resource URL. 'example.com' -> 'example.com?v=1.3.5'
    */
  var queryStringParams: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * allow credentials on cross domain requests
    */
  var withCredentials: js.UndefOr[Boolean] = js.native
}

object BackendOptions {
  @scala.inline
  def apply(): BackendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendOptions]
  }
  @scala.inline
  implicit class BackendOptionsOps[Self <: BackendOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addPath")(js.undefined)
        ret
    }
    @scala.inline
    def withAjax(
      value: (/* url */ String, BackendOptions, /* callback */ AjaxRequestCallback, /* data */ js.Object | String, /* cache */ Boolean) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajax")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutAjax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajax")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowMultiLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultiLoading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMultiLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultiLoading")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossDomain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomHeaders(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadPathFunction2(value: (/* lngs */ js.Array[String], /* namespaces */ js.Array[String]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadPath")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLoadPath(value: LoadPathOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadPath")(js.undefined)
        ret
    }
    @scala.inline
    def withParse(value: /* data */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutParse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.undefined)
        ret
    }
    @scala.inline
    def withParsePayload(
      value: (/* namespace */ String, /* key */ String, /* fallbackValue */ js.UndefOr[String]) => StringDictionary[_]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsePayload")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutParsePayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsePayload")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryStringParams(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryStringParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryStringParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryStringParams")(js.undefined)
        ret
    }
    @scala.inline
    def withWithCredentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(js.undefined)
        ret
    }
  }
  
}

