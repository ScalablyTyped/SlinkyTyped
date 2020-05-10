package typingsSlinky.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUserData extends UserData[AppMetadata, UserMetadata] {
  var connection: String = js.native
}

object CreateUserData {
  @scala.inline
  def apply(connection: String): CreateUserData = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserData]
  }
  @scala.inline
  implicit class CreateUserDataOps[Self <: CreateUserData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

