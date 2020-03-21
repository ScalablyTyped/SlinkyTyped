package typingsSlinky.graphqlTools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfacesMod {
  type DirectiveResolverFn[TSource, TContext] = js.Function5[
    /* next */ typingsSlinky.graphqlTools.interfacesMod.NextResolverFn, 
    /* source */ TSource, 
    /* args */ org.scalablytyped.runtime.StringDictionary[js.Any], 
    /* context */ TContext, 
    /* info */ typingsSlinky.graphql.definitionMod.GraphQLResolveInfo, 
    js.Any
  ]
  type IConnector[TContext] = typingsSlinky.graphqlTools.interfacesMod.IConnectorCls[TContext] | typingsSlinky.graphqlTools.interfacesMod.IConnectorFn[TContext]
  type IConnectorFn[TContext] = js.Function1[/* context */ js.UndefOr[TContext], js.Any]
  type IConnectors[TContext] = org.scalablytyped.runtime.StringDictionary[typingsSlinky.graphqlTools.interfacesMod.IConnector[TContext]]
  type IDirectiveResolvers[TSource, TContext] = org.scalablytyped.runtime.StringDictionary[typingsSlinky.graphqlTools.interfacesMod.DirectiveResolverFn[TSource, TContext]]
  type IEnumResolver = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]
  type IFieldIteratorFn = js.Function3[
    /* fieldDef */ typingsSlinky.graphql.definitionMod.GraphQLField[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]], 
    /* typeName */ java.lang.String, 
    /* fieldName */ java.lang.String, 
    scala.Unit
  ]
  type IFieldResolver[TSource, TContext, TArgs] = js.Function4[
    /* source */ TSource, 
    /* args */ TArgs, 
    /* context */ TContext, 
    /* info */ typingsSlinky.graphqlTools.GraphQLResolveInfomergeIn, 
    js.Any
  ]
  type IMockFn = typingsSlinky.graphql.definitionMod.GraphQLFieldResolver[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
  type IMockTypeFn = js.Function3[
    /* type */ typingsSlinky.graphql.definitionMod.GraphQLType, 
    /* typeName */ js.UndefOr[java.lang.String], 
    /* fieldName */ js.UndefOr[java.lang.String], 
    typingsSlinky.graphql.definitionMod.GraphQLFieldResolver[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
  ]
  type IMocks = org.scalablytyped.runtime.StringDictionary[typingsSlinky.graphqlTools.interfacesMod.IMockFn]
  type IResolvers[TSource, TContext] = org.scalablytyped.runtime.StringDictionary[
    js.Function0[js.Any] | (typingsSlinky.graphqlTools.interfacesMod.IResolverObject[TSource, TContext, js.Any]) | (typingsSlinky.graphqlTools.interfacesMod.IResolverOptions[TSource, TContext, js.Any]) | typingsSlinky.graphql.mod.GraphQLScalarType | typingsSlinky.graphqlTools.interfacesMod.IEnumResolver
  ]
  type IResolversParameter = (js.Array[
    (typingsSlinky.graphqlTools.interfacesMod.IResolvers[js.Any, js.Any]) | (js.Function1[
      /* mergeInfo */ typingsSlinky.graphqlTools.interfacesMod.MergeInfo, 
      typingsSlinky.graphqlTools.interfacesMod.IResolvers[js.Any, js.Any]
    ])
  ]) | (typingsSlinky.graphqlTools.interfacesMod.IResolvers[js.Any, js.Any]) | (js.Function1[
    /* mergeInfo */ typingsSlinky.graphqlTools.interfacesMod.MergeInfo, 
    typingsSlinky.graphqlTools.interfacesMod.IResolvers[js.Any, js.Any]
  ])
  type ITypeDefinitions = typingsSlinky.graphqlTools.interfacesMod.ITypedef | js.Array[typingsSlinky.graphqlTools.interfacesMod.ITypedef]
  type ITypedef = (js.Function0[
    js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias graphql-tools.graphql-tools/dist/Interfaces.ITypedef */ js.Object
    ]
  ]) | java.lang.String | typingsSlinky.graphql.astMod.DocumentNode | typingsSlinky.graphql.astMod.ASTNode
  type NextResolverFn = js.Function0[js.Promise[js.Any]]
  type ResolveType[T /* <: typingsSlinky.graphql.definitionMod.GraphQLType */] = js.Function1[/* type */ T, T]
  type UnitOrList[Type] = Type | js.Array[Type]
  type VisitType = js.Function2[
    /* name */ java.lang.String, 
    /* candidates */ js.Array[typingsSlinky.graphqlTools.interfacesMod.MergeTypeCandidate], 
    typingsSlinky.graphqlTools.interfacesMod.VisitTypeResult
  ]
  type VisitTypeResult = typingsSlinky.graphql.definitionMod.GraphQLNamedType | typingsSlinky.graphqlTools.interfacesMod.TypeWithResolvers | scala.Null
}
