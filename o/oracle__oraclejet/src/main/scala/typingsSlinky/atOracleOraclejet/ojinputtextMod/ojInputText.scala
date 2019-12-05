package typingsSlinky.atOracleOraclejet.ojinputtextMod

import org.scalajs.dom.raw.CustomEvent
import typingsSlinky.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.always
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.auto
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.clearIcon
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.clearIconChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.conditional
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.converter
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.converterChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.email
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.list
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.listChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.never
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.number
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.rawValueChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.search
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.tel
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.text
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.url
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.valueChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.virtualKeyboard
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.virtualKeyboardChanged
import typingsSlinky.atOracleOraclejet.ojvalidationDashBaseMod.Converter
import typingsSlinky.atOracleOraclejet.ojvalidationDashBaseMod.Validation.RegisteredConverter
import typingsSlinky.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojInputText
  extends inputBase[js.Any, ojInputTextSettableProperties, js.Any, js.Any] {
  var clearIcon: never | always | conditional = js.native
  var converter: Converter[_] | RegisteredConverter | Null = js.native
  var list: String = js.native
  var onClearIconChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onConverterChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onListChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojInputText: (js.Function1[CustomEvent, _]) | Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojInputText: (js.Function1[CustomEvent, _]) | Null = js.native
  var onVirtualKeyboardChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var virtualKeyboard: auto | email | number | search | tel | text | url = js.native
  def addEventListener(
    `type`: clearIconChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[never | always | conditional], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: clearIconChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[never | always | conditional], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: rawValueChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojinputtext.inputBase<any, @oracle/oraclejet.@oracle/oraclejet/ojinputtext.ojInputTextSettableProperties, any, any>['rawValue'] */ js.Any
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: rawValueChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojinputtext.inputBase<any, @oracle/oraclejet.@oracle/oraclejet/ojinputtext.ojInputTextSettableProperties, any, any>['rawValue'] */ js.Any
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: valueChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojeditablevalue.editableValue<any, @oracle/oraclejet.@oracle/oraclejet/ojinputtext.ojInputTextSettableProperties, any, any>['value'] */ js.Any
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: valueChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojeditablevalue.editableValue<any, @oracle/oraclejet.@oracle/oraclejet/ojinputtext.ojInputTextSettableProperties, any, any>['value'] */ js.Any
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: virtualKeyboardChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | email | number | search | tel | text | url], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: virtualKeyboardChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | email | number | search | tel | text | url], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_converterChanged(
    `type`: converterChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_converterChanged(
    `type`: converterChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_listChanged(
    `type`: listChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_listChanged(
    `type`: listChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_clearIcon(property: clearIcon): never | always | conditional = js.native
  @JSName("getProperty")
  def getProperty_converter(property: converter): Converter[_] | RegisteredConverter | Null = js.native
  @JSName("getProperty")
  def getProperty_list(property: list): String = js.native
  @JSName("getProperty")
  def getProperty_virtualKeyboard(property: virtualKeyboard): auto | email | number | search | tel | text | url = js.native
  def setProperties(properties: ojInputTextSettablePropertiesLenient): Unit = js.native
  def setProperty(property: clearIcon, value: always): Unit = js.native
  def setProperty(property: clearIcon, value: conditional): Unit = js.native
  def setProperty(property: clearIcon, value: never): Unit = js.native
  def setProperty(property: virtualKeyboard, value: auto): Unit = js.native
  def setProperty(property: virtualKeyboard, value: email): Unit = js.native
  def setProperty(property: virtualKeyboard, value: number): Unit = js.native
  def setProperty(property: virtualKeyboard, value: search): Unit = js.native
  def setProperty(property: virtualKeyboard, value: tel): Unit = js.native
  def setProperty(property: virtualKeyboard, value: text): Unit = js.native
  def setProperty(property: virtualKeyboard, value: url): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter, value: Converter[_]): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter, value: RegisteredConverter): Unit = js.native
  @JSName("setProperty")
  def setProperty_list(property: list, value: String): Unit = js.native
}

@JSImport("@oracle/oraclejet/ojinputtext", "ojInputText")
@js.native
object ojInputText extends js.Object {
  type ojAnimateEnd = CustomEvent
  type ojAnimateStart = CustomEvent
}

