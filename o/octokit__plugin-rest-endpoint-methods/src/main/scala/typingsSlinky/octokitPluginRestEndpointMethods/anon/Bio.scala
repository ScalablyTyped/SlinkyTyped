package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bio extends js.Object {
  var bio: Type = js.native
  var blog: Type = js.native
  var company: Type = js.native
  var email: Type = js.native
  var hireable: Type = js.native
  var location: Type = js.native
  var name: Type = js.native
}

object Bio {
  @scala.inline
  def apply(bio: Type, blog: Type, company: Type, email: Type, hireable: Type, location: Type, name: Type): Bio = {
    val __obj = js.Dynamic.literal(bio = bio.asInstanceOf[js.Any], blog = blog.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], hireable = hireable.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bio]
  }
  @scala.inline
  implicit class BioOps[Self <: Bio] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBio(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlog(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompany(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("company")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHireable(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hireable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

