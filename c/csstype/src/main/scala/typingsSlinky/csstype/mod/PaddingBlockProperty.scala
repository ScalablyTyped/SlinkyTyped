package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - TLength
  - java.lang.String
*/
trait PaddingBlockProperty[TLength] extends js.Object

object PaddingBlockProperty {
  @scala.inline
  implicit def apply[TLength](value: Globals): PaddingBlockProperty[TLength] = value.asInstanceOf[PaddingBlockProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): PaddingBlockProperty[TLength] = value.asInstanceOf[PaddingBlockProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: TLength): PaddingBlockProperty[TLength] = value.asInstanceOf[PaddingBlockProperty[TLength]]
}

