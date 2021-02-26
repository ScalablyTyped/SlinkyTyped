package typingsSlinky.antd

import org.scalablytyped.runtime.Instantiable0
import slinky.core.ReactComponentClass
import typingsSlinky.antd.anon.TypeofItem
import typingsSlinky.antd.anon.TypeofItemGroup
import typingsSlinky.antd.anon.TypeofSubMenu
import typingsSlinky.antd.menuContextMod.MenuTheme
import typingsSlinky.rcMenu.dividerMod.DividerProps
import typingsSlinky.rcMenu.mod.ItemGroup
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuMod {
  
  @JSImport("antd/lib/menu", JSImport.Default)
  @js.native
  class default () extends Menu
  /* static members */
  object default {
    
    @JSImport("antd/lib/menu", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/lib/menu", "default.Divider")
    @js.native
    def Divider: ReactComponentClass[DividerProps] = js.native
    @scala.inline
    def Divider_=(x: ReactComponentClass[DividerProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Divider")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/menu", "default.Item")
    @js.native
    def Item: TypeofItem = js.native
    
    @JSImport("antd/lib/menu", "default.ItemGroup")
    @js.native
    def ItemGroup: TypeofItemGroup with Instantiable0[typingsSlinky.rcMenu.mod.ItemGroup] = js.native
    @scala.inline
    def ItemGroup_=(x: TypeofItemGroup with Instantiable0[ItemGroup]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ItemGroup")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Item_=(x: TypeofItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/menu", "default.SubMenu")
    @js.native
    def SubMenu: Instantiable0[typingsSlinky.antd.subMenuMod.default] with TypeofSubMenu = js.native
    @scala.inline
    def SubMenu_=(x: Instantiable0[typingsSlinky.antd.subMenuMod.default] with TypeofSubMenu): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SubMenu")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Menu
    extends Component[MenuProps, js.Object, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.antd.antdStrings.vertical
    - typingsSlinky.antd.antdStrings.`vertical-left`
    - typingsSlinky.antd.antdStrings.`vertical-right`
    - typingsSlinky.antd.antdStrings.horizontal
    - typingsSlinky.antd.antdStrings.`inline`
  */
  trait MenuMode extends StObject
  object MenuMode {
    
    @scala.inline
    def horizontal: typingsSlinky.antd.antdStrings.horizontal = "horizontal".asInstanceOf[typingsSlinky.antd.antdStrings.horizontal]
    
    @scala.inline
    def `inline`: typingsSlinky.antd.antdStrings.`inline` = "inline".asInstanceOf[typingsSlinky.antd.antdStrings.`inline`]
    
    @scala.inline
    def vertical: typingsSlinky.antd.antdStrings.vertical = "vertical".asInstanceOf[typingsSlinky.antd.antdStrings.vertical]
    
    @scala.inline
    def `vertical-left`: typingsSlinky.antd.antdStrings.`vertical-left` = "vertical-left".asInstanceOf[typingsSlinky.antd.antdStrings.`vertical-left`]
    
    @scala.inline
    def `vertical-right`: typingsSlinky.antd.antdStrings.`vertical-right` = "vertical-right".asInstanceOf[typingsSlinky.antd.antdStrings.`vertical-right`]
  }
  
  @js.native
  trait MenuProps
    extends typingsSlinky.rcMenu.menuMod.MenuProps {
    
    var focusable: js.UndefOr[Boolean] = js.native
    
    var inlineIndent: js.UndefOr[Double] = js.native
    
    var theme: js.UndefOr[MenuTheme] = js.native
  }
  object MenuProps {
    
    @scala.inline
    def apply(): MenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuProps]
    }
    
    @scala.inline
    implicit class MenuPropsMutableBuilder[Self <: MenuProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      @scala.inline
      def setInlineIndent(value: Double): Self = StObject.set(x, "inlineIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineIndentUndefined: Self = StObject.set(x, "inlineIndent", js.undefined)
      
      @scala.inline
      def setTheme(value: MenuTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
