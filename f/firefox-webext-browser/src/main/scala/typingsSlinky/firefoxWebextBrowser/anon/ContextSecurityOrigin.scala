package typingsSlinky.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextSecurityOrigin extends js.Object {
  /**
    * Evaluate the expression in the context of a content script of an extension that matches the specified
    * origin. If given, contextSecurityOrigin overrides the 'true' setting on userContentScriptContext.
    * @deprecated Unsupported on Firefox at this time.
    */
  var contextSecurityOrigin: js.UndefOr[String] = js.native
  /**
    * If specified, the expression is evaluated on the iframe whose URL matches the one specified. By default, the
    * expression is evaluated in the top frame of the inspected page.
    * @deprecated Unsupported on Firefox at this time.
    */
  var frameURL: js.UndefOr[String] = js.native
  /**
    * Evaluate the expression in the context of the content script of the calling extension, provided that the
    * content script is already injected into the inspected page. If not, the expression is not evaluated and the
    * callback is invoked with the exception parameter set to an object that has the `isError` field set to true
    * and the `code` field set to `E_NOTFOUND`.
    * @deprecated Unsupported on Firefox at this time.
    */
  var useContentScriptContext: js.UndefOr[Boolean] = js.native
}

object ContextSecurityOrigin {
  @scala.inline
  def apply(): ContextSecurityOrigin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextSecurityOrigin]
  }
  @scala.inline
  implicit class ContextSecurityOriginOps[Self <: ContextSecurityOrigin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContextSecurityOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextSecurityOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextSecurityOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextSecurityOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameURL")(js.undefined)
        ret
    }
    @scala.inline
    def withUseContentScriptContext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useContentScriptContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseContentScriptContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useContentScriptContext")(js.undefined)
        ret
    }
  }
  
}

