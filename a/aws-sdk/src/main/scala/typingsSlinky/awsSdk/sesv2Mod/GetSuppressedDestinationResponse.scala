package typingsSlinky.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSuppressedDestinationResponse extends js.Object {
  /**
    * An object containing information about the suppressed email address.
    */
  var SuppressedDestination: typingsSlinky.awsSdk.sesv2Mod.SuppressedDestination = js.native
}

object GetSuppressedDestinationResponse {
  @scala.inline
  def apply(SuppressedDestination: SuppressedDestination): GetSuppressedDestinationResponse = {
    val __obj = js.Dynamic.literal(SuppressedDestination = SuppressedDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSuppressedDestinationResponse]
  }
  @scala.inline
  implicit class GetSuppressedDestinationResponseOps[Self <: GetSuppressedDestinationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuppressedDestination(value: SuppressedDestination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuppressedDestination")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

