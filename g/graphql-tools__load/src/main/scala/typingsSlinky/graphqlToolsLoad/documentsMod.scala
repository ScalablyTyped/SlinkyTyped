package typingsSlinky.graphqlToolsLoad

import typingsSlinky.graphqlToolsLoad.anon.LoadTypedefsOptionskeystr
import typingsSlinky.graphqlToolsLoad.graphqlToolsLoadStrings.FragmentDefinition
import typingsSlinky.graphqlToolsLoad.graphqlToolsLoadStrings.OperationDefinition
import typingsSlinky.graphqlToolsLoad.loadTypedefsMod.UnnormalizedTypeDefPointer
import typingsSlinky.graphqlToolsUtils.loadersMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/load/documents", JSImport.Namespace)
@js.native
object documentsMod extends js.Object {
  val NON_OPERATION_KINDS: js.Array[js.Any] = js.native
  val OPERATION_KINDS: js.Array[OperationDefinition | FragmentDefinition] = js.native
  def loadDocuments(pointerOrPointers: js.Array[UnnormalizedTypeDefPointer], options: LoadTypedefsOptionskeystr): js.Promise[js.Array[Source]] = js.native
  def loadDocuments(pointerOrPointers: UnnormalizedTypeDefPointer, options: LoadTypedefsOptionskeystr): js.Promise[js.Array[Source]] = js.native
  def loadDocumentsSync(pointerOrPointers: js.Array[UnnormalizedTypeDefPointer], options: LoadTypedefsOptionskeystr): js.Array[Source] = js.native
  def loadDocumentsSync(pointerOrPointers: UnnormalizedTypeDefPointer, options: LoadTypedefsOptionskeystr): js.Array[Source] = js.native
}

