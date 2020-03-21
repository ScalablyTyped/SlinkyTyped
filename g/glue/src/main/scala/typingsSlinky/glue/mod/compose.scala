package typingsSlinky.glue.mod

import typingsSlinky.hapi.mod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("glue", "compose")
@js.native
object compose extends js.Object {
  def apply(manifest: Manifest): js.Promise[Server] = js.native
  def apply(manifest: Manifest, options: Options): js.Promise[Server] = js.native
}

