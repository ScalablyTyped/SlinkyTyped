package typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateAttributesRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAttributesRequest extends js.Object {
  /**
    * The GLOB wildcard for removing the attributes in the application
    */
  var Blacklist: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.native
}

object UpdateAttributesRequest {
  @scala.inline
  def apply(): UpdateAttributesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAttributesRequest]
  }
  @scala.inline
  implicit class UpdateAttributesRequestOps[Self <: UpdateAttributesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlacklistIterable(value: js.Iterable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Blacklist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlacklist(value: js.Array[String] | js.Iterable[String]): Self = {
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

