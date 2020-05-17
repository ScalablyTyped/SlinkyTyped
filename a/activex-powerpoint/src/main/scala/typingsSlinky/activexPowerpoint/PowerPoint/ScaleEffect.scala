package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleEffect extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  var ByX: Double = js.native
  var ByY: Double = js.native
  var FromX: Double = js.native
  var FromY: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.ScaleEffect_typekey")
  var PowerPointDotScaleEffect_typekey: ScaleEffect = js.native
  var ToX: Double = js.native
  var ToY: Double = js.native
}

object ScaleEffect {
  @scala.inline
  def apply(
    Application: Application,
    ByX: Double,
    ByY: Double,
    FromX: Double,
    FromY: Double,
    Parent: js.Any,
    PowerPointDotScaleEffect_typekey: ScaleEffect,
    ToX: Double,
    ToY: Double
  ): ScaleEffect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ByX = ByX.asInstanceOf[js.Any], ByY = ByY.asInstanceOf[js.Any], FromX = FromX.asInstanceOf[js.Any], FromY = FromY.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ToX = ToX.asInstanceOf[js.Any], ToY = ToY.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ScaleEffect_typekey")(PowerPointDotScaleEffect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleEffect]
  }
  @scala.inline
  implicit class ScaleEffectOps[Self <: ScaleEffect] (val x: Self) extends AnyVal {
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
    def withByX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ByX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withByY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ByY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FromX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FromY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotScaleEffect_typekey(value: ScaleEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.ScaleEffect_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToY")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

