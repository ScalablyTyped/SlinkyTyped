package typingsSlinky.atOracleOraclejet.ojpopupMod

import org.scalajs.dom.raw.CustomEvent
import typingsSlinky.atOracleOraclejet.Anon_AriaCloseSkipLink
import typingsSlinky.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typingsSlinky.atOracleOraclejet.atOracleOraclejetMod.baseComponent
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.auto
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.autoDismiss
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.autoDismissChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.chrome
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.chromeChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.default
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.firstFocusable
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.focusLoss
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.initialFocus
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.initialFocusChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.modal
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.modality
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.modalityChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.modeless
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.none
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ojAnimateEnd
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ojAnimateStart
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeClose
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeOpen
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ojClose
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ojFocus
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ojOpen
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.popup
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.position
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.positionChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.simple
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.tail
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.tailChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.translations
import typingsSlinky.atOracleOraclejet.ojpopupMod.ojPopup.Position
import typingsSlinky.std.Element
import typingsSlinky.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("ojPopup")
@js.native
trait ojPopup_ extends baseComponent[ojPopupSettableProperties] {
  var autoDismiss: none | focusLoss = js.native
  var chrome: default | none = js.native
  var initialFocus: auto | none | firstFocusable | popup = js.native
  var modality: modeless | modal = js.native
  var onAutoDismissChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onChromeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onInitialFocusChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onModalityChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjAnimateEnd: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjAnimateStart: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjBeforeClose: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjBeforeOpen: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjClose: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjFocus: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjOpen: (js.Function1[CustomEvent, _]) | Null = js.native
  var onPositionChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onTailChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var position: Position = js.native
  var tail: none | simple = js.native
  @JSName("translations")
  var translations_ojPopup_ : Anon_AriaCloseSkipLink = js.native
  def addEventListener(
    `type`: autoDismissChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | focusLoss], _]
  ): Unit = js.native
  def addEventListener(
    `type`: autoDismissChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | focusLoss], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: chromeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[default | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: chromeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[default | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: initialFocusChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | none | firstFocusable | popup], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: initialFocusChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | none | firstFocusable | popup], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: modalityChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[modeless | modal], _]
  ): Unit = js.native
  def addEventListener(
    `type`: modalityChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[modeless | modal], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: tailChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | simple], _]
  ): Unit = js.native
  def addEventListener(
    `type`: tailChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | simple], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: ojAnimateEnd,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: ojAnimateEnd,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: ojAnimateStart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: ojAnimateStart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeClose(
    `type`: ojBeforeClose,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeClose(
    `type`: ojBeforeClose,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeOpen(
    `type`: ojBeforeOpen,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeOpen(
    `type`: ojBeforeOpen,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojClose(
    `type`: ojClose,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojClose(
    `type`: ojClose,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojFocus(
    `type`: ojFocus,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojFocus(
    `type`: ojFocus,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojOpen(
    `type`: ojOpen,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojOpen(
    `type`: ojOpen,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_positionChanged(
    `type`: positionChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_positionChanged(
    `type`: positionChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def close(): Unit = js.native
  @JSName("getProperty")
  def getProperty_autoDismiss(property: autoDismiss): none | focusLoss = js.native
  @JSName("getProperty")
  def getProperty_chrome(property: chrome): default | none = js.native
  @JSName("getProperty")
  def getProperty_initialFocus(property: initialFocus): auto | none | firstFocusable | popup = js.native
  @JSName("getProperty")
  def getProperty_modality(property: modality): modeless | modal = js.native
  @JSName("getProperty")
  def getProperty_position(property: position): Position = js.native
  @JSName("getProperty")
  def getProperty_tail(property: tail): none | simple = js.native
  def isOpen(): Boolean = js.native
  def open(launcher: String): Unit = js.native
  def open(launcher: String, position: Position): Unit = js.native
  def open(launcher: Element): Unit = js.native
  def open(launcher: Element, position: Position): Unit = js.native
  def setProperties(properties: ojPopupSettablePropertiesLenient): Unit = js.native
  def setProperty(property: autoDismiss, value: focusLoss): Unit = js.native
  def setProperty(property: autoDismiss, value: none): Unit = js.native
  def setProperty(property: chrome, value: default): Unit = js.native
  def setProperty(property: chrome, value: none): Unit = js.native
  def setProperty(property: initialFocus, value: auto): Unit = js.native
  def setProperty(property: initialFocus, value: firstFocusable): Unit = js.native
  def setProperty(property: initialFocus, value: none): Unit = js.native
  def setProperty(property: initialFocus, value: popup): Unit = js.native
  def setProperty(property: modality, value: modal): Unit = js.native
  def setProperty(property: modality, value: modeless): Unit = js.native
  def setProperty(property: tail, value: none): Unit = js.native
  def setProperty(property: tail, value: simple): Unit = js.native
  @JSName("setProperty")
  def setProperty_position(property: position, value: Position): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: Anon_AriaCloseSkipLink): Unit = js.native
}

