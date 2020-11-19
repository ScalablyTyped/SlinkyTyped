package typingsSlinky.graphql.mod

import typingsSlinky.graphql.definitionMod.GraphQLType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql", "isTypeSubTypeOf")
@js.native
object isTypeSubTypeOf extends js.Object {
  
  def apply(
    schema: typingsSlinky.graphql.schemaMod.GraphQLSchema,
    maybeSubType: GraphQLType,
    superType: GraphQLType
  ): Boolean = js.native
}
