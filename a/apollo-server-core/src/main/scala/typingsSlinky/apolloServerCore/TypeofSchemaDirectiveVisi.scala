package typingsSlinky.apolloServerCore

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.mod.GraphQLDirective
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlTools.AnonArgs
import typingsSlinky.graphqlTools.mod.SchemaDirectiveVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofSchemaDirectiveVisi extends Instantiable1[/* config */ AnonArgs, SchemaDirectiveVisitor] {
  /* protected */ def getDeclaredDirectives(
    schema: GraphQLSchema,
    directiveVisitors: StringDictionary[typingsSlinky.graphqlTools.TypeofSchemaDirectiveVisi]
  ): StringDictionary[GraphQLDirective] = js.native
  def getDirectiveDeclaration(directiveName: String, schema: GraphQLSchema): GraphQLDirective = js.native
  def visitSchemaDirectives(
    schema: GraphQLSchema,
    directiveVisitors: StringDictionary[typingsSlinky.graphqlTools.TypeofSchemaDirectiveVisi]
  ): StringDictionary[js.Array[typingsSlinky.graphqlTools.schemaVisitorMod.SchemaDirectiveVisitor]] = js.native
  def visitSchemaDirectives(
    schema: GraphQLSchema,
    directiveVisitors: StringDictionary[typingsSlinky.graphqlTools.TypeofSchemaDirectiveVisi],
    context: StringDictionary[js.Any]
  ): StringDictionary[js.Array[typingsSlinky.graphqlTools.schemaVisitorMod.SchemaDirectiveVisitor]] = js.native
}

