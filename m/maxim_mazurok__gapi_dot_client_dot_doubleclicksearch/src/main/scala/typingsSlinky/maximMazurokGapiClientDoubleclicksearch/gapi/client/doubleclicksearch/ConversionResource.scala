package typingsSlinky.maximMazurokGapiClientDoubleclicksearch.gapi.client.doubleclicksearch

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDoubleclicksearch.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientDoubleclicksearch.anon.Alt
import typingsSlinky.maximMazurokGapiClientDoubleclicksearch.anon.Callback
import typingsSlinky.maximMazurokGapiClientDoubleclicksearch.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConversionResource extends js.Object {
  
  /** Retrieves a list of conversions from a DoubleClick Search engine account. */
  def get(): Request[ConversionList] = js.native
  def get(request: Accesstoken): Request[ConversionList] = js.native
  
  /** Inserts a batch of new conversions into DoubleClick Search. */
  def insert(request: Alt): Request[ConversionList] = js.native
  def insert(request: Callback, body: ConversionList): Request[ConversionList] = js.native
  
  /** Updates a batch of conversions in DoubleClick Search. */
  def update(request: Alt): Request[ConversionList] = js.native
  def update(request: Callback, body: ConversionList): Request[ConversionList] = js.native
  
  def updateAvailability(request: Callback, body: UpdateAvailabilityRequest): Request[UpdateAvailabilityResponse] = js.native
  /** Updates the availabilities of a batch of floodlight activities in DoubleClick Search. */
  def updateAvailability(request: Fields): Request[UpdateAvailabilityResponse] = js.native
}
