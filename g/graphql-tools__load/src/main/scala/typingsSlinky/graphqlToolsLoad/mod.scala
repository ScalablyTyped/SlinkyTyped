package typingsSlinky.graphqlToolsLoad

import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsLoad.anon.LoadTypedefsOptionskeystr
import typingsSlinky.graphqlToolsLoad.graphqlToolsLoadStrings.FragmentDefinition
import typingsSlinky.graphqlToolsLoad.graphqlToolsLoadStrings.OperationDefinition
import typingsSlinky.graphqlToolsLoad.loadTypedefsMod.LoadTypedefsOptions
import typingsSlinky.graphqlToolsLoad.loadTypedefsMod.UnnormalizedTypeDefPointer
import typingsSlinky.graphqlToolsLoad.schemaMod.LoadSchemaOptions
import typingsSlinky.graphqlToolsUtils.loadersMod.Source
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/load", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val NON_OPERATION_KINDS: js.Array[js.Any] = js.native
  val OPERATION_KINDS: js.Array[OperationDefinition | FragmentDefinition] = js.native
  def filterKind(content: DocumentNode): DocumentNode = js.native
  def filterKind(content: DocumentNode, filterKinds: js.Array[String]): DocumentNode = js.native
  def loadDocuments(pointerOrPointers: js.Array[UnnormalizedTypeDefPointer], options: LoadTypedefsOptionskeystr): js.Promise[js.Array[Source]] = js.native
  def loadDocuments(pointerOrPointers: UnnormalizedTypeDefPointer, options: LoadTypedefsOptionskeystr): js.Promise[js.Array[Source]] = js.native
  def loadDocumentsSync(pointerOrPointers: js.Array[UnnormalizedTypeDefPointer], options: LoadTypedefsOptionskeystr): js.Array[Source] = js.native
  def loadDocumentsSync(pointerOrPointers: UnnormalizedTypeDefPointer, options: LoadTypedefsOptionskeystr): js.Array[Source] = js.native
  def loadSchema(schemaPointers: js.Array[UnnormalizedTypeDefPointer], options: LoadSchemaOptions): js.Promise[GraphQLSchema] = js.native
  def loadSchema(schemaPointers: UnnormalizedTypeDefPointer, options: LoadSchemaOptions): js.Promise[GraphQLSchema] = js.native
  def loadSchemaSync(schemaPointers: js.Array[UnnormalizedTypeDefPointer], options: LoadSchemaOptions): GraphQLSchema = js.native
  def loadSchemaSync(schemaPointers: UnnormalizedTypeDefPointer, options: LoadSchemaOptions): GraphQLSchema = js.native
  def loadTypedefs[AdditionalConfig](
    pointerOrPointers: js.Array[UnnormalizedTypeDefPointer],
    options: LoadTypedefsOptions[Partial[AdditionalConfig]]
  ): js.Promise[js.Array[Source]] = js.native
  def loadTypedefs[AdditionalConfig](
    pointerOrPointers: UnnormalizedTypeDefPointer,
    options: LoadTypedefsOptions[Partial[AdditionalConfig]]
  ): js.Promise[js.Array[Source]] = js.native
  def loadTypedefsSync[AdditionalConfig](
    pointerOrPointers: js.Array[UnnormalizedTypeDefPointer],
    options: LoadTypedefsOptions[Partial[AdditionalConfig]]
  ): js.Array[Source] = js.native
  def loadTypedefsSync[AdditionalConfig](
    pointerOrPointers: UnnormalizedTypeDefPointer,
    options: LoadTypedefsOptions[Partial[AdditionalConfig]]
  ): js.Array[Source] = js.native
}

