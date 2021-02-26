package typingsSlinky.rcMenu

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.rcMenu.anon.PartialMenuState
import typingsSlinky.rcMenu.dividerMod.DividerProps
import typingsSlinky.rcMenu.menuMod.MenuProps
import typingsSlinky.rcMenu.menuMod.MenuState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-menu", JSImport.Default)
  @js.native
  class default protected ()
    extends typingsSlinky.rcMenu.menuMod.default {
    def this(props: MenuProps) = this()
  }
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("rc-menu", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rc-menu", "default.defaultProps.className")
      @js.native
      def className: String = js.native
      @scala.inline
      def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-menu", "default.defaultProps.defaultOpenKeys")
      @js.native
      def defaultOpenKeys: js.Array[js.Any] = js.native
      @scala.inline
      def defaultOpenKeys_=(x: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOpenKeys")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-menu", "default.defaultProps.defaultSelectedKeys")
      @js.native
      def defaultSelectedKeys: js.Array[js.Any] = js.native
      @scala.inline
      def defaultSelectedKeys_=(x: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultSelectedKeys")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-menu", "default.defaultProps.mode")
      @js.native
      def mode: String = js.native
      @scala.inline
      def mode_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-menu", "default.defaultProps.onClick")
      @js.native
      def onClick: js.Function0[Unit] = js.native
      @scala.inline
      def onClick_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClick")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-menu", "default.defaultProps.onDeselect")
      @js.native
      def onDeselect: js.Function0[Unit] = js.native
      @scala.inline
      def onDeselect_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onDeselect")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-menu", "default.defaultProps.onOpenChange")
      @js.native
      def onOpenChange: js.Function0[Unit] = js.native
      @scala.inline
      def onOpenChange_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onOpenChange")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-menu", "default.defaultProps.onSelect")
      @js.native
      def onSelect: js.Function0[Unit] = js.native
      @scala.inline
      def onSelect_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-menu", "default.defaultProps.overflowedIndicator")
      @js.native
      def overflowedIndicator: ReactElement = js.native
      @scala.inline
      def overflowedIndicator_=(x: ReactElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overflowedIndicator")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-menu", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: String = js.native
      @scala.inline
      def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-menu", "default.defaultProps.selectable")
      @js.native
      def selectable: Boolean = js.native
      @scala.inline
      def selectable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectable")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-menu", "default.defaultProps.subMenuCloseDelay")
      @js.native
      def subMenuCloseDelay: Double = js.native
      @scala.inline
      def subMenuCloseDelay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("subMenuCloseDelay")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-menu", "default.defaultProps.subMenuOpenDelay")
      @js.native
      def subMenuOpenDelay: Double = js.native
      @scala.inline
      def subMenuOpenDelay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("subMenuOpenDelay")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-menu", "default.defaultProps.triggerSubMenuAction")
      @js.native
      def triggerSubMenuAction: String = js.native
      @scala.inline
      def triggerSubMenuAction_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("triggerSubMenuAction")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("rc-menu", "default.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(nextProps: MenuProps, prevState: MenuState): PartialMenuState = js.native
  }
  
  @JSImport("rc-menu", "Divider")
  @js.native
  val Divider: ReactComponentClass[DividerProps] = js.native
  
  @JSImport("rc-menu", "Item")
  @js.native
  val Item: js.Any = js.native
  
  @JSImport("rc-menu", "ItemGroup")
  @js.native
  class ItemGroup ()
    extends typingsSlinky.rcMenu.menuItemGroupMod.default
  object ItemGroup {
    
    @JSImport("rc-menu", "ItemGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("rc-menu", "ItemGroup.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rc-menu", "ItemGroup.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      @scala.inline
      def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("rc-menu", "ItemGroup.isMenuItemGroup")
    @js.native
    def isMenuItemGroup: Boolean = js.native
    @scala.inline
    def isMenuItemGroup_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isMenuItemGroup")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rc-menu", "MenuItem")
  @js.native
  val MenuItem: js.Any = js.native
  
  @JSImport("rc-menu", "MenuItemGroup")
  @js.native
  class MenuItemGroup ()
    extends typingsSlinky.rcMenu.menuItemGroupMod.default
  object MenuItemGroup {
    
    @JSImport("rc-menu", "MenuItemGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("rc-menu", "MenuItemGroup.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rc-menu", "MenuItemGroup.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      @scala.inline
      def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("rc-menu", "MenuItemGroup.isMenuItemGroup")
    @js.native
    def isMenuItemGroup: Boolean = js.native
    @scala.inline
    def isMenuItemGroup_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isMenuItemGroup")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rc-menu", "SubMenu")
  @js.native
  val SubMenu: js.Any = js.native
}
