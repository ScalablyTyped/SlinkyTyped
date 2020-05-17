package typingsSlinky.reactNative.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.anon.Index
import typingsSlinky.reactNative.anon.Section
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SectionListProps[ItemT] extends VirtualizedListWithoutRenderItemProps[ItemT] {
  /**
    * Rendered in between adjacent Items within each section.
    */
  var ItemSeparatorComponent: js.UndefOr[ReactComponentClass[_] | Null] = js.native
  /**
    * Rendered in between each section.
    */
  var SectionSeparatorComponent: js.UndefOr[ReactComponentClass[_] | ReactElement | Null] = js.native
  /**
    * `getItemLayout` is an optional optimization that lets us skip measurement of dynamic
    * content if you know the height of items a priori. getItemLayout is the most efficient,
    * and is easy to use if you have fixed height items, for example:
    * ```
    * getItemLayout={(data, index) => (
    *   {length: ITEM_HEIGHT, offset: ITEM_HEIGHT * index, index}
    * )}
    * ```
    */
  @JSName("getItemLayout")
  var getItemLayout_SectionListProps: js.UndefOr[
    js.Function2[/* data */ js.Array[SectionListData[ItemT]] | Null, /* index */ Double, Index]
  ] = js.native
  /**
    * Uses legacy MetroListView instead of default VirtualizedSectionList
    */
  var legacyImplementation: js.UndefOr[Boolean] = js.native
  /**
    * Default renderer for every item in every section. Can be over-ridden on a per-section basis.
    */
  var renderItem: js.UndefOr[SectionListRenderItem[ItemT]] = js.native
  /**
    * Rendered at the bottom of each section.
    */
  var renderSectionFooter: js.UndefOr[js.Function1[/* info */ Section[ItemT], ReactElement | Null]] = js.native
  /**
    * Rendered at the top of each section. Sticky headers are not yet supported.
    */
  var renderSectionHeader: js.UndefOr[js.Function1[/* info */ Section[ItemT], ReactElement | Null]] = js.native
  /**
    * An array of objects with data for each section.
    */
  var sections: js.Array[SectionListData[ItemT]] = js.native
  /**
    * Makes section headers stick to the top of the screen until the next one pushes it off.
    * Only enabled by default on iOS because that is the platform standard there.
    */
  var stickySectionHeadersEnabled: js.UndefOr[Boolean] = js.native
}

object SectionListProps {
  @scala.inline
  def apply[ItemT](sections: js.Array[SectionListData[ItemT]]): SectionListProps[ItemT] = {
    val __obj = js.Dynamic.literal(sections = sections.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionListProps[ItemT]]
  }
  @scala.inline
  implicit class SectionListPropsOps[Self[itemt] <: SectionListProps[itemt], ItemT] (val x: Self[ItemT]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ItemT] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ItemT]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ItemT] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ItemT] with Other]
    @scala.inline
    def withSections(value: js.Array[SectionListData[ItemT]]): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sections")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withSectionSeparatorComponentReactElement(value: ReactElement): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SectionSeparatorComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSectionSeparatorComponentFunctionComponent(value: ReactComponentClass[_]): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SectionSeparatorComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSectionSeparatorComponentComponentClass(value: ReactComponentClass[_]): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SectionSeparatorComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSectionSeparatorComponent(value: ReactComponentClass[_] | ReactElement): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SectionSeparatorComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSectionSeparatorComponent: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SectionSeparatorComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withSectionSeparatorComponentNull: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SectionSeparatorComponent")(null)
        ret
    }
    @scala.inline
    def withGetItemLayout(value: (/* data */ js.Array[SectionListData[ItemT]] | Null, /* index */ Double) => Index): Self[ItemT] = {
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
    def withRenderItem(value: /* info */ SectionListRenderItemInfo[ItemT] => ReactElement | Null): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderItem: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderItem")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderSectionFooter(value: /* info */ Section[ItemT] => ReactElement | Null): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSectionFooter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderSectionFooter: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSectionFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderSectionHeader(value: /* info */ Section[ItemT] => ReactElement | Null): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSectionHeader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderSectionHeader: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSectionHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withStickySectionHeadersEnabled(value: Boolean): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickySectionHeadersEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStickySectionHeadersEnabled: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickySectionHeadersEnabled")(js.undefined)
        ret
    }
  }
  
}

