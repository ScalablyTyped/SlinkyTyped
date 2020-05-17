package typingsSlinky.grommet.utilsMod

import typingsSlinky.grommet.anon.SizeStyle
import typingsSlinky.grommet.anon.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - typingsSlinky.grommet.utilsMod.BoxSideType
  - typingsSlinky.grommet.anon.Style
  - js.Array[typingsSlinky.grommet.anon.SizeStyle]
*/
trait BorderType extends js.Object

object BorderType {
  @scala.inline
  implicit def apply(value: js.Array[SizeStyle]): BorderType = value.asInstanceOf[BorderType]
  @scala.inline
  implicit def apply(value: Boolean): BorderType = value.asInstanceOf[BorderType]
  @scala.inline
  implicit def apply(value: BoxSideType): BorderType = value.asInstanceOf[BorderType]
  @scala.inline
  implicit def apply(value: Style): BorderType = value.asInstanceOf[BorderType]
}

