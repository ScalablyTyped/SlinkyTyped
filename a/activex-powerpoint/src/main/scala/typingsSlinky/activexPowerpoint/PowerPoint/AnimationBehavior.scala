package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationBehavior extends js.Object {
  var Accumulate: MsoAnimAccumulate
  var Additive: MsoAnimAdditive
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application
  val ColorEffect: typingsSlinky.activexPowerpoint.PowerPoint.ColorEffect
  val CommandEffect: typingsSlinky.activexPowerpoint.PowerPoint.CommandEffect
  val FilterEffect: typingsSlinky.activexPowerpoint.PowerPoint.FilterEffect
  val MotionEffect: typingsSlinky.activexPowerpoint.PowerPoint.MotionEffect
  val Parent: js.Any
  @JSName("PowerPoint.AnimationBehavior_typekey")
  var PowerPointDotAnimationBehavior_typekey: AnimationBehavior
  val PropertyEffect: typingsSlinky.activexPowerpoint.PowerPoint.PropertyEffect
  val RotationEffect: typingsSlinky.activexPowerpoint.PowerPoint.RotationEffect
  val ScaleEffect: typingsSlinky.activexPowerpoint.PowerPoint.ScaleEffect
  val SetEffect: typingsSlinky.activexPowerpoint.PowerPoint.SetEffect
  val Timing: typingsSlinky.activexPowerpoint.PowerPoint.Timing
  var Type: MsoAnimType
  def Delete(): Unit
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
}

