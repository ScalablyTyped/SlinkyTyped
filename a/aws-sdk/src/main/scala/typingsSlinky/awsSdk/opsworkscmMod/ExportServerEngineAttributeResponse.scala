package typingsSlinky.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportServerEngineAttributeResponse extends js.Object {
  /**
    * The requested engine attribute pair with attribute name and value.
    */
  var EngineAttribute: js.UndefOr[typingsSlinky.awsSdk.opsworkscmMod.EngineAttribute] = js.native
  /**
    * The server name used in the request.
    */
  var ServerName: js.UndefOr[typingsSlinky.awsSdk.opsworkscmMod.ServerName] = js.native
}

object ExportServerEngineAttributeResponse {
  @scala.inline
  def apply(): ExportServerEngineAttributeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportServerEngineAttributeResponse]
  }
  @scala.inline
  implicit class ExportServerEngineAttributeResponseOps[Self <: ExportServerEngineAttributeResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEngineAttribute(value: EngineAttribute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withServerName(value: ServerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerName")(js.undefined)
        ret
    }
  }
  
}

