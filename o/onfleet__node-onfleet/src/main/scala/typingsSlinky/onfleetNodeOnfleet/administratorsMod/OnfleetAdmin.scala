package typingsSlinky.onfleetNodeOnfleet.administratorsMod

import typingsSlinky.onfleetNodeOnfleet.metadataMod.OnfleetMetadata
import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.`super`
import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.standard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnfleetAdmin extends js.Object {
  var email: String = js.native
  var id: String = js.native
  var isActive: Boolean = js.native
  var metadata: OnfleetMetadata = js.native
  var name: String = js.native
  var organization: String = js.native
  var phone: String = js.native
  var timeCreated: Double = js.native
  var timeLastModified: Double = js.native
  var `type`: `super` | standard = js.native
}

object OnfleetAdmin {
  @scala.inline
  def apply(
    email: String,
    id: String,
    isActive: Boolean,
    metadata: OnfleetMetadata,
    name: String,
    organization: String,
    phone: String,
    timeCreated: Double,
    timeLastModified: Double,
    `type`: `super` | standard
  ): OnfleetAdmin = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeLastModified = timeLastModified.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnfleetAdmin]
  }
  @scala.inline
  implicit class OnfleetAdminOps[Self <: OnfleetAdmin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: OnfleetMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrganization(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeCreated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeCreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeLastModified(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeLastModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: `super` | standard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

