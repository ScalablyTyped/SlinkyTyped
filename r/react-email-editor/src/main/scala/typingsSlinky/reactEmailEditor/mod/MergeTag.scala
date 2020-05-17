package typingsSlinky.reactEmailEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactEmailEditor.mod.SimpleMergeTag
  - typingsSlinky.reactEmailEditor.mod.ConditionalMergeTag
  - typingsSlinky.reactEmailEditor.mod.GroupedMergeTag
*/
trait MergeTag extends js.Object

object MergeTag {
  @scala.inline
  implicit def apply(value: ConditionalMergeTag): MergeTag = value.asInstanceOf[MergeTag]
  @scala.inline
  implicit def apply(value: GroupedMergeTag): MergeTag = value.asInstanceOf[MergeTag]
  @scala.inline
  implicit def apply(value: SimpleMergeTag): MergeTag = value.asInstanceOf[MergeTag]
}

