package typingsSlinky.graphqlCompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object objectTypeComposerMod {
  type ArgsMap = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ComposeFieldConfigArgumentMap[TArgs] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ argName in keyof TArgs ]: graphql-compose.graphql-compose/lib/ObjectTypeComposer.ComposeArgumentConfig}
    */ typingsSlinky.graphqlCompose.graphqlComposeStrings.ComposeFieldConfigArgumentMap with org.scalablytyped.runtime.TopLevel[js.Any]
  type ComposeFieldConfigMap[TSource, TContext] = typingsSlinky.graphqlCompose.definitionsMod.ObjMap[
    typingsSlinky.graphqlCompose.objectTypeComposerMod.ComposeFieldConfig[TSource, TContext, typingsSlinky.graphqlCompose.objectTypeComposerMod.ArgsMap]
  ]
  type GetRecordIdFn[TSource, TContext] = js.Function3[/* source */ TSource, /* args */ js.Any, /* context */ TContext, java.lang.String]
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
