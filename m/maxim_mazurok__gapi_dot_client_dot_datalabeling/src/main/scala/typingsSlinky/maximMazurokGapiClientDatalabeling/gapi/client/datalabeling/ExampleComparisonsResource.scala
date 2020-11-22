package typingsSlinky.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDatalabeling.anon.Alt
import typingsSlinky.maximMazurokGapiClientDatalabeling.anon.Parent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExampleComparisonsResource extends js.Object {
  
  def search(request: Alt, body: GoogleCloudDatalabelingV1beta1SearchExampleComparisonsRequest): Request[GoogleCloudDatalabelingV1beta1SearchExampleComparisonsResponse] = js.native
  /**
    * Searches example comparisons from an evaluation. The return format is a list of example comparisons that show ground truth and prediction(s) for a single input. Search by providing
    * an evaluation ID.
    */
  def search(request: Parent): Request[GoogleCloudDatalabelingV1beta1SearchExampleComparisonsResponse] = js.native
}
