package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EffectParameters extends js.Object {
  var Amount: Double = js.native
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  val Color2: ColorFormat = js.native
  var Direction: MsoAnimDirection = js.native
  var FontName: String = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.EffectParameters_typekey")
  var PowerPointDotEffectParameters_typekey: EffectParameters = js.native
  var Relative: MsoTriState = js.native
  var Size: Double = js.native
}

object EffectParameters {
  @scala.inline
  def apply(
    Amount: Double,
    Application: Application,
    Color2: ColorFormat,
    Direction: MsoAnimDirection,
    FontName: String,
    Parent: js.Any,
    PowerPointDotEffectParameters_typekey: EffectParameters,
    Relative: MsoTriState,
    Size: Double
  ): EffectParameters = {
    val __obj = js.Dynamic.literal(Amount = Amount.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Color2 = Color2.asInstanceOf[js.Any], Direction = Direction.asInstanceOf[js.Any], FontName = FontName.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Relative = Relative.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.EffectParameters_typekey")(PowerPointDotEffectParameters_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectParameters]
  }
  @scala.inline
  implicit class EffectParametersOps[Self <: EffectParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor2(value: ColorFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Color2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirection(value: MsoAnimDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotEffectParameters_typekey(value: EffectParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.EffectParameters_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelative(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Relative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Size")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

