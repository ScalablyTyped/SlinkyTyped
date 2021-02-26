package typingsSlinky.reactNativeSortableGrid

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ClassicComponent
import typingsSlinky.react.mod.ClassicComponentClass
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeSortableGrid.anon.DeleteModeOn
import typingsSlinky.reactNativeSortableGrid.anon.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-sortable-grid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-sortable-grid", JSImport.Default)
  @js.native
  def default: SortableGridStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-native-sortable-grid", JSImport.Default)
  @js.native
  class defaultCls protected ()
    extends ClassicComponent[SortableGridProps, js.Object] {
    def this(props: SortableGridProps) = this()
    def this(props: SortableGridProps, context: js.Any) = this()
  }
  
  @scala.inline
  def default_=(x: SortableGridStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  @js.native
  trait ItemOrder extends StObject {
    
    var itemOrder: js.Array[OrderedItem] = js.native
  }
  object ItemOrder {
    
    @scala.inline
    def apply(itemOrder: js.Array[OrderedItem]): ItemOrder = {
      val __obj = js.Dynamic.literal(itemOrder = itemOrder.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemOrder]
    }
    
    @scala.inline
    implicit class ItemOrderMutableBuilder[Self <: ItemOrder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItemOrder(value: js.Array[OrderedItem]): Self = StObject.set(x, "itemOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemOrderVarargs(value: OrderedItem*): Self = StObject.set(x, "itemOrder", js.Array(value :_*))
    }
  }
  
  @js.native
  trait OrderedItem extends StObject {
    
    var key: String = js.native
    
    var order: Double = js.native
    
    var ref: ReactElement | Null = js.native
  }
  object OrderedItem {
    
    @scala.inline
    def apply(key: String, order: Double): OrderedItem = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
      __obj.asInstanceOf[OrderedItem]
    }
    
    @scala.inline
    implicit class OrderedItemMutableBuilder[Self <: OrderedItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRef(value: ReactElement): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
    }
  }
  
  type SortableGrid = SortableGridStatic
  
  type SortableGridItem = ReactElement
  
  @js.native
  trait SortableGridItemProps extends StObject {
    
    /**
      * Flag to mark a child node as being inactive. If set, no touch events
      * will be fired when users interact with the node.
      */
    var inactive: js.UndefOr[Boolean] = js.native
    
    var key: String = js.native
    
    /**
      * Function that is executed when the block is double tapped within a
      * timeframe of doubleTapTreshold (default 150ms). Assigning this will
      * delay the execution of onTap. Omitting this will cause all taps to be
      * handled as single taps, regardless of their frequency.
      */
    var onDoubleTap: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Function that is executed when the block is tapped once, but not pressed
      *  for long enough to activate the drag.
      */
    var onTap: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object SortableGridItemProps {
    
    @scala.inline
    def apply(key: String): SortableGridItemProps = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[SortableGridItemProps]
    }
    
    @scala.inline
    implicit class SortableGridItemPropsMutableBuilder[Self <: SortableGridItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInactive(value: Boolean): Self = StObject.set(x, "inactive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInactiveUndefined: Self = StObject.set(x, "inactive", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDoubleTap(value: () => Unit): Self = StObject.set(x, "onDoubleTap", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDoubleTapUndefined: Self = StObject.set(x, "onDoubleTap", js.undefined)
      
      @scala.inline
      def setOnTap(value: () => Unit): Self = StObject.set(x, "onTap", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnTapUndefined: Self = StObject.set(x, "onTap", js.undefined)
    }
  }
  
  @js.native
  trait SortableGridProps extends StObject {
    
    /**
      * How long should it take for the block that is being dragged to seek its
      * place after it's released (milliseconds)
      */
    var activeBlockCenteringDuration: js.UndefOr[Double] = js.native
    
    /**
      * How long should the transition of a passive block take when the active
      * block takes its place (milliseconds)
      */
    var blockTransitionDuration: js.UndefOr[Double] = js.native
    
    /**
      * Items to be rendered in the SortableGrid
      */
    var children: js.UndefOr[js.Array[ReactElement]] = js.native
    
    /**
      * How long will the execution wait for the second tap before deciding it
      * was a single tap (milliseconds). Will be omitted if no
      * onDoubleTap-property is given to the item being tapped - In which case
      * single-tap callback will be executed instantly
      */
    var doubleTapTreshold: js.UndefOr[Double] = js.native
    
    /**
      * How long must the user hold the press on the block until it becomes
      * active and can be dragged (milliseconds)
      */
    var dragActivationThreshold: js.UndefOr[Double] = js.native
    
    /**
      * Custom animation to override the default wiggle. Must be an object
      * containing a key transform, which is an array of transformations.
      */
    var dragStartAnimation: js.UndefOr[Transform] = js.native
    
    /**
      * When used together with itemsPerRow, sets the size of a block to
      * something other than the default square
      */
    var itemHeight: js.UndefOr[Double] = js.native
    
    /**
      * If set, itemsPerRow will be calculated to fit items of this size
      */
    var itemWidth: js.UndefOr[Double] = js.native
    
    /**
      * How many items should be placed on one row
      */
    var itemsPerRow: js.UndefOr[Double] = js.native
    
    /**
      * Function that is executed item is deleted. Will return the properties
      * of the deleted item.
      */
    var onDeleteItem: js.UndefOr[js.Function1[/* deletedItem */ OrderedItem, Unit]] = js.native
    
    /**
      * Function that is executed after the drag is released. Will return the
      * new item order.
      */
    var onDragRelease: js.UndefOr[js.Function1[/* itemOrder */ ItemOrder, Unit]] = js.native
    
    /**
      * Function that is called when the dragging starts. This can be used to
      * lock other touch responders from listening to the touch such as
      * ScrollViews and Swipers.
      */
    var onDragStart: js.UndefOr[js.Function1[/* item */ OrderedItem, Unit]] = js.native
    
    /**
      * Custom styles to override or complement the sortableGrid native style.
      */
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  }
  object SortableGridProps {
    
    @scala.inline
    def apply(): SortableGridProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortableGridProps]
    }
    
    @scala.inline
    implicit class SortableGridPropsMutableBuilder[Self <: SortableGridProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveBlockCenteringDuration(value: Double): Self = StObject.set(x, "activeBlockCenteringDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveBlockCenteringDurationUndefined: Self = StObject.set(x, "activeBlockCenteringDuration", js.undefined)
      
      @scala.inline
      def setBlockTransitionDuration(value: Double): Self = StObject.set(x, "blockTransitionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockTransitionDurationUndefined: Self = StObject.set(x, "blockTransitionDuration", js.undefined)
      
      @scala.inline
      def setChildren(value: js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setDoubleTapTreshold(value: Double): Self = StObject.set(x, "doubleTapTreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoubleTapTresholdUndefined: Self = StObject.set(x, "doubleTapTreshold", js.undefined)
      
      @scala.inline
      def setDragActivationThreshold(value: Double): Self = StObject.set(x, "dragActivationThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragActivationThresholdUndefined: Self = StObject.set(x, "dragActivationThreshold", js.undefined)
      
      @scala.inline
      def setDragStartAnimation(value: Transform): Self = StObject.set(x, "dragStartAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragStartAnimationUndefined: Self = StObject.set(x, "dragStartAnimation", js.undefined)
      
      @scala.inline
      def setItemHeight(value: Double): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemHeightUndefined: Self = StObject.set(x, "itemHeight", js.undefined)
      
      @scala.inline
      def setItemWidth(value: Double): Self = StObject.set(x, "itemWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemWidthUndefined: Self = StObject.set(x, "itemWidth", js.undefined)
      
      @scala.inline
      def setItemsPerRow(value: Double): Self = StObject.set(x, "itemsPerRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsPerRowUndefined: Self = StObject.set(x, "itemsPerRow", js.undefined)
      
      @scala.inline
      def setOnDeleteItem(value: /* deletedItem */ OrderedItem => Unit): Self = StObject.set(x, "onDeleteItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDeleteItemUndefined: Self = StObject.set(x, "onDeleteItem", js.undefined)
      
      @scala.inline
      def setOnDragRelease(value: /* itemOrder */ ItemOrder => Unit): Self = StObject.set(x, "onDragRelease", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragReleaseUndefined: Self = StObject.set(x, "onDragRelease", js.undefined)
      
      @scala.inline
      def setOnDragStart(value: /* item */ OrderedItem => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait SortableGridStatic extends ClassicComponentClass[SortableGridProps] {
    
    /**
      * Calling this will toggle item deletion mode on/off.
      */
    def toggleDeleteMode(): DeleteModeOn = js.native
  }
}
