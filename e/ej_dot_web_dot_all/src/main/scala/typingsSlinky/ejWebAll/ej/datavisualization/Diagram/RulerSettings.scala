package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RulerSettings extends js.Object {
  /** Defines the appearance of horizontal ruler
    */
  var horizontalRuler: js.UndefOr[RulerSettingsHorizontalRuler] = js.native
  /** Enables or disables both the horizontal and vertical ruler.
    * @Default {false}
    */
  var showRulers: js.UndefOr[Boolean] = js.native
  /** Defines the appearance of vertical ruler
    */
  var verticalRuler: js.UndefOr[RulerSettingsVerticalRuler] = js.native
}

object RulerSettings {
  @scala.inline
  def apply(): RulerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RulerSettings]
  }
  @scala.inline
  implicit class RulerSettingsOps[Self <: RulerSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHorizontalRuler(value: RulerSettingsHorizontalRuler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalRuler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalRuler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalRuler")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRulers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRulers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRulers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRulers")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalRuler(value: RulerSettingsVerticalRuler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalRuler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalRuler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalRuler")(js.undefined)
        ret
    }
  }
  
}

