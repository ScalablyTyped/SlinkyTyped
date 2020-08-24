package typingsSlinky.graphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object definitionMod {
  type GraphQLArgumentExtensions = org.scalablytyped.runtime.StringDictionary[js.Any]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any]
    - typingsSlinky.graphql.definitionMod.GraphQLInterfaceType
    - typingsSlinky.graphql.definitionMod.GraphQLUnionType
  */
  type GraphQLCompositeType = typingsSlinky.graphql.definitionMod._GraphQLCompositeType | (typingsSlinky.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any])
  type GraphQLEnumTypeExtensions = org.scalablytyped.runtime.StringDictionary[js.Any]
  type GraphQLEnumValueConfigMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.graphql.definitionMod.GraphQLEnumValueConfig]
  type GraphQLEnumValueExtensions = org.scalablytyped.runtime.StringDictionary[js.Any]
  type GraphQLFieldConfigArgumentMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.graphql.definitionMod.GraphQLArgumentConfig]
  type GraphQLFieldConfigMap[TSource, TContext] = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.graphql.definitionMod.GraphQLFieldConfig[TSource, TContext, org.scalablytyped.runtime.StringDictionary[js.Any]]
  ]
  type GraphQLFieldExtensions[TSource, TContext, TArgs] = org.scalablytyped.runtime.StringDictionary[js.Any]
  type GraphQLFieldMap[TSource, TContext] = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.graphql.definitionMod.GraphQLField[TSource, TContext, org.scalablytyped.runtime.StringDictionary[js.Any]]
  ]
  type GraphQLFieldResolver[TSource, TContext, TArgs] = js.Function4[
    /* source */ TSource, 
    /* args */ TArgs, 
    /* context */ TContext, 
    /* info */ typingsSlinky.graphql.definitionMod.GraphQLResolveInfo, 
    js.Any
  ]
  type GraphQLInputFieldConfigMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.graphql.definitionMod.GraphQLInputFieldConfig]
  type GraphQLInputFieldExtensions = org.scalablytyped.runtime.StringDictionary[js.Any]
  type GraphQLInputFieldMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.graphql.definitionMod.GraphQLInputField]
  type GraphQLInputObjectTypeExtensions = org.scalablytyped.runtime.StringDictionary[js.Any]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.graphql.definitionMod.GraphQLScalarType
    - typingsSlinky.graphql.definitionMod.GraphQLEnumType
    - typingsSlinky.graphql.definitionMod.GraphQLInputObjectType
    - typingsSlinky.graphql.definitionMod.GraphQLList[js.Any]
    - typingsSlinky.graphql.definitionMod.GraphQLNonNull[
  typingsSlinky.graphql.definitionMod.GraphQLScalarType | typingsSlinky.graphql.definitionMod.GraphQLEnumType | typingsSlinky.graphql.definitionMod.GraphQLInputObjectType | typingsSlinky.graphql.definitionMod.GraphQLList[js.Any]]
  */
  type GraphQLInputType = typingsSlinky.graphql.definitionMod._GraphQLInputType | typingsSlinky.graphql.definitionMod.GraphQLList[js.Any] | (typingsSlinky.graphql.definitionMod.GraphQLNonNull[
    typingsSlinky.graphql.definitionMod.GraphQLScalarType | typingsSlinky.graphql.definitionMod.GraphQLEnumType | typingsSlinky.graphql.definitionMod.GraphQLInputObjectType | typingsSlinky.graphql.definitionMod.GraphQLList[js.Any]
  ])
  type GraphQLInterfaceTypeExtensions = org.scalablytyped.runtime.StringDictionary[js.Any]
  type GraphQLIsTypeOfFn[TSource, TContext] = js.Function3[
    /* source */ TSource, 
    /* context */ TContext, 
    /* info */ typingsSlinky.graphql.definitionMod.GraphQLResolveInfo, 
    typingsSlinky.graphql.promiseOrValueMod.PromiseOrValue[scala.Boolean]
  ]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.graphql.definitionMod.GraphQLScalarType
    - typingsSlinky.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any]
    - typingsSlinky.graphql.definitionMod.GraphQLInterfaceType
    - typingsSlinky.graphql.definitionMod.GraphQLUnionType
    - typingsSlinky.graphql.definitionMod.GraphQLEnumType
    - typingsSlinky.graphql.definitionMod.GraphQLInputObjectType
  */
  type GraphQLNamedType = typingsSlinky.graphql.definitionMod._GraphQLNamedType | (typingsSlinky.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any])
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.graphql.definitionMod.GraphQLScalarType
    - typingsSlinky.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any]
    - typingsSlinky.graphql.definitionMod.GraphQLInterfaceType
    - typingsSlinky.graphql.definitionMod.GraphQLUnionType
    - typingsSlinky.graphql.definitionMod.GraphQLEnumType
    - typingsSlinky.graphql.definitionMod.GraphQLInputObjectType
    - typingsSlinky.graphql.definitionMod.GraphQLList[js.Any]
  */
  type GraphQLNullableType = typingsSlinky.graphql.definitionMod._GraphQLNullableType | (typingsSlinky.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any]) | typingsSlinky.graphql.definitionMod.GraphQLList[js.Any]
  type GraphQLObjectTypeExtensions[TSource, TContext] = org.scalablytyped.runtime.StringDictionary[js.Any]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.graphql.definitionMod.GraphQLScalarType
    - typingsSlinky.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any]
    - typingsSlinky.graphql.definitionMod.GraphQLInterfaceType
    - typingsSlinky.graphql.definitionMod.GraphQLUnionType
    - typingsSlinky.graphql.definitionMod.GraphQLEnumType
    - typingsSlinky.graphql.definitionMod.GraphQLList[js.Any]
    - typingsSlinky.graphql.definitionMod.GraphQLNonNull[
  typingsSlinky.graphql.definitionMod.GraphQLScalarType | (typingsSlinky.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any]) | typingsSlinky.graphql.definitionMod.GraphQLInterfaceType | typingsSlinky.graphql.definitionMod.GraphQLUnionType | typingsSlinky.graphql.definitionMod.GraphQLEnumType | typingsSlinky.graphql.definitionMod.GraphQLList[js.Any]]
  */
  type GraphQLOutputType = typingsSlinky.graphql.definitionMod._GraphQLOutputType | (typingsSlinky.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any]) | typingsSlinky.graphql.definitionMod.GraphQLList[js.Any] | (typingsSlinky.graphql.definitionMod.GraphQLNonNull[
    typingsSlinky.graphql.definitionMod.GraphQLScalarType | (typingsSlinky.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any]) | typingsSlinky.graphql.definitionMod.GraphQLInterfaceType | typingsSlinky.graphql.definitionMod.GraphQLUnionType | typingsSlinky.graphql.definitionMod.GraphQLEnumType | typingsSlinky.graphql.definitionMod.GraphQLList[js.Any]
  ])
  type GraphQLScalarLiteralParser[TInternal] = js.Function2[
    /* valueNode */ typingsSlinky.graphql.astMod.ValueNode, 
    /* variables */ typingsSlinky.graphql.maybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[js.Any]], 
    typingsSlinky.graphql.maybeMod.Maybe[TInternal]
  ]
  type GraphQLScalarSerializer[TExternal] = js.Function1[/* value */ js.Any, typingsSlinky.graphql.maybeMod.Maybe[TExternal]]
  type GraphQLScalarTypeExtensions = org.scalablytyped.runtime.StringDictionary[js.Any]
  type GraphQLScalarValueParser[TInternal] = js.Function1[/* value */ js.Any, typingsSlinky.graphql.maybeMod.Maybe[TInternal]]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.graphql.definitionMod.GraphQLScalarType
    - typingsSlinky.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any]
    - typingsSlinky.graphql.definitionMod.GraphQLInterfaceType
    - typingsSlinky.graphql.definitionMod.GraphQLUnionType
    - typingsSlinky.graphql.definitionMod.GraphQLEnumType
    - typingsSlinky.graphql.definitionMod.GraphQLInputObjectType
    - typingsSlinky.graphql.definitionMod.GraphQLList[js.Any]
    - typingsSlinky.graphql.definitionMod.GraphQLNonNull[js.Any]
  */
  type GraphQLType = typingsSlinky.graphql.definitionMod._GraphQLType | (typingsSlinky.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any]) | typingsSlinky.graphql.definitionMod.GraphQLList[js.Any] | typingsSlinky.graphql.definitionMod.GraphQLNonNull[js.Any]
  type GraphQLTypeResolver[TSource, TContext] = js.Function4[
    /* value */ TSource, 
    /* context */ TContext, 
    /* info */ typingsSlinky.graphql.definitionMod.GraphQLResolveInfo, 
    /* abstractType */ typingsSlinky.graphql.definitionMod.GraphQLAbstractType, 
    typingsSlinky.graphql.promiseOrValueMod.PromiseOrValue[
      typingsSlinky.graphql.maybeMod.Maybe[
        (typingsSlinky.graphql.definitionMod.GraphQLObjectType[TSource, TContext]) | java.lang.String
      ]
    ]
  ]
  type GraphQLUnionTypeExtensions = org.scalablytyped.runtime.StringDictionary[js.Any]
  type GraphQLWrappingType = typingsSlinky.graphql.definitionMod.GraphQLList[js.Any] | typingsSlinky.graphql.definitionMod.GraphQLNonNull[js.Any]
  type Thunk[T] = js.Function0[T] | T
}
