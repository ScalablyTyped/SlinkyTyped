package typingsSlinky.apolloDashServerDashCore

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.graphqlMod.GraphQLDirective
import typingsSlinky.graphql.graphqlMod.GraphQLSchema
import typingsSlinky.graphqlDashTools.Anon_Args
import typingsSlinky.graphqlDashTools.graphqlDashToolsMod.SchemaDirectiveVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassSchemaDirectiveVisitor extends Instantiable1[/* config */ Anon_Args, SchemaDirectiveVisitor] {
  /* protected */ def getDeclaredDirectives(
    schema: GraphQLSchema,
    directiveVisitors: StringDictionary[typingsSlinky.graphqlDashTools.TypeofClassSchemaDirectiveVisitor]
  ): StringDictionary[GraphQLDirective] = js.native
  def getDirectiveDeclaration(directiveName: String, schema: GraphQLSchema): GraphQLDirective = js.native
  def visitSchemaDirectives(
    schema: GraphQLSchema,
    directiveVisitors: StringDictionary[typingsSlinky.graphqlDashTools.TypeofClassSchemaDirectiveVisitor]
  ): StringDictionary[
    js.Array[typingsSlinky.graphqlDashTools.distSchemaVisitorMod.SchemaDirectiveVisitor]
  ] = js.native
  def visitSchemaDirectives(
    schema: GraphQLSchema,
    directiveVisitors: StringDictionary[typingsSlinky.graphqlDashTools.TypeofClassSchemaDirectiveVisitor],
    context: StringDictionary[js.Any]
  ): StringDictionary[
    js.Array[typingsSlinky.graphqlDashTools.distSchemaVisitorMod.SchemaDirectiveVisitor]
  ] = js.native
}

