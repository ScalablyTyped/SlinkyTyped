package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCompute.anon.MaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterconnectLocationsResource extends js.Object {
  
  /** Returns the details for the specified interconnect location. Gets a list of available interconnect locations by making a list() request. */
  def get(): Request[InterconnectLocation] = js.native
  def get(request: typingsSlinky.maximMazurokGapiClientCompute.anon.InterconnectLocation): Request[InterconnectLocation] = js.native
  
  /** Retrieves the list of interconnect locations available to the specified project. */
  def list(): Request[InterconnectLocationList] = js.native
  def list(request: MaxResults): Request[InterconnectLocationList] = js.native
}
