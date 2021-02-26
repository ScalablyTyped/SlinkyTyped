package typingsSlinky.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundImageLink extends StObject {
  
  var backgroundImageLink: js.UndefOr[String] = js.native
  
  var colorRgb: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
}
object BackgroundImageLink {
  
  @scala.inline
  def apply(): BackgroundImageLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundImageLink]
  }
  
  @scala.inline
  implicit class BackgroundImageLinkMutableBuilder[Self <: BackgroundImageLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundImageLink(value: String): Self = StObject.set(x, "backgroundImageLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundImageLinkUndefined: Self = StObject.set(x, "backgroundImageLink", js.undefined)
    
    @scala.inline
    def setColorRgb(value: String): Self = StObject.set(x, "colorRgb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorRgbUndefined: Self = StObject.set(x, "colorRgb", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
