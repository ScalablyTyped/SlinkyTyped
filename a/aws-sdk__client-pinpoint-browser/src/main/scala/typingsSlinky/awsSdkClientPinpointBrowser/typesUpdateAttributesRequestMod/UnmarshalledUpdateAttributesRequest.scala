package typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateAttributesRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledUpdateAttributesRequest extends UpdateAttributesRequest {
  /**
    * The GLOB wildcard for removing the attributes in the application
    */
  @JSName("Blacklist")
  var Blacklist_UnmarshalledUpdateAttributesRequest: js.UndefOr[js.Array[String]] = js.native
}

object UnmarshalledUpdateAttributesRequest {
  @scala.inline
  def apply(): UnmarshalledUpdateAttributesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledUpdateAttributesRequest]
  }
  @scala.inline
  implicit class UnmarshalledUpdateAttributesRequestOps[Self <: UnmarshalledUpdateAttributesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlacklist(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Blacklist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlacklist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Blacklist")(js.undefined)
        ret
    }
  }
  
}

