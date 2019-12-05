package typingsSlinky.atOracleOraclejet.ojdialogMod

import org.scalajs.dom.raw.CustomEvent
import typingsSlinky.atOracleOraclejet.Anon_LabelCloseIcon
import typingsSlinky.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typingsSlinky.atOracleOraclejet.atOracleOraclejetMod.baseComponent
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.`title-bar`
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.cancelBehavior
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.cancelBehaviorChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dialogTitle
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dialogTitleChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dragAffordance
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dragAffordanceChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.escape
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.hide
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.icon
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.initialVisibility
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.initialVisibilityChanged
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
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ojResize
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ojResizeStart
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ojResizeStop
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.position
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.positionChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.resizable
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.resizeBehavior
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.resizeBehaviorChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.role
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.roleChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.show
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.translations
import typingsSlinky.atOracleOraclejet.ojdialogMod.ojDialog.Position
import typingsSlinky.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("ojDialog")
@js.native
trait ojDialog_ extends baseComponent[ojDialogSettableProperties] {
  var cancelBehavior: icon | escape | none = js.native
  var dialogTitle: String | Null = js.native
  var dragAffordance: `title-bar` | none = js.native
  var initialVisibility: hide | show = js.native
  var modality: modal | modeless = js.native
  var onCancelBehaviorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDialogTitleChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDragAffordanceChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onInitialVisibilityChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onModalityChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjAnimateEnd: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjAnimateStart: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjBeforeClose: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjBeforeOpen: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjClose: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjFocus: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjOpen: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjResize: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjResizeStart: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjResizeStop: (js.Function1[CustomEvent, _]) | Null = js.native
  var onPositionChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onResizeBehaviorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onRoleChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var position: Position = js.native
  var resizeBehavior: resizable | none = js.native
  var role: String = js.native
  @JSName("translations")
  var translations_ojDialog_ : Anon_LabelCloseIcon = js.native
  def addEventListener(
    `type`: cancelBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[icon | escape | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: cancelBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[icon | escape | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: dragAffordanceChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[`title-bar` | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: dragAffordanceChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[`title-bar` | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: initialVisibilityChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[hide | show], _]
  ): Unit = js.native
  def addEventListener(
    `type`: initialVisibilityChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[hide | show], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: modalityChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[modal | modeless], _]
  ): Unit = js.native
  def addEventListener(
    `type`: modalityChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[modal | modeless], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: resizeBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[resizable | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: resizeBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[resizable | none], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dialogTitleChanged(
    `type`: dialogTitleChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dialogTitleChanged(
    `type`: dialogTitleChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
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
  def addEventListener_ojResize(
    `type`: ojResize,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResize(
    `type`: ojResize,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResizeStart(
    `type`: ojResizeStart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResizeStart(
    `type`: ojResizeStart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResizeStop(
    `type`: ojResizeStop,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResizeStop(
    `type`: ojResizeStop,
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
  @JSName("addEventListener")
  def addEventListener_roleChanged(
    `type`: roleChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_roleChanged(
    `type`: roleChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def close(): Unit = js.native
  @JSName("getProperty")
  def getProperty_cancelBehavior(property: cancelBehavior): icon | escape | none = js.native
  @JSName("getProperty")
  def getProperty_dialogTitle(property: dialogTitle): String | Null = js.native
  @JSName("getProperty")
  def getProperty_dragAffordance(property: dragAffordance): `title-bar` | none = js.native
  @JSName("getProperty")
  def getProperty_initialVisibility(property: initialVisibility): hide | show = js.native
  @JSName("getProperty")
  def getProperty_modality(property: modality): modal | modeless = js.native
  @JSName("getProperty")
  def getProperty_position(property: position): Position = js.native
  @JSName("getProperty")
  def getProperty_resizeBehavior(property: resizeBehavior): resizable | none = js.native
  @JSName("getProperty")
  def getProperty_role(property: role): String = js.native
  def isOpen(): Boolean = js.native
  def open(): Unit = js.native
  def setProperties(properties: ojDialogSettablePropertiesLenient): Unit = js.native
  def setProperty(property: cancelBehavior, value: escape): Unit = js.native
  def setProperty(property: cancelBehavior, value: icon): Unit = js.native
  def setProperty(property: cancelBehavior, value: none): Unit = js.native
  def setProperty(property: dragAffordance, value: `title-bar`): Unit = js.native
  def setProperty(property: dragAffordance, value: none): Unit = js.native
  def setProperty(property: initialVisibility, value: hide): Unit = js.native
  def setProperty(property: initialVisibility, value: show): Unit = js.native
  def setProperty(property: modality, value: modal): Unit = js.native
  def setProperty(property: modality, value: modeless): Unit = js.native
  def setProperty(property: resizeBehavior, value: none): Unit = js.native
  def setProperty(property: resizeBehavior, value: resizable): Unit = js.native
  @JSName("setProperty")
  def setProperty_dialogTitle(property: dialogTitle): Unit = js.native
  @JSName("setProperty")
  def setProperty_dialogTitle(property: dialogTitle, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_position(property: position, value: Position): Unit = js.native
  @JSName("setProperty")
  def setProperty_role(property: role, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: Anon_LabelCloseIcon): Unit = js.native
}

