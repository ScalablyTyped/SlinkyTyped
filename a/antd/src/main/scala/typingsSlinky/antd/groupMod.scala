package typingsSlinky.antd

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.antd.antdStrings.bottom
import typingsSlinky.antd.antdStrings.top
import typingsSlinky.antd.sizeContextMod.AvatarSize
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupMod extends Shortcut {
  
  @JSImport("antd/lib/avatar/group", JSImport.Default)
  @js.native
  val default: ReactComponentClass[GroupProps] = js.native
  
  @js.native
  trait GroupProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var maxCount: js.UndefOr[Double] = js.native
    
    var maxPopoverPlacement: js.UndefOr[top | bottom] = js.native
    
    var maxStyle: js.UndefOr[CSSProperties] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[AvatarSize] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object GroupProps {
    
    @scala.inline
    def apply(): GroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupProps]
    }
    
    @scala.inline
    implicit class GroupPropsMutableBuilder[Self <: GroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setMaxCount(value: Double): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxCountUndefined: Self = StObject.set(x, "maxCount", js.undefined)
      
      @scala.inline
      def setMaxPopoverPlacement(value: top | bottom): Self = StObject.set(x, "maxPopoverPlacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPopoverPlacementUndefined: Self = StObject.set(x, "maxPopoverPlacement", js.undefined)
      
      @scala.inline
      def setMaxStyle(value: CSSProperties): Self = StObject.set(x, "maxStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxStyleUndefined: Self = StObject.set(x, "maxStyle", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setSize(value: AvatarSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[GroupProps]
  
  /* This means you don't have to write `default`, but can instead just say `groupMod.foo` */
  override def _to: ReactComponentClass[GroupProps] = default
}
