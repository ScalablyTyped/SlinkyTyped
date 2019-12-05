package typingsSlinky.atFrctlFractal.atFrctlFractalMod.fractal.web

import typingsSlinky.atFrctlFractal.Anon_Server
import typingsSlinky.atFrctlFractal.Anon_ServerSync
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@frctl/fractal", "fractal.web.Server")
@js.native
class Server () extends EventEmitter {
  val isSynced: Boolean = js.native
  val port: js.UndefOr[Double] = js.native
  val ports: Anon_Server = js.native
  val url: js.UndefOr[String] = js.native
  val urls: Anon_ServerSync = js.native
  def start(): js.Promise[typingsSlinky.node.httpMod.Server] = js.native
  def start(sync: Boolean): js.Promise[typingsSlinky.node.httpMod.Server] = js.native
  def stop(): Unit = js.native
  def use(mount: String, middleware: js.Any): Unit = js.native
}

