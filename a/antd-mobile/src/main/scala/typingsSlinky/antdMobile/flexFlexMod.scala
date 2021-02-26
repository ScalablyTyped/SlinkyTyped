package typingsSlinky.antdMobile

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antdMobile.anon.Align
import typingsSlinky.antdMobile.antdMobileStrings.around
import typingsSlinky.antdMobile.antdMobileStrings.between
import typingsSlinky.antdMobile.antdMobileStrings.center
import typingsSlinky.antdMobile.antdMobileStrings.end
import typingsSlinky.antdMobile.antdMobileStrings.start
import typingsSlinky.antdMobile.antdMobileStrings.stretch
import typingsSlinky.antdMobile.flexPropsTypeMod.FlexPropsType
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flexFlexMod {
  
  @JSImport("antd-mobile/lib/flex/Flex", JSImport.Default)
  @js.native
  class default () extends Flex
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/flex/Flex", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/flex/Flex", "default.Item")
    @js.native
    def Item: js.Any = js.native
    @scala.inline
    def Item_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/lib/flex/Flex", "default.defaultProps")
    @js.native
    def defaultProps: Align = js.native
    @scala.inline
    def defaultProps_=(x: Align): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Flex
    extends Component[FlexProps, js.Any, js.Any]
  
  @js.native
  trait FlexProps extends FlexPropsType {
    
    var alignContent: js.UndefOr[start | end | center | between | around | stretch] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var onClick: js.UndefOr[js.Function1[/* e */ SyntheticMouseEvent[HTMLDivElement], Unit]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var role: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object FlexProps {
    
    @scala.inline
    def apply(): FlexProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlexProps]
    }
    
    @scala.inline
    implicit class FlexPropsMutableBuilder[Self <: FlexProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignContent(value: start | end | center | between | around | stretch): Self = StObject.set(x, "alignContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignContentUndefined: Self = StObject.set(x, "alignContent", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* e */ SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
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
