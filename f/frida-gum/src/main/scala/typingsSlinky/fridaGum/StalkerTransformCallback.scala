package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.StalkerX86TransformCallback
  - typingsSlinky.fridaGum.StalkerArm64TransformCallback
  - typingsSlinky.fridaGum.StalkerNativeTransformCallback
*/
trait StalkerTransformCallback extends js.Object

object StalkerTransformCallback {
  @scala.inline
  implicit def apply(value: StalkerArm64TransformCallback | StalkerX86TransformCallback): StalkerTransformCallback = value.asInstanceOf[StalkerTransformCallback]
  @scala.inline
  implicit def apply(value: StalkerNativeTransformCallback): StalkerTransformCallback = value.asInstanceOf[StalkerTransformCallback]
}

