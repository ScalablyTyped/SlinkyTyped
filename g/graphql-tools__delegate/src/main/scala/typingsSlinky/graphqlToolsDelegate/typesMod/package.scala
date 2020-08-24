package typingsSlinky.graphqlToolsDelegate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type AsyncExecutor = js.Function1[
    /* params */ typingsSlinky.graphqlToolsDelegate.typesMod.ExecutionParams[
      typingsSlinky.std.Record[java.lang.String, js.Any], 
      typingsSlinky.std.Record[java.lang.String, js.Any]
    ], 
    js.Promise[
      typingsSlinky.graphqlToolsUtils.interfacesMod.ExecutionResult[typingsSlinky.std.Record[java.lang.String, js.Any]]
    ]
  ]
  type CreateProxyingResolverFn = js.Function1[
    /* options */ typingsSlinky.graphqlToolsDelegate.typesMod.ICreateProxyingResolverOptions, 
    typingsSlinky.graphql.definitionMod.GraphQLFieldResolver[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
  ]
  type DelegationBinding = js.Function1[
    /* delegationContext */ typingsSlinky.graphqlToolsDelegate.typesMod.DelegationContext, 
    js.Array[
      typingsSlinky.graphqlToolsUtils.interfacesMod.Transform[typingsSlinky.std.Record[java.lang.String, js.Any]]
    ]
  ]
  type Executor = typingsSlinky.graphqlToolsDelegate.typesMod.AsyncExecutor | typingsSlinky.graphqlToolsDelegate.typesMod.SyncExecutor
  type MergedTypeResolver = js.Function5[
    /* originalResult */ js.Any, 
    /* context */ typingsSlinky.std.Record[java.lang.String, js.Any], 
    /* info */ typingsSlinky.graphql.definitionMod.GraphQLResolveInfo, 
    /* subschema */ typingsSlinky.graphql.mod.GraphQLSchema | typingsSlinky.graphqlToolsDelegate.typesMod.SubschemaConfig, 
    /* selectionSet */ typingsSlinky.graphql.astMod.SelectionSetNode, 
    js.Any
  ]
  type Subscriber = js.Function1[
    /* params */ typingsSlinky.graphqlToolsDelegate.typesMod.ExecutionParams[
      typingsSlinky.std.Record[java.lang.String, js.Any], 
      typingsSlinky.std.Record[java.lang.String, js.Any]
    ], 
    js.Promise[
      (typingsSlinky.std.AsyncIterator[
        typingsSlinky.graphqlToolsUtils.interfacesMod.ExecutionResult[typingsSlinky.std.Record[java.lang.String, js.Any]], 
        js.Any, 
        js.UndefOr[scala.Nothing]
      ]) | (typingsSlinky.graphqlToolsUtils.interfacesMod.ExecutionResult[typingsSlinky.std.Record[java.lang.String, js.Any]])
    ]
  ]
  type SyncExecutor = js.Function1[
    /* params */ typingsSlinky.graphqlToolsDelegate.typesMod.ExecutionParams[
      typingsSlinky.std.Record[java.lang.String, js.Any], 
      typingsSlinky.std.Record[java.lang.String, js.Any]
    ], 
    typingsSlinky.graphqlToolsUtils.interfacesMod.ExecutionResult[typingsSlinky.std.Record[java.lang.String, js.Any]]
  ]
}
