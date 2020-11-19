package typingsSlinky.relayRuntime.relayObservableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sink[T] extends js.Object {
  
  val closed: Boolean = js.native
  
  def complete(): Unit = js.native
  
  def error(error: js.Error): Unit = js.native
  def error(error: js.Error, isUncaughtThrownError: Boolean): Unit = js.native
  
  def next(value: T): Unit = js.native
}
