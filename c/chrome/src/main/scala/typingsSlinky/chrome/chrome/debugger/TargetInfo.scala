package typingsSlinky.chrome.chrome.debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetInfo extends js.Object {
  /** True if debugger is already attached. */
  var attached: Boolean = js.native
  /**
    * Optional.
    * Since Chrome 30.
    * The extension id, defined if type = 'background_page'.
    */
  var extensionId: js.UndefOr[String] = js.native
  /** Optional. Target favicon URL.  */
  var faviconUrl: js.UndefOr[String] = js.native
  /** Target id. */
  var id: String = js.native
  /**
    * Optional.
    * Since Chrome 30.
    * The tab id, defined if type == 'page'.
    */
  var tabId: js.UndefOr[Double] = js.native
  /** Target page title. */
  var title: String = js.native
  /** Target type. */
  var `type`: String = js.native
  /** Target URL. */
  var url: String = js.native
}

object TargetInfo {
  @scala.inline
  def apply(attached: Boolean, id: String, title: String, `type`: String, url: String): TargetInfo = {
    val __obj = js.Dynamic.literal(attached = attached.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetInfo]
  }
  @scala.inline
  implicit class TargetInfoOps[Self <: TargetInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttached(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionId")(js.undefined)
        ret
    }
    @scala.inline
    def withFaviconUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faviconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFaviconUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faviconUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withTabId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabId")(js.undefined)
        ret
    }
  }
  
}

