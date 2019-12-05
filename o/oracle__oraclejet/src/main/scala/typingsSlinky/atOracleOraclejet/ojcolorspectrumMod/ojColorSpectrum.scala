package typingsSlinky.atOracleOraclejet.ojcolorspectrumMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.atOracleOraclejet.Anon_LabelHue
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.labelledBy
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.labelledByChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.transientValueChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.translations
import typingsSlinky.atOracleOraclejet.ojcolorMod.^
import typingsSlinky.atOracleOraclejet.ojeditablevalueMod.editableValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojColorSpectrum extends editableValue[^, ojColorSpectrumSettableProperties, ^, ^] {
  var labelledBy: String | Null = js.native
  var onLabelledByChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojColorSpectrum: (js.Function1[CustomEvent, _]) | Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojColorSpectrum: (js.Function1[CustomEvent, _]) | Null = js.native
  var onTransientValueChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  val transientValue: ^ = js.native
  @JSName("translations")
  var translations_ojColorSpectrum: Anon_LabelHue = js.native
  @JSName("addEventListener")
  def addEventListener_labelledByChanged(`type`: labelledByChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelledByChanged(
    `type`: labelledByChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transientValueChanged(`type`: transientValueChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transientValueChanged(
    `type`: transientValueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_labelledBy(property: labelledBy): String | Null = js.native
  @JSName("getProperty")
  def getProperty_transientValue(property: typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.transientValue): ^ = js.native
  def setProperties(properties: ojColorSpectrumSettablePropertiesLenient): Unit = js.native
  @JSName("setProperty")
  def setProperty_labelledBy(property: labelledBy): Unit = js.native
  @JSName("setProperty")
  def setProperty_labelledBy(property: labelledBy, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_transientValue(property: typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.transientValue, value: ^): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: Anon_LabelHue): Unit = js.native
}

@JSImport("@oracle/oraclejet/ojcolorspectrum", "ojColorSpectrum")
@js.native
object ojColorSpectrum extends js.Object {
  type ojAnimateEnd = CustomEvent
  type ojAnimateStart = CustomEvent
}

