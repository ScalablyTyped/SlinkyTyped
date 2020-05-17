package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - typingsSlinky.csstype.mod.BgSize[TLength]
  - java.lang.String
*/
trait MaskSizeProperty[TLength] extends js.Object

object MaskSizeProperty {
  @scala.inline
  implicit def apply[TLength](value: BgSize[TLength]): MaskSizeProperty[TLength] = value.asInstanceOf[MaskSizeProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: Globals): MaskSizeProperty[TLength] = value.asInstanceOf[MaskSizeProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): MaskSizeProperty[TLength] = value.asInstanceOf[MaskSizeProperty[TLength]]
}

