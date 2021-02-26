package typingsSlinky.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientVideointelligence.anon.Fields
import typingsSlinky.maximMazurokGapiClientVideointelligence.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideosResource extends StObject {
  
  /**
    * Performs asynchronous video annotation. Progress and results can be retrieved through the `google.longrunning.Operations` interface. `Operation.metadata` contains
    * `AnnotateVideoProgress` (progress). `Operation.response` contains `AnnotateVideoResponse` (results).
    */
  def annotate(request: Fields): Request[GoogleLongrunningOperation] = js.native
  def annotate(request: Key, body: GoogleCloudVideointelligenceV1AnnotateVideoRequest): Request[GoogleLongrunningOperation] = js.native
}
