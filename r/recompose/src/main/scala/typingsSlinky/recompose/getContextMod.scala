package typingsSlinky.recompose

import typingsSlinky.react.reactMod.ValidationMap
import typingsSlinky.recompose.recomposeMod.InferableComponentEnhancer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#getcontext
@JSImport("recompose/getContext", JSImport.Namespace)
@js.native
object getContextMod extends js.Object {
  def default[TContext](contextTypes: ValidationMap[TContext]): InferableComponentEnhancer[TContext] = js.native
}

