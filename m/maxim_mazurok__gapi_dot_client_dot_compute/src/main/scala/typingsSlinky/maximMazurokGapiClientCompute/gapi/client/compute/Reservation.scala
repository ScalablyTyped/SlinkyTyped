package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reservation extends js.Object {
  
  /** [Output Only] Full or partial URL to a parent commitment. This field displays for reservations that are tied to a commitment. */
  var commitment: js.UndefOr[String] = js.native
  
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.native
  
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.native
  
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.native
  
  /** [Output Only] Type of the resource. Always compute#reservations for reservations. */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the
    * name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following
    * characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.native
  
  /** [Output Only] Server-defined fully-qualified URL for this resource. */
  var selfLink: js.UndefOr[String] = js.native
  
  /** Reservation for instances with specific machine shapes. */
  var specificReservation: js.UndefOr[AllocationSpecificSKUReservation] = js.native
  
  /**
    * Indicates whether the reservation can be consumed by VMs with affinity for "any" reservation. If the field is set, then only VMs that target the reservation by name can consume from
    * this reservation.
    */
  var specificReservationRequired: js.UndefOr[Boolean] = js.native
  
  /** [Output Only] The status of the reservation. */
  var status: js.UndefOr[String] = js.native
  
  /** Zone in which the reservation resides. A zone must be provided if the reservation is created within a commitment. */
  var zone: js.UndefOr[String] = js.native
}
object Reservation {
  
  @scala.inline
  def apply(): Reservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reservation]
  }
  
  @scala.inline
  implicit class ReservationOps[Self <: Reservation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCommitment(value: String): Self = this.set("commitment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommitment: Self = this.set("commitment", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setSpecificReservation(value: AllocationSpecificSKUReservation): Self = this.set("specificReservation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecificReservation: Self = this.set("specificReservation", js.undefined)
    
    @scala.inline
    def setSpecificReservationRequired(value: Boolean): Self = this.set("specificReservationRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecificReservationRequired: Self = this.set("specificReservationRequired", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = this.set("zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZone: Self = this.set("zone", js.undefined)
  }
}
