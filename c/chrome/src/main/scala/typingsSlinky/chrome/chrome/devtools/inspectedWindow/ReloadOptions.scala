package typingsSlinky.chrome.chrome.devtools.inspectedWindow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReloadOptions extends js.Object {
  /** Optional. When true, the loader will ignore the cache for all inspected page resources loaded before the load event is fired. The effect is similar to pressing Ctrl+Shift+R in the inspected window or within the Developer Tools window.  */
  var ignoreCache: js.UndefOr[Boolean] = js.native
  /** Optional. If specified, the script will be injected into every frame of the inspected page immediately upon load, before any of the frame's scripts. The script will not be injected after subsequent reloads—for example, if the user presses Ctrl+R.  */
  var injectedScript: js.UndefOr[String] = js.native
  /**
    * Optional.
    * If specified, this script evaluates into a function that accepts three string arguments: the source to preprocess, the URL of the source, and a function name if the source is an DOM event handler. The preprocessorerScript function should return a string to be compiled by Chrome in place of the input source. In the case that the source is a DOM event handler, the returned source must compile to a single JS function.
    * @deprecated Deprecated since Chrome 41. Please avoid using this parameter, it will be removed soon.
    */
  var preprocessorScript: js.UndefOr[String] = js.native
  /** Optional. If specified, the string will override the value of the User-Agent HTTP header that's sent while loading the resources of the inspected page. The string will also override the value of the navigator.userAgent property that's returned to any scripts that are running within the inspected page.  */
  var userAgent: js.UndefOr[String] = js.native
}

object ReloadOptions {
  @scala.inline
  def apply(): ReloadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReloadOptions]
  }
  @scala.inline
  implicit class ReloadOptionsOps[Self <: ReloadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreCache")(js.undefined)
        ret
    }
    @scala.inline
    def withInjectedScript(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injectedScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInjectedScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injectedScript")(js.undefined)
        ret
    }
    @scala.inline
    def withPreprocessorScript(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preprocessorScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreprocessorScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preprocessorScript")(js.undefined)
        ret
    }
    @scala.inline
    def withUserAgent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(js.undefined)
        ret
    }
  }
  
}

