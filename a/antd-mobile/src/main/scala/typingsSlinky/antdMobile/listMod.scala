package typingsSlinky.antdMobile

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.antdMobile.anon.PartialListProps
import typingsSlinky.antdMobile.anon.TypeofItem
import typingsSlinky.antdMobile.listItemMod.ListItemProps
import typingsSlinky.antdMobile.listPropsTypeMod.ListPropsType
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMod {
  
  @JSImport("antd-mobile/lib/list", JSImport.Default)
  @js.native
  class default () extends List
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/list", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/list", "default.Item")
    @js.native
    def Item: (Instantiable1[/* props */ ListItemProps, typingsSlinky.antdMobile.listItemMod.default]) with TypeofItem = js.native
    @scala.inline
    def Item_=(
      x: (Instantiable1[/* props */ ListItemProps, typingsSlinky.antdMobile.listItemMod.default]) with TypeofItem
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/lib/list", "default.defaultProps")
    @js.native
    def defaultProps: PartialListProps = js.native
    @scala.inline
    def defaultProps_=(x: PartialListProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait List
    extends Component[ListProps, js.Any, js.Any]
  
  @js.native
  trait ListProps extends ListPropsType {
    
    var className: js.UndefOr[String] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var role: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object ListProps {
    
    @scala.inline
    def apply(): ListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListProps]
    }
    
    @scala.inline
    implicit class ListPropsMutableBuilder[Self <: ListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
