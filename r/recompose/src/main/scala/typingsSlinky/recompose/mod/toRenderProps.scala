package typingsSlinky.recompose.mod

import slinky.core.ReactComponentClass
import typingsSlinky.recompose.anon.Children
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recompose", "toRenderProps")
@js.native
object toRenderProps extends js.Object {
  def apply[TInner, TOutter](hoc: InferableComponentEnhancerWithProps[TInner with TOutter, TOutter]): ReactComponentClass[TOutter with Children[TInner]] = js.native
}

