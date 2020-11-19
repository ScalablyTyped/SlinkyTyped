package typingsSlinky.q.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("q", "delay")
@js.native
object delay extends js.Object {
  
  def apply(ms: Double): Promise[Unit] = js.native
  def apply[T](promiseOrValue: T, ms: Double): Promise[T] = js.native
  def apply[T](promiseOrValue: Promise[T], ms: Double): Promise[T] = js.native
}
