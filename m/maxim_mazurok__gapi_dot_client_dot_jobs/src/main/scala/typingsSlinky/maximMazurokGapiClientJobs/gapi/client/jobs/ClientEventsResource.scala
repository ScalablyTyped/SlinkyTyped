package typingsSlinky.maximMazurokGapiClientJobs.gapi.client.jobs

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientJobs.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientJobs.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientEventsResource extends StObject {
  
  /**
    * Report events issued when end user interacts with customer's application that uses Cloud Talent Solution. You may inspect the created events in [self service
    * tools](https://console.cloud.google.com/talent-solution/overview). [Learn more](https://cloud.google.com/talent-solution/docs/management-tools) about self service tools.
    */
  def create(request: Accesstoken): Request[ClientEvent] = js.native
  def create(request: Alt, body: CreateClientEventRequest): Request[ClientEvent] = js.native
}
