package typingsSlinky.atOracleOraclejet.ojlegendMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.Element
import typingsSlinky.atOracleOraclejet.Anon_ComponentNameLabelAndValue
import typingsSlinky.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.as
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.asChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.asNeeded
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.bottom
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.center
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.data
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dataChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dim
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.drilling
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.drillingChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.end
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.expanded
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.expandedChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.halign
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.halignChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.hiddenCategories
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.hiddenCategoriesChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.hideAndShowBehavior
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.hideAndShowBehaviorChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.highlightedCategories
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.highlightedCategoriesChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.horizontal
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.hoverBehavior
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.hoverBehaviorChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.hoverBehaviorDelay
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.hoverBehaviorDelayChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.middle
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.none
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.off
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ojDrill
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.on
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.orientation
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.orientationChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.scrolling
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.scrollingChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.start
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.symbolHeight
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.symbolHeightChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.symbolWidth
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.symbolWidthChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.textStyle
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.textStyleChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.top
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.translations
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.valign
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.valignChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.vertical
import typingsSlinky.atOracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.atOracleOraclejet.ojdvtDashBaseMod.dvtBaseComponent
import typingsSlinky.atOracleOraclejet.ojkeysetMod.KeySet
import typingsSlinky.atOracleOraclejet.ojlegendMod.ojLegend.ItemContext
import typingsSlinky.atOracleOraclejet.ojlegendMod.ojLegend.NodeContext
import typingsSlinky.atOracleOraclejet.ojlegendMod.ojLegend.PreferredSize
import typingsSlinky.atOracleOraclejet.ojlegendMod.ojLegend.SectionContext
import typingsSlinky.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("ojLegend")
@js.native
trait ojLegend_[K, D] extends dvtBaseComponent[ojLegendSettableProperties[K, D]] {
  var as: String = js.native
  var data: (DataProvider[K, D]) | Null = js.native
  var drilling: on | off = js.native
  var expanded: KeySet[K] | Null = js.native
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
  var symbolHeight: Double = js.native
  var symbolWidth: Double = js.native
  var textStyle: js.UndefOr[js.Object] = js.native
  @JSName("translations")
  var translations_ojLegend_ : Anon_ComponentNameLabelAndValue = js.native
  var valign: middle | bottom | top = js.native
  def addEventListener(
    `type`: drillingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off], _]
  ): Unit = js.native
  def addEventListener(
    `type`: drillingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: halignChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[center | end | start], _]
  ): Unit = js.native
  def addEventListener(
    `type`: halignChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[center | end | start], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: hideAndShowBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off], _]
  ): Unit = js.native
  def addEventListener(
    `type`: hideAndShowBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: hoverBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[dim | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: hoverBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[dim | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: orientationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[horizontal | vertical], _]
  ): Unit = js.native
  def addEventListener(
    `type`: orientationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[horizontal | vertical], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: scrollingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[off | asNeeded], _]
  ): Unit = js.native
  def addEventListener(
    `type`: scrollingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[off | asNeeded], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: valignChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[middle | bottom | top], _]
  ): Unit = js.native
  def addEventListener(
    `type`: valignChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[middle | bottom | top], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: asChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: asChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: dataChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: dataChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_expandedChanged(
    `type`: expandedChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_expandedChanged(
    `type`: expandedChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hiddenCategoriesChanged(
    `type`: hiddenCategoriesChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hiddenCategoriesChanged(
    `type`: hiddenCategoriesChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highlightedCategoriesChanged(
    `type`: highlightedCategoriesChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highlightedCategoriesChanged(
    `type`: highlightedCategoriesChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hoverBehaviorDelayChanged(
    `type`: hoverBehaviorDelayChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hoverBehaviorDelayChanged(
    `type`: hoverBehaviorDelayChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojDrill(
    `type`: ojDrill,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojDrill(
    `type`: ojDrill,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_symbolHeightChanged(
    `type`: symbolHeightChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_symbolHeightChanged(
    `type`: symbolHeightChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_symbolWidthChanged(
    `type`: symbolWidthChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_symbolWidthChanged(
    `type`: symbolWidthChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_textStyleChanged(
    `type`: textStyleChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_textStyleChanged(
    `type`: textStyleChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
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
  def setProperty_textStyle(property: textStyle, value: js.Object): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: Anon_ComponentNameLabelAndValue): Unit = js.native
}

