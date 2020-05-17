package typingsSlinky.babelCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Boolean
  - scala.Double
  - scala.Null
  - js.UndefOr[scala.Nothing]
*/
trait SimpleCacheKey extends js.Object

object SimpleCacheKey {
  @scala.inline
  implicit def apply(value: Boolean): SimpleCacheKey = value.asInstanceOf[SimpleCacheKey]
  @scala.inline
  implicit def apply(value: Double): SimpleCacheKey = value.asInstanceOf[SimpleCacheKey]
  @scala.inline
  implicit def apply(value: Null): SimpleCacheKey = value.asInstanceOf[SimpleCacheKey]
  @scala.inline
  implicit def apply(value: String): SimpleCacheKey = value.asInstanceOf[SimpleCacheKey]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => SimpleCacheKey): SimpleCacheKey = value.asInstanceOf[SimpleCacheKey]
}

