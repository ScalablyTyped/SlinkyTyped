package typingsSlinky.elasticElasticsearch.anon

import typingsSlinky.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Url extends StObject {
  
  var url: URL_ = js.native
}
object Url {
  
  @scala.inline
  def apply(url: URL_): Url = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Url]
  }
  
  @scala.inline
  implicit class UrlMutableBuilder[Self <: Url] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: URL_): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
