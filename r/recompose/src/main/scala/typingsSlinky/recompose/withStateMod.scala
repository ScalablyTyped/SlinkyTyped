package typingsSlinky.recompose

import typingsSlinky.recompose.mod.InferableComponentEnhancerWithProps
import typingsSlinky.recompose.mod.mapper
import typingsSlinky.recompose.mod.stateProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#withstate
@JSImport("recompose/withState", JSImport.Namespace)
@js.native
object withStateMod extends js.Object {
  
  def default[TOutter, TState, TStateName /* <: String */, TStateUpdaterName /* <: String */](stateName: TStateName, stateUpdaterName: TStateUpdaterName, initialState: TState): InferableComponentEnhancerWithProps[stateProps[TState, TStateName, TStateUpdaterName], TOutter] = js.native
  def default[TOutter, TState, TStateName /* <: String */, TStateUpdaterName /* <: String */](stateName: TStateName, stateUpdaterName: TStateUpdaterName, initialState: mapper[TOutter, TState]): InferableComponentEnhancerWithProps[stateProps[TState, TStateName, TStateUpdaterName], TOutter] = js.native
}
