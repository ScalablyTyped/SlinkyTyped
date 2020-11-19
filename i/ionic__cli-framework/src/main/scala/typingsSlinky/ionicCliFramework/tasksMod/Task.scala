package typingsSlinky.ionicCliFramework.tasksMod

import typingsSlinky.ionicCliFramework.ionicCliFrameworkStrings.clear
import typingsSlinky.ionicCliFramework.ionicCliFrameworkStrings.end
import typingsSlinky.ionicCliFramework.ionicCliFrameworkStrings.failure
import typingsSlinky.ionicCliFramework.ionicCliFrameworkStrings.success
import typingsSlinky.ionicCliFramework.ionicCliFrameworkStrings.tick
import typingsSlinky.node.NodeJS.Timer
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/cli-framework/lib/tasks", "Task")
@js.native
class Task () extends EventEmitter {
  def this(hasMsgTickInterval: TaskOptions) = this()
  
  var _msg: String = js.native
  
  def clear(): this.type = js.native
  
  @JSName("emit")
  def emit_clear(name: clear): Boolean = js.native
  @JSName("emit")
  def emit_end(name: end): Boolean = js.native
  @JSName("emit")
  def emit_failure(name: failure): Boolean = js.native
  @JSName("emit")
  def emit_success(name: success): Boolean = js.native
  @JSName("emit")
  def emit_tick(name: tick): Boolean = js.native
  
  def end(): this.type = js.native
  
  def fail(): this.type = js.native
  
  var intervalId: js.UndefOr[Timer] = js.native
  
  def msg: String = js.native
  def msg_=(msg: String): Unit = js.native
  
  @JSName("on")
  def on_clear(name: clear, handler: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_end(name: end, handler: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_failure(name: failure, handler: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_success(name: success, handler: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_tick(name: tick, handler: js.Function0[Unit]): this.type = js.native
  
  def progress(prog: Double, total: Double): this.type = js.native
  
  var progressRatio: js.UndefOr[Double] = js.native
  
  var running: Boolean = js.native
  
  def start(): this.type = js.native
  
  def succeed(): this.type = js.native
  
  def tick(): this.type = js.native
  
  var tickInterval: js.UndefOr[Double] = js.native
}
