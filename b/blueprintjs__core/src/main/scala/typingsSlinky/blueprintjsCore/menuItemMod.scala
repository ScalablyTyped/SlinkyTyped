package typingsSlinky.blueprintjsCore

import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsCore.anon.PartialIPopoverProps
import typingsSlinky.blueprintjsCore.commonMod.AbstractPureComponent2
import typingsSlinky.blueprintjsCore.propsMod.IActionProps
import typingsSlinky.blueprintjsCore.propsMod.ILinkProps
import typingsSlinky.react.mod.AnchorHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuItemMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/menu/menuItem", "MenuItem")
  @js.native
  class MenuItem protected ()
    extends AbstractPureComponent2[IMenuItemProps with AnchorHTMLAttributes[HTMLAnchorElement], js.Object, js.Object] {
    def this(props: IMenuItemProps with AnchorHTMLAttributes[HTMLAnchorElement]) = this()
    def this(props: IMenuItemProps with AnchorHTMLAttributes[HTMLAnchorElement], context: js.Any) = this()
    
    var maybeRenderLabel: js.Any = js.native
    
    var maybeRenderPopover: js.Any = js.native
  }
  /* static members */
  object MenuItem {
    
    @JSImport("@blueprintjs/core/lib/esm/components/menu/menuItem", "MenuItem")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/menu/menuItem", "MenuItem.defaultProps")
    @js.native
    def defaultProps: IMenuItemProps = js.native
    @scala.inline
    def defaultProps_=(x: IMenuItemProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/menu/menuItem", "MenuItem.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IMenuItemProps
    extends IActionProps
       with ILinkProps {
    
    /** Whether this menu item should appear with an active state. */
    var active: js.UndefOr[Boolean] = js.native
    
    /**
      * Children of this component will be rendered in a __submenu__ that appears when hovering or
      * clicking on this menu item.
      *
      * Use `text` prop for the content of the menu item itself.
      */
    var children: js.UndefOr[ReactElement] = js.native
    
    /**
      * HTML title to be passed to the <Text> component
      */
    var htmlTitle: js.UndefOr[String] = js.native
    
    /**
      * Right-aligned label text content, useful for displaying hotkeys.
      *
      * This prop actually supports JSX elements, but TypeScript will throw an error because
      * `HTMLAttributes` only allows strings. Use `labelElement` to supply a JSX element in TypeScript.
      */
    var label: js.UndefOr[String] = js.native
    
    /**
      * A space-delimited list of class names to pass along to the right-aligned label wrapper element.
      */
    var labelClassName: js.UndefOr[String] = js.native
    
    /**
      * Right-aligned label content, useful for displaying hotkeys.
      */
    var labelElement: js.UndefOr[ReactElement] = js.native
    
    /**
      * Whether the text should be allowed to wrap to multiple lines.
      * If `false`, text will be truncated with an ellipsis when it reaches `max-width`.
      * @default false
      */
    var multiline: js.UndefOr[Boolean] = js.native
    
    /**
      * Props to spread to `Popover`. Note that `content` and `minimal` cannot be
      * changed and `usePortal` defaults to `false` so all submenus will live in
      * the same container.
      */
    var popoverProps: js.UndefOr[PartialIPopoverProps] = js.native
    
    /**
      * Whether an enabled item without a submenu should automatically close its parent popover when clicked.
      * @default true
      */
    var shouldDismissPopover: js.UndefOr[Boolean] = js.native
    
    /**
      * Name of the HTML tag that wraps the MenuItem.
      * @default "a"
      */
    var tagName: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
      ] = js.native
    
    /**
      * A space-delimited list of class names to pass along to the text wrapper element.
      */
    var textClassName: js.UndefOr[String] = js.native
    
    /** Item text, required for usability. */
    @JSName("text")
    var text_IMenuItemProps: ReactElement = js.native
  }
  object IMenuItemProps {
    
    @scala.inline
    def apply(): IMenuItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMenuItemProps]
    }
    
    @scala.inline
    implicit class IMenuItemPropsMutableBuilder[Self <: IMenuItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setHtmlTitle(value: String): Self = StObject.set(x, "htmlTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlTitleUndefined: Self = StObject.set(x, "htmlTitle", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelClassName(value: String): Self = StObject.set(x, "labelClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelClassNameUndefined: Self = StObject.set(x, "labelClassName", js.undefined)
      
      @scala.inline
      def setLabelElement(value: ReactElement): Self = StObject.set(x, "labelElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelElementReactElement(value: ReactElement): Self = StObject.set(x, "labelElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelElementUndefined: Self = StObject.set(x, "labelElement", js.undefined)
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
      
      @scala.inline
      def setPopoverProps(value: PartialIPopoverProps): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
      
      @scala.inline
      def setShouldDismissPopover(value: Boolean): Self = StObject.set(x, "shouldDismissPopover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldDismissPopoverUndefined: Self = StObject.set(x, "shouldDismissPopover", js.undefined)
      
      @scala.inline
      def setTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
      
      @scala.inline
      def setText(value: ReactElement): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextClassName(value: String): Self = StObject.set(x, "textClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextClassNameUndefined: Self = StObject.set(x, "textClassName", js.undefined)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
