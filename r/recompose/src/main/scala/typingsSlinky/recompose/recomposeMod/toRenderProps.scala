package typingsSlinky.recompose.recomposeMod

import slinky.core.ReactComponentClass
import typingsSlinky.recompose.Anon_Children
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recompose", "toRenderProps")
@js.native
object toRenderProps extends js.Object {
  def apply[TInner, TOutter](hoc: InferableComponentEnhancerWithProps[TInner with TOutter, TOutter]): ReactComponentClass[TOutter with Anon_Children[TInner]] = js.native
}

