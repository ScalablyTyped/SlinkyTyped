package typingsSlinky.firefoxWebextBrowser.browser.windows

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies whether the `windows.Window` returned should contain a list of the `tabs.Tab` objects. */
@js.native
trait GetInfo extends js.Object {
  /**
    * If true, the `windows.Window` returned will have a `tabs` property that contains a list of the `tabs.Tab`
    * objects. The `Tab` objects only contain the `url`, `title` and `favIconUrl` properties if the extension's
    * manifest file includes the `"tabs"` permission.
    */
  var populate: js.UndefOr[Boolean] = js.native
  /**
    * `windowTypes` is deprecated and ignored on Firefox.
    * @deprecated `windowTypes` is deprecated and ignored on Firefox.
    */
  var windowTypes: js.UndefOr[js.Array[WindowType]] = js.native
}

object GetInfo {
  @scala.inline
  def apply(): GetInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInfo]
  }
  @scala.inline
  implicit class GetInfoOps[Self <: GetInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPopulate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("populate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopulate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("populate")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowTypes(value: js.Array[WindowType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowTypes")(js.undefined)
        ret
    }
  }
  
}

