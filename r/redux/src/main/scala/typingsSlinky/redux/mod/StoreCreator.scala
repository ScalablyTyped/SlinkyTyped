package typingsSlinky.redux.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoreCreator extends js.Object {
  
  def apply[S, A /* <: Action[_] */, Ext, StateExt](reducer: Reducer[S, A]): (Store[S with StateExt, A]) with Ext = js.native
  def apply[S, A /* <: Action[_] */, Ext, StateExt](reducer: Reducer[S, A], enhancer: StoreEnhancer[Ext, StateExt]): (Store[S with StateExt, A]) with Ext = js.native
  def apply[S, A /* <: Action[_] */, Ext, StateExt](
    reducer: Reducer[S, A],
    preloadedState: js.UndefOr[scala.Nothing],
    enhancer: StoreEnhancer[Ext, js.Object]
  ): (Store[S with StateExt, A]) with Ext = js.native
  def apply[S, A /* <: Action[_] */, Ext, StateExt](reducer: Reducer[S, A], preloadedState: PreloadedState[S]): (Store[S with StateExt, A]) with Ext = js.native
  def apply[S, A /* <: Action[_] */, Ext, StateExt](reducer: Reducer[S, A], preloadedState: PreloadedState[S], enhancer: StoreEnhancer[Ext, js.Object]): (Store[S with StateExt, A]) with Ext = js.native
}
