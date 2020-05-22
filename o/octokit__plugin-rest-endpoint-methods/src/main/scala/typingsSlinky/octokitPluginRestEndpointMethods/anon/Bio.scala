package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bio extends js.Object {
  var bio: Type
  var blog: Type
  var company: Type
  var email: Type
  var hireable: Type
  var location: Type
  var name: Type
}

object Bio {
  @scala.inline
  def apply(bio: Type, blog: Type, company: Type, email: Type, hireable: Type, location: Type, name: Type): Bio = {
    val __obj = js.Dynamic.literal(bio = bio.asInstanceOf[js.Any], blog = blog.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], hireable = hireable.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bio]
  }
}

