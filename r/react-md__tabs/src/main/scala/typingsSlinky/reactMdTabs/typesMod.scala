package typingsSlinky.reactMdTabs

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactMdTabs.reactMdTabsStrings.horizontal
import typingsSlinky.reactMdTabs.reactMdTabsStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait TabConfig extends StObject {
    
    /**
      * The children to display in the tab. This is required and should normally
      * just be text or an icon.
      */
    var children: js.UndefOr[ReactElement] = js.native
    
    /**
      * An optional className to apply to the tab.
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * An optional className to apply to the `<span>` surrounding the `children`
      * of the `Tab`. You _probably_ won't need to use this.
      */
    var contentClassName: js.UndefOr[String] = js.native
    
    /**
      * An optional style to apply to the `<span>` surrounding the `children` of
      * the `Tab`. You _probably_ won't need to use this.
      */
    var contentStyle: js.UndefOr[CSSProperties] = js.native
    
    /**
      * Boolean if the tab should be disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * An optional icon to render in the `Tab` along with the normal text. If you
      * want to have an icon only tab, you should not use this prop and instead
      * just provide the icon as the tab's children.
      */
    var icon: js.UndefOr[ReactElement] = js.native
    
    /**
      * Boolean if the icon should appear after the text instead of before. When
      * the `stacked` prop is also enabled, it will cause the icon to appear below
      * the text instead of above.
      */
    var iconAfter: js.UndefOr[Boolean] = js.native
    
    /**
      * An optional id to use for the tab if the default generated ids are not to
      * your liking.
      */
    var id: js.UndefOr[String] = js.native
    
    /**
      * Boolean if the icon and text should be stacked instead of rendered inline.
      * This is only valid when the `icon` prop has been provided.
      */
    var stacked: js.UndefOr[Boolean] = js.native
    
    /**
      * An optional style to apply to the tab.
      */
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object TabConfig {
    
    @scala.inline
    def apply(): TabConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabConfig]
    }
    
    @scala.inline
    implicit class TabConfigMutableBuilder[Self <: TabConfig] (val x: Self) extends AnyVal {
      
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
      def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      @scala.inline
      def setContentStyle(value: CSSProperties): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconAfter(value: Boolean): Self = StObject.set(x, "iconAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconAfterUndefined: Self = StObject.set(x, "iconAfter", js.undefined)
      
      @scala.inline
      def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setStacked(value: Boolean): Self = StObject.set(x, "stacked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackedUndefined: Self = StObject.set(x, "stacked", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactMdTabs.reactMdTabsStrings.left
    - typingsSlinky.reactMdTabs.reactMdTabsStrings.center
    - typingsSlinky.reactMdTabs.reactMdTabsStrings.right
  */
  trait TabsAlignment extends StObject
  object TabsAlignment {
    
    @scala.inline
    def center: typingsSlinky.reactMdTabs.reactMdTabsStrings.center = "center".asInstanceOf[typingsSlinky.reactMdTabs.reactMdTabsStrings.center]
    
    @scala.inline
    def left: typingsSlinky.reactMdTabs.reactMdTabsStrings.left = "left".asInstanceOf[typingsSlinky.reactMdTabs.reactMdTabsStrings.left]
    
    @scala.inline
    def right: typingsSlinky.reactMdTabs.reactMdTabsStrings.right = "right".asInstanceOf[typingsSlinky.reactMdTabs.reactMdTabsStrings.right]
  }
  
  @js.native
  trait TabsConfig extends StObject {
    
    /**
      * The alignment to use for the tabs.
      */
    var align: js.UndefOr[TabsAlignment] = js.native
    
    /**
      * Boolean if the tab should automatically become active when the user
      * navigates to the tab with the arrow keys.
      *
      * @see https://www.w3.org/TR/wai-aria-practices/#kbd_selection_follows_focus
      */
    var automatic: js.UndefOr[Boolean] = js.native
    
    /**
      * The orientation for the tabs. When this is set to vertical, the keyboard
      * movement will be updated to use Up and Down arrow keys instead of Left and
      * Right.
      */
    var orientation: js.UndefOr[horizontal | vertical] = js.native
    
    /**
      * Boolean if you know that the tabs will be scrollable which will add some
      * additional padding before the first tab to help users know that there's
      * additional tabs.
      */
    var padded: js.UndefOr[Boolean] = js.native
  }
  object TabsConfig {
    
    @scala.inline
    def apply(): TabsConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabsConfig]
    }
    
    @scala.inline
    implicit class TabsConfigMutableBuilder[Self <: TabsConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: TabsAlignment): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setAutomatic(value: Boolean): Self = StObject.set(x, "automatic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutomaticUndefined: Self = StObject.set(x, "automatic", js.undefined)
      
      @scala.inline
      def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setPadded(value: Boolean): Self = StObject.set(x, "padded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddedUndefined: Self = StObject.set(x, "padded", js.undefined)
    }
  }
}
