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
  def SimpleMergeTag(name: String, value: String): MergeTag = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeTag]
  }
  @scala.inline
  def ConditionalMergeTag(name: String, rules: js.Array[ConditionalMergeTagRule]): MergeTag = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeTag]
  }
  @scala.inline
  def GroupedMergeTag(
    mergeTags: js.Array[SimpleMergeTag | typingsSlinky.reactEmailEditor.mod.GroupedMergeTag],
    name: String
  ): MergeTag = {
    val __obj = js.Dynamic.literal(mergeTags = mergeTags.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeTag]
  }
}

