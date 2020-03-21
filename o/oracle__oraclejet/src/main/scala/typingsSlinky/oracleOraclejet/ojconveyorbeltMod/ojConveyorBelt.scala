package typingsSlinky.oracleOraclejet.ojconveyorbeltMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.oracleOraclejet.mod.baseComponent
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.contentParent
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.contentParentChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.horizontal
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.orientation
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.orientationChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojConveyorBelt extends baseComponent[ojConveyorBeltSettableProperties] {
  var contentParent: String | Null = js.native
  var onContentParentChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOrientationChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var orientation: horizontal | vertical = js.native
  def addEventListener(`type`: orientationChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: orientationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contentParentChanged(`type`: contentParentChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contentParentChanged(
    `type`: contentParentChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_contentParent(property: contentParent): String | Null = js.native
  @JSName("getProperty")
  def getProperty_orientation(property: orientation): horizontal | vertical = js.native
  def setProperties(properties: ojConveyorBeltSettablePropertiesLenient): Unit = js.native
  def setProperty(property: orientation, value: horizontal): Unit = js.native
  def setProperty(property: orientation, value: vertical): Unit = js.native
  @JSName("setProperty")
  def setProperty_contentParent(property: contentParent): Unit = js.native
  @JSName("setProperty")
  def setProperty_contentParent(property: contentParent, value: String): Unit = js.native
}

