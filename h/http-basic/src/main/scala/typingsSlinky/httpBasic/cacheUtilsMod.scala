package typingsSlinky.httpBasic

import typingsSlinky.httpBasic.cachedResponseMod.CachedResponse
import typingsSlinky.httpBasic.headersMod.Headers
import typingsSlinky.httpResponseObject.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("http-basic/lib/cache-utils", JSImport.Namespace)
@js.native
object cacheUtilsMod extends js.Object {
  
  def canCache[T](res: ^[T]): Boolean = js.native
  
  def isExpired(cachedResponse: CachedResponse): Boolean = js.native
  
  def isMatch(requestHeaders: Headers, cachedResponse: CachedResponse): Boolean = js.native
}
