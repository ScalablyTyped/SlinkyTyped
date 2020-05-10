package typingsSlinky.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisionedCapacityDescription extends js.Object {
  /**
    * The ID that identifies the provisioned capacity unit.
    */
  var CapacityId: js.UndefOr[String] = js.native
  /**
    * The date that the provisioned capacity unit expires, in Universal Coordinated Time (UTC).
    */
  var ExpirationDate: js.UndefOr[String] = js.native
  /**
    * The date that the provisioned capacity unit was purchased, in Universal Coordinated Time (UTC).
    */
  var StartDate: js.UndefOr[String] = js.native
}

object ProvisionedCapacityDescription {
  @scala.inline
  def apply(): ProvisionedCapacityDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionedCapacityDescription]
  }
  @scala.inline
  implicit class ProvisionedCapacityDescriptionOps[Self <: ProvisionedCapacityDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapacityId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CapacityId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapacityId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CapacityId")(js.undefined)
        ret
    }
    @scala.inline
    def withExpirationDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpirationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpirationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartDate")(js.undefined)
        ret
    }
  }
  
}

