package typingsSlinky.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDatalabeling.anon.Fields
import typingsSlinky.maximMazurokGapiClientDatalabeling.anon.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExamplesResource extends js.Object {
  
  /** Gets an example by resource name, including both data and annotation. */
  def get(): Request[GoogleCloudDatalabelingV1beta1Example] = js.native
  def get(request: Filter): Request[GoogleCloudDatalabelingV1beta1Example] = js.native
  
  /** Lists examples in an annotated dataset. Pagination is supported. */
  def list(): Request[GoogleCloudDatalabelingV1beta1ListExamplesResponse] = js.native
  def list(request: Fields): Request[GoogleCloudDatalabelingV1beta1ListExamplesResponse] = js.native
}
