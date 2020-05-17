package typingsSlinky.graphqlCompose.objectTypeComposerMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.mod.GraphQLObjectType
import typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString
  - typingsSlinky.graphqlCompose.objectTypeComposerMod.ComposeObjectTypeConfig[TSource, TContext]
  - typingsSlinky.graphql.mod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
*/
trait ObjectTypeComposeDefinition[TSource, TContext] extends js.Object

object ObjectTypeComposeDefinition {
  @scala.inline
  implicit def apply[TSource, TContext](value: ComposeObjectTypeConfig[TSource, TContext]): ObjectTypeComposeDefinition[TSource, TContext] = value.asInstanceOf[ObjectTypeComposeDefinition[TSource, TContext]]
  @scala.inline
  implicit def apply[TSource, TContext](value: GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]]): ObjectTypeComposeDefinition[TSource, TContext] = value.asInstanceOf[ObjectTypeComposeDefinition[TSource, TContext]]
  @scala.inline
  implicit def apply[TSource, TContext](value: TypeAsString): ObjectTypeComposeDefinition[TSource, TContext] = value.asInstanceOf[ObjectTypeComposeDefinition[TSource, TContext]]
}

