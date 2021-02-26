package typingsSlinky.antdMobile

import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antdMobile.antdMobileStrings._empty
import typingsSlinky.antdMobile.antdMobileStrings.android
import typingsSlinky.antdMobile.antdMobileStrings.bottom
import typingsSlinky.antdMobile.antdMobileStrings.down
import typingsSlinky.antdMobile.antdMobileStrings.empty
import typingsSlinky.antdMobile.antdMobileStrings.horizontal
import typingsSlinky.antdMobile.antdMobileStrings.ios
import typingsSlinky.antdMobile.antdMobileStrings.middle
import typingsSlinky.antdMobile.antdMobileStrings.top
import typingsSlinky.antdMobile.antdMobileStrings.up
import typingsSlinky.antdMobile.listPropsTypeMod.ListItemPropsType
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemMod {
  
  @JSImport("antd-mobile/lib/list/ListItem", JSImport.Default)
  @js.native
  class default protected () extends ListItem {
    def this(props: ListItemProps) = this()
  }
  object default {
    
    @JSImport("antd-mobile/lib/list/ListItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("antd-mobile/lib/list/ListItem", "default.Brief")
    @js.native
    class Brief ()
      extends typingsSlinky.antdMobile.listItemMod.Brief
    /* static member */
    /* was `typeof Brief` */
    @JSImport("antd-mobile/lib/list/ListItem", "default.Brief")
    @js.native
    def Brief: Instantiable0[typingsSlinky.antdMobile.listItemMod.Brief] = js.native
    @scala.inline
    def Brief_=(x: Instantiable0[typingsSlinky.antdMobile.listItemMod.Brief]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Brief")(x.asInstanceOf[js.Any])
    
    /* static member */
    /* Inlined std.Partial<antd-mobile.antd-mobile/lib/list/ListItem.ListItemProps> */
    object defaultProps {
      
      @JSImport("antd-mobile/lib/list/ListItem", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("antd-mobile/lib/list/ListItem", "default.defaultProps.activeStyle")
      @js.native
      def activeStyle: js.UndefOr[CSSProperties] = js.native
      @scala.inline
      def activeStyle_=(x: js.UndefOr[CSSProperties]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeStyle")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile/lib/list/ListItem", "default.defaultProps.align")
      @js.native
      def align: js.UndefOr[top | middle | bottom] = js.native
      @scala.inline
      def align_=(x: js.UndefOr[top | middle | bottom]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("align")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile/lib/list/ListItem", "default.defaultProps.arrow")
      @js.native
      def arrow: js.UndefOr[horizontal | down | up | empty | _empty] = js.native
      @scala.inline
      def arrow_=(x: js.UndefOr[horizontal | down | up | empty | _empty]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrow")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile/lib/list/ListItem", "default.defaultProps.className")
      @js.native
      def className: js.UndefOr[String] = js.native
      @scala.inline
      def className_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile/lib/list/ListItem", "default.defaultProps.disabled")
      @js.native
      def disabled: js.UndefOr[Boolean] = js.native
      @scala.inline
      def disabled_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile/lib/list/ListItem", "default.defaultProps.error")
      @js.native
      def error: js.UndefOr[Boolean] = js.native
      @scala.inline
      def error_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile/lib/list/ListItem", "default.defaultProps.extra")
      @js.native
      def extra: js.UndefOr[ReactElement] = js.native
      @scala.inline
      def extra_=(x: js.UndefOr[ReactElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extra")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile/lib/list/ListItem", "default.defaultProps.multipleLine")
      @js.native
      def multipleLine: js.UndefOr[Boolean] = js.native
      @scala.inline
      def multipleLine_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("multipleLine")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile/lib/list/ListItem", "default.defaultProps.onClick")
      @js.native
      def onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
      @scala.inline
      def onClick_=(x: js.UndefOr[MouseEventHandler[HTMLDivElement]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClick")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile/lib/list/ListItem", "default.defaultProps.platform")
      @js.native
      def platform: js.UndefOr[android | ios] = js.native
      @scala.inline
      def platform_=(x: js.UndefOr[android | ios]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("platform")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile/lib/list/ListItem", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: js.UndefOr[String] = js.native
      @scala.inline
      def prefixCls_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile/lib/list/ListItem", "default.defaultProps.role")
      @js.native
      def role: js.UndefOr[String] = js.native
      @scala.inline
      def role_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile/lib/list/ListItem", "default.defaultProps.style")
      @js.native
      def style: js.UndefOr[CSSProperties] = js.native
      @scala.inline
      def style_=(x: js.UndefOr[CSSProperties]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("style")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile/lib/list/ListItem", "default.defaultProps.thumb")
      @js.native
      def thumb: js.UndefOr[ReactElement | Null] = js.native
      @scala.inline
      def thumb_=(x: js.UndefOr[ReactElement | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("thumb")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile/lib/list/ListItem", "default.defaultProps.wrap")
      @js.native
      def wrap: js.UndefOr[Boolean] = js.native
      @scala.inline
      def wrap_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrap")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("antd-mobile/lib/list/ListItem", "Brief")
  @js.native
  class Brief protected ()
    extends Component[BriefProps, js.Any, js.Any] {
    def this(props: BriefProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BriefProps, context: js.Any) = this()
  }
  
  @js.native
  trait BriefProps
    extends typingsSlinky.antdMobile.listPropsTypeMod.BriefProps {
    
    var className: js.UndefOr[String] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var role: js.UndefOr[String] = js.native
  }
  object BriefProps {
    
    @scala.inline
    def apply(): BriefProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BriefProps]
    }
    
    @scala.inline
    implicit class BriefPropsMutableBuilder[Self <: BriefProps] (val x: Self) extends AnyVal {
      
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
    }
  }
  
  @js.native
  trait ListItem
    extends Component[ListItemProps, js.Any, js.Any] {
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MListItem(): Unit = js.native
    
    var debounceTimeout: js.Any = js.native
    
    def onClick(ev: SyntheticMouseEvent[HTMLDivElement]): Unit = js.native
  }
  
  @js.native
  trait ListItemProps extends ListItemPropsType {
    
    var className: js.UndefOr[String] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var role: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object ListItemProps {
    
    @scala.inline
    def apply(): ListItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemProps]
    }
    
    @scala.inline
    implicit class ListItemPropsMutableBuilder[Self <: ListItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
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
