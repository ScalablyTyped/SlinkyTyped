package typingsSlinky.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetContactAttributesResponse extends js.Object {
  /**
    * Information about the attributes.
    */
  var Attributes: js.UndefOr[typingsSlinky.awsSdk.connectMod.Attributes] = js.native
}

object GetContactAttributesResponse {
  @scala.inline
  def apply(): GetContactAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContactAttributesResponse]
  }
  @scala.inline
  implicit class GetContactAttributesResponseOps[Self <: GetContactAttributesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: Attributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(js.undefined)
        ret
    }
  }
  
}

