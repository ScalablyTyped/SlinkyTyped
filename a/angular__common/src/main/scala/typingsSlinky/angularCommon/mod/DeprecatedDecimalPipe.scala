package typingsSlinky.angularCommon.mod

import typingsSlinky.angularCore.mod.PipeTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "DeprecatedDecimalPipe")
@js.native
class DeprecatedDecimalPipe protected () extends PipeTransform {
  def this(_locale: String) = this()
  var _locale: js.Any = js.native
  def transform(value: js.Any): String | Null = js.native
  def transform(value: js.Any, digits: String): String | Null = js.native
}

