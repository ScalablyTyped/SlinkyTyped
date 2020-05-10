package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyDBProxyResponse extends js.Object {
  /**
    * The DBProxy object representing the new settings for the proxy.
    */
  var DBProxy: js.UndefOr[typingsSlinky.awsSdk.rdsMod.DBProxy] = js.native
}

object ModifyDBProxyResponse {
  @scala.inline
  def apply(): ModifyDBProxyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyDBProxyResponse]
  }
  @scala.inline
  implicit class ModifyDBProxyResponseOps[Self <: ModifyDBProxyResponse] (val x: Self) extends AnyVal {
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

