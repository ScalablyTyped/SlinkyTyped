package typingsSlinky.graphqlTools.schemaVisitorMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.mod.GraphQLDirective
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlTools.anon.Args
import typingsSlinky.graphqlTools.anon.TypeofSchemaDirectiveVisi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/schemaVisitor", "SchemaDirectiveVisitor")
@js.native
class SchemaDirectiveVisitor protected () extends SchemaVisitor {
  protected def this(config: Args) = this()
  var args: StringDictionary[js.Any] = js.native
  var context: StringDictionary[js.Any] = js.native
  var name: String = js.native
  var visitedType: VisitableSchemaType = js.native
}

/* static members */
@JSImport("graphql-tools/dist/schemaVisitor", "SchemaDirectiveVisitor")
@js.native
object SchemaDirectiveVisitor extends js.Object {
  /* protected */ def getDeclaredDirectives(schema: GraphQLSchema, directiveVisitors: StringDictionary[TypeofSchemaDirectiveVisi]): StringDictionary[GraphQLDirective] = js.native
  def getDirectiveDeclaration(directiveName: String, schema: GraphQLSchema): GraphQLDirective = js.native
  def visitSchemaDirectives(schema: GraphQLSchema, directiveVisitors: StringDictionary[TypeofSchemaDirectiveVisi]): StringDictionary[js.Array[SchemaDirectiveVisitor]] = js.native
  def visitSchemaDirectives(
    schema: GraphQLSchema,
    directiveVisitors: StringDictionary[TypeofSchemaDirectiveVisi],
    context: StringDictionary[js.Any]
  ): StringDictionary[js.Array[SchemaDirectiveVisitor]] = js.native
}

