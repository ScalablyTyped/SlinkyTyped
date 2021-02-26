package typingsSlinky.reactNative.mod

import slinky.core.ReactComponentClass
import typingsSlinky.reactNative.anon.Index
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlatListProps[ItemT] extends VirtualizedListProps[ItemT] {
  
  /**
    * Rendered in between each item, but not at the top or bottom
    */
  var ItemSeparatorComponent: js.UndefOr[ReactComponentClass[_] | Null] = js.native
  
  /**
    * Styling for internal View for ListFooterComponent
    */
  var ListFooterComponentStyle: js.UndefOr[ViewStyle | Null] = js.native
  
  /**
    * Styling for internal View for ListHeaderComponent
    */
  var ListHeaderComponentStyle: js.UndefOr[ViewStyle | Null] = js.native
  
  /**
    * Optional custom style for multi-item rows generated when numColumns > 1
    */
  var columnWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * For simplicity, data is just a plain array. If you want to use something else,
    * like an immutable list, use the underlying VirtualizedList directly.
    */
  @JSName("data")
  var data_FlatListProps: js.UndefOr[js.Array[ItemT] | Null] = js.native
  
  /**
    * `getItemLayout` is an optional optimization that lets us skip measurement of dynamic
    * content if you know the height of items a priori. getItemLayout is the most efficient,
    * and is easy to use if you have fixed height items, for example:
    * ```
    * getItemLayout={(data, index) => (
    *   {length: ITEM_HEIGHT, offset: ITEM_HEIGHT * index, index}
    * )}
    * ```
    * Remember to include separator length (height or width) in your offset calculation if you specify
    * `ItemSeparatorComponent`.
    */
  @JSName("getItemLayout")
  var getItemLayout_FlatListProps: js.UndefOr[
    js.Function2[/* data */ js.UndefOr[js.Array[ItemT] | Null], /* index */ Double, Index]
  ] = js.native
  
  /**
    * Uses legacy MetroListView instead of default VirtualizedSectionList
    */
  var legacyImplementation: js.UndefOr[Boolean] = js.native
  
  /**
    * Multiple columns can only be rendered with `horizontal={false}` and will zig-zag like a `flexWrap` layout.
    * Items should all be the same height - masonry layouts are not supported.
    */
  var numColumns: js.UndefOr[Double] = js.native
  
  /**
    * See `ViewabilityHelper` for flow type and further documentation.
    */
  @JSName("viewabilityConfig")
  var viewabilityConfig_FlatListProps: js.UndefOr[js.Any] = js.native
}
object FlatListProps {
  
  @scala.inline
  def apply[ItemT](): FlatListProps[ItemT] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlatListProps[ItemT]]
  }
  
  @scala.inline
  implicit class FlatListPropsMutableBuilder[Self <: FlatListProps[_], ItemT] (val x: Self with FlatListProps[ItemT]) extends AnyVal {
    
    @scala.inline
    def setColumnWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "columnWrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnWrapperStyleNull: Self = StObject.set(x, "columnWrapperStyle", null)
    
    @scala.inline
    def setColumnWrapperStyleUndefined: Self = StObject.set(x, "columnWrapperStyle", js.undefined)
    
    @scala.inline
    def setData(value: js.Array[ItemT]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataNull: Self = StObject.set(x, "data", null)
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: ItemT*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setGetItemLayout(value: (/* data */ js.UndefOr[js.Array[ItemT] | Null], /* index */ Double) => Index): Self = StObject.set(x, "getItemLayout", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetItemLayoutUndefined: Self = StObject.set(x, "getItemLayout", js.undefined)
    
    @scala.inline
    def setItemSeparatorComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "ItemSeparatorComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemSeparatorComponentComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "ItemSeparatorComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemSeparatorComponentFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "ItemSeparatorComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemSeparatorComponentNull: Self = StObject.set(x, "ItemSeparatorComponent", null)
    
    @scala.inline
    def setItemSeparatorComponentUndefined: Self = StObject.set(x, "ItemSeparatorComponent", js.undefined)
    
    @scala.inline
    def setLegacyImplementation(value: Boolean): Self = StObject.set(x, "legacyImplementation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegacyImplementationUndefined: Self = StObject.set(x, "legacyImplementation", js.undefined)
    
    @scala.inline
    def setListFooterComponentStyle(value: ViewStyle): Self = StObject.set(x, "ListFooterComponentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListFooterComponentStyleNull: Self = StObject.set(x, "ListFooterComponentStyle", null)
    
    @scala.inline
    def setListFooterComponentStyleUndefined: Self = StObject.set(x, "ListFooterComponentStyle", js.undefined)
    
    @scala.inline
    def setListHeaderComponentStyle(value: ViewStyle): Self = StObject.set(x, "ListHeaderComponentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListHeaderComponentStyleNull: Self = StObject.set(x, "ListHeaderComponentStyle", null)
    
    @scala.inline
    def setListHeaderComponentStyleUndefined: Self = StObject.set(x, "ListHeaderComponentStyle", js.undefined)
    
    @scala.inline
    def setNumColumns(value: Double): Self = StObject.set(x, "numColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumColumnsUndefined: Self = StObject.set(x, "numColumns", js.undefined)
    
    @scala.inline
    def setViewabilityConfig(value: js.Any): Self = StObject.set(x, "viewabilityConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewabilityConfigUndefined: Self = StObject.set(x, "viewabilityConfig", js.undefined)
  }
}
