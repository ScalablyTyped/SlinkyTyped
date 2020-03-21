package typingsSlinky.csurf.mod

import typingsSlinky.csurf.AnonCookie
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("csurf", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): RequestHandler[ParamsDictionary, _, _] = js.native
  def apply(options: AnonCookie): RequestHandler[ParamsDictionary, _, _] = js.native
}

