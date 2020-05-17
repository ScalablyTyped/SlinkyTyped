package typingsSlinky.arangodb.anon

import typingsSlinky.arangodb.arangodbStrings.applicationSlashjson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accept extends js.Object {
  var accept: applicationSlashjson = js.native
  var authorization: String = js.native
}

object Accept {
  @scala.inline
  def apply(accept: applicationSlashjson, authorization: String): Accept = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], authorization = authorization.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accept]
  }
  @scala.inline
  implicit class AcceptOps[Self <: Accept] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccept(value: applicationSlashjson): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthorization(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorization")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

