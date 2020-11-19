package typingsSlinky.recompose

import typingsSlinky.recompose.mod.InferableComponentEnhancerWithProps
import typingsSlinky.recompose.mod.mapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#withprops
@JSImport("recompose/withProps", JSImport.Namespace)
@js.native
object withPropsMod extends js.Object {
  
  def default[TInner, TOutter](createProps: TInner): InferableComponentEnhancerWithProps[TInner with TOutter, TOutter] = js.native
  def default[TInner, TOutter](createProps: mapper[TOutter, TInner]): InferableComponentEnhancerWithProps[TInner with TOutter, TOutter] = js.native
}
