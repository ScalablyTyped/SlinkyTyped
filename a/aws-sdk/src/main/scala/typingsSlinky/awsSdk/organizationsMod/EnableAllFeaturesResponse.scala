package typingsSlinky.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableAllFeaturesResponse extends js.Object {
  /**
    * A structure that contains details about the handshake created to support this request to enable all features in the organization.
    */
  var Handshake: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.Handshake] = js.native
}

object EnableAllFeaturesResponse {
  @scala.inline
  def apply(): EnableAllFeaturesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableAllFeaturesResponse]
  }
  @scala.inline
  implicit class EnableAllFeaturesResponseOps[Self <: EnableAllFeaturesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandshake(value: Handshake): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Handshake")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandshake: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Handshake")(js.undefined)
        ret
    }
  }
  
}

