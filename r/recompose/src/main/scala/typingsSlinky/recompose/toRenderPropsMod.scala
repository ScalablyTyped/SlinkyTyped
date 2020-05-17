package typingsSlinky.recompose

import slinky.core.ReactComponentClass
import typingsSlinky.recompose.anon.Children
import typingsSlinky.recompose.mod.InferableComponentEnhancerWithProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#torenderprops
@JSImport("recompose/toRenderProps", JSImport.Namespace)
@js.native
object toRenderPropsMod extends js.Object {
  def default[TInner, TOutter](hoc: InferableComponentEnhancerWithProps[TInner with TOutter, TOutter]): ReactComponentClass[TOutter with Children[TInner]] = js.native
}

