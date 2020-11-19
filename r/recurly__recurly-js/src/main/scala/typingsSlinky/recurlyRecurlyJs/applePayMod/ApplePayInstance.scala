package typingsSlinky.recurlyRecurlyJs.applePayMod

import typingsSlinky.recurlyRecurlyJs.emitterMod.Emitter
import typingsSlinky.std.VoidFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplePayInstance extends Emitter[ApplePayEvent] {
  
  def begin(): Unit = js.native
  def begin(cb: VoidFunction): Unit = js.native
  
  def ready(): Unit = js.native
  def ready(cb: VoidFunction): Unit = js.native
}
