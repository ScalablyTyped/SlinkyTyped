package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostedZoneConfig extends js.Object {
  /**
    * Any comments that you want to include about the hosted zone.
    */
  var Comment: js.UndefOr[ResourceDescription] = js.native
  /**
    * A value that indicates whether this is a private hosted zone.
    */
  var PrivateZone: js.UndefOr[IsPrivateZone] = js.native
}

object HostedZoneConfig {
  @scala.inline
  def apply(): HostedZoneConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostedZoneConfig]
  }
  @scala.inline
  implicit class HostedZoneConfigOps[Self <: HostedZoneConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComment(value: ResourceDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Comment")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateZone(value: IsPrivateZone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateZone")(js.undefined)
        ret
    }
  }
  
}

