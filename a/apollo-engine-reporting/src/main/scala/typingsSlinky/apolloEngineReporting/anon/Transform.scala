package typingsSlinky.apolloEngineReporting.anon

import typingsSlinky.apolloEngineReporting.agentMod.VariableValueOptions
import typingsSlinky.apolloEngineReporting.agentMod.VariableValueTransformOptions
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transform extends VariableValueOptions {
  def transform(options: VariableValueTransformOptions): Record[String, _]
}

object Transform {
  @scala.inline
  def apply(transform: VariableValueTransformOptions => Record[String, _]): Transform = {
    val __obj = js.Dynamic.literal(transform = js.Any.fromFunction1(transform))
    __obj.asInstanceOf[Transform]
  }
}

