package typingsSlinky.ionicCliFramework.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkFootnote extends Footnote {
  
  var id: String | Double = js.native
  
  var shortUrl: js.UndefOr[String] = js.native
  
  var url: String = js.native
}
object LinkFootnote {
  
  @scala.inline
  def apply(id: String | Double, url: String): LinkFootnote = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkFootnote]
  }
  
  @scala.inline
  implicit class LinkFootnoteMutableBuilder[Self <: LinkFootnote] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortUrl(value: String): Self = StObject.set(x, "shortUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortUrlUndefined: Self = StObject.set(x, "shortUrl", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
