package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposCreateFileParamsCommitter extends js.Object {
  /**
    * The email of the author or committer of the commit. You'll receive a `422` status code if `email` is omitted.
    */
  var email: String = js.native
  /**
    * The name of the author or committer of the commit. You'll receive a `422` status code if `name` is omitted.
    */
  var name: String = js.native
}

object ReposCreateFileParamsCommitter {
  @scala.inline
  def apply(email: String, name: String): ReposCreateFileParamsCommitter = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateFileParamsCommitter]
  }
  @scala.inline
  implicit class ReposCreateFileParamsCommitterOps[Self <: ReposCreateFileParamsCommitter] (val x: Self) extends AnyVal {
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

