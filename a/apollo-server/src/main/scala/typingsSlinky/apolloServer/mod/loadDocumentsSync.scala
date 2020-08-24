package typingsSlinky.apolloServer.mod

import typingsSlinky.graphqlToolsLoad.anon.LoadTypedefsOptionskeystr
import typingsSlinky.graphqlToolsLoad.loadTypedefsMod.UnnormalizedTypeDefPointer
import typingsSlinky.graphqlToolsUtils.loadersMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "loadDocumentsSync")
@js.native
object loadDocumentsSync extends js.Object {
  def apply(pointerOrPointers: js.Array[UnnormalizedTypeDefPointer], options: LoadTypedefsOptionskeystr): js.Array[Source] = js.native
  def apply(pointerOrPointers: UnnormalizedTypeDefPointer, options: LoadTypedefsOptionskeystr): js.Array[Source] = js.native
}

