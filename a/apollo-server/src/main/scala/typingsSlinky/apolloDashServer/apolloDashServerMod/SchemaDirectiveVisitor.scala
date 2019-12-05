package typingsSlinky.apolloDashServer.apolloDashServerMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.graphqlMod.GraphQLDirective
import typingsSlinky.graphql.graphqlMod.GraphQLSchema
import typingsSlinky.graphqlDashTools.Anon_Args
import typingsSlinky.graphqlDashTools.TypeofClassSchemaDirectiveVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "SchemaDirectiveVisitor")
@js.native
class SchemaDirectiveVisitor protected ()
  extends typingsSlinky.apolloDashServer.distExportsMod.SchemaDirectiveVisitor {
  protected def this(config: Anon_Args) = this()
}

/* static members */
@JSImport("apollo-server", "SchemaDirectiveVisitor")
@js.native
object SchemaDirectiveVisitor extends js.Object {
  /* protected */ def getDeclaredDirectives(schema: GraphQLSchema, directiveVisitors: StringDictionary[TypeofClassSchemaDirectiveVisitor]): StringDictionary[GraphQLDirective] = js.native
  def getDirectiveDeclaration(directiveName: String, schema: GraphQLSchema): GraphQLDirective = js.native
  def visitSchemaDirectives(schema: GraphQLSchema, directiveVisitors: StringDictionary[TypeofClassSchemaDirectiveVisitor]): StringDictionary[
    js.Array[typingsSlinky.graphqlDashTools.distSchemaVisitorMod.SchemaDirectiveVisitor]
  ] = js.native
  def visitSchemaDirectives(
    schema: GraphQLSchema,
    directiveVisitors: StringDictionary[TypeofClassSchemaDirectiveVisitor],
    context: StringDictionary[js.Any]
  ): StringDictionary[
    js.Array[typingsSlinky.graphqlDashTools.distSchemaVisitorMod.SchemaDirectiveVisitor]
  ] = js.native
}

