package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsersGetContextForUserResponseContextsItem extends js.Object {
  var message: String = js.native
  var octicon: String = js.native
}

object UsersGetContextForUserResponseContextsItem {
  @scala.inline
  def apply(message: String, octicon: String): UsersGetContextForUserResponseContextsItem = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], octicon = octicon.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersGetContextForUserResponseContextsItem]
  }
  @scala.inline
  implicit class UsersGetContextForUserResponseContextsItemOps[Self <: UsersGetContextForUserResponseContextsItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOcticon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("octicon")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

