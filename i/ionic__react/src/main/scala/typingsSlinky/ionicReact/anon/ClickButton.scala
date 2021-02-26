package typingsSlinky.ionicReact.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.ionicReact.navContextMod.NavContextState
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.ContextType
import typingsSlinky.react.mod.ErrorInfo
import typingsSlinky.react.mod.ReactInstance
import typingsSlinky.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClickButton extends StObject {
  
  var UNSAFE_componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var UNSAFE_componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ ReadonlyProps, /* nextContext */ js.Any, Unit]] = js.native
  
  var UNSAFE_componentWillUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ ReadonlyProps, 
      /* nextState */ js.Object, 
      /* nextContext */ js.Any, 
      Unit
    ]
  ] = js.native
  
  def clickButton(e: SyntheticMouseEvent[Element]): Unit = js.native
  
  var componentDidCatch: js.UndefOr[js.Function2[/* error */ js.Error, /* errorInfo */ ErrorInfo, Unit]] = js.native
  
  var componentDidMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentDidUpdate: js.UndefOr[
    js.Function3[
      /* prevProps */ ReadonlyProps, 
      /* prevState */ js.Object, 
      /* snapshot */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ ReadonlyProps, /* nextContext */ js.Any, Unit]] = js.native
  
  var componentWillUnmount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentWillUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ ReadonlyProps, 
      /* nextState */ js.Object, 
      /* nextContext */ js.Any, 
      Unit
    ]
  ] = js.native
  
  var context: ContextType[Context[NavContextState]] = js.native
  
  def forceUpdate(): Unit = js.native
  def forceUpdate(callback: js.Function0[Unit]): Unit = js.native
  
  var getSnapshotBeforeUpdate: js.UndefOr[js.Function2[/* prevProps */ ReadonlyProps, /* prevState */ js.Object, _]] = js.native
  
  val props: ReadonlyPropsReadonlychil = js.native
  
  var refs: StringDictionary[ReactInstance] = js.native
  
  def render(): ReactElement = js.native
  
  def setState[K /* <: scala.Nothing */](): Unit = js.native
  def setState[K /* <: scala.Nothing */](
    state: js.Function2[
      /* prevState */ js.Object, 
      /* props */ ReadonlyProps, 
      js.Object | (Pick[js.Object, K]) | Null
    ]
  ): Unit = js.native
  def setState[K /* <: scala.Nothing */](
    state: js.Function2[
      /* prevState */ js.Object, 
      /* props */ ReadonlyProps, 
      js.Object | (Pick[js.Object, K]) | Null
    ],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def setState[K /* <: scala.Nothing */](state: js.Object): Unit = js.native
  def setState[K /* <: scala.Nothing */](state: js.Object, callback: js.Function0[Unit]): Unit = js.native
  def setState[K /* <: scala.Nothing */](state: Null, callback: js.Function0[Unit]): Unit = js.native
  def setState[K /* <: scala.Nothing */](state: Pick[js.Object, K]): Unit = js.native
  def setState[K /* <: scala.Nothing */](state: Pick[js.Object, K], callback: js.Function0[Unit]): Unit = js.native
  
  var shouldComponentUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ ReadonlyProps, 
      /* nextState */ js.Object, 
      /* nextContext */ js.Any, 
      Boolean
    ]
  ] = js.native
}
