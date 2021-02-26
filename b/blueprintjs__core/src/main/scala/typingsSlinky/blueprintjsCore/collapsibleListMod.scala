package typingsSlinky.blueprintjsCore

import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsCore.anon.PartialICollapsibleListPr
import typingsSlinky.blueprintjsCore.boundaryMod.Boundary
import typingsSlinky.blueprintjsCore.menuItemMod.IMenuItemProps
import typingsSlinky.blueprintjsCore.popoverMod.IPopoverProps
import typingsSlinky.blueprintjsCore.propsMod.IProps
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collapsibleListMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/collapsible-list/collapsibleList", "CollapsibleList")
  @js.native
  class CollapsibleList protected ()
    extends Component[ICollapsibleListProps, js.Object, js.Any] {
    def this(props: ICollapsibleListProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ICollapsibleListProps, context: js.Any) = this()
    
    var partitionChildren: js.Any = js.native
  }
  /* static members */
  object CollapsibleList {
    
    @JSImport("@blueprintjs/core/lib/esm/components/collapsible-list/collapsibleList", "CollapsibleList")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/collapsible-list/collapsibleList", "CollapsibleList.defaultProps")
    @js.native
    def defaultProps: PartialICollapsibleListPr = js.native
    @scala.inline
    def defaultProps_=(x: PartialICollapsibleListPr): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/collapsible-list/collapsibleList", "CollapsibleList.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ICollapsibleListProps extends IProps {
    
    /**
      * Which direction the items should collapse from: start or end of the children.
      * @default Boundary.START
      */
    var collapseFrom: js.UndefOr[Boundary] = js.native
    
    /**
      * Props to pass to the dropdown.
      */
    var dropdownProps: js.UndefOr[IPopoverProps] = js.native
    
    /**
      * Element to render as dropdown target with `CLICK` interaction to show collapsed menu.
      */
    var dropdownTarget: ReactElement = js.native
    
    /**
      * CSS class names to add to `<li>` tags containing each visible item and the dropdown.
      */
    var visibleItemClassName: js.UndefOr[String] = js.native
    
    /**
      * Exact number of visible items.
      * @default 3
      */
    var visibleItemCount: js.UndefOr[Double] = js.native
    
    /**
      * Callback invoked to render each visible item. The item will be wrapped in an `li` with
      * the optional `visibleItemClassName` prop.
      */
    def visibleItemRenderer(props: IMenuItemProps, index: Double): ReactElement = js.native
  }
  object ICollapsibleListProps {
    
    @scala.inline
    def apply(dropdownTarget: ReactElement, visibleItemRenderer: (IMenuItemProps, Double) => ReactElement): ICollapsibleListProps = {
      val __obj = js.Dynamic.literal(dropdownTarget = dropdownTarget.asInstanceOf[js.Any], visibleItemRenderer = js.Any.fromFunction2(visibleItemRenderer))
      __obj.asInstanceOf[ICollapsibleListProps]
    }
    
    @scala.inline
    implicit class ICollapsibleListPropsMutableBuilder[Self <: ICollapsibleListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollapseFrom(value: Boundary): Self = StObject.set(x, "collapseFrom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseFromUndefined: Self = StObject.set(x, "collapseFrom", js.undefined)
      
      @scala.inline
      def setDropdownProps(value: IPopoverProps): Self = StObject.set(x, "dropdownProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownPropsUndefined: Self = StObject.set(x, "dropdownProps", js.undefined)
      
      @scala.inline
      def setDropdownTarget(value: ReactElement): Self = StObject.set(x, "dropdownTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleItemClassName(value: String): Self = StObject.set(x, "visibleItemClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleItemClassNameUndefined: Self = StObject.set(x, "visibleItemClassName", js.undefined)
      
      @scala.inline
      def setVisibleItemCount(value: Double): Self = StObject.set(x, "visibleItemCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleItemCountUndefined: Self = StObject.set(x, "visibleItemCount", js.undefined)
      
      @scala.inline
      def setVisibleItemRenderer(value: (IMenuItemProps, Double) => ReactElement): Self = StObject.set(x, "visibleItemRenderer", js.Any.fromFunction2(value))
    }
  }
}
