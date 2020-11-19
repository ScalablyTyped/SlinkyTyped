package typingsSlinky.apolloServer.exportsMod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsUtils.loadersMod.Source
import typingsSlinky.graphqlToolsUtils.validateDocumentsMod.LoadDocumentError
import typingsSlinky.graphqlToolsUtils.validateDocumentsMod.ValidationRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server/dist/exports", "validateGraphQlDocuments")
@js.native
object validateGraphQlDocuments extends js.Object {
  
  def apply(schema: GraphQLSchema, documentFiles: js.Array[Source]): js.Promise[js.Array[LoadDocumentError]] = js.native
  def apply(schema: GraphQLSchema, documentFiles: js.Array[Source], effectiveRules: js.Array[ValidationRule]): js.Promise[js.Array[LoadDocumentError]] = js.native
}
