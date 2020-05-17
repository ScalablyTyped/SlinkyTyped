package typingsSlinky.graphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object definitionMod {
  type GraphQLEnumValueConfigMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.graphql.definitionMod.GraphQLEnumValueConfig]
  type GraphQLFieldConfigArgumentMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.graphql.definitionMod.GraphQLArgumentConfig]
  type GraphQLFieldConfigMap[TSource, TContext, TArgs] = org.scalablytyped.runtime.StringDictionary[typingsSlinky.graphql.definitionMod.GraphQLFieldConfig[TSource, TContext, TArgs]]
  type GraphQLFieldMap[TSource, TContext, TArgs] = org.scalablytyped.runtime.StringDictionary[typingsSlinky.graphql.definitionMod.GraphQLField[TSource, TContext, TArgs]]
  type GraphQLFieldResolver[TSource, TContext, TArgs] = js.Function4[
    /* source */ TSource, 
    /* args */ TArgs, 
    /* context */ TContext, 
    /* info */ typingsSlinky.graphql.definitionMod.GraphQLResolveInfo, 
    js.Any
  ]
  type GraphQLInputFieldConfigMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.graphql.definitionMod.GraphQLInputFieldConfig]
  type GraphQLInputFieldMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.graphql.definitionMod.GraphQLInputField]
  type GraphQLIsTypeOfFn[TSource, TContext] = js.Function3[
    /* source */ TSource, 
    /* context */ TContext, 
    /* info */ typingsSlinky.graphql.definitionMod.GraphQLResolveInfo, 
    typingsSlinky.graphql.promiseOrValueMod.PromiseOrValue[scala.Boolean]
  ]
  type GraphQLScalarLiteralParser[TInternal] = js.Function2[
    /* valueNode */ typingsSlinky.graphql.astMod.ValueNode, 
    /* variables */ typingsSlinky.graphql.maybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[js.Any]], 
    typingsSlinky.graphql.maybeMod.Maybe[TInternal]
  ]
  type GraphQLScalarSerializer[TExternal] = js.Function1[/* value */ js.Any, typingsSlinky.graphql.maybeMod.Maybe[TExternal]]
  type GraphQLScalarValueParser[TInternal] = js.Function1[/* value */ js.Any, typingsSlinky.graphql.maybeMod.Maybe[TInternal]]
  type GraphQLTypeResolver[TSource, TContext, TArgs] = js.Function4[
    /* value */ TSource, 
    /* context */ TContext, 
    /* info */ typingsSlinky.graphql.definitionMod.GraphQLResolveInfo, 
    /* abstractType */ typingsSlinky.graphql.definitionMod.GraphQLAbstractType, 
    typingsSlinky.graphql.promiseOrValueMod.PromiseOrValue[
      typingsSlinky.graphql.maybeMod.Maybe[
        (typingsSlinky.graphql.definitionMod.GraphQLObjectType[TSource, TContext, TArgs]) | java.lang.String
      ]
    ]
  ]
}
