package typingsSlinky.ckeditor.CKEDITOR

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait sharedSpace extends StObject {
  
  var bottom: js.UndefOr[String | HTMLElement] = js.native
  
  var top: js.UndefOr[String | HTMLElement] = js.native
}
object sharedSpace {
  
  @scala.inline
  def apply(): sharedSpace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[sharedSpace]
  }
  
  @scala.inline
  implicit class sharedSpaceMutableBuilder[Self <: sharedSpace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: String | HTMLElement): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomHTMLElement(value: HTMLElement): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setTop(value: String | HTMLElement): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopHTMLElement(value: HTMLElement): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
