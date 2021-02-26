package typingsSlinky.recompose

import typingsSlinky.recompose.mod.InferableComponentEnhancerWithProps
import typingsSlinky.recompose.mod.StateHandlerMap
import typingsSlinky.recompose.mod.StateUpdaters
import typingsSlinky.recompose.mod.mapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#withstatehandlers
object withStateHandlersMod {
  
  @JSImport("recompose/withStateHandlers", JSImport.Default)
  @js.native
  def default[TState, TUpdaters /* <: StateHandlerMap[TState] */, TOutter](createProps: TState, stateUpdaters: StateUpdaters[TOutter, TState, TUpdaters]): InferableComponentEnhancerWithProps[TOutter with TState with TUpdaters, TOutter] = js.native
  @JSImport("recompose/withStateHandlers", JSImport.Default)
  @js.native
  def default[TState, TUpdaters /* <: StateHandlerMap[TState] */, TOutter](createProps: mapper[TOutter, TState], stateUpdaters: StateUpdaters[TOutter, TState, TUpdaters]): InferableComponentEnhancerWithProps[TOutter with TState with TUpdaters, TOutter] = js.native
}
