package typingsSlinky.peculiarJsonSchema

import typingsSlinky.peculiarJsonSchema.typesMod.IValidation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@peculiar/json-schema/build/types/validations/pattern", JSImport.Namespace)
@js.native
object patternMod extends js.Object {
  @js.native
  class PatternValidation protected () extends IValidation {
    def this(pattern: String) = this()
    def this(pattern: js.RegExp) = this()
    var pattern: js.Any = js.native
    /* CompleteClass */
    override def validate(value: js.Any): Unit = js.native
  }
  
}

