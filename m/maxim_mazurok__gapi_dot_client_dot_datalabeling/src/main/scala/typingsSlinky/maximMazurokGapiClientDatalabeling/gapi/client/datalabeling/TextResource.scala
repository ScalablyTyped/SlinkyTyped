package typingsSlinky.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDatalabeling.anon.Alt
import typingsSlinky.maximMazurokGapiClientDatalabeling.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextResource extends StObject {
  
  def label(request: Alt, body: GoogleCloudDatalabelingV1beta1LabelTextRequest): Request[GoogleLongrunningOperation] = js.native
  /** Starts a labeling task for text. The type of text labeling task is configured by feature in the request. */
  def label(request: QuotaUser): Request[GoogleLongrunningOperation] = js.native
}
