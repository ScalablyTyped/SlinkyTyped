package typingsSlinky.loopback.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("loopback", "static")
@js.native
object static extends js.Object {
  /**
    * Serve static assets of a LoopBack application
    * @param {string} root The root directory from which the static assets are to
    * be served.
    * @param {any} options Refer to
    *   [express documentation](expressjs.com/4x/api.html#express.static)
    *   for the full list of available options.
    * @header loopback.static(root, [options])
    */
  def apply(root: String): RequestHandler[ParamsDictionary] = js.native
  def apply(root: String, options: js.Any): RequestHandler[ParamsDictionary] = js.native
}

