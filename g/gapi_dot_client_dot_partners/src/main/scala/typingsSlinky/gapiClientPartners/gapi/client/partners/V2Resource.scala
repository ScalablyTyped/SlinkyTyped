package typingsSlinky.gapiClientPartners.gapi.client.partners

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientPartners.AnonFields
import typingsSlinky.gapiClientPartners.AnonPp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait V2Resource extends js.Object {
  /**
    * Gets Partners Status of the logged in user's agency.
    * Should only be called if the logged in user is the admin of the agency.
    */
  def getPartnersstatus(request: AnonFields): Request_[GetPartnersStatusResponse] = js.native
  /**
    * Update company.
    * Should only be called within the context of an authorized logged in user.
    */
  def updateCompanies(request: AnonPp): Request_[Company] = js.native
  /** Updates the specified lead. */
  def updateLeads(request: AnonPp): Request_[Lead] = js.native
}

object V2Resource {
  @scala.inline
  def apply(
    getPartnersstatus: AnonFields => Request_[GetPartnersStatusResponse],
    updateCompanies: AnonPp => Request_[Company],
    updateLeads: AnonPp => Request_[Lead]
  ): V2Resource = {
    val __obj = js.Dynamic.literal(getPartnersstatus = js.Any.fromFunction1(getPartnersstatus), updateCompanies = js.Any.fromFunction1(updateCompanies), updateLeads = js.Any.fromFunction1(updateLeads))
    __obj.asInstanceOf[V2Resource]
  }
  @scala.inline
  implicit class V2ResourceOps[Self <: V2Resource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetPartnersstatus(value: AnonFields => Request_[GetPartnersStatusResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPartnersstatus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateCompanies(value: AnonPp => Request_[Company]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateCompanies")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateLeads(value: AnonPp => Request_[Lead]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateLeads")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

