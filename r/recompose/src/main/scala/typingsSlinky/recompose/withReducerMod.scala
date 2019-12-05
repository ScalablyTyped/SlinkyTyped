package typingsSlinky.recompose

import typingsSlinky.recompose.recomposeMod.InferableComponentEnhancerWithProps
import typingsSlinky.recompose.recomposeMod.mapper
import typingsSlinky.recompose.recomposeMod.reducer
import typingsSlinky.recompose.recomposeMod.reducerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#withreducer
@JSImport("recompose/withReducer", JSImport.Namespace)
@js.native
object withReducerMod extends js.Object {
  def default[TOutter, TState, TAction, TStateName /* <: String */, TDispatchName /* <: String */](
    stateName: TStateName,
    dispatchName: TDispatchName,
    reducer: reducer[TState, TAction],
    initialState: TState
  ): InferableComponentEnhancerWithProps[reducerProps[TState, TAction, TStateName, TDispatchName], TOutter] = js.native
  def default[TOutter, TState, TAction, TStateName /* <: String */, TDispatchName /* <: String */](
    stateName: TStateName,
    dispatchName: TDispatchName,
    reducer: reducer[TState, TAction],
    initialState: mapper[TOutter, TState]
  ): InferableComponentEnhancerWithProps[reducerProps[TState, TAction, TStateName, TDispatchName], TOutter] = js.native
}

