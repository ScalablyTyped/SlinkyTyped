package typingsSlinky.gapiClientCivicinfo.gapi.client.civicinfo

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCivicinfo.AnonIncludeOffices
import typingsSlinky.gapiClientCivicinfo.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepresentativesResource extends js.Object {
  /** Looks up political geography and representative information for a single address. */
  def representativeInfoByAddress(request: AnonIncludeOffices): Request_[RepresentativeInfoResponse]
  /** Looks up representative information for a single geographic division. */
  def representativeInfoByDivision(request: AnonKey): Request_[RepresentativeInfoData]
}

object RepresentativesResource {
  @scala.inline
  def apply(
    representativeInfoByAddress: AnonIncludeOffices => Request_[RepresentativeInfoResponse],
    representativeInfoByDivision: AnonKey => Request_[RepresentativeInfoData]
  ): RepresentativesResource = {
    val __obj = js.Dynamic.literal(representativeInfoByAddress = js.Any.fromFunction1(representativeInfoByAddress), representativeInfoByDivision = js.Any.fromFunction1(representativeInfoByDivision))
  
    __obj.asInstanceOf[RepresentativesResource]
  }
}

