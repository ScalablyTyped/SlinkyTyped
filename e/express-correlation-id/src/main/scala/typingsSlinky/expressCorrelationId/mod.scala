package typingsSlinky.expressCorrelationId

import typingsSlinky.expressCorrelationId.anon.Header
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.RequestHandler
import typingsSlinky.qs.mod.ParsedQs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("express-correlation-id", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(): RequestHandler[ParamsDictionary, _, _, ParsedQs] = js.native
  def apply(options: Header): RequestHandler[ParamsDictionary, _, _, ParsedQs] = js.native
  
  def getId(): js.UndefOr[String] = js.native
}
