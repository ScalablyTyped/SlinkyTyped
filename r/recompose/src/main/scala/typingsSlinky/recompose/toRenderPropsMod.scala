package typingsSlinky.recompose

import slinky.core.ReactComponentClass
import typingsSlinky.recompose.anon.Children
import typingsSlinky.recompose.mod.InferableComponentEnhancerWithProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#torenderprops
object toRenderPropsMod {
  
  @JSImport("recompose/toRenderProps", JSImport.Default)
  @js.native
  def default[TInner, TOutter](hoc: InferableComponentEnhancerWithProps[TInner with TOutter, TOutter]): ReactComponentClass[TOutter with Children[TInner]] = js.native
}
