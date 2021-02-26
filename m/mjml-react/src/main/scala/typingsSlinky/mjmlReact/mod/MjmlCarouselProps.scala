package typingsSlinky.mjmlReact.mod

import typingsSlinky.csstype.mod.BackgroundColorProperty
import typingsSlinky.csstype.mod.BorderProperty
import typingsSlinky.csstype.mod.BorderRadiusProperty
import typingsSlinky.mjmlReact.mjmlReactStrings.hidden
import typingsSlinky.mjmlReact.mjmlReactStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MjmlCarouselProps extends StObject {
  
  var align: js.UndefOr[String] = js.native
  
  var backgroundColor: js.UndefOr[BackgroundColorProperty] = js.native
  
  var borderRadius: js.UndefOr[String | Double] = js.native
  
  var iconWidth: js.UndefOr[String] = js.native
  
  var leftIcon: js.UndefOr[String] = js.native
  
  var rightIcon: js.UndefOr[String] = js.native
  
  var tbBorder: js.UndefOr[BorderProperty[String | Double]] = js.native
  
  var tbBorderRadius: js.UndefOr[BorderRadiusProperty[String | Double]] = js.native
  
  var tbHoverBorderColor: js.UndefOr[String] = js.native
  
  var tbSelectedBorderColor: js.UndefOr[String] = js.native
  
  var tbWidth: js.UndefOr[String] = js.native
  
  var thumbnails: js.UndefOr[hidden | visible] = js.native
}
object MjmlCarouselProps {
  
  @scala.inline
  def apply(): MjmlCarouselProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlCarouselProps]
  }
  
  @scala.inline
  implicit class MjmlCarouselPropsMutableBuilder[Self <: MjmlCarouselProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: BackgroundColorProperty): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBorderRadius(value: String | Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    @scala.inline
    def setIconWidth(value: String): Self = StObject.set(x, "iconWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconWidthUndefined: Self = StObject.set(x, "iconWidth", js.undefined)
    
    @scala.inline
    def setLeftIcon(value: String): Self = StObject.set(x, "leftIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftIconUndefined: Self = StObject.set(x, "leftIcon", js.undefined)
    
    @scala.inline
    def setRightIcon(value: String): Self = StObject.set(x, "rightIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightIconUndefined: Self = StObject.set(x, "rightIcon", js.undefined)
    
    @scala.inline
    def setTbBorder(value: BorderProperty[String | Double]): Self = StObject.set(x, "tbBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTbBorderRadius(value: BorderRadiusProperty[String | Double]): Self = StObject.set(x, "tbBorderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTbBorderRadiusUndefined: Self = StObject.set(x, "tbBorderRadius", js.undefined)
    
    @scala.inline
    def setTbBorderUndefined: Self = StObject.set(x, "tbBorder", js.undefined)
    
    @scala.inline
    def setTbHoverBorderColor(value: String): Self = StObject.set(x, "tbHoverBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTbHoverBorderColorUndefined: Self = StObject.set(x, "tbHoverBorderColor", js.undefined)
    
    @scala.inline
    def setTbSelectedBorderColor(value: String): Self = StObject.set(x, "tbSelectedBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTbSelectedBorderColorUndefined: Self = StObject.set(x, "tbSelectedBorderColor", js.undefined)
    
    @scala.inline
    def setTbWidth(value: String): Self = StObject.set(x, "tbWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTbWidthUndefined: Self = StObject.set(x, "tbWidth", js.undefined)
    
    @scala.inline
    def setThumbnails(value: hidden | visible): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
  }
}
