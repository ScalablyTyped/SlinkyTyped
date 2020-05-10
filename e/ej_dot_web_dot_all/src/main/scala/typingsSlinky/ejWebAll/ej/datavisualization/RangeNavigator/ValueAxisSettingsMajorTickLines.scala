package typingsSlinky.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueAxisSettingsMajorTickLines extends js.Object {
  /** Specifies the size of the majorTickLines in range navigator
    * @Default {0}
    */
  var size: js.UndefOr[Double] = js.native
  /** Toggles the visibility of major tick lines.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.native
  /** Specifies width of the major tick lines.
    * @Default {0}
    */
  var width: js.UndefOr[Double] = js.native
}

object ValueAxisSettingsMajorTickLines {
  @scala.inline
  def apply(): ValueAxisSettingsMajorTickLines = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueAxisSettingsMajorTickLines]
  }
  @scala.inline
  implicit class ValueAxisSettingsMajorTickLinesOps[Self <: ValueAxisSettingsMajorTickLines] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withVisible(value: Boolean): Self = {
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
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

