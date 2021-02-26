package typingsSlinky.recompose

import typingsSlinky.react.mod.ValidationMap
import typingsSlinky.recompose.mod.InferableComponentEnhancer
import typingsSlinky.recompose.mod.mapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#withcontext
object withContextMod {
  
  @JSImport("recompose/withContext", JSImport.Default)
  @js.native
  def default[TContext, TProps](childContextTypes: ValidationMap[TContext], getChildContext: mapper[TProps, _]): InferableComponentEnhancer[js.Object] = js.native
}
