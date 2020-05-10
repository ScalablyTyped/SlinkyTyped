package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBio extends js.Object {
  var bio: AnonType = js.native
  var blog: AnonType = js.native
  var company: AnonType = js.native
  var email: AnonType = js.native
  var hireable: AnonType = js.native
  var location: AnonType = js.native
  var name: AnonType = js.native
}

object AnonBio {
  @scala.inline
  def apply(
    bio: AnonType,
    blog: AnonType,
    company: AnonType,
    email: AnonType,
    hireable: AnonType,
    location: AnonType,
    name: AnonType
  ): AnonBio = {
    val __obj = js.Dynamic.literal(bio = bio.asInstanceOf[js.Any], blog = blog.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], hireable = hireable.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBio]
  }
  @scala.inline
  implicit class AnonBioOps[Self <: AnonBio] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBio(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlog(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompany(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("company")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHireable(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hireable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

