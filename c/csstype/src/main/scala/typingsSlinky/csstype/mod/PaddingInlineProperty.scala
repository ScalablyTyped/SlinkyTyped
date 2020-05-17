package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - TLength
  - java.lang.String
*/
trait PaddingInlineProperty[TLength] extends js.Object

object PaddingInlineProperty {
  @scala.inline
  implicit def apply[TLength](value: Globals): PaddingInlineProperty[TLength] = value.asInstanceOf[PaddingInlineProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): PaddingInlineProperty[TLength] = value.asInstanceOf[PaddingInlineProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: TLength): PaddingInlineProperty[TLength] = value.asInstanceOf[PaddingInlineProperty[TLength]]
}

