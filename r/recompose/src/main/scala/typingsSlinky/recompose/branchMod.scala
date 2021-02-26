package typingsSlinky.recompose

import typingsSlinky.recompose.mod.ComponentEnhancer
import typingsSlinky.recompose.mod.InferableComponentEnhancer
import typingsSlinky.recompose.mod.predicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#branch
object branchMod {
  
  @JSImport("recompose/branch", JSImport.Default)
  @js.native
  def default[TOutter](
    test: predicate[TOutter],
    trueEnhancer: (ComponentEnhancer[_, _]) | InferableComponentEnhancer[js.Object]
  ): ComponentEnhancer[_, TOutter] = js.native
  @JSImport("recompose/branch", JSImport.Default)
  @js.native
  def default[TOutter](
    test: predicate[TOutter],
    trueEnhancer: (ComponentEnhancer[_, _]) | InferableComponentEnhancer[js.Object],
    falseEnhancer: (ComponentEnhancer[_, _]) | InferableComponentEnhancer[js.Object]
  ): ComponentEnhancer[_, TOutter] = js.native
}
