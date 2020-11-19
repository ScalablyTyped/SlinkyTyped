package typingsSlinky.graphqlTools.mod

import typingsSlinky.graphql.mod.GraphQLDirective
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsUtils.anon.Args
import typingsSlinky.graphqlToolsUtils.schemaDirectiveVisitorMod.SchemaDirectiveVisitorClass
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-tools", "SchemaDirectiveVisitor")
@js.native
class SchemaDirectiveVisitor[TArgs, TContext] protected ()
  extends typingsSlinky.graphqlToolsUtils.mod.SchemaDirectiveVisitor[TArgs, TContext] {
  protected def this(config: Args[TArgs, TContext]) = this()
}
/* static members */
@JSImport("graphql-tools", "SchemaDirectiveVisitor")
@js.native
object SchemaDirectiveVisitor extends js.Object {
  
  /* protected */ def getDeclaredDirectives(schema: GraphQLSchema, directiveVisitors: Record[String, SchemaDirectiveVisitorClass]): Record[String, GraphQLDirective] = js.native
  
  def getDirectiveDeclaration(directiveName: String, schema: GraphQLSchema): js.UndefOr[GraphQLDirective | Null] = js.native
  
  def visitSchemaDirectives(schema: GraphQLSchema, directiveVisitors: Record[String, SchemaDirectiveVisitorClass]): Record[
    String, 
    js.Array[
      typingsSlinky.graphqlToolsUtils.schemaDirectiveVisitorMod.SchemaDirectiveVisitor[_, _]
    ]
  ] = js.native
  def visitSchemaDirectives(
    schema: GraphQLSchema,
    directiveVisitors: Record[String, SchemaDirectiveVisitorClass],
    context: Record[String, _]
  ): Record[
    String, 
    js.Array[
      typingsSlinky.graphqlToolsUtils.schemaDirectiveVisitorMod.SchemaDirectiveVisitor[_, _]
    ]
  ] = js.native
}
