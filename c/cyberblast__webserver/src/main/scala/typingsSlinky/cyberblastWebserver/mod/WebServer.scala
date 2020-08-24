package typingsSlinky.cyberblastWebserver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@cyberblast/webserver", "WebServer")
@js.native
class WebServer () extends js.Object {
  def this(webConfigFile: String) = this()
  def this(webConfigFile: js.UndefOr[scala.Nothing], logConfigFile: String) = this()
  def this(webConfigFile: String, logConfigFile: String) = this()
  def respondError(error: String, context: ServerContext): js.Promise[Unit] = js.native
  def respondError(error: String, context: ServerContext, code: js.UndefOr[scala.Nothing], message: String): js.Promise[Unit] = js.native
  def respondError(error: String, context: ServerContext, code: Double): js.Promise[Unit] = js.native
  def respondError(error: String, context: ServerContext, code: Double, message: String): js.Promise[Unit] = js.native
  def respondError(error: js.Error, context: ServerContext): js.Promise[Unit] = js.native
  def respondError(error: js.Error, context: ServerContext, code: js.UndefOr[scala.Nothing], message: String): js.Promise[Unit] = js.native
  def respondError(error: js.Error, context: ServerContext, code: Double): js.Promise[Unit] = js.native
  def respondError(error: js.Error, context: ServerContext, code: Double, message: String): js.Promise[Unit] = js.native
  def start(): js.Promise[Unit] = js.native
  def stop(): Unit = js.native
}

