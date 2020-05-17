package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RotationEffect extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  var By: Double = js.native
  var From: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.RotationEffect_typekey")
  var PowerPointDotRotationEffect_typekey: RotationEffect = js.native
  var To: Double = js.native
}

object RotationEffect {
  @scala.inline
  def apply(
    Application: Application,
    By: Double,
    From: Double,
    Parent: js.Any,
    PowerPointDotRotationEffect_typekey: RotationEffect,
    To: Double
  ): RotationEffect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], By = By.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.RotationEffect_typekey")(PowerPointDotRotationEffect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotationEffect]
  }
  @scala.inline
  implicit class RotationEffectOps[Self <: RotationEffect] (val x: Self) extends AnyVal {
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
    def withBy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("By")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrom(value: Double): Self = {
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
    def withPowerPointDotRotationEffect_typekey(value: RotationEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.RotationEffect_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("To")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

