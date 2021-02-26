package typingsSlinky.antdMobile

import typingsSlinky.antdMobile.anon.CheckboxProps
import typingsSlinky.antdMobile.checkboxPropsTypeMod.CheckboxItemPropsType
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxItemMod {
  
  @JSImport("antd-mobile/lib/checkbox/CheckboxItem", JSImport.Default)
  @js.native
  class default () extends CheckboxItem
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/checkbox/CheckboxItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/checkbox/CheckboxItem", "default.defaultProps")
    @js.native
    def defaultProps: CheckboxProps = js.native
    @scala.inline
    def defaultProps_=(x: CheckboxProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait CheckboxItem
    extends Component[CheckboxItemProps, js.Any, js.Any]
  
  @js.native
  trait CheckboxItemProps extends CheckboxItemPropsType {
    
    var checkboxProps: js.UndefOr[typingsSlinky.antdMobile.checkboxCheckboxMod.CheckboxProps] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var listPrefixCls: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var wrapLabel: js.UndefOr[Boolean] = js.native
  }
  object CheckboxItemProps {
    
    @scala.inline
    def apply(): CheckboxItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxItemProps]
    }
    
    @scala.inline
    implicit class CheckboxItemPropsMutableBuilder[Self <: CheckboxItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckboxProps(value: typingsSlinky.antdMobile.checkboxCheckboxMod.CheckboxProps): Self = StObject.set(x, "checkboxProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckboxPropsUndefined: Self = StObject.set(x, "checkboxProps", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setListPrefixCls(value: String): Self = StObject.set(x, "listPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListPrefixClsUndefined: Self = StObject.set(x, "listPrefixCls", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setWrapLabel(value: Boolean): Self = StObject.set(x, "wrapLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapLabelUndefined: Self = StObject.set(x, "wrapLabel", js.undefined)
    }
  }
}
