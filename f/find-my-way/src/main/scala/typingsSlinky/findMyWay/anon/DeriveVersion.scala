package typingsSlinky.findMyWay.anon

import typingsSlinky.findMyWay.mod.HTTPVersion
import typingsSlinky.findMyWay.mod.Req
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeriveVersion[V /* <: HTTPVersion */] extends js.Object {
  
  def deriveVersion[Context](req: Req[V]): String = js.native
  def deriveVersion[Context](req: Req[V], ctx: Context): String = js.native
  
  def storage(): Del[V] = js.native
}
