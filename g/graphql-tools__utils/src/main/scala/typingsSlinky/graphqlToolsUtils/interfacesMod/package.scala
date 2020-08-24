package typingsSlinky.graphqlToolsUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfacesMod {
  type AbstractTypeMapper = js.Function2[
    /* type */ typingsSlinky.graphql.mod.GraphQLInterfaceType | typingsSlinky.graphql.mod.GraphQLUnionType, 
    /* schema */ typingsSlinky.graphql.mod.GraphQLSchema, 
    js.UndefOr[
      typingsSlinky.graphql.mod.GraphQLInterfaceType | typingsSlinky.graphql.mod.GraphQLUnionType | scala.Null
    ]
  ]
  type AbstractTypeVisitor = js.Function2[
    /* type */ typingsSlinky.graphql.mod.GraphQLInterfaceType | typingsSlinky.graphql.mod.GraphQLUnionType, 
    /* schema */ typingsSlinky.graphql.mod.GraphQLSchema, 
    js.UndefOr[
      typingsSlinky.graphql.mod.GraphQLInterfaceType | typingsSlinky.graphql.mod.GraphQLUnionType | scala.Null
    ]
  ]
  type ArgumentMapper = js.Function4[
    /* argumentConfig */ typingsSlinky.graphql.definitionMod.GraphQLArgumentConfig, 
    /* fieldName */ java.lang.String, 
    /* typeName */ java.lang.String, 
    /* schema */ typingsSlinky.graphql.mod.GraphQLSchema, 
    js.UndefOr[
      typingsSlinky.graphql.definitionMod.GraphQLArgumentConfig | (js.Tuple2[java.lang.String, typingsSlinky.graphql.definitionMod.GraphQLArgumentConfig]) | scala.Null
    ]
  ]
  type CompositeTypeMapper = js.Function2[
    /* type */ (typingsSlinky.graphql.mod.GraphQLObjectType[js.Any, js.Any]) | typingsSlinky.graphql.mod.GraphQLInterfaceType | typingsSlinky.graphql.mod.GraphQLUnionType, 
    /* schema */ typingsSlinky.graphql.mod.GraphQLSchema, 
    js.UndefOr[
      (typingsSlinky.graphql.mod.GraphQLObjectType[js.Any, js.Any]) | typingsSlinky.graphql.mod.GraphQLInterfaceType | typingsSlinky.graphql.mod.GraphQLUnionType | scala.Null
    ]
  ]
  type CompositeTypeVisitor = js.Function2[
    /* type */ (typingsSlinky.graphql.mod.GraphQLObjectType[js.Any, js.Any]) | typingsSlinky.graphql.mod.GraphQLInterfaceType | typingsSlinky.graphql.mod.GraphQLUnionType, 
    /* schema */ typingsSlinky.graphql.mod.GraphQLSchema, 
    js.UndefOr[
      (typingsSlinky.graphql.mod.GraphQLObjectType[js.Any, js.Any]) | typingsSlinky.graphql.mod.GraphQLInterfaceType | typingsSlinky.graphql.mod.GraphQLUnionType | scala.Null
    ]
  ]
  type DirectiveMapper = js.Function2[
    /* directive */ typingsSlinky.graphql.mod.GraphQLDirective, 
    /* schema */ typingsSlinky.graphql.mod.GraphQLSchema, 
    js.UndefOr[typingsSlinky.graphql.mod.GraphQLDirective | scala.Null]
  ]
  type DirectiveResolverFn[TSource, TContext] = js.Function5[
    /* next */ typingsSlinky.graphqlToolsUtils.interfacesMod.NextResolverFn, 
    /* source */ TSource, 
    /* args */ org.scalablytyped.runtime.StringDictionary[js.Any], 
    /* context */ TContext, 
    /* info */ typingsSlinky.graphql.definitionMod.GraphQLResolveInfo, 
    js.Any
  ]
  type EnumTypeMapper = js.Function2[
    /* type */ typingsSlinky.graphql.mod.GraphQLEnumType, 
    /* schema */ typingsSlinky.graphql.mod.GraphQLSchema, 
    js.UndefOr[typingsSlinky.graphql.mod.GraphQLEnumType | scala.Null]
  ]
  type EnumTypeVisitor = js.Function2[
    /* type */ typingsSlinky.graphql.mod.GraphQLEnumType, 
    /* schema */ typingsSlinky.graphql.mod.GraphQLSchema, 
    js.UndefOr[typingsSlinky.graphql.mod.GraphQLEnumType | scala.Null]
  ]
  type EnumValueMapper = js.Function4[
    /* valueConfig */ typingsSlinky.graphql.definitionMod.GraphQLEnumValueConfig, 
    /* typeName */ java.lang.String, 
    /* schema */ typingsSlinky.graphql.mod.GraphQLSchema, 
    /* externalValue */ java.lang.String, 
    js.UndefOr[
      typingsSlinky.graphql.definitionMod.GraphQLEnumValueConfig | (js.Tuple2[java.lang.String, typingsSlinky.graphql.definitionMod.GraphQLEnumValueConfig]) | scala.Null
    ]
  ]
  type FieldFilter = js.Function3[
    /* typeName */ js.UndefOr[java.lang.String], 
    /* fieldName */ js.UndefOr[java.lang.String], 
    /* fieldConfig */ js.UndefOr[
      typingsSlinky.graphql.definitionMod.GraphQLFieldConfig[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
    ], 
    scala.Boolean
  ]
  type FieldMapper = typingsSlinky.graphqlToolsUtils.interfacesMod.GenericFieldMapper[
    typingsSlinky.graphql.definitionMod.GraphQLFieldConfig[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
  ]
  type FieldNodeMapper = js.Function3[
    /* fieldNode */ typingsSlinky.graphql.astMod.FieldNode, 
    /* fragments */ typingsSlinky.std.Record[java.lang.String, typingsSlinky.graphql.astMod.FragmentDefinitionNode], 
    /* transformationContext */ typingsSlinky.std.Record[java.lang.String, js.Any], 
    typingsSlinky.graphql.astMod.SelectionNode | js.Array[typingsSlinky.graphql.astMod.SelectionNode]
  ]
  type FieldNodeMappers = typingsSlinky.std.Record[
    java.lang.String, 
    typingsSlinky.std.Record[java.lang.String, typingsSlinky.graphqlToolsUtils.interfacesMod.FieldNodeMapper]
  ]
  type GenericFieldMapper[F /* <: (typingsSlinky.graphql.definitionMod.GraphQLFieldConfig[_, _, org.scalablytyped.runtime.StringDictionary[_]]) | typingsSlinky.graphql.definitionMod.GraphQLInputFieldConfig */] = js.Function4[
    /* fieldConfig */ F, 
    /* fieldName */ java.lang.String, 
    /* typeName */ java.lang.String, 
    /* schema */ typingsSlinky.graphql.mod.GraphQLSchema, 
    js.UndefOr[F | (js.Tuple2[java.lang.String, F]) | scala.Null]
  ]
  type IDefaultValueIteratorFn = js.Function2[
    /* type */ typingsSlinky.graphql.definitionMod.GraphQLInputType, 
    /* value */ js.Any, 
    scala.Unit
  ]
  type IDirectiveResolvers[TSource, TContext] = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.graphqlToolsUtils.interfacesMod.DirectiveResolverFn[TSource, TContext]
  ]
  type IEnumTypeResolver = (typingsSlinky.std.Record[java.lang.String, _]) with typingsSlinky.graphqlToolsUtils.anon.AstNode
  type IFieldIteratorFn = js.Function3[
    /* fieldDef */ typingsSlinky.graphql.definitionMod.GraphQLField[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]], 
    /* typeName */ java.lang.String, 
    /* fieldName */ java.lang.String, 
    scala.Unit
  ]
  type IFieldResolver[TSource, TContext, TArgs, TReturn] = js.Function4[
    /* source */ TSource, 
    /* args */ TArgs, 
    /* context */ TContext, 
    /* info */ typingsSlinky.graphql.definitionMod.GraphQLResolveInfo, 
    TReturn
  ]
  type IResolvers[TSource, TContext, TArgs, TReturn] = typingsSlinky.std.Record[
    java.lang.String, 
    (typingsSlinky.graphqlToolsUtils.interfacesMod.ISchemaLevelResolver[TSource, TContext, TArgs, TReturn]) | (typingsSlinky.graphqlToolsUtils.interfacesMod.IObjectTypeResolver[TSource, TContext, js.Any]) | (typingsSlinky.graphqlToolsUtils.interfacesMod.IInterfaceTypeResolver[TSource, TContext, js.Any]) | typingsSlinky.graphqlToolsUtils.interfacesMod.IUnionTypeResolver | typingsSlinky.graphqlToolsUtils.interfacesMod.IScalarTypeResolver | typingsSlinky.graphqlToolsUtils.interfacesMod.IEnumTypeResolver | typingsSlinky.graphqlToolsUtils.interfacesMod.IInputObjectTypeResolver
  ]
  type ISchemaLevelResolver[TSource, TContext, TArgs, TReturn] = typingsSlinky.graphqlToolsUtils.interfacesMod.IFieldResolver[TSource, TContext, TArgs, TReturn]
  type ITypeDefinitions = typingsSlinky.graphqlToolsUtils.interfacesMod.ITypedef | js.Array[typingsSlinky.graphqlToolsUtils.interfacesMod.ITypedef]
  type ITypedef = (js.Function0[
    js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @graphql-tools/utils.@graphql-tools/utils/Interfaces.ITypedef */ js.Object
    ]
  ]) | java.lang.String | typingsSlinky.graphql.astMod.DocumentNode
  type InputFieldFilter = js.Function3[
    /* typeName */ js.UndefOr[java.lang.String], 
    /* fieldName */ js.UndefOr[java.lang.String], 
    /* inputFieldConfig */ js.UndefOr[typingsSlinky.graphql.definitionMod.GraphQLInputFieldConfig], 
    scala.Boolean
  ]
  type InputFieldMapper = typingsSlinky.graphqlToolsUtils.interfacesMod.GenericFieldMapper[typingsSlinky.graphql.definitionMod.GraphQLInputFieldConfig]
  type InputObjectTypeMapper = js.Function2[
    /* type */ typingsSlinky.graphql.mod.GraphQLInputObjectType, 
    /* schema */ typingsSlinky.graphql.mod.GraphQLSchema, 
    js.UndefOr[typingsSlinky.graphql.mod.GraphQLInputObjectType | scala.Null]
  ]
  type InputObjectTypeVisitor = js.Function2[
    /* type */ typingsSlinky.graphql.mod.GraphQLInputObjectType, 
    /* schema */ typingsSlinky.graphql.mod.GraphQLSchema, 
    js.UndefOr[typingsSlinky.graphql.mod.GraphQLInputObjectType | scala.Null]
  ]
  type InterfaceTypeMapper = js.Function2[
    /* type */ typingsSlinky.graphql.mod.GraphQLInterfaceType, 
    /* schema */ typingsSlinky.graphql.mod.GraphQLSchema, 
    js.UndefOr[typingsSlinky.graphql.mod.GraphQLInterfaceType | scala.Null]
  ]
  type InterfaceTypeVisitor = js.Function2[
    /* type */ typingsSlinky.graphql.mod.GraphQLInterfaceType, 
    /* schema */ typingsSlinky.graphql.mod.GraphQLSchema, 
    js.UndefOr[typingsSlinky.graphql.mod.GraphQLInterfaceType | scala.Null]
  ]
  type NamedTypeMapper = js.Function2[
    /* type */ typingsSlinky.graphql.definitionMod.GraphQLNamedType, 
    /* schema */ typingsSlinky.graphql.mod.GraphQLSchema, 
    js.UndefOr[typingsSlinky.graphql.definitionMod.GraphQLNamedType | scala.Null]
  ]
  type NamedTypeVisitor = js.Function2[
    /* type */ typingsSlinky.graphql.definitionMod.GraphQLNamedType, 
    /* schema */ typingsSlinky.graphql.mod.GraphQLSchema, 
    js.UndefOr[typingsSlinky.graphql.definitionMod.GraphQLNamedType | scala.Null]
  ]
  type NextResolverFn = js.Function0[js.Promise[js.Any]]
  type ObjectTypeMapper = js.Function2[
    /* type */ typingsSlinky.graphql.mod.GraphQLObjectType[js.Any, js.Any], 
    /* schema */ typingsSlinky.graphql.mod.GraphQLSchema, 
    js.UndefOr[(typingsSlinky.graphql.mod.GraphQLObjectType[js.Any, js.Any]) | scala.Null]
  ]
  type ObjectTypeVisitor = js.Function2[
    /* type */ typingsSlinky.graphql.mod.GraphQLObjectType[js.Any, js.Any], 
    /* schema */ typingsSlinky.graphql.mod.GraphQLSchema, 
    js.UndefOr[(typingsSlinky.graphql.mod.GraphQLObjectType[js.Any, js.Any]) | scala.Null]
  ]
  type RequestTransform[T] = js.Function3[
    /* originalRequest */ typingsSlinky.graphqlToolsUtils.interfacesMod.Request, 
    /* delegationContext */ js.UndefOr[typingsSlinky.std.Record[java.lang.String, js.Any]], 
    /* transformationContext */ js.UndefOr[T], 
    typingsSlinky.graphqlToolsUtils.interfacesMod.Request
  ]
  type Result = typingsSlinky.graphqlToolsUtils.interfacesMod.ExecutionResult[typingsSlinky.std.Record[java.lang.String, js.Any]]
  type ResultTransform[T] = js.Function3[
    /* originalResult */ typingsSlinky.graphqlToolsUtils.interfacesMod.ExecutionResult[typingsSlinky.std.Record[java.lang.String, js.Any]], 
    /* delegationContext */ js.UndefOr[typingsSlinky.std.Record[java.lang.String, js.Any]], 
    /* transformationContext */ js.UndefOr[T], 
    typingsSlinky.graphqlToolsUtils.interfacesMod.ExecutionResult[typingsSlinky.std.Record[java.lang.String, js.Any]]
  ]
  type RootFieldFilter = js.Function3[
    /* operation */ js.UndefOr[
      typingsSlinky.graphqlToolsUtils.graphqlToolsUtilsStrings.Query | typingsSlinky.graphqlToolsUtils.graphqlToolsUtilsStrings.Mutation | typingsSlinky.graphqlToolsUtils.graphqlToolsUtilsStrings.Subscription
    ], 
    /* rootFieldName */ js.UndefOr[java.lang.String], 
    /* fieldConfig */ js.UndefOr[
      typingsSlinky.graphql.definitionMod.GraphQLFieldConfig[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
    ], 
    scala.Boolean
  ]
  type ScalarTypeMapper = js.Function2[
    /* type */ typingsSlinky.graphql.mod.GraphQLScalarType, 
    /* schema */ typingsSlinky.graphql.mod.GraphQLSchema, 
    js.UndefOr[typingsSlinky.graphql.mod.GraphQLScalarType | scala.Null]
  ]
  type ScalarTypeVisitor = js.Function2[
    /* type */ typingsSlinky.graphql.mod.GraphQLScalarType, 
    /* schema */ typingsSlinky.graphql.mod.GraphQLSchema, 
    js.UndefOr[typingsSlinky.graphql.mod.GraphQLScalarType | scala.Null]
  ]
  type SchemaTransform = js.Function1[
    /* originalSchema */ typingsSlinky.graphql.mod.GraphQLSchema, 
    typingsSlinky.graphql.mod.GraphQLSchema
  ]
  type TypeMap = typingsSlinky.std.Record[java.lang.String, typingsSlinky.graphql.definitionMod.GraphQLNamedType]
  type UnionTypeMapper = js.Function2[
    /* type */ typingsSlinky.graphql.mod.GraphQLUnionType, 
    /* schema */ typingsSlinky.graphql.mod.GraphQLSchema, 
    js.UndefOr[typingsSlinky.graphql.mod.GraphQLUnionType | scala.Null]
  ]
  type UnionTypeVisitor = js.Function2[
    /* type */ typingsSlinky.graphql.mod.GraphQLUnionType, 
    /* schema */ typingsSlinky.graphql.mod.GraphQLSchema, 
    js.UndefOr[typingsSlinky.graphql.mod.GraphQLUnionType | scala.Null]
  ]
  type VisitableSchemaType = typingsSlinky.graphql.mod.GraphQLSchema | (typingsSlinky.graphql.mod.GraphQLObjectType[js.Any, js.Any]) | typingsSlinky.graphql.mod.GraphQLInterfaceType | typingsSlinky.graphql.mod.GraphQLInputObjectType | typingsSlinky.graphql.definitionMod.GraphQLNamedType | typingsSlinky.graphql.mod.GraphQLScalarType | (typingsSlinky.graphql.definitionMod.GraphQLField[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]) | typingsSlinky.graphql.definitionMod.GraphQLInputField | typingsSlinky.graphql.definitionMod.GraphQLArgument | typingsSlinky.graphql.mod.GraphQLUnionType | typingsSlinky.graphql.mod.GraphQLEnumType | typingsSlinky.graphql.definitionMod.GraphQLEnumValue
  type VisitorSelector = js.Function2[
    /* type */ typingsSlinky.graphqlToolsUtils.interfacesMod.VisitableSchemaType, 
    /* methodName */ java.lang.String, 
    js.Array[
      typingsSlinky.graphqlToolsUtils.schemaVisitorMod.SchemaVisitor | typingsSlinky.graphqlToolsUtils.interfacesMod.SchemaVisitorMap
    ]
  ]
}
