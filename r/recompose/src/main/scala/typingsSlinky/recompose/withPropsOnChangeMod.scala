package typingsSlinky.recompose

import typingsSlinky.recompose.recomposeMod.InferableComponentEnhancerWithProps
import typingsSlinky.recompose.recomposeMod.mapper
import typingsSlinky.recompose.recomposeMod.predicateDiff
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#withpropsonchange
@JSImport("recompose/withPropsOnChange", JSImport.Namespace)
@js.native
object withPropsOnChangeMod extends js.Object {
  def default[TInner, TOutter](shouldMapOrKeys: js.Array[String], createProps: mapper[TOutter, TInner]): InferableComponentEnhancerWithProps[TInner with TOutter, TOutter] = js.native
  def default[TInner, TOutter](shouldMapOrKeys: predicateDiff[TOutter], createProps: mapper[TOutter, TInner]): InferableComponentEnhancerWithProps[TInner with TOutter, TOutter] = js.native
}

