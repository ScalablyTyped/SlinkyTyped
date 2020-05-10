package typingsSlinky.apolloEngineReporting

import typingsSlinky.apolloEngineReporting.agentMod.VariableValueOptions
import typingsSlinky.apolloEngineReporting.agentMod.VariableValueTransformOptions
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTransform extends VariableValueOptions {
  def transform(options: VariableValueTransformOptions): Record[String, _] = js.native
}

object AnonTransform {
  @scala.inline
  def apply(transform: VariableValueTransformOptions => Record[String, _]): AnonTransform = {
    val __obj = js.Dynamic.literal(transform = js.Any.fromFunction1(transform))
    __obj.asInstanceOf[AnonTransform]
  }
  @scala.inline
  implicit class AnonTransformOps[Self <: AnonTransform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransform(value: VariableValueTransformOptions => Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

