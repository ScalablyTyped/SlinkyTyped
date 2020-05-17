package typingsSlinky.autolinker.autolinkerMod

import typingsSlinky.autolinker.htmlTagMod.HtmlTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - java.lang.String
  - typingsSlinky.autolinker.htmlTagMod.HtmlTag
  - scala.Null
  - js.UndefOr[scala.Nothing]
  - scala.Unit
*/
trait ReplaceFnReturn extends js.Object

object ReplaceFnReturn {
  @scala.inline
  implicit def apply(value: Boolean): ReplaceFnReturn = value.asInstanceOf[ReplaceFnReturn]
  @scala.inline
  implicit def apply(value: HtmlTag): ReplaceFnReturn = value.asInstanceOf[ReplaceFnReturn]
  @scala.inline
  implicit def apply(value: Null): ReplaceFnReturn = value.asInstanceOf[ReplaceFnReturn]
  @scala.inline
  implicit def apply(value: String): ReplaceFnReturn = value.asInstanceOf[ReplaceFnReturn]
  @scala.inline
  implicit def apply(value: Unit): ReplaceFnReturn = value.asInstanceOf[ReplaceFnReturn]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => ReplaceFnReturn): ReplaceFnReturn = value.asInstanceOf[ReplaceFnReturn]
}

