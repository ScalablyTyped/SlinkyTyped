package typingsSlinky.loopback.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("loopback", "favicon")
@js.native
object favicon extends js.Object {
  // END OF PERSISTED MODEL
  /**
    * Serve the LoopBack favicon.
    * @header loopback.favicon(
    */
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

