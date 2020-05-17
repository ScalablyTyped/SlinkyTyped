package typingsSlinky.rollup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.rollup.rollupBooleans.`false`
  - scala.Null
  - js.UndefOr[scala.Nothing]
  - typingsSlinky.rollup.mod.PartialResolvedId
*/
trait ResolveIdResult extends js.Object

object ResolveIdResult {
  @scala.inline
  def `false`: typingsSlinky.rollup.rollupBooleans.`false` = false.asInstanceOf[typingsSlinky.rollup.rollupBooleans.`false`]
  @scala.inline
  implicit def apply(value: Null): ResolveIdResult = value.asInstanceOf[ResolveIdResult]
  @scala.inline
  implicit def apply(value: PartialResolvedId): ResolveIdResult = value.asInstanceOf[ResolveIdResult]
  @scala.inline
  implicit def apply(value: String): ResolveIdResult = value.asInstanceOf[ResolveIdResult]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => ResolveIdResult): ResolveIdResult = value.asInstanceOf[ResolveIdResult]
}

