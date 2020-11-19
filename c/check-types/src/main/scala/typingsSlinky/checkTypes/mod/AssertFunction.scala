package typingsSlinky.checkTypes.mod

import typingsSlinky.checkTypes.anon.Instantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssertFunction extends CheckType {
  
  def apply[T](possibleFalsy: T): T = js.native
  def apply[T](possibleFalsy: T, message: js.UndefOr[scala.Nothing], errorType: Instantiable): T = js.native
  def apply[T](possibleFalsy: T, message: String): T = js.native
  def apply[T](possibleFalsy: T, message: String, errorType: Instantiable): T = js.native
}
