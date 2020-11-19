package typingsSlinky.frctlFractal.mod.fractal.web

import typingsSlinky.frctlFractal.anon.Sync
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@frctl/fractal", "fractal.web.Server")
@js.native
class Server () extends EventEmitter {
  
  val isSynced: Boolean = js.native
  
  val port: js.UndefOr[Double] = js.native
  
  val ports: typingsSlinky.frctlFractal.anon.Server = js.native
  
  def start(): js.Promise[typingsSlinky.node.httpMod.Server] = js.native
  def start(sync: Boolean): js.Promise[typingsSlinky.node.httpMod.Server] = js.native
  
  def stop(): Unit = js.native
  
  val url: js.UndefOr[String] = js.native
  
  val urls: Sync = js.native
  
  def use(mount: String, middleware: js.Any): Unit = js.native
}
