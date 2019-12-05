package typingsSlinky.apolloDashUtilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTransformMod {
  import typingsSlinky.graphql.languageAstMod.ArgumentNode
  import typingsSlinky.graphql.languageAstMod.DirectiveNode
  import typingsSlinky.graphql.languageAstMod.FragmentDefinitionNode
  import typingsSlinky.graphql.languageAstMod.FragmentSpreadNode
  import typingsSlinky.graphql.languageAstMod.VariableDefinitionNode

  type GetDirectiveConfig = GetNodeConfig[DirectiveNode]
  type GetFragmentSpreadConfig = GetNodeConfig[FragmentSpreadNode]
  type RemoveArgumentsConfig = RemoveNodeConfig[ArgumentNode]
  type RemoveDirectiveConfig = RemoveNodeConfig[DirectiveNode]
  type RemoveFragmentDefinitionConfig = RemoveNodeConfig[FragmentDefinitionNode]
  type RemoveFragmentSpreadConfig = RemoveNodeConfig[FragmentSpreadNode]
  type RemoveVariableDefinitionConfig = RemoveNodeConfig[VariableDefinitionNode]
}
