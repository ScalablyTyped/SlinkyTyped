package typingsSlinky.jestValidate

import typingsSlinky.jestValidate.typesMod.ValidationOptions
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-validate/build/deprecated", JSImport.Namespace)
@js.native
object deprecatedMod extends js.Object {
  def deprecationWarning(
    config: Record[String, _],
    option: String,
    deprecatedOptions: Record[String, js.Function],
    options: ValidationOptions
  ): Boolean = js.native
}

