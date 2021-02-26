package typingsSlinky.reactEmailEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactEmailEditor.mod.SimpleMergeTag
  - typingsSlinky.reactEmailEditor.mod.ConditionalMergeTag
  - typingsSlinky.reactEmailEditor.mod.GroupedMergeTag
*/
trait MergeTag extends StObject
object MergeTag {
  
  @scala.inline
  def ConditionalMergeTag(name: String, rules: js.Array[ConditionalMergeTagRule]): typingsSlinky.reactEmailEditor.mod.ConditionalMergeTag = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactEmailEditor.mod.ConditionalMergeTag]
  }
  
  @scala.inline
  def GroupedMergeTag(
    mergeTags: js.Array[SimpleMergeTag | typingsSlinky.reactEmailEditor.mod.GroupedMergeTag],
    name: String
  ): typingsSlinky.reactEmailEditor.mod.GroupedMergeTag = {
    val __obj = js.Dynamic.literal(mergeTags = mergeTags.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactEmailEditor.mod.GroupedMergeTag]
  }
  
  @scala.inline
  def SimpleMergeTag(name: String, value: String): typingsSlinky.reactEmailEditor.mod.SimpleMergeTag = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactEmailEditor.mod.SimpleMergeTag]
  }
}
