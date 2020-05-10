package typingsSlinky.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigatorStyleSettingsMajorGridLineStyle extends js.Object {
  /** Specifies the color of major grid lines in range navigator.
    * @Default {#B5B5B5}
    */
  var color: js.UndefOr[String] = js.native
  /** Toggles the visibility of major grid lines.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object NavigatorStyleSettingsMajorGridLineStyle {
  @scala.inline
  def apply(): NavigatorStyleSettingsMajorGridLineStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigatorStyleSettingsMajorGridLineStyle]
  }
  @scala.inline
  implicit class NavigatorStyleSettingsMajorGridLineStyleOps[Self <: NavigatorStyleSettingsMajorGridLineStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
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
  }
  
}

