package typingsSlinky.grommet.utilsMod

import typingsSlinky.grommet.anon.Start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.grommet.grommetStrings.none
  - typingsSlinky.grommet.utilsMod.EdgeSizeType
  - typingsSlinky.grommet.anon.Start
  - java.lang.String
*/
trait EdgeType extends js.Object

object EdgeType {
  @scala.inline
  def none: typingsSlinky.grommet.grommetStrings.none = "none".asInstanceOf[typingsSlinky.grommet.grommetStrings.none]
  @scala.inline
  implicit def apply(value: EdgeSizeType): EdgeType = value.asInstanceOf[EdgeType]
  @scala.inline
  implicit def apply(value: Start): EdgeType = value.asInstanceOf[EdgeType]
  @scala.inline
  implicit def apply(value: String): EdgeType = value.asInstanceOf[EdgeType]
}

