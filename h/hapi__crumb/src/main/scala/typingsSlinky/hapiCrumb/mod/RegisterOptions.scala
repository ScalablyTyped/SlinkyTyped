package typingsSlinky.hapiCrumb.mod

import typingsSlinky.hapiHapi.mod.Request
import typingsSlinky.hapiHapi.mod.ResponseToolkit
import typingsSlinky.hapiHapi.mod.ServerStateCookieOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterOptions extends js.Object {
  /**
    * Whether to automatically add the crumb to view contexts as the given key.
    *
    * @default true
    */
  var addToViewContext: js.UndefOr[Boolean] = js.native
  /**
    * Whether to automatically generate a new crumb for requests.
    *
    * @default true
    */
  var autoGenerate: js.UndefOr[Boolean] = js.native
  /**
    * Storage options for the cookie containing the crumb
    *
    * @default { path: '/' }
    */
  var cookieOptions: js.UndefOr[ServerStateCookieOptions] = js.native
  /**
    * Using enforce with false will set the CSRF header cookie but won't execute the validation.
    *
    * @default true
    */
  var enforce: js.UndefOr[Boolean] = js.native
  /**
    * Specify the name of the custom CSRF header.
    *
    * @default 'X-CSRF-Token'
    */
  var headerName: js.UndefOr[String] = js.native
  /**
    * The name of the cookie to store the CSRF crumb into.
    *
    * @default 'crumb'
    */
  var key: js.UndefOr[String] = js.native
  /**
    * Whether to add to the request log with tag 'crumb' and data 'validation failed'.
    *
    * @default false
    */
  var logUnauthorized: js.UndefOr[Boolean] = js.native
  /**
    * RESTful mode that validates crumb tokens from 'X-CSRF-Token' request header for POST, PUT, PATCH and DELETE server routes.
    * Disables payload/query crumb validation.
    *
    * @default false
    */
  var restful: js.UndefOr[Boolean] = js.native
  /**
    * The length of the crumb to generate.
    * See {@link https://github.com/hapijs/cryptiles cryptiles} for more information.
    *
    * @default 43
    */
  var size: js.UndefOr[Double] = js.native
  /**
    * A function which when provided, is called for every request.
    * If the provided function returns true, validation and generation of crumb is skipped.
    *
    * @default false
    */
  var skip: js.UndefOr[Boolean | SkipFunction] = js.native
}

object RegisterOptions {
  @scala.inline
  def apply(): RegisterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterOptions]
  }
  @scala.inline
  implicit class RegisterOptionsOps[Self <: RegisterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddToViewContext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addToViewContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddToViewContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addToViewContext")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoGenerate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoGenerate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoGenerate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoGenerate")(js.undefined)
        ret
    }
    @scala.inline
    def withCookieOptions(value: ServerStateCookieOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookieOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withEnforce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnforce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforce")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerName")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
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
    def withLogUnauthorized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logUnauthorized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogUnauthorized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logUnauthorized")(js.undefined)
        ret
    }
    @scala.inline
    def withRestful(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restful")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestful: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restful")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipFunction2(value: (/* request */ js.UndefOr[Request], /* h */ js.UndefOr[ResponseToolkit]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSkip(value: Boolean | SkipFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.undefined)
        ret
    }
  }
  
}

