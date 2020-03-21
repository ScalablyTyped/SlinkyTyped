package typingsSlinky.graphqlCompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object objectTypeComposerMod {
  type ArgsMap = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ComposeArgumentConfig = typingsSlinky.graphqlCompose.objectTypeComposerMod.ComposeArgumentConfigAsObject | typingsSlinky.graphqlCompose.objectTypeComposerMod.ComposeArgumentType | (js.Function0[
    typingsSlinky.graphqlCompose.objectTypeComposerMod.ComposeArgumentConfigAsObject | typingsSlinky.graphqlCompose.objectTypeComposerMod.ComposeArgumentType
  ])
  type ComposeArgumentType = typingsSlinky.graphql.definitionMod.GraphQLInputType | typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString | typingsSlinky.graphqlCompose.inputTypeComposerMod.InputTypeComposer[js.Any] | typingsSlinky.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[js.Any] | typingsSlinky.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer[js.Any] | (js.Array[
    typingsSlinky.graphql.definitionMod.GraphQLInputType | typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString | typingsSlinky.graphqlCompose.inputTypeComposerMod.InputTypeComposer[js.Any] | typingsSlinky.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[js.Any] | typingsSlinky.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer[js.Any]
  ])
  type ComposeFieldConfig[TSource, TContext, TArgs] = (typingsSlinky.graphqlCompose.objectTypeComposerMod.ComposeFieldConfigAsObject[TSource, TContext, TArgs]) | (typingsSlinky.graphqlCompose.objectTypeComposerMod.ComposeOutputType[js.Any, TContext]) | (typingsSlinky.graphqlCompose.definitionsMod.Thunk[
    (typingsSlinky.graphqlCompose.objectTypeComposerMod.ComposeFieldConfigAsObject[TSource, TContext, TArgs]) | (typingsSlinky.graphqlCompose.objectTypeComposerMod.ComposeOutputType[js.Any, TContext])
  ])
  type ComposeFieldConfigArgumentMap[TArgs] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ argName in keyof TArgs ]: graphql-compose.graphql-compose/lib/ObjectTypeComposer.ComposeArgumentConfig}
    */ typingsSlinky.graphqlCompose.graphqlComposeStrings.ComposeFieldConfigArgumentMap with js.Any
  type ComposeFieldConfigMap[TSource, TContext] = typingsSlinky.graphqlCompose.definitionsMod.ObjMap[
    typingsSlinky.graphqlCompose.objectTypeComposerMod.ComposeFieldConfig[TSource, TContext, typingsSlinky.graphqlCompose.objectTypeComposerMod.ArgsMap]
  ]
  type ComposeObjectType = (typingsSlinky.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer[js.Any, js.Any]) | (typingsSlinky.graphql.mod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]) | typingsSlinky.graphqlCompose.typeMapperMod.TypeDefinitionString | typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString
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
  type ComposeOutputType[TReturn, TContext] = (typingsSlinky.graphqlCompose.objectTypeComposerMod._ComposeOutputType[TReturn, TContext]) | (typingsSlinky.graphqlCompose.resolverMod.Resolver[js.Any, TContext, js.Any, js.Any]) | (js.Array[
    typingsSlinky.graphql.definitionMod.GraphQLOutputType | (typingsSlinky.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer[TReturn, TContext]) | typingsSlinky.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[TContext] | typingsSlinky.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer[TContext] | typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString | (typingsSlinky.graphqlCompose.resolverMod.Resolver[js.Any, TContext, js.Any, js.Any]) | (typingsSlinky.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer[TReturn, TContext]) | (typingsSlinky.graphqlCompose.unionTypeComposerMod.UnionTypeComposer[TReturn, TContext])
  ]) | typingsSlinky.graphql.definitionMod.GraphQLOutputType | typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString
  type GetRecordIdFn[TSource, TContext] = js.Function3[/* source */ TSource, /* args */ js.Any, /* context */ TContext, java.lang.String]
  type ObjectTypeComposeDefinition[TSource, TContext] = typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString | (typingsSlinky.graphqlCompose.objectTypeComposerMod.ComposeObjectTypeConfig[TSource, TContext]) | (typingsSlinky.graphql.mod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]])
  type RelationArgsMapper[TSource, TContext, TArgs] = org.scalablytyped.runtime.StringDictionary[
    org.scalablytyped.runtime.StringDictionary[js.Any] | (typingsSlinky.graphqlCompose.objectTypeComposerMod.RelationArgsMapperFn[TSource, TContext, TArgs]) | scala.Null | scala.Unit | java.lang.String | scala.Double | js.Array[js.Any]
  ]
  type RelationArgsMapperFn[TSource, TContext, TArgs] = js.Function4[
    /* source */ TSource, 
    /* args */ TArgs, 
    /* context */ TContext, 
    /* info */ typingsSlinky.graphql.definitionMod.GraphQLResolveInfo, 
    js.Any
  ]
  type RelationThunkMap[TSource, TContext] = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.graphqlCompose.definitionsMod.Thunk[
      typingsSlinky.graphqlCompose.objectTypeComposerMod.RelationOpts[
        TSource, 
        TContext, 
        typingsSlinky.graphqlCompose.objectTypeComposerMod.ArgsMap, 
        typingsSlinky.graphqlCompose.objectTypeComposerMod.ArgsMap
      ]
    ]
  ]
}
