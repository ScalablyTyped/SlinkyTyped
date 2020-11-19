package typingsSlinky.rmcPicker.anon

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentDidUpdate extends js.Object {
  
  var componentDidMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentDidUpdate: js.UndefOr[
    js.Function3[
      /* prevProps */ ReadonlyIPickerProps, 
      /* prevState */ js.Any, 
      /* prevContext */ js.Any, 
      Unit
    ]
  ] = js.native
  
  var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentWillReceiveProps: js.UndefOr[
    js.Function2[/* nextProps */ ReadonlyIPickerProps, /* nextContext */ js.Any, Unit]
  ] = js.native
  
  var componentWillUnmount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentWillUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ ReadonlyIPickerProps, 
      /* nextState */ js.Any, 
      /* nextContext */ js.Any, 
      Unit
    ]
  ] = js.native
  
  def computeChildIndex(top: js.Any, itemHeight: js.Any, childrenLength: js.Any): Double = js.native
  
  var context: js.Any = js.native
  
  def doScrollingComplete(top: js.Any, itemHeight: js.Any, fireValueChange: js.Any): Unit = js.native
  
  def forceUpdate(): Unit = js.native
  def forceUpdate(callBack: js.Function0[_]): Unit = js.native
  
  var props: ReadonlychildrenReactNodeChildren = js.native
  
  var refs: StringDictionary[ReactInstance] = js.native
  
  def render(): ReactElement = js.native
  
  def select(value: js.Any, itemHeight: js.Any, scrollTo: js.Any): Unit = js.native
  
  def selectByIndex(index: js.Any, itemHeight: js.Any, zscrollTo: js.Any): Unit = js.native
  
  def setState[K /* <: String | Double | js.Symbol */](state: js.Any): Unit = js.native
  def setState[K /* <: String | Double | js.Symbol */](state: js.Any, callback: js.Function0[_]): Unit = js.native
  
  var shouldComponentUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ ReadonlyIPickerProps, 
      /* nextState */ js.Any, 
      /* nextContext */ js.Any, 
      Boolean
    ]
  ] = js.native
  
  var state: js.Any = js.native
}
