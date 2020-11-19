package typingsSlinky.graphql.astMod

import typingsSlinky.graphql.graphqlStrings.Field_
import typingsSlinky.graphql.graphqlStrings.FragmentSpread
import typingsSlinky.graphql.graphqlStrings.InlineFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphql.astMod.FieldNode
  - typingsSlinky.graphql.astMod.FragmentSpreadNode
  - typingsSlinky.graphql.astMod.InlineFragmentNode
*/
trait SelectionNode extends js.Object
object SelectionNode {
  
  @scala.inline
  def FieldNode(kind: Field_, name: NameNode): SelectionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionNode]
  }
  
  @scala.inline
  def FragmentSpreadNode(kind: FragmentSpread, name: NameNode): SelectionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionNode]
  }
  
  @scala.inline
  def InlineFragmentNode(kind: InlineFragment, selectionSet: SelectionSetNode): SelectionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionNode]
  }
}
