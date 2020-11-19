package typingsSlinky.graphqlCompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object resolverMod {
  
  type ResolverFilterArgFn[TSource, TContext, TArgs] = js.Function3[
    /* query */ js.Any, 
    /* value */ js.Any, 
    /* resolveParams */ typingsSlinky.graphqlCompose.resolverMod.ResolveParams[TSource, TContext, TArgs], 
    js.Any
  ]
  
  type ResolverMiddleware[TSource, TContext, TArgs] = js.Function5[
    /* resolve */ js.Function4[
      /* source */ TSource, 
      /* args */ TArgs, 
      /* context */ TContext, 
      /* info */ typingsSlinky.graphql.definitionMod.GraphQLResolveInfo, 
      js.Any
    ], 
    /* source */ TSource, 
    /* args */ TArgs, 
    /* context */ TContext, 
    /* info */ typingsSlinky.graphql.definitionMod.GraphQLResolveInfo, 
    js.Any
  ]
  
  type ResolverNextRpCb[TSource, TContext, TArgs] = js.Function1[
    /* next */ typingsSlinky.graphqlCompose.resolverMod.ResolverRpCb[TSource, TContext, TArgs], 
    typingsSlinky.graphqlCompose.resolverMod.ResolverRpCb[TSource, TContext, TArgs]
  ]
  
  type ResolverRpCb[TSource, TContext, TArgs] = js.Function1[
    /* resolveParams */ typingsSlinky.graphqlCompose.resolverMod.ResolveParams[TSource, TContext, TArgs], 
    js.Promise[js.Any] | js.Any
  ]
  
  type ResolverSortArgFn[TSource, TContext, TArgs] = js.Function1[
    /* resolveParams */ typingsSlinky.graphqlCompose.resolverMod.ResolveParams[TSource, TContext, TArgs], 
    js.Any
  ]
  
  type ResolverWrapArgsCb[TArgs] = js.Function1[
    /* prevArgs */ typingsSlinky.graphql.definitionMod.GraphQLFieldConfigArgumentMap, 
    typingsSlinky.graphqlCompose.objectTypeComposerMod.ComposeFieldConfigArgumentMap[TArgs]
  ]
  
  type ResolverWrapCb[TNewSource, TPrevSource, TContext, TNewArgs, TPrevArgs] = js.Function2[
    /* newResolver */ typingsSlinky.graphqlCompose.resolverMod.Resolver[TNewSource, TContext, TNewArgs, js.Any], 
    /* prevResolver */ typingsSlinky.graphqlCompose.resolverMod.Resolver[TPrevSource, TContext, TPrevArgs, js.Any], 
    typingsSlinky.graphqlCompose.resolverMod.Resolver[TNewSource, TContext, TNewArgs, js.Any]
  ]
  
  type ResolverWrapTypeCb[TContext, TReturn] = js.Function1[
    /* prevType */ typingsSlinky.graphql.definitionMod.GraphQLOutputType, 
    typingsSlinky.graphqlCompose.objectTypeComposerMod.ComposeOutputType[TReturn, TContext]
  ]
}
