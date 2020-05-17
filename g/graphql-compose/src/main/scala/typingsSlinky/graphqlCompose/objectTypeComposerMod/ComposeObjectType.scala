package typingsSlinky.graphqlCompose.objectTypeComposerMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.mod.GraphQLObjectType
import typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString
import typingsSlinky.graphqlCompose.typeMapperMod.TypeDefinitionString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer[js.Any, js.Any]
  - typingsSlinky.graphql.mod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
  - typingsSlinky.graphqlCompose.typeMapperMod.TypeDefinitionString
  - typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString
*/
trait ComposeObjectType extends js.Object

object ComposeObjectType {
  @scala.inline
  implicit def apply(value: GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]]): ComposeObjectType = value.asInstanceOf[ComposeObjectType]
  @scala.inline
  implicit def apply(value: ObjectTypeComposer[js.Any, js.Any]): ComposeObjectType = value.asInstanceOf[ComposeObjectType]
  @scala.inline
  implicit def apply(value: TypeAsString): ComposeObjectType = value.asInstanceOf[ComposeObjectType]
  @scala.inline
  implicit def apply(value: TypeDefinitionString): ComposeObjectType = value.asInstanceOf[ComposeObjectType]
}

