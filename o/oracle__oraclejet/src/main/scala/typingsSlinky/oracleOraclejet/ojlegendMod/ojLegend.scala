package typingsSlinky.oracleOraclejet.ojlegendMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.oracleOraclejet.anon.LabelAndValue
import typingsSlinky.oracleOraclejet.anon.Sections
import typingsSlinky.oracleOraclejet.anon.TextString
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.ojdvtBaseMod.dvtBaseComponent
import typingsSlinky.oracleOraclejet.ojkeysetMod.KeySet
import typingsSlinky.oracleOraclejet.ojlegendMod.ojLegend.ItemContext
import typingsSlinky.oracleOraclejet.ojlegendMod.ojLegend.NodeContext
import typingsSlinky.oracleOraclejet.ojlegendMod.ojLegend.PreferredSize
import typingsSlinky.oracleOraclejet.ojlegendMod.ojLegend.SectionContext
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.as
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.asChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.asNeeded
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.bottom
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.center
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.data
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dataChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dim
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.drilling
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.drillingChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.end
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.expanded
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.expandedChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.halign
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.halignChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hiddenCategories
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hiddenCategoriesChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hideAndShowBehavior
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hideAndShowBehaviorChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.highlightedCategories
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.highlightedCategoriesChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.horizontal
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hoverBehavior
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hoverBehaviorChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hoverBehaviorDelay
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hoverBehaviorDelayChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.middle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojDrill
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.orientation
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.orientationChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.scrolling
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.scrollingChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.start
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.symbolHeight
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.symbolHeightChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.symbolWidth
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.symbolWidthChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.textStyle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.textStyleChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.top
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.translations
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valign
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valignChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojLegend[K, D] extends dvtBaseComponent[ojLegendSettableProperties[K, D]] {
  
  def addEventListener(`type`: drillingChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: drillingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: halignChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: halignChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: hideAndShowBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  def addEventListener(
    `type`: hideAndShowBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: hoverBehaviorChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: hoverBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: orientationChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: orientationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: scrollingChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: scrollingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: valignChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: valignChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(`type`: asChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: asChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(`type`: dataChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: dataChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_expandedChanged(`type`: expandedChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_expandedChanged(
    `type`: expandedChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hiddenCategoriesChanged(
    `type`: hiddenCategoriesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hiddenCategoriesChanged(
    `type`: hiddenCategoriesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highlightedCategoriesChanged(
    `type`: highlightedCategoriesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highlightedCategoriesChanged(
    `type`: highlightedCategoriesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hoverBehaviorDelayChanged(
    `type`: hoverBehaviorDelayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hoverBehaviorDelayChanged(
    `type`: hoverBehaviorDelayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojDrill(`type`: ojDrill, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojDrill(
    `type`: ojDrill,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_symbolHeightChanged(`type`: symbolHeightChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_symbolHeightChanged(
    `type`: symbolHeightChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_symbolWidthChanged(`type`: symbolWidthChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_symbolWidthChanged(
    `type`: symbolWidthChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_textStyleChanged(`type`: textStyleChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_textStyleChanged(
    `type`: textStyleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  
  var as: String = js.native
  
  var data: (DataProvider[K, D]) | Null = js.native
  
  var drilling: on | off = js.native
  
  var expanded: KeySet[K] | Null = js.native
  
  def getContextByNode(node: Element): NodeContext | Null = js.native
  
  def getItem(subIdPath: js.Array[_]): ItemContext | Null = js.native
  
  def getPreferredSize(): PreferredSize | Null = js.native
  
  @JSName("getProperty")
  def getProperty_as(property: as): String = js.native
  @JSName("getProperty")
  def getProperty_data(property: data): (DataProvider[K, D]) | Null = js.native
  @JSName("getProperty")
  def getProperty_drilling(property: drilling): on | off = js.native
  @JSName("getProperty")
  def getProperty_expanded(property: expanded): KeySet[K] | Null = js.native
  @JSName("getProperty")
  def getProperty_halign(property: halign): center | end | start = js.native
  @JSName("getProperty")
  def getProperty_hiddenCategories(property: hiddenCategories): js.Array[String] = js.native
  @JSName("getProperty")
  def getProperty_hideAndShowBehavior(property: hideAndShowBehavior): on | off = js.native
  @JSName("getProperty")
  def getProperty_highlightedCategories(property: highlightedCategories): js.Array[String] = js.native
  @JSName("getProperty")
  def getProperty_hoverBehavior(property: hoverBehavior): dim | none = js.native
  @JSName("getProperty")
  def getProperty_hoverBehaviorDelay(property: hoverBehaviorDelay): Double = js.native
  @JSName("getProperty")
  def getProperty_orientation(property: orientation): horizontal | vertical = js.native
  @JSName("getProperty")
  def getProperty_scrolling(property: scrolling): off | asNeeded = js.native
  @JSName("getProperty")
  def getProperty_symbolHeight(property: symbolHeight): Double = js.native
  @JSName("getProperty")
  def getProperty_symbolWidth(property: symbolWidth): Double = js.native
  @JSName("getProperty")
  def getProperty_textStyle(property: textStyle): js.UndefOr[js.Object] = js.native
  @JSName("getProperty")
  def getProperty_valign(property: valign): middle | bottom | top = js.native
  
  def getSection(subIdPath: js.Array[_]): SectionContext | Null = js.native
  
  var halign: center | end | start = js.native
  
  var hiddenCategories: js.Array[String] = js.native
  
  var hideAndShowBehavior: on | off = js.native
  
  var highlightedCategories: js.Array[String] = js.native
  
  var hoverBehavior: dim | none = js.native
  
  var hoverBehaviorDelay: Double = js.native
  
  var onAsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onDataChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onDrillingChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onExpandedChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onHalignChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onHiddenCategoriesChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onHideAndShowBehaviorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onHighlightedCategoriesChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onHoverBehaviorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onHoverBehaviorDelayChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onOjDrill: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onOrientationChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onScrollingChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onSymbolHeightChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onSymbolWidthChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onTextStyleChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onValignChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var orientation: horizontal | vertical = js.native
  
  var scrolling: off | asNeeded = js.native
  
  def setProperties(properties: ojLegendSettablePropertiesLenient[K, D]): Unit = js.native
  
  def setProperty(property: drilling, value: off): Unit = js.native
  def setProperty(property: drilling, value: on): Unit = js.native
  def setProperty(property: halign, value: center): Unit = js.native
  def setProperty(property: halign, value: end): Unit = js.native
  def setProperty(property: halign, value: start): Unit = js.native
  def setProperty(property: hideAndShowBehavior, value: off): Unit = js.native
  def setProperty(property: hideAndShowBehavior, value: on): Unit = js.native
  def setProperty(property: hoverBehavior, value: dim): Unit = js.native
  def setProperty(property: hoverBehavior, value: none): Unit = js.native
  def setProperty(property: orientation, value: horizontal): Unit = js.native
  def setProperty(property: orientation, value: vertical): Unit = js.native
  def setProperty(property: scrolling, value: asNeeded): Unit = js.native
  def setProperty(property: scrolling, value: off): Unit = js.native
  def setProperty(property: valign, value: bottom): Unit = js.native
  def setProperty(property: valign, value: middle): Unit = js.native
  def setProperty(property: valign, value: top): Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: as, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_expanded(property: expanded): Unit = js.native
  @JSName("setProperty")
  def setProperty_expanded(property: expanded, value: KeySet[K]): Unit = js.native
  @JSName("setProperty")
  def setProperty_hiddenCategories(property: hiddenCategories, value: js.Array[String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_highlightedCategories(property: highlightedCategories, value: js.Array[String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_hoverBehaviorDelay(property: hoverBehaviorDelay, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_symbolHeight(property: symbolHeight, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_symbolWidth(property: symbolWidth, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_textStyle(property: textStyle): Unit = js.native
  @JSName("setProperty")
  def setProperty_textStyle(property: textStyle, value: js.Object): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: LabelAndValue): Unit = js.native
  
  var symbolHeight: Double = js.native
  
  var symbolWidth: Double = js.native
  
  var textStyle: js.UndefOr[js.Object] = js.native
  
  @JSName("translations")
  var translations_ojLegend: LabelAndValue = js.native
  
  var valign: middle | bottom | top = js.native
}
object ojLegend {
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait ItemContext extends StObject {
    
    var text: String = js.native
  }
  object ItemContext {
    
    @scala.inline
    def apply(text: String): ItemContext = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemContext]
    }
    
    @scala.inline
    implicit class ItemContextMutableBuilder[Self <: ItemContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait NodeContext extends StObject {
    
    var itemIndex: Double = js.native
    
    var sectionIndexPath: js.Array[Double] = js.native
    
    var subId: String = js.native
  }
  object NodeContext {
    
    @scala.inline
    def apply(itemIndex: Double, sectionIndexPath: js.Array[Double], subId: String): NodeContext = {
      val __obj = js.Dynamic.literal(itemIndex = itemIndex.asInstanceOf[js.Any], sectionIndexPath = sectionIndexPath.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeContext]
    }
    
    @scala.inline
    implicit class NodeContextMutableBuilder[Self <: NodeContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSectionIndexPath(value: js.Array[Double]): Self = StObject.set(x, "sectionIndexPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSectionIndexPathVarargs(value: Double*): Self = StObject.set(x, "sectionIndexPath", js.Array(value :_*))
      
      @scala.inline
      def setSubId(value: String): Self = StObject.set(x, "subId", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait PreferredSize extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object PreferredSize {
    
    @scala.inline
    def apply(height: Double, width: Double): PreferredSize = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreferredSize]
    }
    
    @scala.inline
    implicit class PreferredSizeMutableBuilder[Self <: PreferredSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait SectionContext extends StObject {
    
    var getItems: TextString = js.native
    
    var getSection: Sections = js.native
    
    var items: js.Array[js.Object] = js.native
    
    var sections: js.Array[js.Object] = js.native
    
    var title: String = js.native
  }
  object SectionContext {
    
    @scala.inline
    def apply(
      getItems: TextString,
      getSection: Sections,
      items: js.Array[js.Object],
      sections: js.Array[js.Object],
      title: String
    ): SectionContext = {
      val __obj = js.Dynamic.literal(getItems = getItems.asInstanceOf[js.Any], getSection = getSection.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[SectionContext]
    }
    
    @scala.inline
    implicit class SectionContextMutableBuilder[Self <: SectionContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetItems(value: TextString): Self = StObject.set(x, "getItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetSection(value: Sections): Self = StObject.set(x, "getSection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItems(value: js.Array[js.Object]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: js.Object*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setSections(value: js.Array[js.Object]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSectionsVarargs(value: js.Object*): Self = StObject.set(x, "sections", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type ojDrill = CustomEvent
}
