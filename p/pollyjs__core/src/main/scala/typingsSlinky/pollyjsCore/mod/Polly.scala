package typingsSlinky.pollyjsCore.mod

import typingsSlinky.pollyjsAdapter.mod.default
import typingsSlinky.pollyjsCore.anon.TypeofAdapter
import typingsSlinky.pollyjsCore.anon.TypeofPersister
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pollyjs/core", "Polly")
@js.native
class Polly protected () extends js.Object {
  def this(recordingName: String) = this()
  def this(recordingName: String, options: PollyConfig) = this()
  
  var adapters: Map[String, default] = js.native
  
  var config: PollyConfig = js.native
  
  def configure(config: PollyConfig): Unit = js.native
  
  def connectTo(name: String): Unit = js.native
  def connectTo(name: TypeofAdapter): Unit = js.native
  
  def disconnect(): Unit = js.native
  
  def disconnectFrom(name: String): Unit = js.native
  def disconnectFrom(name: TypeofAdapter): Unit = js.native
  
  def flush(): js.Promise[Unit] = js.native
  
  var mode: MODE = js.native
  
  def passthrough(): Unit = js.native
  
  def pause(): Unit = js.native
  
  var persister: typingsSlinky.pollyjsPersister.mod.default | Null = js.native
  
  def play(): Unit = js.native
  
  def record(): Unit = js.native
  
  var recordingId: String = js.native
  
  var recordingName: String = js.native
  
  def replay(): Unit = js.native
  
  var server: PollyServer = js.native
  
  def stop(): js.Promise[Unit] = js.native
}
/* static members */
@JSImport("@pollyjs/core", "Polly")
@js.native
object Polly extends js.Object {
  
  var VERSION: String = js.native
  
  def off(event: PollyEvent, listener: PollyEventListener): Unit = js.native
  
  def on(event: PollyEvent, listener: PollyEventListener): Unit = js.native
  
  def once(event: PollyEvent, listener: PollyEventListener): Unit = js.native
  
  def register(Factory: TypeofAdapter): Unit = js.native
  def register(Factory: TypeofPersister): Unit = js.native
  
  def unregister(Factory: TypeofAdapter): Unit = js.native
  def unregister(Factory: TypeofPersister): Unit = js.native
}
