package typingsSlinky.maximMazurokGapiClientBooks.gapi.client.books

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientBooks.anon.MaxResults
import typingsSlinky.maximMazurokGapiClientBooks.anon.SummaryId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayersResource extends StObject {
  
  var annotationData: AnnotationDataResource = js.native
  
  /** Gets the layer summary for a volume. */
  def get(): Request[Layersummary] = js.native
  def get(request: SummaryId): Request[Layersummary] = js.native
  
  /** List the layer summaries for a volume. */
  def list(): Request[Layersummaries] = js.native
  def list(request: MaxResults): Request[Layersummaries] = js.native
  
  var volumeAnnotations: VolumeAnnotationsResource = js.native
}
