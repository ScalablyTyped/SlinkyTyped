package typingsSlinky.rmcPicker.anon

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ReactInstance
import typingsSlinky.react.mod.SFCElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentWillMount extends js.Object {
  
  var componentDidMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentDidUpdate: js.UndefOr[
    js.Function3[
      /* prevProps */ ReadonlyIPopupPickerProps, 
      /* prevState */ js.Any, 
      /* prevContext */ js.Any, 
      Unit
    ]
  ] = js.native
  
  var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  def componentWillReceiveProps(nextProps: js.Any): Unit = js.native
  
  var componentWillUnmount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentWillUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ ReadonlyIPopupPickerProps, 
      /* nextState */ js.Any, 
      /* nextContext */ js.Any, 
      Unit
    ]
  ] = js.native
  
  var context: js.Any = js.native
  
  def fireVisibleChange(visible: js.Any): Unit = js.native
  
  def forceUpdate(): Unit = js.native
  def forceUpdate(callBack: js.Function0[_]): Unit = js.native
  
  def getContent(): String | ReactElement | SFCElement[Dictx] = js.native
  
  def getRender(): js.Any = js.native
  
  def hide(): Unit = js.native
  
  def onDismiss(): Unit = js.native
  
  def onOk(): Unit = js.native
  
  def onPickerChange(pickerValue: js.Any): Unit = js.native
  
  def onTriggerClick(e: js.Any): Unit = js.native
  
  var picker: js.Any = js.native
  
  var props: ReadonlychildrenReactNodeActionTextActiveOpacity = js.native
  
  var refs: StringDictionary[ReactInstance] = js.native
  
  def render(): js.Any = js.native
  
  def saveRef(picker: js.Any): Unit = js.native
  
  def setState[K /* <: String | Double | js.Symbol */](state: js.Any): Unit = js.native
  def setState[K /* <: String | Double | js.Symbol */](state: js.Any, callback: js.Function0[_]): Unit = js.native
  
  def setVisibleState(visible: js.Any): Unit = js.native
  
  var shouldComponentUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ ReadonlyIPopupPickerProps, 
      /* nextState */ js.Any, 
      /* nextContext */ js.Any, 
      Boolean
    ]
  ] = js.native
  
  var state: js.Any = js.native
}
