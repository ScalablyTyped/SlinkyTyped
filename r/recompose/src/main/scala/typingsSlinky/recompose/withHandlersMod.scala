package typingsSlinky.recompose

import typingsSlinky.recompose.mod.HandleCreators
import typingsSlinky.recompose.mod.HandleCreatorsFactory
import typingsSlinky.recompose.mod.InferableComponentEnhancerWithProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#withhandlers
object withHandlersMod {
  
  @JSImport("recompose/withHandlers", JSImport.Default)
  @js.native
  def default[TOutter, THandlers](handlerCreators: HandleCreators[TOutter, THandlers]): InferableComponentEnhancerWithProps[THandlers with TOutter, TOutter] = js.native
  @JSImport("recompose/withHandlers", JSImport.Default)
  @js.native
  def default[TOutter, THandlers](handlerCreators: HandleCreatorsFactory[TOutter, THandlers]): InferableComponentEnhancerWithProps[THandlers with TOutter, TOutter] = js.native
}
