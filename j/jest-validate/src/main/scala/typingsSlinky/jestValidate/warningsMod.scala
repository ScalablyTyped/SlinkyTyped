package typingsSlinky.jestValidate

import typingsSlinky.jestValidate.typesMod.ValidationOptions
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-validate/build/warnings", JSImport.Namespace)
@js.native
object warningsMod extends js.Object {
  
  def unknownOptionWarning(
    config: Record[String, _],
    exampleConfig: Record[String, _],
    option: String,
    options: ValidationOptions
  ): Unit = js.native
  def unknownOptionWarning(
    config: Record[String, _],
    exampleConfig: Record[String, _],
    option: String,
    options: ValidationOptions,
    path: js.Array[String]
  ): Unit = js.native
}
