package typingsSlinky.graphqlCompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object schemaComposerMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer[js.Any, TContext]
    - typingsSlinky.graphqlCompose.inputTypeComposerMod.InputTypeComposer[TContext]
    - typingsSlinky.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[TContext]
    - typingsSlinky.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer[js.Any, TContext]
    - typingsSlinky.graphqlCompose.unionTypeComposerMod.UnionTypeComposer[js.Any, TContext]
    - typingsSlinky.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer[TContext]
  */
  type AnyComposeType[TContext] = typingsSlinky.graphqlCompose.schemaComposerMod._AnyComposeType[TContext] | (typingsSlinky.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer[js.Any, TContext]) | (typingsSlinky.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer[js.Any, TContext]) | (typingsSlinky.graphqlCompose.unionTypeComposerMod.UnionTypeComposer[js.Any, TContext])
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer[js.Any, TContext]
    - typingsSlinky.graphqlCompose.inputTypeComposerMod.InputTypeComposer[TContext]
    - typingsSlinky.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[TContext]
    - typingsSlinky.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer[js.Any, TContext]
    - typingsSlinky.graphqlCompose.unionTypeComposerMod.UnionTypeComposer[js.Any, TContext]
    - typingsSlinky.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer[TContext]
    - typingsSlinky.graphql.definitionMod.GraphQLNamedType
  */
  type AnyType[TContext] = typingsSlinky.graphqlCompose.schemaComposerMod._AnyType[TContext] | (typingsSlinky.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer[js.Any, TContext]) | (typingsSlinky.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer[js.Any, TContext]) | (typingsSlinky.graphqlCompose.unionTypeComposerMod.UnionTypeComposer[js.Any, TContext]) | typingsSlinky.graphql.definitionMod.GraphQLNamedType
  
  type GraphQLToolsResolveMethods[TContext] = org.scalablytyped.runtime.StringDictionary[
    org.scalablytyped.runtime.StringDictionary[
      js.Function4[
        /* source */ js.Any, 
        /* args */ js.Object, 
        /* context */ TContext, 
        /* info */ typingsSlinky.graphql.definitionMod.GraphQLResolveInfo, 
        js.Any
      ]
    ]
  ]
}
