package typingsSlinky.reactNative.mod

import slinky.core.ReactComponentClass
import typingsSlinky.reactNative.AnonIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    js.Function2[/* data */ js.UndefOr[js.Array[ItemT] | Null], /* index */ Double, AnonIndex]
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
  implicit class FlatListPropsOps[Self[itemt] <: FlatListProps[itemt], ItemT] (val x: Self[ItemT]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ItemT] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ItemT]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ItemT] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ItemT] with Other]
    @scala.inline
    def withItemSeparatorComponentFunctionComponent(value: ReactComponentClass[_]): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemSeparatorComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemSeparatorComponentComponentClass(value: ReactComponentClass[_]): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemSeparatorComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemSeparatorComponent(value: ReactComponentClass[_]): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemSeparatorComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemSeparatorComponent: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemSeparatorComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withItemSeparatorComponentNull: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemSeparatorComponent")(null)
        ret
    }
    @scala.inline
    def withListFooterComponentStyle(value: ViewStyle): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListFooterComponentStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListFooterComponentStyle: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListFooterComponentStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withListFooterComponentStyleNull: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListFooterComponentStyle")(null)
        ret
    }
    @scala.inline
    def withListHeaderComponentStyle(value: ViewStyle): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListHeaderComponentStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListHeaderComponentStyle: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListHeaderComponentStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withListHeaderComponentStyleNull: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListHeaderComponentStyle")(null)
        ret
    }
    @scala.inline
    def withColumnWrapperStyle(value: StyleProp[ViewStyle]): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWrapperStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnWrapperStyle: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWrapperStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnWrapperStyleNull: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWrapperStyle")(null)
        ret
    }
    @scala.inline
    def withData(value: js.Array[ItemT]): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDataNull: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(null)
        ret
    }
    @scala.inline
    def withGetItemLayout(value: (/* data */ js.UndefOr[js.Array[ItemT] | Null], /* index */ Double) => AnonIndex): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemLayout")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetItemLayout: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withLegacyImplementation(value: Boolean): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legacyImplementation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegacyImplementation: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legacyImplementation")(js.undefined)
        ret
    }
    @scala.inline
    def withNumColumns(value: Double): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumColumns: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withViewabilityConfig(value: js.Any): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewabilityConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewabilityConfig: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewabilityConfig")(js.undefined)
        ret
    }
  }
  
}

