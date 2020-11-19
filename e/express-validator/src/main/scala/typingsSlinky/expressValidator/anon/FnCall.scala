package typingsSlinky.expressValidator.anon

import typingsSlinky.expressValidator.validationResultMod.ResultFactory
import typingsSlinky.expressValidator.validationResultMod.ResultFactoryBuilderOptions
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends js.Object {
  
  def apply[T](): ResultFactory[T] = js.native
  def apply[T](options: Partial[ResultFactoryBuilderOptions[T]]): ResultFactory[T] = js.native
}
