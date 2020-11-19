package typingsSlinky.nsqjs.mod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.nsqjs.nsqjsStrings.closed
import typingsSlinky.nsqjs.nsqjsStrings.error
import typingsSlinky.nsqjs.nsqjsStrings.ready
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nsqjs", "Writer")
@js.native
class Writer protected () extends EventEmitter {
  def this(nsqdHost: String, nsqdPort: Double) = this()
  def this(nsqdHost: String, nsqdPort: Double, options: ConnectionConfigOptions) = this()
  
  def close(): js.Any = js.native
  
  def connect(): js.Any = js.native
  
  val nsqdHost: String = js.native
  
  val nsqdPort: Double = js.native
  
  @JSName("on")
  def on_closed(event: closed, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
  
  def publish(topic: String, msgs: js.Any): js.Any = js.native
  def publish(topic: String, msgs: js.Any, listener: js.Function1[/* err */ js.Error, Unit]): js.Any = js.native
}
/* static members */
@JSImport("nsqjs", "Writer")
@js.native
object Writer extends js.Object {
  
  var CLOSED: String = js.native
  
  var ERROR: String = js.native
  
  var READY: String = js.native
}
