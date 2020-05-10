package typingsSlinky.ionic.definitionsMod

import typingsSlinky.ionic.AnonAndroid
import typingsSlinky.ionic.ionicStrings.development
import typingsSlinky.ionic.ionicStrings.production
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityProfile extends js.Object {
  var created: String = js.native
  var credentials: AnonAndroid = js.native
  var name: String = js.native
  var tag: String = js.native
  var `type`: development | production = js.native
}

object SecurityProfile {
  @scala.inline
  def apply(
    created: String,
    credentials: AnonAndroid,
    name: String,
    tag: String,
    `type`: development | production
  ): SecurityProfile = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityProfile]
  }
  @scala.inline
  implicit class SecurityProfileOps[Self <: SecurityProfile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCredentials(value: AnonAndroid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: development | production): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

