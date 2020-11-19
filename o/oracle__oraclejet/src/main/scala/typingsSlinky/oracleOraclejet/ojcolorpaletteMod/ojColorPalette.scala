package typingsSlinky.oracleOraclejet.ojcolorpaletteMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.oracleOraclejet.anon.Label
import typingsSlinky.oracleOraclejet.anon.LabelNone
import typingsSlinky.oracleOraclejet.ojcolorMod.^
import typingsSlinky.oracleOraclejet.ojeditablevalueMod.editableValue
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.grid
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.labelDisplay
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.labelDisplayChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.labelledBy
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.labelledByChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.layout
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.layoutChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.lg
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.list
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.palette
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.paletteChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.sm
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.swatchSize
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.swatchSizeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.translations
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.xs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojColorPalette extends editableValue[^, ojColorPaletteSettableProperties, ^, ^] {
  
  def addEventListener(`type`: labelDisplayChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: labelDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: layoutChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: layoutChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: swatchSizeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: swatchSizeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelledByChanged(`type`: labelledByChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelledByChanged(
    `type`: labelledByChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paletteChanged(`type`: paletteChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paletteChanged(
    `type`: paletteChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  
  @JSName("getProperty")
  def getProperty_labelDisplay(property: labelDisplay): auto | off = js.native
  @JSName("getProperty")
  def getProperty_labelledBy(property: labelledBy): String | Null = js.native
  @JSName("getProperty")
  def getProperty_layout(property: layout): grid | list = js.native
  @JSName("getProperty")
  def getProperty_palette(property: palette): js.Array[Label] = js.native
  @JSName("getProperty")
  def getProperty_swatchSize(property: swatchSize): xs | sm | lg = js.native
  
  var labelDisplay: auto | off = js.native
  
  var labelledBy: String | Null = js.native
  
  var layout: grid | list = js.native
  
  var onLabelDisplayChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onLabelledByChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onLayoutChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojColorPalette: (js.Function1[CustomEvent, _]) | Null = js.native
  
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojColorPalette: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onPaletteChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onSwatchSizeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var palette: js.Array[Label] = js.native
  
  def setProperties(properties: ojColorPaletteSettablePropertiesLenient): Unit = js.native
  
  def setProperty(property: labelDisplay, value: auto): Unit = js.native
  def setProperty(property: labelDisplay, value: off): Unit = js.native
  def setProperty(property: layout, value: grid): Unit = js.native
  def setProperty(property: layout, value: list): Unit = js.native
  def setProperty(property: swatchSize, value: lg): Unit = js.native
  def setProperty(property: swatchSize, value: sm): Unit = js.native
  def setProperty(property: swatchSize, value: xs): Unit = js.native
  @JSName("setProperty")
  def setProperty_labelledBy(property: labelledBy): Unit = js.native
  @JSName("setProperty")
  def setProperty_labelledBy(property: labelledBy, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_palette(property: palette, value: js.Array[Label]): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: LabelNone): Unit = js.native
  
  var swatchSize: xs | sm | lg = js.native
  
  @JSName("translations")
  var translations_ojColorPalette: LabelNone = js.native
}
@JSImport("@oracle/oraclejet/ojcolorpalette", "ojColorPalette")
@js.native
object ojColorPalette extends js.Object {
  
  type ojAnimateEnd = CustomEvent
  
  type ojAnimateStart = CustomEvent
}
