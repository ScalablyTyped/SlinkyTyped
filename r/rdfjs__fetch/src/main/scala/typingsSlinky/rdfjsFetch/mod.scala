package typingsSlinky.rdfjsFetch

import typingsSlinky.rdfJs.mod.BaseQuad
import typingsSlinky.rdfJs.mod.DatasetCore
import typingsSlinky.rdfJs.mod.Quad
import typingsSlinky.rdfjsFetch.anon.PartialFormatsInit
import typingsSlinky.rdfjsFetchLite.mod.DatasetResponse
import typingsSlinky.rdfjsFetchLite.mod.FactoryInit
import typingsSlinky.rdfjsFetchLite.mod.RdfFetchResponse
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rdfjs/fetch", JSImport.Namespace)
  @js.native
  def apply(url: String): js.Promise[RdfFetchResponse[Quad]] = js.native
  @JSImport("@rdfjs/fetch", JSImport.Namespace)
  @js.native
  def apply(url: String, options: PartialFormatsInit): js.Promise[RdfFetchResponse[Quad]] = js.native
  @JSImport("@rdfjs/fetch", JSImport.Namespace)
  @js.native
  def apply[D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */](url: String, options: Partial[FactoryInit[D, OutQuad, InQuad]]): js.Promise[DatasetResponse[D, OutQuad, InQuad]] = js.native
}
