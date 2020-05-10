package typingsSlinky.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueAxisSettingsAxisLine extends js.Object {
  /** Toggles the visibility of axis line.
    * @Default {none}
    */
  var visible: js.UndefOr[String] = js.native
}

object ValueAxisSettingsAxisLine {
  @scala.inline
  def apply(): ValueAxisSettingsAxisLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueAxisSettingsAxisLine]
  }
  @scala.inline
  implicit class ValueAxisSettingsAxisLineOps[Self <: ValueAxisSettingsAxisLine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVisible(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

