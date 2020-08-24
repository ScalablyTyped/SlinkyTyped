package typingsSlinky.graphqlQueryComplexity

import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.mod.GraphQLError
import typingsSlinky.graphql.mod.TypeInfo
import typingsSlinky.graphql.mod.ValidationContext
import typingsSlinky.graphql.schemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-query-complexity/dist/@/tests/fixtures/CompatibleValidationContext", JSImport.Namespace)
@js.native
object compatibleValidationContextMod extends js.Object {
  @js.native
  class CompatibleValidationContext protected () extends ValidationContext {
    def this(schema: GraphQLSchema, ast: DocumentNode, typeInfo: TypeInfo) = this()
    var errors: js.Any = js.native
    def getErrors(): js.Array[GraphQLError] = js.native
  }
  
}

