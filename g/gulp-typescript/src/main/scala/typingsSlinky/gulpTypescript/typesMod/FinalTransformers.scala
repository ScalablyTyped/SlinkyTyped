package typingsSlinky.gulpTypescript.typesMod

import typingsSlinky.typescript.mod.CustomTransformers
import typingsSlinky.typescript.mod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.UndefOr[scala.Nothing]
  - js.Function1[
/ * program * / js.UndefOr[typingsSlinky.typescript.mod.Program], 
typingsSlinky.typescript.mod.CustomTransformers]
*/
trait FinalTransformers extends js.Object

object FinalTransformers {
  @scala.inline
  implicit def apply(value: js.Function1[/* program */ js.UndefOr[Program], CustomTransformers]): FinalTransformers = value.asInstanceOf[FinalTransformers]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => FinalTransformers): FinalTransformers = value.asInstanceOf[FinalTransformers]
}

