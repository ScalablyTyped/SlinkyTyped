package typingsSlinky.graphqlToolsDelegate

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsDelegate.typesMod.IDelegateRequestOptions
import typingsSlinky.graphqlToolsDelegate.typesMod.IDelegateToSchemaOptions
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/delegate/delegateToSchema", JSImport.Namespace)
@js.native
object delegateToSchemaMod extends js.Object {
  
  def delegateRequest(
    hasRequestSchemaRootValueInfoOperationFieldNameArgsReturnTypeContextTransformsTransformedSchemaSkipValidationSkipTypeMergingBinding: IDelegateRequestOptions
  ): js.Any = js.native
  
  def delegateToSchema(options: GraphQLSchema): js.Any = js.native
  def delegateToSchema(options: IDelegateToSchemaOptions[Record[String, _], Record[String, _]]): js.Any = js.native
}
