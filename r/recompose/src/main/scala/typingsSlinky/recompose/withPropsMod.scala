package typingsSlinky.recompose

import typingsSlinky.recompose.recomposeMod.InferableComponentEnhancerWithProps
import typingsSlinky.recompose.recomposeMod.mapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#withprops
@JSImport("recompose/withProps", JSImport.Namespace)
@js.native
object withPropsMod extends js.Object {
  def default[TInner, TOutter](createProps: TInner): InferableComponentEnhancerWithProps[TInner with TOutter, TOutter] = js.native
  def default[TInner, TOutter](createProps: mapper[TOutter, TInner]): InferableComponentEnhancerWithProps[TInner with TOutter, TOutter] = js.native
}

