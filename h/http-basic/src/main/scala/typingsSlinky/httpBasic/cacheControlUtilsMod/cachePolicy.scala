package typingsSlinky.httpBasic.cacheControlUtilsMod

import typingsSlinky.httpBasic.cachedResponseMod.CachedResponse
import typingsSlinky.httpResponseObject.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("http-basic/lib/cache-control-utils", "cachePolicy")
@js.native
object cachePolicy extends js.Object {
  
  def apply[T](res: CachedResponse): Policy | Null = js.native
  def apply[T](res: ^[T]): Policy | Null = js.native
}
