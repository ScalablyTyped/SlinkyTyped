package typingsSlinky.rcSlider.anon

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import typingsSlinky.rcSlider.createSliderWithTooltipMod.ComponentWrapperProps
import typingsSlinky.rcSlider.createSliderWithTooltipMod.ComponentWrapperState
import typingsSlinky.rcSlider.interfaceMod.GenericSliderProps
import typingsSlinky.rcSlider.rcSliderStrings.visibles
import typingsSlinky.react.mod.ErrorInfo
import typingsSlinky.react.mod.ReactInstance
import typingsSlinky.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentDidCatch[Props /* <: GenericSliderProps */] extends StObject {
  
  var UNSAFE_componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var UNSAFE_componentWillReceiveProps: js.UndefOr[
    js.Function2[/* nextProps */ ComponentWrapperProps with Props, /* nextContext */ js.Any, Unit]
  ] = js.native
  
  var UNSAFE_componentWillUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ ComponentWrapperProps with Props, 
      /* nextState */ ReadonlyComponentWrapperS, 
      /* nextContext */ js.Any, 
      Unit
    ]
  ] = js.native
  
  var componentDidCatch: js.UndefOr[js.Function2[/* error */ js.Error, /* errorInfo */ ErrorInfo, Unit]] = js.native
  
  var componentDidMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentDidUpdate: js.UndefOr[
    js.Function3[
      /* prevProps */ ComponentWrapperProps with Props, 
      /* prevState */ ReadonlyComponentWrapperS, 
      /* snapshot */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentWillReceiveProps: js.UndefOr[
    js.Function2[/* nextProps */ ComponentWrapperProps with Props, /* nextContext */ js.Any, Unit]
  ] = js.native
  
  var componentWillUnmount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentWillUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ ComponentWrapperProps with Props, 
      /* nextState */ ReadonlyComponentWrapperS, 
      /* nextContext */ js.Any, 
      Unit
    ]
  ] = js.native
  
  var context: js.Any = js.native
  
  def forceUpdate(): Unit = js.native
  def forceUpdate(callback: js.Function0[Unit]): Unit = js.native
  
  var getSnapshotBeforeUpdate: js.UndefOr[
    js.Function2[
      /* prevProps */ ComponentWrapperProps with Props, 
      /* prevState */ ReadonlyComponentWrapperS, 
      _
    ]
  ] = js.native
  
  def handleTooltipVisibleChange(index: js.Any, visible: js.Any): Unit = js.native
  
  def handleWithTooltip(hasValueDraggingIndexDisabledRestProps: Dictx): ReactElement = js.native
  
  val props: ComponentWrapperProps with Props with ReadonlychildrenReactNode = js.native
  
  var refs: StringDictionary[ReactInstance] = js.native
  
  def render(): ReactElement = js.native
  
  def setState[K /* <: visibles */](
    state: js.Function2[
      /* prevState */ ReadonlyComponentWrapperS, 
      /* props */ ComponentWrapperProps with Props, 
      ComponentWrapperState | (Pick[ComponentWrapperState, K])
    ]
  ): Unit = js.native
  def setState[K /* <: visibles */](
    state: js.Function2[
      /* prevState */ ReadonlyComponentWrapperS, 
      /* props */ ComponentWrapperProps with Props, 
      ComponentWrapperState | (Pick[ComponentWrapperState, K])
    ],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def setState[K /* <: visibles */](state: ComponentWrapperState): Unit = js.native
  def setState[K /* <: visibles */](state: ComponentWrapperState, callback: js.Function0[Unit]): Unit = js.native
  def setState[K /* <: visibles */](state: Pick[ComponentWrapperState, K]): Unit = js.native
  def setState[K /* <: visibles */](state: Pick[ComponentWrapperState, K], callback: js.Function0[Unit]): Unit = js.native
  
  var shouldComponentUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ ComponentWrapperProps with Props, 
      /* nextState */ ReadonlyComponentWrapperS, 
      /* nextContext */ js.Any, 
      Boolean
    ]
  ] = js.native
  
  var state: Visibles = js.native
}
