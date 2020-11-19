package typingsSlinky.isMyJsonValid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Validator extends js.Object {
  
  def apply(schema: js.Any): ValidateFunction = js.native
  def apply(schema: js.Any, options: js.Any): ValidateFunction = js.native
  
  def filter(schema: js.Any): js.Any = js.native
}
