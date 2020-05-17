package typingsSlinky.graphqlCompose.objectTypeComposerMod

import typingsSlinky.graphql.definitionMod.GraphQLOutputType
import typingsSlinky.graphqlCompose.enumTypeComposerMod.EnumTypeComposer
import typingsSlinky.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer
import typingsSlinky.graphqlCompose.resolverMod.Resolver
import typingsSlinky.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer
import typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString
import typingsSlinky.graphqlCompose.unionTypeComposerMod.UnionTypeComposer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphql.definitionMod.GraphQLOutputType
  - typingsSlinky.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer[TReturn, TContext]
  - typingsSlinky.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[TContext]
  - typingsSlinky.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer[TContext]
  - typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString
  - typingsSlinky.graphqlCompose.resolverMod.Resolver[js.Any, TContext, js.Any, js.Any]
  - typingsSlinky.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer[TReturn, TContext]
  - typingsSlinky.graphqlCompose.unionTypeComposerMod.UnionTypeComposer[TReturn, TContext]
  - js.Array[
typingsSlinky.graphql.definitionMod.GraphQLOutputType | (typingsSlinky.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer[TReturn, TContext]) | typingsSlinky.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[TContext] | typingsSlinky.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer[TContext] | typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString | (typingsSlinky.graphqlCompose.resolverMod.Resolver[js.Any, TContext, js.Any, js.Any]) | (typingsSlinky.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer[TReturn, TContext]) | (typingsSlinky.graphqlCompose.unionTypeComposerMod.UnionTypeComposer[TReturn, TContext])]
*/
trait ComposeOutputType[TReturn, TContext]
  extends ComposeFieldConfig[js.Any, TContext, js.Any]

object ComposeOutputType {
  @scala.inline
  implicit def apply[TReturn, TContext](
    value: js.Array[
      GraphQLOutputType | (ObjectTypeComposer[TReturn, TContext]) | EnumTypeComposer[TContext] | ScalarTypeComposer[TContext] | TypeAsString | (Resolver[js.Any, TContext, js.Any, js.Any]) | (InterfaceTypeComposer[TReturn, TContext]) | (UnionTypeComposer[TReturn, TContext])
    ]
  ): ComposeOutputType[TReturn, TContext] = value.asInstanceOf[ComposeOutputType[TReturn, TContext]]
  @scala.inline
  implicit def apply[TReturn, TContext](value: EnumTypeComposer[TContext]): ComposeOutputType[TReturn, TContext] = value.asInstanceOf[ComposeOutputType[TReturn, TContext]]
  @scala.inline
  implicit def apply[TReturn, TContext](value: GraphQLOutputType): ComposeOutputType[TReturn, TContext] = value.asInstanceOf[ComposeOutputType[TReturn, TContext]]
  @scala.inline
  implicit def apply[TReturn, TContext](value: InterfaceTypeComposer[TReturn, TContext]): ComposeOutputType[TReturn, TContext] = value.asInstanceOf[ComposeOutputType[TReturn, TContext]]
  @scala.inline
  implicit def apply[TReturn, TContext](value: ObjectTypeComposer[TReturn, TContext]): ComposeOutputType[TReturn, TContext] = value.asInstanceOf[ComposeOutputType[TReturn, TContext]]
  @scala.inline
  implicit def apply[TReturn, TContext](value: Resolver[js.Any, TContext, js.Any, js.Any]): ComposeOutputType[TReturn, TContext] = value.asInstanceOf[ComposeOutputType[TReturn, TContext]]
  @scala.inline
  implicit def apply[TReturn, TContext](value: ScalarTypeComposer[TContext]): ComposeOutputType[TReturn, TContext] = value.asInstanceOf[ComposeOutputType[TReturn, TContext]]
  @scala.inline
  implicit def apply[TReturn, TContext](value: TypeAsString): ComposeOutputType[TReturn, TContext] = value.asInstanceOf[ComposeOutputType[TReturn, TContext]]
  @scala.inline
  implicit def apply[TReturn, TContext](value: UnionTypeComposer[TReturn, TContext]): ComposeOutputType[TReturn, TContext] = value.asInstanceOf[ComposeOutputType[TReturn, TContext]]
}

