package typingsSlinky.activexLibreoffice.com_.sun.star.rendering

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Panose extends js.Object {
  var ArmStyle: Double = js.native
  var Contrast: Double = js.native
  var FamilyType: Double = js.native
  var Letterform: Double = js.native
  var Midline: Double = js.native
  var Proportion: Double = js.native
  var SerifStyle: Double = js.native
  var StrokeVariation: Double = js.native
  var Weight: Double = js.native
  var XHeight: Double = js.native
}

object Panose {
  @scala.inline
  def apply(
    ArmStyle: Double,
    Contrast: Double,
    FamilyType: Double,
    Letterform: Double,
    Midline: Double,
    Proportion: Double,
    SerifStyle: Double,
    StrokeVariation: Double,
    Weight: Double,
    XHeight: Double
  ): Panose = {
    val __obj = js.Dynamic.literal(ArmStyle = ArmStyle.asInstanceOf[js.Any], Contrast = Contrast.asInstanceOf[js.Any], FamilyType = FamilyType.asInstanceOf[js.Any], Letterform = Letterform.asInstanceOf[js.Any], Midline = Midline.asInstanceOf[js.Any], Proportion = Proportion.asInstanceOf[js.Any], SerifStyle = SerifStyle.asInstanceOf[js.Any], StrokeVariation = StrokeVariation.asInstanceOf[js.Any], Weight = Weight.asInstanceOf[js.Any], XHeight = XHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Panose]
  }
  @scala.inline
  implicit class PanoseOps[Self <: Panose] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArmStyle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArmStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContrast(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Contrast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFamilyType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FamilyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLetterform(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Letterform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMidline(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Midline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProportion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Proportion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerifStyle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SerifStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrokeVariation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StrokeVariation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XHeight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

