package typingsSlinky.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the ListSendAs method.
  */
@js.native
trait SchemaListSendAsResponse extends js.Object {
  /**
    * List of send-as aliases.
    */
  var sendAs: js.UndefOr[js.Array[SchemaSendAs]] = js.native
}

object SchemaListSendAsResponse {
  @scala.inline
  def apply(): SchemaListSendAsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSendAsResponse]
  }
  @scala.inline
  implicit class SchemaListSendAsResponseOps[Self <: SchemaListSendAsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSendAs(value: js.Array[SchemaSendAs]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendAs")(js.undefined)
        ret
    }
  }
  
}

