package typingsSlinky.csurf.mod

import typingsSlinky.csurf.anon.Cookie
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.RequestHandler
import typingsSlinky.qs.mod.ParsedQs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("csurf", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): RequestHandler[ParamsDictionary, _, _, ParsedQs] = js.native
  def apply(options: Cookie): RequestHandler[ParamsDictionary, _, _, ParsedQs] = js.native
}

