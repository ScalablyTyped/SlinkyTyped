package typingsSlinky.mdast.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mdast.mod.TopLevelContent
  - typingsSlinky.mdast.mod.ListContent
  - typingsSlinky.mdast.mod.TableContent
  - typingsSlinky.mdast.mod.RowContent
  - typingsSlinky.mdast.mod.PhrasingContent
*/
trait Content extends js.Object

object Content {
  @scala.inline
  implicit def apply(value: ListContent): Content = value.asInstanceOf[Content]
  @scala.inline
  implicit def apply(value: PhrasingContent): Content = value.asInstanceOf[Content]
  @scala.inline
  implicit def apply(value: RowContent): Content = value.asInstanceOf[Content]
  @scala.inline
  implicit def apply(value: TableContent): Content = value.asInstanceOf[Content]
  @scala.inline
  implicit def apply(value: TopLevelContent): Content = value.asInstanceOf[Content]
}

