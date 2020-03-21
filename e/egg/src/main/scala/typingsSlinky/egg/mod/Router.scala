package typingsSlinky.egg.mod

import typingsSlinky.koaRouter.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Router
  extends ^[js.Any, Context] {
  /**
    * restful router api
    */
  def resources(name: String, prefix: String, middleware: js.Any*): Router = js.native
}

