package typingsSlinky.reactElemental.mod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipProps extends StObject {
  
  val bottom: js.UndefOr[Boolean] = js.native
  
  val children: ReactElement = js.native
  
  val contents: ReactElement = js.native
  
  val offset: js.UndefOr[Double] = js.native
  
  val persistent: js.UndefOr[Boolean] = js.native
  
  val style: js.UndefOr[CSSProperties] = js.native
  
  val top: js.UndefOr[Boolean] = js.native
  
  val width: js.UndefOr[Double | String] = js.native
}
object TooltipProps {
  
  @scala.inline
  def apply(contents: ReactElement): TooltipProps = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipProps]
  }
  
  @scala.inline
  implicit class TooltipPropsMutableBuilder[Self <: TooltipProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: Boolean): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setContents(value: ReactElement): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
