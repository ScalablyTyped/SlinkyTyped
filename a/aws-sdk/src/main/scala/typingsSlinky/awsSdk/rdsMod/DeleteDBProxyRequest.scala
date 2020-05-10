package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDBProxyRequest extends js.Object {
  /**
    * The name of the DB proxy to delete.
    */
  var DBProxyName: String = js.native
}

object DeleteDBProxyRequest {
  @scala.inline
  def apply(DBProxyName: String): DeleteDBProxyRequest = {
    val __obj = js.Dynamic.literal(DBProxyName = DBProxyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDBProxyRequest]
  }
  @scala.inline
  implicit class DeleteDBProxyRequestOps[Self <: DeleteDBProxyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDBProxyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBProxyName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

