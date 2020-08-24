package typingsSlinky.graphqlToolsUtils.validateDocumentsMod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsUtils.loadersMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/validate-documents", "validateGraphQlDocuments")
@js.native
object validateGraphQlDocuments extends js.Object {
  def apply(schema: GraphQLSchema, documentFiles: js.Array[Source]): js.Promise[js.Array[LoadDocumentError]] = js.native
  def apply(schema: GraphQLSchema, documentFiles: js.Array[Source], effectiveRules: js.Array[ValidationRule]): js.Promise[js.Array[LoadDocumentError]] = js.native
}

