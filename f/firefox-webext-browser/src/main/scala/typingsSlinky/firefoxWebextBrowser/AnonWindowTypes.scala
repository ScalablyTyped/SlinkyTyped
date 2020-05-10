package typingsSlinky.firefoxWebextBrowser

import typingsSlinky.firefoxWebextBrowser.browser.windows.WindowType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonWindowTypes extends js.Object {
  /**
    * If true, the `windows.Window` returned will have a `tabs` property that contains a list of the `tabs.Tab`
    * objects. The `Tab` objects only contain the `url`, `title` and `favIconUrl` properties if the extension's
    * manifest file includes the `"tabs"` permission.
    */
  var populate: js.UndefOr[Boolean] = js.native
  /**
    * If set, the `windows.Window` returned will be filtered based on its type. If unset the default filter is set
    * to `['app', 'normal', 'panel', 'popup']`, with `'app'` and `'panel'` window types limited to the extension's
    * own windows.
    * @deprecated If set, the `windows.Window` returned will be filtered based on its type. If unset the default
    *     filter is set to `['app', 'normal', 'panel', 'popup']`, with `'app'` and `'panel'` window types limited
    *     to the extension's own windows.
    */
  var windowTypes: js.UndefOr[js.Array[WindowType]] = js.native
}

object AnonWindowTypes {
  @scala.inline
  def apply(): AnonWindowTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonWindowTypes]
  }
  @scala.inline
  implicit class AnonWindowTypesOps[Self <: AnonWindowTypes] (val x: Self) extends AnyVal {
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

