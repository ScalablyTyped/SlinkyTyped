package typingsSlinky.correlationId

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("correlation-id", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def bindId[T /* <: js.Function1[/* repeated */ js.Any, _] */](id: String, work: T): T = js.native
  def bindId[T /* <: js.Function1[/* repeated */ js.Any, _] */](work: T): T = js.native
  
  def getId(): js.UndefOr[String] = js.native
  
  def withId(id: String, work: js.Function0[Unit]): Unit = js.native
  def withId(work: js.Function0[Unit]): Unit = js.native
}
