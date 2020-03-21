package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDfareporting.AnonAltFields
import typingsSlinky.gapiClientDfareporting.AnonFields
import typingsSlinky.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloodlightConfigurationsResource extends js.Object {
  /** Gets one floodlight configuration by ID. */
  def get(request: AnonFields): Request_[FloodlightConfiguration]
  /** Retrieves a list of floodlight configurations, possibly filtered. */
  def list(request: AnonAltFields): Request_[FloodlightConfigurationsListResponse]
  /** Updates an existing floodlight configuration. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[FloodlightConfiguration]
  /** Updates an existing floodlight configuration. */
  def update(request: AnonKey): Request_[FloodlightConfiguration]
}

object FloodlightConfigurationsResource {
  @scala.inline
  def apply(
    get: AnonFields => Request_[FloodlightConfiguration],
    list: AnonAltFields => Request_[FloodlightConfigurationsListResponse],
    patch: AnonFields => Request_[FloodlightConfiguration],
    update: AnonKey => Request_[FloodlightConfiguration]
  ): FloodlightConfigurationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[FloodlightConfigurationsResource]
  }
}

