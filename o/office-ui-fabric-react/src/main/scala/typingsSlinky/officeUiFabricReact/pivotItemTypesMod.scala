package typingsSlinky.officeUiFabricReact

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonProps
import typingsSlinky.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pivotItemTypesMod {
  
  @js.native
  trait IPivotItemProps extends HTMLAttributes[HTMLDivElement] {
    
    /**
      * Defines whether to always render the pivot item (regardless of whether it is selected or not).
      * Useful if you're rendering content that is expensive to mount.
      *
      * @defaultvalue false
      */
    var alwaysRender: js.UndefOr[Boolean] = js.native
    
    /**
      * The aria label of each pivot link which will read by screen reader instead of linkText.
      *
      * Note that unless you have compelling requirements you should not override aria-label.
      */
    var ariaLabel: js.UndefOr[String] = js.native
    
    /**
      * Gets the component ref.
      */
    var componentRef: js.UndefOr[IRefObject[js.Object]] = js.native
    
    /**
      * Props for the header command button. This provides a way to pass in native props, such as data-* and aria-*,
      * for each pivot header/link element.
      */
    var headerButtonProps: js.UndefOr[IButtonProps | (StringDictionary[String | Double | Boolean])] = js.native
    
    /**
      * The text displayed of each pivot link.
      */
    var headerText: js.UndefOr[String] = js.native
    
    /**
      * Defines an optional item count displayed in parentheses just after the `linkText`.
      *
      * Examples: completed (4), Unread (99+)
      */
    var itemCount: js.UndefOr[Double | String] = js.native
    
    /**
      * An optional icon to show next to the pivot link.
      */
    var itemIcon: js.UndefOr[String] = js.native
    
    /**
      * An required key to uniquely identify a pivot item.
      *
      * Note: The 'key' from react props cannot be used inside component.
      */
    var itemKey: js.UndefOr[String] = js.native
    
    /**
      * Optional keytip for this PivotItem.
      */
    var keytipProps: js.UndefOr[IKeytipProps] = js.native
    
    /**
      * The text displayed of each pivot link - renaming to `headerText`.
      * @deprecated Use `headerText` instead.
      */
    var linkText: js.UndefOr[String] = js.native
    
    /**
      * Optional custom renderer for the pivot item link.
      */
    var onRenderItemLink: js.UndefOr[IRenderFunction[IPivotItemProps]] = js.native
  }
  object IPivotItemProps {
    
    @scala.inline
    def apply(): IPivotItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPivotItemProps]
    }
    
    @scala.inline
    implicit class IPivotItemPropsMutableBuilder[Self <: IPivotItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlwaysRender(value: Boolean): Self = StObject.set(x, "alwaysRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysRenderUndefined: Self = StObject.set(x, "alwaysRender", js.undefined)
      
      @scala.inline
      def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[js.Object]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ js.Object | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefRefObject(value: ReactRef[js.Object]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setHeaderButtonProps(value: IButtonProps | (StringDictionary[String | Double | Boolean])): Self = StObject.set(x, "headerButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderButtonPropsUndefined: Self = StObject.set(x, "headerButtonProps", js.undefined)
      
      @scala.inline
      def setHeaderText(value: String): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTextUndefined: Self = StObject.set(x, "headerText", js.undefined)
      
      @scala.inline
      def setItemCount(value: Double | String): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemCountUndefined: Self = StObject.set(x, "itemCount", js.undefined)
      
      @scala.inline
      def setItemIcon(value: String): Self = StObject.set(x, "itemIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIconUndefined: Self = StObject.set(x, "itemIcon", js.undefined)
      
      @scala.inline
      def setItemKey(value: String): Self = StObject.set(x, "itemKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemKeyUndefined: Self = StObject.set(x, "itemKey", js.undefined)
      
      @scala.inline
      def setKeytipProps(value: IKeytipProps): Self = StObject.set(x, "keytipProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeytipPropsUndefined: Self = StObject.set(x, "keytipProps", js.undefined)
      
      @scala.inline
      def setLinkText(value: String): Self = StObject.set(x, "linkText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkTextUndefined: Self = StObject.set(x, "linkText", js.undefined)
      
      @scala.inline
      def setOnRenderItemLink(
        value: (/* props */ js.UndefOr[IPivotItemProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPivotItemProps], ReactElement | Null]]) => ReactElement | Null
      ): Self = StObject.set(x, "onRenderItemLink", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRenderItemLinkUndefined: Self = StObject.set(x, "onRenderItemLink", js.undefined)
    }
  }
}
