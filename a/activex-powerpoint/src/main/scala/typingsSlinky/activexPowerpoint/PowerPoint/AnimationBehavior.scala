package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationBehavior extends js.Object {
  var Accumulate: MsoAnimAccumulate = js.native
  var Additive: MsoAnimAdditive = js.native
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  val ColorEffect: typingsSlinky.activexPowerpoint.PowerPoint.ColorEffect = js.native
  val CommandEffect: typingsSlinky.activexPowerpoint.PowerPoint.CommandEffect = js.native
  val FilterEffect: typingsSlinky.activexPowerpoint.PowerPoint.FilterEffect = js.native
  val MotionEffect: typingsSlinky.activexPowerpoint.PowerPoint.MotionEffect = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.AnimationBehavior_typekey")
  var PowerPointDotAnimationBehavior_typekey: AnimationBehavior = js.native
  val PropertyEffect: typingsSlinky.activexPowerpoint.PowerPoint.PropertyEffect = js.native
  val RotationEffect: typingsSlinky.activexPowerpoint.PowerPoint.RotationEffect = js.native
  val ScaleEffect: typingsSlinky.activexPowerpoint.PowerPoint.ScaleEffect = js.native
  val SetEffect: typingsSlinky.activexPowerpoint.PowerPoint.SetEffect = js.native
  val Timing: typingsSlinky.activexPowerpoint.PowerPoint.Timing = js.native
  var Type: MsoAnimType = js.native
  def Delete(): Unit = js.native
}

object AnimationBehavior {
  @scala.inline
  def apply(
    Accumulate: MsoAnimAccumulate,
    Additive: MsoAnimAdditive,
    Application: Application,
    ColorEffect: ColorEffect,
    CommandEffect: CommandEffect,
    Delete: () => Unit,
    FilterEffect: FilterEffect,
    MotionEffect: MotionEffect,
    Parent: js.Any,
    PowerPointDotAnimationBehavior_typekey: AnimationBehavior,
    PropertyEffect: PropertyEffect,
    RotationEffect: RotationEffect,
    ScaleEffect: ScaleEffect,
    SetEffect: SetEffect,
    Timing: Timing,
    Type: MsoAnimType
  ): AnimationBehavior = {
    val __obj = js.Dynamic.literal(Accumulate = Accumulate.asInstanceOf[js.Any], Additive = Additive.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], ColorEffect = ColorEffect.asInstanceOf[js.Any], CommandEffect = CommandEffect.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), FilterEffect = FilterEffect.asInstanceOf[js.Any], MotionEffect = MotionEffect.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PropertyEffect = PropertyEffect.asInstanceOf[js.Any], RotationEffect = RotationEffect.asInstanceOf[js.Any], ScaleEffect = ScaleEffect.asInstanceOf[js.Any], SetEffect = SetEffect.asInstanceOf[js.Any], Timing = Timing.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.AnimationBehavior_typekey")(PowerPointDotAnimationBehavior_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationBehavior]
  }
  @scala.inline
  implicit class AnimationBehaviorOps[Self <: AnimationBehavior] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccumulate(value: MsoAnimAccumulate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Accumulate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdditive(value: MsoAnimAdditive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Additive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorEffect(value: ColorEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColorEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommandEffect(value: CommandEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommandEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFilterEffect(value: FilterEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMotionEffect(value: MotionEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MotionEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotAnimationBehavior_typekey(value: AnimationBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.AnimationBehavior_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropertyEffect(value: PropertyEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PropertyEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotationEffect(value: RotationEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RotationEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleEffect(value: ScaleEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScaleEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetEffect(value: SetEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTiming(value: Timing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: MsoAnimType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

