package typingsSlinky.graphqlToolsWrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type DataTransformer = js.Function2[
    /* value */ js.Any, 
    /* transformationContext */ js.UndefOr[typingsSlinky.std.Record[java.lang.String, js.Any]], 
    js.Any
  ]
  
  type EnumValueTransformer = js.Function3[
    /* typeName */ java.lang.String, 
    /* externalValue */ java.lang.String, 
    /* enumValueConfig */ typingsSlinky.graphql.definitionMod.GraphQLEnumValueConfig, 
    js.UndefOr[
      typingsSlinky.graphql.definitionMod.GraphQLEnumValueConfig | (js.Tuple2[java.lang.String, typingsSlinky.graphql.definitionMod.GraphQLEnumValueConfig]) | scala.Null
    ]
  ]
  
  type ErrorsTransformer = js.Function2[
    /* errors */ js.Array[typingsSlinky.graphql.mod.GraphQLError], 
    /* transformationContext */ typingsSlinky.std.Record[java.lang.String, js.Any], 
    js.Array[typingsSlinky.graphql.mod.GraphQLError]
  ]
  
  type FieldNodeTransformer = js.Function5[
    /* typeName */ java.lang.String, 
    /* fieldName */ java.lang.String, 
    /* fieldNode */ typingsSlinky.graphql.astMod.FieldNode, 
    /* fragments */ typingsSlinky.std.Record[java.lang.String, typingsSlinky.graphql.astMod.FragmentDefinitionNode], 
    /* transformationContext */ typingsSlinky.std.Record[java.lang.String, js.Any], 
    typingsSlinky.graphql.astMod.SelectionNode | js.Array[typingsSlinky.graphql.astMod.SelectionNode]
  ]
  
  type FieldTransformer = js.Function3[
    /* typeName */ java.lang.String, 
    /* fieldName */ java.lang.String, 
    /* fieldConfig */ typingsSlinky.graphql.definitionMod.GraphQLFieldConfig[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]], 
    js.UndefOr[
      (typingsSlinky.graphql.definitionMod.GraphQLFieldConfig[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]) | (js.Tuple2[
        java.lang.String, 
        typingsSlinky.graphql.definitionMod.GraphQLFieldConfig[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
      ]) | scala.Null
    ]
  ]
  
  type InputFieldNodeTransformer = js.Function5[
    /* typeName */ java.lang.String, 
    /* fieldName */ java.lang.String, 
    /* inputFieldNode */ typingsSlinky.graphql.astMod.ObjectFieldNode, 
    /* request */ typingsSlinky.graphqlToolsUtils.interfacesMod.Request, 
    /* delegationContext */ js.UndefOr[typingsSlinky.graphqlToolsDelegate.typesMod.DelegationContext], 
    typingsSlinky.graphql.astMod.ObjectFieldNode | js.Array[typingsSlinky.graphql.astMod.ObjectFieldNode]
  ]
  
  type InputFieldTransformer = js.Function3[
    /* typeName */ java.lang.String, 
    /* fieldName */ java.lang.String, 
    /* inputFieldConfig */ typingsSlinky.graphql.definitionMod.GraphQLInputFieldConfig, 
    js.UndefOr[
      typingsSlinky.graphql.definitionMod.GraphQLInputFieldConfig | (js.Tuple2[java.lang.String, typingsSlinky.graphql.definitionMod.GraphQLInputFieldConfig]) | scala.Null
    ]
  ]
  
  type InputObjectNodeTransformer = js.Function4[
    /* typeName */ java.lang.String, 
    /* inputObjectNode */ typingsSlinky.graphql.astMod.ObjectValueNode, 
    /* request */ typingsSlinky.graphqlToolsUtils.interfacesMod.Request, 
    /* delegationContext */ js.UndefOr[typingsSlinky.graphqlToolsDelegate.typesMod.DelegationContext], 
    typingsSlinky.graphql.astMod.ObjectValueNode
  ]
  
  type LeafValueTransformer = js.Function2[/* typeName */ java.lang.String, /* value */ js.Any, js.Any]
  
  type ObjectValueTransformerMap = typingsSlinky.std.Record[java.lang.String, typingsSlinky.graphqlToolsWrap.typesMod.DataTransformer]
  
  type RootFieldTransformer = js.Function3[
    /* operation */ typingsSlinky.graphqlToolsWrap.graphqlToolsWrapStrings.Query | typingsSlinky.graphqlToolsWrap.graphqlToolsWrapStrings.Mutation | typingsSlinky.graphqlToolsWrap.graphqlToolsWrapStrings.Subscription, 
    /* fieldName */ java.lang.String, 
    /* fieldConfig */ typingsSlinky.graphql.definitionMod.GraphQLFieldConfig[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]], 
    js.UndefOr[
      (typingsSlinky.graphql.definitionMod.GraphQLFieldConfig[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]) | (js.Tuple2[
        java.lang.String, 
        typingsSlinky.graphql.definitionMod.GraphQLFieldConfig[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
      ]) | scala.Null
    ]
  ]
}
