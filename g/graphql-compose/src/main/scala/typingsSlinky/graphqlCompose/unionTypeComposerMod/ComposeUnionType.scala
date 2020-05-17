package typingsSlinky.graphqlCompose.unionTypeComposerMod

import typingsSlinky.graphql.mod.GraphQLUnionType
import typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString
import typingsSlinky.graphqlCompose.typeMapperMod.TypeDefinitionString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphqlCompose.unionTypeComposerMod.UnionTypeComposer[js.Any, js.Any]
  - typingsSlinky.graphql.mod.GraphQLUnionType
  - typingsSlinky.graphqlCompose.typeMapperMod.TypeDefinitionString
  - typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString
*/
trait ComposeUnionType extends js.Object

object ComposeUnionType {
  @scala.inline
  implicit def apply(value: GraphQLUnionType): ComposeUnionType = value.asInstanceOf[ComposeUnionType]
  @scala.inline
  implicit def apply(value: TypeAsString): ComposeUnionType = value.asInstanceOf[ComposeUnionType]
  @scala.inline
  implicit def apply(value: TypeDefinitionString): ComposeUnionType = value.asInstanceOf[ComposeUnionType]
  @scala.inline
  implicit def apply(value: UnionTypeComposer[js.Any, js.Any]): ComposeUnionType = value.asInstanceOf[ComposeUnionType]
}

