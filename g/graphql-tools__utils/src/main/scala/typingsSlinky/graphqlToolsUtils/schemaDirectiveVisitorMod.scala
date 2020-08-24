package typingsSlinky.graphqlToolsUtils

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.graphql.mod.GraphQLDirective
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsUtils.anon.Args
import typingsSlinky.graphqlToolsUtils.anon.Context
import typingsSlinky.graphqlToolsUtils.interfacesMod.VisitableSchemaType
import typingsSlinky.graphqlToolsUtils.schemaVisitorMod.SchemaVisitor
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/SchemaDirectiveVisitor", JSImport.Namespace)
@js.native
object schemaDirectiveVisitorMod extends js.Object {
  @js.native
  class SchemaDirectiveVisitor[TArgs, TContext] protected () extends SchemaVisitor {
    protected def this(config: Args[TArgs, TContext]) = this()
    var args: TArgs = js.native
    var context: TContext = js.native
    var name: String = js.native
    var visitedType: VisitableSchemaType = js.native
  }
  
  @js.native
  trait SchemaDirectiveVisitorClass
    extends Instantiable1[/* config */ Context, SchemaDirectiveVisitor[js.Object, js.Object]] {
    /* protected */ def getDeclaredDirectives(schema: GraphQLSchema, directiveVisitors: Record[String, SchemaDirectiveVisitorClass]): Record[String, GraphQLDirective] = js.native
    def getDirectiveDeclaration(directiveName: String, schema: GraphQLSchema): js.UndefOr[GraphQLDirective | Null] = js.native
    def visitSchemaDirectives(schema: GraphQLSchema, directiveVisitors: Record[String, SchemaDirectiveVisitorClass]): Record[String, js.Array[SchemaDirectiveVisitor[_, _]]] = js.native
    def visitSchemaDirectives(
      schema: GraphQLSchema,
      directiveVisitors: Record[String, SchemaDirectiveVisitorClass],
      context: Record[String, _]
    ): Record[String, js.Array[SchemaDirectiveVisitor[_, _]]] = js.native
  }
  
  /* static members */
  @js.native
  object SchemaDirectiveVisitor extends js.Object {
    /* protected */ def getDeclaredDirectives(schema: GraphQLSchema, directiveVisitors: Record[String, SchemaDirectiveVisitorClass]): Record[String, GraphQLDirective] = js.native
    def getDirectiveDeclaration(directiveName: String, schema: GraphQLSchema): js.UndefOr[GraphQLDirective | Null] = js.native
    def visitSchemaDirectives(schema: GraphQLSchema, directiveVisitors: Record[String, SchemaDirectiveVisitorClass]): Record[String, js.Array[SchemaDirectiveVisitor[_, _]]] = js.native
    def visitSchemaDirectives(
      schema: GraphQLSchema,
      directiveVisitors: Record[String, SchemaDirectiveVisitorClass],
      context: Record[String, _]
    ): Record[String, js.Array[SchemaDirectiveVisitor[_, _]]] = js.native
  }
  
}

