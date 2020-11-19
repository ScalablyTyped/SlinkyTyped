package typingsSlinky.graphql.executeMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.definitionMod.GraphQLField
import typingsSlinky.graphql.definitionMod.GraphQLObjectType
import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.graphql.schemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql/execution/execute", "getFieldDef")
@js.native
object getFieldDef extends js.Object {
  
  def apply(schema: GraphQLSchema, parentType: GraphQLObjectType[_, _], fieldName: String): Maybe[GraphQLField[_, _, StringDictionary[_]]] = js.native
}
