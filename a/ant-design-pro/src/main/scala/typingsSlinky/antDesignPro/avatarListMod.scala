package typingsSlinky.antDesignPro

import org.scalablytyped.runtime.Instantiable1
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.antDesignPro.avatarItemMod.AvatarItemProps
import typingsSlinky.antDesignPro.avatarItemMod.SizeType
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avatarListMod {
  
  @JSImport("ant-design-pro/lib/AvatarList", JSImport.Default)
  @js.native
  class default ()
    extends Component[AvatarListProps, js.Any, js.Any]
  /* static members */
  object default {
    
    @JSImport("ant-design-pro/lib/AvatarList", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ant-design-pro/lib/AvatarList", "default.Item")
    @js.native
    def Item: Instantiable1[/* props */ AvatarItemProps, typingsSlinky.antDesignPro.avatarItemMod.default] = js.native
    @scala.inline
    def Item_=(x: Instantiable1[/* props */ AvatarItemProps, typingsSlinky.antDesignPro.avatarItemMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  }
  
  type AvatarList = ReactComponentClass[AvatarListProps]
  
  @js.native
  trait AvatarListProps extends StObject {
    
    var Item: js.UndefOr[ReactElement] = js.native
    
    var children: ReactElement | js.Array[ReactElement] = js.native
    
    var excessItemsStyle: js.UndefOr[CSSProperties] = js.native
    
    var maxLength: js.UndefOr[Double] = js.native
    
    var size: js.UndefOr[SizeType] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object AvatarListProps {
    
    @scala.inline
    def apply(children: ReactElement | js.Array[ReactElement]): AvatarListProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvatarListProps]
    }
    
    @scala.inline
    implicit class AvatarListPropsMutableBuilder[Self <: AvatarListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement | js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setExcessItemsStyle(value: CSSProperties): Self = StObject.set(x, "excessItemsStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcessItemsStyleUndefined: Self = StObject.set(x, "excessItemsStyle", js.undefined)
      
      @scala.inline
      def setItem(value: ReactElement): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setSize(value: SizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
