package typingsSlinky.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTargetHttpsProxiesSetQuicOverrideRequest extends js.Object {
  /**
    * QUIC policy for the TargetHttpsProxy resource.
    */
  var quicOverride: js.UndefOr[String] = js.native
}

object SchemaTargetHttpsProxiesSetQuicOverrideRequest {
  @scala.inline
  def apply(): SchemaTargetHttpsProxiesSetQuicOverrideRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetHttpsProxiesSetQuicOverrideRequest]
  }
  @scala.inline
  implicit class SchemaTargetHttpsProxiesSetQuicOverrideRequestOps[Self <: SchemaTargetHttpsProxiesSetQuicOverrideRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuicOverride(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quicOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuicOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quicOverride")(js.undefined)
        ret
    }
  }
  
}

