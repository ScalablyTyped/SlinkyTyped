package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HyperlinkComponentProperties
  extends ComponentProperties
     with TitledComponentProperties {
  
  var label: String = js.native
  
  var url: String = js.native
}
object HyperlinkComponentProperties {
  
  @scala.inline
  def apply(label: String, url: String): HyperlinkComponentProperties = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperlinkComponentProperties]
  }
  
  @scala.inline
  implicit class HyperlinkComponentPropertiesMutableBuilder[Self <: HyperlinkComponentProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
