package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorEffect extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  val By: ColorFormat = js.native
  val From: ColorFormat = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.ColorEffect_typekey")
  var PowerPointDotColorEffect_typekey: ColorEffect = js.native
  val To: ColorFormat = js.native
}

object ColorEffect {
  @scala.inline
  def apply(
    Application: Application,
    By: ColorFormat,
    From: ColorFormat,
    Parent: js.Any,
    PowerPointDotColorEffect_typekey: ColorEffect,
    To: ColorFormat
  ): ColorEffect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], By = By.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ColorEffect_typekey")(PowerPointDotColorEffect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorEffect]
  }
  @scala.inline
  implicit class ColorEffectOps[Self <: ColorEffect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBy(value: ColorFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("By")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrom(value: ColorFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("From")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotColorEffect_typekey(value: ColorEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.ColorEffect_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: ColorFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("To")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

