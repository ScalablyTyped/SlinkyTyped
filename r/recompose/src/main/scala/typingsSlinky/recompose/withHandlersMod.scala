package typingsSlinky.recompose

import typingsSlinky.recompose.mod.HandleCreators
import typingsSlinky.recompose.mod.HandleCreatorsFactory
import typingsSlinky.recompose.mod.InferableComponentEnhancerWithProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#withhandlers
@JSImport("recompose/withHandlers", JSImport.Namespace)
@js.native
object withHandlersMod extends js.Object {
  
  def default[TOutter, THandlers](handlerCreators: HandleCreators[TOutter, THandlers]): InferableComponentEnhancerWithProps[THandlers with TOutter, TOutter] = js.native
  def default[TOutter, THandlers](handlerCreators: HandleCreatorsFactory[TOutter, THandlers]): InferableComponentEnhancerWithProps[THandlers with TOutter, TOutter] = js.native
}
