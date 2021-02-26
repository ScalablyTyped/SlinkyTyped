package typingsSlinky.amapJsSdk.anon

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.amapJsSdk.AMap.LngLat
import typingsSlinky.amapJsSdk.AMap.Pixel
import typingsSlinky.amapJsSdk.AMap.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoMove extends StObject {
  
  var autoMove: js.UndefOr[Boolean] = js.native
  
  var closeWhenClickMap: js.UndefOr[Boolean] = js.native
  
  var content: js.UndefOr[String | HTMLElement] = js.native
  
  var isCustom: js.UndefOr[Boolean] = js.native
  
  var offset: js.UndefOr[Pixel] = js.native
  
  var position: js.UndefOr[LngLat] = js.native
  
  var showShadow: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[Size] = js.native
}
object AutoMove {
  
  @scala.inline
  def apply(): AutoMove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoMove]
  }
  
  @scala.inline
  implicit class AutoMoveMutableBuilder[Self <: AutoMove] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoMove(value: Boolean): Self = StObject.set(x, "autoMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoMoveUndefined: Self = StObject.set(x, "autoMove", js.undefined)
    
    @scala.inline
    def setCloseWhenClickMap(value: Boolean): Self = StObject.set(x, "closeWhenClickMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseWhenClickMapUndefined: Self = StObject.set(x, "closeWhenClickMap", js.undefined)
    
    @scala.inline
    def setContent(value: String | HTMLElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentHTMLElement(value: HTMLElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setIsCustom(value: Boolean): Self = StObject.set(x, "isCustom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCustomUndefined: Self = StObject.set(x, "isCustom", js.undefined)
    
    @scala.inline
    def setOffset(value: Pixel): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPosition(value: LngLat): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setShowShadow(value: Boolean): Self = StObject.set(x, "showShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowShadowUndefined: Self = StObject.set(x, "showShadow", js.undefined)
    
    @scala.inline
    def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
