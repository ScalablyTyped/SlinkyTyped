package typingsSlinky.apolloUtilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object transformMod {
  type GetDirectiveConfig = typingsSlinky.apolloUtilities.transformMod.GetNodeConfig[typingsSlinky.graphql.astMod.DirectiveNode]
  type GetFragmentSpreadConfig = typingsSlinky.apolloUtilities.transformMod.GetNodeConfig[typingsSlinky.graphql.astMod.FragmentSpreadNode]
  type RemoveArgumentsConfig = typingsSlinky.apolloUtilities.transformMod.RemoveNodeConfig[typingsSlinky.graphql.astMod.ArgumentNode]
  type RemoveDirectiveConfig = typingsSlinky.apolloUtilities.transformMod.RemoveNodeConfig[typingsSlinky.graphql.astMod.DirectiveNode]
  type RemoveFragmentDefinitionConfig = typingsSlinky.apolloUtilities.transformMod.RemoveNodeConfig[typingsSlinky.graphql.astMod.FragmentDefinitionNode]
  type RemoveFragmentSpreadConfig = typingsSlinky.apolloUtilities.transformMod.RemoveNodeConfig[typingsSlinky.graphql.astMod.FragmentSpreadNode]
  type RemoveVariableDefinitionConfig = typingsSlinky.apolloUtilities.transformMod.RemoveNodeConfig[typingsSlinky.graphql.astMod.VariableDefinitionNode]
}
