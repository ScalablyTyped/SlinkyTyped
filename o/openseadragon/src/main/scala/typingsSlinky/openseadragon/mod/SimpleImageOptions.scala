package typingsSlinky.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleImageOptions extends ImageOptions {
  
  var url: String = js.native
}
object SimpleImageOptions {
  
  @scala.inline
  def apply(url: String): SimpleImageOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleImageOptions]
  }
  
  @scala.inline
  implicit class SimpleImageOptionsMutableBuilder[Self <: SimpleImageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
