package typingsSlinky.officeUiFabricReact

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import typingsSlinky.fluentuiReactFocus.focusZoneTypesMod.IFocusZoneProps
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonProps
import typingsSlinky.officeUiFabricReact.iconTypesMod.IIconProps
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.a
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.h1
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.h2
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.h3
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.h4
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.h5
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.h6
import typingsSlinky.officeUiFabricReact.tooltipHostTypesMod.ITooltipHostProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.icomponentasMod.IComponentAs
import typingsSlinky.uifabricUtilities.icomponentasMod.IComponentAsProps
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbTypesMod {
  
  @js.native
  trait IBreadcrumb extends StObject {
    
    /**
      * Sets focus to the first breadcrumb link.
      */
    def focus(): Unit = js.native
  }
  object IBreadcrumb {
    
    @scala.inline
    def apply(focus: () => Unit): IBreadcrumb = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[IBreadcrumb]
    }
    
    @scala.inline
    implicit class IBreadcrumbMutableBuilder[Self <: IBreadcrumb] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait IBreadcrumbData extends StObject {
    
    var props: IBreadcrumbProps = js.native
    
    var renderedItems: js.Array[IBreadcrumbItem] = js.native
    
    var renderedOverflowItems: js.Array[IBreadcrumbItem] = js.native
  }
  object IBreadcrumbData {
    
    @scala.inline
    def apply(
      props: IBreadcrumbProps,
      renderedItems: js.Array[IBreadcrumbItem],
      renderedOverflowItems: js.Array[IBreadcrumbItem]
    ): IBreadcrumbData = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], renderedItems = renderedItems.asInstanceOf[js.Any], renderedOverflowItems = renderedOverflowItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBreadcrumbData]
    }
    
    @scala.inline
    implicit class IBreadcrumbDataMutableBuilder[Self <: IBreadcrumbData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProps(value: IBreadcrumbProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderedItems(value: js.Array[IBreadcrumbItem]): Self = StObject.set(x, "renderedItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderedItemsVarargs(value: IBreadcrumbItem*): Self = StObject.set(x, "renderedItems", js.Array(value :_*))
      
      @scala.inline
      def setRenderedOverflowItems(value: js.Array[IBreadcrumbItem]): Self = StObject.set(x, "renderedOverflowItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderedOverflowItemsVarargs(value: IBreadcrumbItem*): Self = StObject.set(x, "renderedOverflowItems", js.Array(value :_*))
    }
  }
  
  @js.native
  trait IBreadcrumbItem extends StObject {
    
    /**
      * Optional prop to render the item as a heading of your choice.
      *
      * You can also use this to force items to render as links instead of buttons (by default,
      * any item with a `href` renders as a link, and any item without a `href` renders as a button).
      * This is not generally recommended because it may prevent activating the link using the keyboard.
      */
    var as: js.UndefOr[h1 | h2 | h3 | h4 | h5 | h6 | a] = js.native
    
    /**
      * Url to navigate to when this breadcrumb item is clicked.
      */
    var href: js.UndefOr[String] = js.native
    
    /**
      * Whether this is the breadcrumb item the user is currently navigated to.
      * If true, `aria-current="page"` will be applied to this breadcrumb item.
      */
    var isCurrentItem: js.UndefOr[Boolean] = js.native
    
    /**
      * Arbitrary unique string associated with the breadcrumb item.
      */
    var key: String = js.native
    
    /**
      * Callback issued when the breadcrumb item is selected.
      */
    var onClick: js.UndefOr[
        js.Function2[
          /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], 
          /* item */ js.UndefOr[this.type], 
          Unit
        ]
      ] = js.native
    
    /**
      * Optional role for the breadcrumb item (which renders as a button by default)
      */
    var role: js.UndefOr[String] = js.native
    
    /**
      * Text to display to the user for the breadcrumb item.
      */
    var text: String = js.native
  }
  object IBreadcrumbItem {
    
    @scala.inline
    def apply(key: String, text: String): IBreadcrumbItem = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBreadcrumbItem]
    }
    
    @scala.inline
    implicit class IBreadcrumbItemMutableBuilder[Self <: IBreadcrumbItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: h1 | h2 | h3 | h4 | h5 | h6 | a): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setIsCurrentItem(value: Boolean): Self = StObject.set(x, "isCurrentItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCurrentItemUndefined: Self = StObject.set(x, "isCurrentItem", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(
        value: (/* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], /* item */ js.UndefOr[IBreadcrumbItem]) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IBreadcrumbProps extends HTMLAttributes[HTMLElement] {
    
    /**
      * Aria label for the root element of the breadcrumb (which is a navigation landmark).
      */
    var ariaLabel: js.UndefOr[String] = js.native
    
    /**
      * Optional callback to access the IBreadcrumb interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[IBreadcrumb]] = js.native
    
    /**
      * Render a custom divider in place of the default chevron `>`
      */
    var dividerAs: js.UndefOr[IComponentAs[IDividerAsProps]] = js.native
    
    /**
      * Extra props for the root FocusZone.
      */
    var focusZoneProps: js.UndefOr[IFocusZoneProps] = js.native
    
    /**
      * Collection of breadcrumbs to render
      */
    var items: js.Array[IBreadcrumbItem] = js.native
    
    /**
      * The maximum number of breadcrumbs to display before coalescing.
      * If not specified, all breadcrumbs will be rendered.
      */
    var maxDisplayedItems: js.UndefOr[Double] = js.native
    
    /**
      * Method that determines how to group the length of the breadcrumb.
      * Return undefined to never increase breadcrumb length.
      */
    var onGrowData: js.UndefOr[js.Function1[/* data */ IBreadcrumbData, js.UndefOr[IBreadcrumbData]]] = js.native
    
    /**
      * Method that determines how to reduce the length of the breadcrumb.
      * Return undefined to never reduce breadcrumb length.
      */
    var onReduceData: js.UndefOr[js.Function1[/* data */ IBreadcrumbData, js.UndefOr[IBreadcrumbData]]] = js.native
    
    /** Custom render function for each breadcrumb item. */
    var onRenderItem: js.UndefOr[IRenderFunction[IBreadcrumbItem]] = js.native
    
    /**
      * Render a custom overflow icon in place of the default icon `...`
      */
    var onRenderOverflowIcon: js.UndefOr[IRenderFunction[IButtonProps]] = js.native
    
    /**
      * Aria label for the overflow button.
      */
    var overflowAriaLabel: js.UndefOr[String] = js.native
    
    /**
      * Custom component for the overflow button.
      */
    var overflowButtonAs: js.UndefOr[IComponentAs[IButtonProps]] = js.native
    
    /**
      * Optional index where overflow items will be collapsed. Defaults to 0.
      */
    var overflowIndex: js.UndefOr[Double] = js.native
    
    var styles: js.UndefOr[IStyleFunctionOrObject[IBreadcrumbStyleProps, IBreadcrumbStyles]] = js.native
    
    var theme: js.UndefOr[ITheme] = js.native
    
    /**
      * Extra props for the TooltipHost which wraps each breadcrumb item.
      */
    var tooltipHostProps: js.UndefOr[ITooltipHostProps] = js.native
  }
  object IBreadcrumbProps {
    
    @scala.inline
    def apply(items: js.Array[IBreadcrumbItem]): IBreadcrumbProps = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBreadcrumbProps]
    }
    
    @scala.inline
    implicit class IBreadcrumbPropsMutableBuilder[Self <: IBreadcrumbProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[IBreadcrumb]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ IBreadcrumb | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefRefObject(value: ReactRef[IBreadcrumb]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setDividerAs(value: IComponentAs[IDividerAsProps]): Self = StObject.set(x, "dividerAs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDividerAsComponentClass(value: ReactComponentClass[IComponentAsProps[IDividerAsProps]]): Self = StObject.set(x, "dividerAs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDividerAsFunctionComponent(value: ReactComponentClass[IComponentAsProps[IDividerAsProps]]): Self = StObject.set(x, "dividerAs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDividerAsUndefined: Self = StObject.set(x, "dividerAs", js.undefined)
      
      @scala.inline
      def setFocusZoneProps(value: IFocusZoneProps): Self = StObject.set(x, "focusZoneProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusZonePropsUndefined: Self = StObject.set(x, "focusZoneProps", js.undefined)
      
      @scala.inline
      def setItems(value: js.Array[IBreadcrumbItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: IBreadcrumbItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setMaxDisplayedItems(value: Double): Self = StObject.set(x, "maxDisplayedItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDisplayedItemsUndefined: Self = StObject.set(x, "maxDisplayedItems", js.undefined)
      
      @scala.inline
      def setOnGrowData(value: /* data */ IBreadcrumbData => js.UndefOr[IBreadcrumbData]): Self = StObject.set(x, "onGrowData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnGrowDataUndefined: Self = StObject.set(x, "onGrowData", js.undefined)
      
      @scala.inline
      def setOnReduceData(value: /* data */ IBreadcrumbData => js.UndefOr[IBreadcrumbData]): Self = StObject.set(x, "onReduceData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnReduceDataUndefined: Self = StObject.set(x, "onReduceData", js.undefined)
      
      @scala.inline
      def setOnRenderItem(
        value: (/* props */ js.UndefOr[IBreadcrumbItem], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IBreadcrumbItem], ReactElement | Null]]) => ReactElement | Null
      ): Self = StObject.set(x, "onRenderItem", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRenderItemUndefined: Self = StObject.set(x, "onRenderItem", js.undefined)
      
      @scala.inline
      def setOnRenderOverflowIcon(
        value: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], ReactElement | Null]]) => ReactElement | Null
      ): Self = StObject.set(x, "onRenderOverflowIcon", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRenderOverflowIconUndefined: Self = StObject.set(x, "onRenderOverflowIcon", js.undefined)
      
      @scala.inline
      def setOverflowAriaLabel(value: String): Self = StObject.set(x, "overflowAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowAriaLabelUndefined: Self = StObject.set(x, "overflowAriaLabel", js.undefined)
      
      @scala.inline
      def setOverflowButtonAs(value: IComponentAs[IButtonProps]): Self = StObject.set(x, "overflowButtonAs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowButtonAsComponentClass(value: ReactComponentClass[IComponentAsProps[IButtonProps]]): Self = StObject.set(x, "overflowButtonAs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowButtonAsFunctionComponent(value: ReactComponentClass[IComponentAsProps[IButtonProps]]): Self = StObject.set(x, "overflowButtonAs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowButtonAsUndefined: Self = StObject.set(x, "overflowButtonAs", js.undefined)
      
      @scala.inline
      def setOverflowIndex(value: Double): Self = StObject.set(x, "overflowIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowIndexUndefined: Self = StObject.set(x, "overflowIndex", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IBreadcrumbStyleProps, IBreadcrumbStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IBreadcrumbStyleProps => DeepPartial[IBreadcrumbStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setTooltipHostProps(value: ITooltipHostProps): Self = StObject.set(x, "tooltipHostProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipHostPropsUndefined: Self = StObject.set(x, "tooltipHostProps", js.undefined)
    }
  }
  
  @js.native
  trait IBreadcrumbStyleProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var theme: ITheme = js.native
  }
  object IBreadcrumbStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IBreadcrumbStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBreadcrumbStyleProps]
    }
    
    @scala.inline
    implicit class IBreadcrumbStylePropsMutableBuilder[Self <: IBreadcrumbStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IBreadcrumbStyles extends StObject {
    
    var chevron: IStyle = js.native
    
    var item: IStyle = js.native
    
    var itemLink: IStyle = js.native
    
    var list: IStyle = js.native
    
    var listItem: IStyle = js.native
    
    var overflow: IStyle = js.native
    
    var overflowButton: IStyle = js.native
    
    var root: IStyle = js.native
  }
  object IBreadcrumbStyles {
    
    @scala.inline
    def apply(): IBreadcrumbStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBreadcrumbStyles]
    }
    
    @scala.inline
    implicit class IBreadcrumbStylesMutableBuilder[Self <: IBreadcrumbStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChevron(value: IStyle): Self = StObject.set(x, "chevron", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChevronNull: Self = StObject.set(x, "chevron", null)
      
      @scala.inline
      def setChevronUndefined: Self = StObject.set(x, "chevron", js.undefined)
      
      @scala.inline
      def setItem(value: IStyle): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemLink(value: IStyle): Self = StObject.set(x, "itemLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemLinkNull: Self = StObject.set(x, "itemLink", null)
      
      @scala.inline
      def setItemLinkUndefined: Self = StObject.set(x, "itemLink", js.undefined)
      
      @scala.inline
      def setItemNull: Self = StObject.set(x, "item", null)
      
      @scala.inline
      def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      @scala.inline
      def setList(value: IStyle): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListItem(value: IStyle): Self = StObject.set(x, "listItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListItemNull: Self = StObject.set(x, "listItem", null)
      
      @scala.inline
      def setListItemUndefined: Self = StObject.set(x, "listItem", js.undefined)
      
      @scala.inline
      def setListNull: Self = StObject.set(x, "list", null)
      
      @scala.inline
      def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      @scala.inline
      def setOverflow(value: IStyle): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowButton(value: IStyle): Self = StObject.set(x, "overflowButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowButtonNull: Self = StObject.set(x, "overflowButton", null)
      
      @scala.inline
      def setOverflowButtonUndefined: Self = StObject.set(x, "overflowButton", js.undefined)
      
      @scala.inline
      def setOverflowNull: Self = StObject.set(x, "overflow", null)
      
      @scala.inline
      def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
  
  @js.native
  trait IDividerAsProps extends IIconProps {
    
    /**
      * Breadcrumb item to left of the divider to be passed for custom rendering.
      * For overflowed items, it will be last item in the list.
      */
    var item: js.UndefOr[IBreadcrumbItem] = js.native
  }
  object IDividerAsProps {
    
    @scala.inline
    def apply(): IDividerAsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDividerAsProps]
    }
    
    @scala.inline
    implicit class IDividerAsPropsMutableBuilder[Self <: IDividerAsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem(value: IBreadcrumbItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    }
  }
}
