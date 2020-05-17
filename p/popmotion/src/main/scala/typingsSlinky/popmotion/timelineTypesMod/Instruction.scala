package typingsSlinky.popmotion.timelineTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - java.lang.String
  - typingsSlinky.popmotion.timelineTypesMod.AnimationDefinition
  - js.Array[typingsSlinky.popmotion.timelineTypesMod.AnimationDefinition | scala.Double]
*/
trait Instruction extends js.Object

object Instruction {
  @scala.inline
  implicit def apply(value: AnimationDefinition): Instruction = value.asInstanceOf[Instruction]
  @scala.inline
  implicit def apply(value: js.Array[AnimationDefinition | Double]): Instruction = value.asInstanceOf[Instruction]
  @scala.inline
  implicit def apply(value: Double): Instruction = value.asInstanceOf[Instruction]
  @scala.inline
  implicit def apply(value: String): Instruction = value.asInstanceOf[Instruction]
}

