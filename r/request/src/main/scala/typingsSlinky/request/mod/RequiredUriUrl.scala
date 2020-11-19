package typingsSlinky.request.mod

import typingsSlinky.node.urlMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.request.mod.UriOptions
  - typingsSlinky.request.mod.UrlOptions
*/
trait RequiredUriUrl extends js.Object
object RequiredUriUrl {
  
  @scala.inline
  def UriOptions(uri: String | Url): RequiredUriUrl = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredUriUrl]
  }
  
  @scala.inline
  def UrlOptions(url: String | Url): RequiredUriUrl = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredUriUrl]
  }
}
