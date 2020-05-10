package typingsSlinky.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnResizeSettings extends js.Object {
  /** Specifies the mode for column resizing
    * @Default {ej.TreeGrid.ColumnResizeMode.Normal}
    */
  var columnResizeMode: js.UndefOr[ColumnResizeMode | String] = js.native
}

object ColumnResizeSettings {
  @scala.inline
  def apply(): ColumnResizeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnResizeSettings]
  }
  @scala.inline
  implicit class ColumnResizeSettingsOps[Self <: ColumnResizeSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnResizeMode(value: ColumnResizeMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnResizeMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnResizeMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnResizeMode")(js.undefined)
        ret
    }
  }
  
}

