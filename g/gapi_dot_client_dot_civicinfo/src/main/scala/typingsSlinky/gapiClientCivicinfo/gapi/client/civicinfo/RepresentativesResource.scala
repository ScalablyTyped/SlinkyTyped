package typingsSlinky.gapiClientCivicinfo.gapi.client.civicinfo

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCivicinfo.AnonIncludeOffices
import typingsSlinky.gapiClientCivicinfo.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepresentativesResource extends js.Object {
  /** Looks up political geography and representative information for a single address. */
  def representativeInfoByAddress(request: AnonIncludeOffices): Request_[RepresentativeInfoResponse] = js.native
  /** Looks up representative information for a single geographic division. */
  def representativeInfoByDivision(request: AnonKey): Request_[RepresentativeInfoData] = js.native
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
  @scala.inline
  implicit class RepresentativesResourceOps[Self <: RepresentativesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRepresentativeInfoByAddress(value: AnonIncludeOffices => Request_[RepresentativeInfoResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("representativeInfoByAddress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRepresentativeInfoByDivision(value: AnonKey => Request_[RepresentativeInfoData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("representativeInfoByDivision")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

