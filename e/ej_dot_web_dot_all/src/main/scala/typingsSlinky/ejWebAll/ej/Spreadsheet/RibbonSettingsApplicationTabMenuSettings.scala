package typingsSlinky.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RibbonSettingsApplicationTabMenuSettings extends js.Object {
  /** Specifies the data source to append in application tab.
    * @Default {[]}
    */
  var dataSource: js.UndefOr[js.Array[_]] = js.native
  /** Gets or sets a value that indicates whether to enable or disable isAppend property in ribbon settings.
    * @Default {false}
    */
  var isAppend: js.UndefOr[Boolean] = js.native
}

object RibbonSettingsApplicationTabMenuSettings {
  @scala.inline
  def apply(): RibbonSettingsApplicationTabMenuSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RibbonSettingsApplicationTabMenuSettings]
  }
  @scala.inline
  implicit class RibbonSettingsApplicationTabMenuSettingsOps[Self <: RibbonSettingsApplicationTabMenuSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSource(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAppend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAppend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAppend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAppend")(js.undefined)
        ret
    }
  }
  
}

