package typingsSlinky.recompose

import typingsSlinky.recompose.mod.InferableComponentEnhancer
import typingsSlinky.recompose.mod.ReactLifeCycleFunctions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#lifecycle
@JSImport("recompose/lifecycle", JSImport.Namespace)
@js.native
object lifecycleMod extends js.Object {
  
  def default[TProps, TState, TInstance](spec: (ReactLifeCycleFunctions[TProps, TState, TInstance]) with TInstance): InferableComponentEnhancer[js.Object] = js.native
}
