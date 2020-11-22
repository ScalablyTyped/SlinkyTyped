package typingsSlinky.reactNative.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.anon.Index
import typingsSlinky.reactNative.anon.Section
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SectionListProps[ItemT, SectionT] extends VirtualizedListWithoutRenderItemProps[ItemT] {
  
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
    js.Function2[
      /* data */ (js.Array[SectionListData[ItemT, SectionT]]) | Null, 
      /* index */ Double, 
      Index
    ]
  ] = js.native
  
  /**
    * Uses legacy MetroListView instead of default VirtualizedSectionList
    */
  var legacyImplementation: js.UndefOr[Boolean] = js.native
  
  /**
    * Default renderer for every item in every section. Can be over-ridden on a per-section basis.
    */
  var renderItem: js.UndefOr[SectionListRenderItem[ItemT, SectionT]] = js.native
  
  /**
    * Rendered at the bottom of each section.
    */
  var renderSectionFooter: js.UndefOr[js.Function1[/* info */ Section[ItemT, SectionT], ReactElement | Null]] = js.native
  
  /**
    * Rendered at the top of each section. Sticky headers are not yet supported.
    */
  var renderSectionHeader: js.UndefOr[js.Function1[/* info */ Section[ItemT, SectionT], ReactElement | Null]] = js.native
  
  /**
    * An array of objects with data for each section.
    */
  var sections: js.Array[SectionListData[ItemT, SectionT]] = js.native
  
  /**
    * Makes section headers stick to the top of the screen until the next one pushes it off.
    * Only enabled by default on iOS because that is the platform standard there.
    */
  var stickySectionHeadersEnabled: js.UndefOr[Boolean] = js.native
}
object SectionListProps {
  
  @scala.inline
  def apply[ItemT, SectionT](sections: js.Array[SectionListData[ItemT, SectionT]]): SectionListProps[ItemT, SectionT] = {
    val __obj = js.Dynamic.literal(sections = sections.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionListProps[ItemT, SectionT]]
  }
  
  @scala.inline
  implicit class SectionListPropsOps[Self <: SectionListProps[_, _], ItemT, SectionT] (val x: Self with (SectionListProps[ItemT, SectionT])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSectionsVarargs(value: (SectionListData[ItemT, SectionT])*): Self = this.set("sections", js.Array(value :_*))
    
    @scala.inline
    def setSections(value: js.Array[SectionListData[ItemT, SectionT]]): Self = this.set("sections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemSeparatorComponentFunctionComponent(value: ReactComponentClass[_]): Self = this.set("ItemSeparatorComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemSeparatorComponentComponentClass(value: ReactComponentClass[_]): Self = this.set("ItemSeparatorComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemSeparatorComponent(value: ReactComponentClass[_]): Self = this.set("ItemSeparatorComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemSeparatorComponent: Self = this.set("ItemSeparatorComponent", js.undefined)
    
    @scala.inline
    def setItemSeparatorComponentNull: Self = this.set("ItemSeparatorComponent", null)
    
    @scala.inline
    def setSectionSeparatorComponentReactElement(value: ReactElement): Self = this.set("SectionSeparatorComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionSeparatorComponentFunctionComponent(value: ReactComponentClass[_]): Self = this.set("SectionSeparatorComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionSeparatorComponentComponentClass(value: ReactComponentClass[_]): Self = this.set("SectionSeparatorComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionSeparatorComponent(value: ReactComponentClass[_] | ReactElement): Self = this.set("SectionSeparatorComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSectionSeparatorComponent: Self = this.set("SectionSeparatorComponent", js.undefined)
    
    @scala.inline
    def setSectionSeparatorComponentNull: Self = this.set("SectionSeparatorComponent", null)
    
    @scala.inline
    def setGetItemLayout(
      value: (/* data */ (js.Array[SectionListData[ItemT, SectionT]]) | Null, /* index */ Double) => Index
    ): Self = this.set("getItemLayout", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetItemLayout: Self = this.set("getItemLayout", js.undefined)
    
    @scala.inline
    def setLegacyImplementation(value: Boolean): Self = this.set("legacyImplementation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegacyImplementation: Self = this.set("legacyImplementation", js.undefined)
    
    @scala.inline
    def setRenderItem(value: /* info */ SectionListRenderItemInfo[ItemT, SectionT] => ReactElement | Null): Self = this.set("renderItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderItem: Self = this.set("renderItem", js.undefined)
    
    @scala.inline
    def setRenderSectionFooter(value: /* info */ Section[ItemT, SectionT] => ReactElement | Null): Self = this.set("renderSectionFooter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderSectionFooter: Self = this.set("renderSectionFooter", js.undefined)
    
    @scala.inline
    def setRenderSectionHeader(value: /* info */ Section[ItemT, SectionT] => ReactElement | Null): Self = this.set("renderSectionHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderSectionHeader: Self = this.set("renderSectionHeader", js.undefined)
    
    @scala.inline
    def setStickySectionHeadersEnabled(value: Boolean): Self = this.set("stickySectionHeadersEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStickySectionHeadersEnabled: Self = this.set("stickySectionHeadersEnabled", js.undefined)
  }
}
