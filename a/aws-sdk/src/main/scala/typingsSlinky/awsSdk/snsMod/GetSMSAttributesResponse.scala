package typingsSlinky.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSMSAttributesResponse extends js.Object {
  /**
    * The SMS attribute names and their values.
    */
  var attributes: js.UndefOr[MapStringToString] = js.native
}

object GetSMSAttributesResponse {
  @scala.inline
  def apply(): GetSMSAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSMSAttributesResponse]
  }
  @scala.inline
  implicit class GetSMSAttributesResponseOps[Self <: GetSMSAttributesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: MapStringToString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
  }
  
}

