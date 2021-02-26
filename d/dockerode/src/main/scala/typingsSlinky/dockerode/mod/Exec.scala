package typingsSlinky.dockerode.mod

import typingsSlinky.node.streamMod.Duplex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dockerode", "Exec")
@js.native
class Exec protected () extends StObject {
  def this(modem: js.Any, id: String) = this()
  
  var id: String = js.native
  
  def inspect(): js.Promise[ExecInspectInfo] = js.native
  def inspect(callback: Callback[ExecInspectInfo]): Unit = js.native
  
  var modem: js.Any = js.native
  
  def resize(options: js.Object): js.Promise[_] = js.native
  def resize(options: js.Object, callback: Callback[_]): Unit = js.native
  
  def start(options: ExecStartOptions): js.Promise[Duplex] = js.native
  def start(options: ExecStartOptions, callback: Callback[Duplex]): Unit = js.native
}
