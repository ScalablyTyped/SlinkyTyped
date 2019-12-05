package typingsSlinky.recompose

import typingsSlinky.recompose.recomposeMod.InferableComponentEnhancerWithProps
import typingsSlinky.recompose.recomposeMod.mapper
import typingsSlinky.recompose.recomposeMod.stateProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#withstate
@JSImport("recompose/withState", JSImport.Namespace)
@js.native
object withStateMod extends js.Object {
  def default[TOutter, TState, TStateName /* <: String */, TStateUpdaterName /* <: String */](stateName: TStateName, stateUpdaterName: TStateUpdaterName, initialState: TState): InferableComponentEnhancerWithProps[stateProps[TState, TStateName, TStateUpdaterName], TOutter] = js.native
  def default[TOutter, TState, TStateName /* <: String */, TStateUpdaterName /* <: String */](stateName: TStateName, stateUpdaterName: TStateUpdaterName, initialState: mapper[TOutter, TState]): InferableComponentEnhancerWithProps[stateProps[TState, TStateName, TStateUpdaterName], TOutter] = js.native
}

