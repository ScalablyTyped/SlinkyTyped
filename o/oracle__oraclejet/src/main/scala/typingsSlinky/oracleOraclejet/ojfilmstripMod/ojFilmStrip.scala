package typingsSlinky.oracleOraclejet.ojfilmstripMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.oracleOraclejet.anon.Id
import typingsSlinky.oracleOraclejet.anon.LabelAccArrowNextPage
import typingsSlinky.oracleOraclejet.mod.baseComponent
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.adjacent
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.arrowPlacement
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.arrowPlacementChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.arrowVisibility
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.arrowVisibilityChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.currentItem
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.currentItemChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hidden
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.horizontal
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hover
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.looping
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.loopingChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.maxItemsPerPage
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.maxItemsPerPageChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.orientation
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.orientationChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.overlay
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.page
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.translations
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.vertical
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojFilmStrip extends baseComponent[ojFilmStripSettableProperties] {
  var arrowPlacement: adjacent | overlay = js.native
  var arrowVisibility: visible | hidden | hover | auto = js.native
  var currentItem: Id = js.native
  var looping: off | page = js.native
  var maxItemsPerPage: Double = js.native
  var onArrowPlacementChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onArrowVisibilityChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onCurrentItemChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onLoopingChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onMaxItemsPerPageChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOrientationChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var orientation: horizontal | vertical = js.native
  @JSName("translations")
  var translations_ojFilmStrip: LabelAccArrowNextPage = js.native
  def addEventListener(`type`: arrowPlacementChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: arrowPlacementChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: arrowVisibilityChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: arrowVisibilityChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: loopingChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: loopingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: orientationChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: orientationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currentItemChanged(`type`: currentItemChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currentItemChanged(
    `type`: currentItemChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxItemsPerPageChanged(`type`: maxItemsPerPageChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxItemsPerPageChanged(
    `type`: maxItemsPerPageChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def getItemsPerPage(): Double = js.native
  @JSName("getProperty")
  def getProperty_arrowPlacement(property: arrowPlacement): adjacent | overlay = js.native
  @JSName("getProperty")
  def getProperty_arrowVisibility(property: arrowVisibility): visible | hidden | hover | auto = js.native
  @JSName("getProperty")
  def getProperty_currentItem(property: currentItem): Id = js.native
  @JSName("getProperty")
  def getProperty_looping(property: looping): off | page = js.native
  @JSName("getProperty")
  def getProperty_maxItemsPerPage(property: maxItemsPerPage): Double = js.native
  @JSName("getProperty")
  def getProperty_orientation(property: orientation): horizontal | vertical = js.native
  def setProperties(properties: ojFilmStripSettablePropertiesLenient): Unit = js.native
  def setProperty(property: arrowPlacement, value: adjacent): Unit = js.native
  def setProperty(property: arrowPlacement, value: overlay): Unit = js.native
  def setProperty(property: arrowVisibility, value: auto): Unit = js.native
  def setProperty(property: arrowVisibility, value: hidden): Unit = js.native
  def setProperty(property: arrowVisibility, value: hover): Unit = js.native
  def setProperty(property: arrowVisibility, value: visible): Unit = js.native
  def setProperty(property: looping, value: off): Unit = js.native
  def setProperty(property: looping, value: page): Unit = js.native
  def setProperty(property: orientation, value: horizontal): Unit = js.native
  def setProperty(property: orientation, value: vertical): Unit = js.native
  @JSName("setProperty")
  def setProperty_currentItem(property: currentItem, value: Id): Unit = js.native
  @JSName("setProperty")
  def setProperty_maxItemsPerPage(property: maxItemsPerPage, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: LabelAccArrowNextPage): Unit = js.native
}

