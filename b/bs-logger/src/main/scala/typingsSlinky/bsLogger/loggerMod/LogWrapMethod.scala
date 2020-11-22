package typingsSlinky.bsLogger.loggerMod

import typingsSlinky.bsLogger.contextMod.LogContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogWrapMethod extends js.Object {
  
  def apply[F /* <: js.Function1[/* repeated */ js.Any, _] */](context: LogContext, message: String, func: F): F = js.native
  def apply[F /* <: js.Function1[/* repeated */ js.Any, _] */](func: F): F = js.native
  def apply[F /* <: js.Function1[/* repeated */ js.Any, _] */](level: Double, message: String, func: F): F = js.native
  def apply[F /* <: js.Function1[/* repeated */ js.Any, _] */](message: String, func: F): F = js.native
}
