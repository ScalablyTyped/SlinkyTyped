package typingsSlinky.antd

import slinky.core.facade.ReactElement
import typingsSlinky.antd.antdStrings.horizontal
import typingsSlinky.antd.antdStrings.marginLeft
import typingsSlinky.antd.antdStrings.marginRight
import typingsSlinky.antd.antdStrings.vertical
import typingsSlinky.antd.configProviderSizeContextMod.SizeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spaceItemMod {
  
  @JSImport("antd/lib/space/Item", JSImport.Default)
  @js.native
  def default(hasClassNameDirectionIndexSizeMarginDirectionChildrenSplit: ItemProps): ReactElement | Null = js.native
  
  @js.native
  trait ItemProps extends StObject {
    
    var children: ReactElement = js.native
    
    var className: String = js.native
    
    var direction: js.UndefOr[horizontal | vertical] = js.native
    
    var index: Double = js.native
    
    var marginDirection: marginLeft | marginRight = js.native
    
    var size: js.UndefOr[SizeType | Double] = js.native
    
    var split: js.UndefOr[String | ReactElement] = js.native
  }
  object ItemProps {
    
    @scala.inline
    def apply(className: String, index: Double, marginDirection: marginLeft | marginRight): ItemProps = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], marginDirection = marginDirection.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemProps]
    }
    
    @scala.inline
    implicit class ItemPropsMutableBuilder[Self <: ItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginDirection(value: marginLeft | marginRight): Self = StObject.set(x, "marginDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: SizeType | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSplit(value: String | ReactElement): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitReactElement(value: ReactElement): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
    }
  }
}
