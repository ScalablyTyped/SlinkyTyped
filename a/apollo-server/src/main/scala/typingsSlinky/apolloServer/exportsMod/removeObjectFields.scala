package typingsSlinky.apolloServer.exportsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.definitionMod.GraphQLFieldConfig
import typingsSlinky.graphql.definitionMod.GraphQLFieldConfigMap
import typingsSlinky.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server/dist/exports", "removeObjectFields")
@js.native
object removeObjectFields extends js.Object {
  
  def apply(
    schema: GraphQLSchema,
    typeName: String,
    testFn: js.Function2[
      /* fieldName */ String, 
      /* field */ GraphQLFieldConfig[_, _, StringDictionary[_]], 
      Boolean
    ]
  ): js.Tuple2[GraphQLSchema, GraphQLFieldConfigMap[_, _]] = js.native
}
