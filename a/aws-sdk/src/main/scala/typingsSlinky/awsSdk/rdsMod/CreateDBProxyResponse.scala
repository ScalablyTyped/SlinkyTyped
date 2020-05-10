package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDBProxyResponse extends js.Object {
  /**
    * The DBProxy structure corresponding to the new proxy.
    */
  var DBProxy: js.UndefOr[typingsSlinky.awsSdk.rdsMod.DBProxy] = js.native
}

object CreateDBProxyResponse {
  @scala.inline
  def apply(): CreateDBProxyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDBProxyResponse]
  }
  @scala.inline
  implicit class CreateDBProxyResponseOps[Self <: CreateDBProxyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDBProxy(value: DBProxy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBProxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBProxy")(js.undefined)
        ret
    }
  }
  
}

