package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OLEControl extends js.Object {
  var AltHTML: String = js.native
  var Height: Double = js.native
  var Left: Double = js.native
  var Name: String = js.native
  @JSName("PowerPoint.OLEControl_typekey")
  var PowerPointDotOLEControl_typekey: OLEControl = js.native
  var Top: Double = js.native
  var Visible: Boolean = js.native
  var Width: Double = js.native
  val ZOrderPosition: Double = js.native
}

object OLEControl {
  @scala.inline
  def apply(
    AltHTML: String,
    Height: Double,
    Left: Double,
    Name: String,
    PowerPointDotOLEControl_typekey: OLEControl,
    Top: Double,
    Visible: Boolean,
    Width: Double,
    ZOrderPosition: Double
  ): OLEControl = {
    val __obj = js.Dynamic.literal(AltHTML = AltHTML.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], ZOrderPosition = ZOrderPosition.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.OLEControl_typekey")(PowerPointDotOLEControl_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OLEControl]
  }
  @scala.inline
  implicit class OLEControlOps[Self <: OLEControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAltHTML(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AltHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotOLEControl_typekey(value: OLEControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.OLEControl_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZOrderPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZOrderPosition")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

