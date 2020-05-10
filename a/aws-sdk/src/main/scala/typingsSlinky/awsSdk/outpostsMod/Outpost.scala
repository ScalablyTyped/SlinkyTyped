package typingsSlinky.awsSdk.outpostsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Outpost extends js.Object {
  var AvailabilityZone: js.UndefOr[typingsSlinky.awsSdk.outpostsMod.AvailabilityZone] = js.native
  var AvailabilityZoneId: js.UndefOr[typingsSlinky.awsSdk.outpostsMod.AvailabilityZoneId] = js.native
  var Description: js.UndefOr[OutpostDescription] = js.native
  var LifeCycleStatus: js.UndefOr[typingsSlinky.awsSdk.outpostsMod.LifeCycleStatus] = js.native
  var Name: js.UndefOr[OutpostName] = js.native
  var OutpostArn: js.UndefOr[typingsSlinky.awsSdk.outpostsMod.OutpostArn] = js.native
  var OutpostId: js.UndefOr[typingsSlinky.awsSdk.outpostsMod.OutpostId] = js.native
  var OwnerId: js.UndefOr[typingsSlinky.awsSdk.outpostsMod.OwnerId] = js.native
  var SiteId: js.UndefOr[typingsSlinky.awsSdk.outpostsMod.SiteId] = js.native
}

object Outpost {
  @scala.inline
  def apply(): Outpost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Outpost]
  }
  @scala.inline
  implicit class OutpostOps[Self <: Outpost] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailabilityZone(value: AvailabilityZone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailabilityZoneId(value: AvailabilityZoneId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZoneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZoneId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZoneId")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: OutpostDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withLifeCycleStatus(value: LifeCycleStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LifeCycleStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifeCycleStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LifeCycleStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: OutpostName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withOutpostArn(value: OutpostArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutpostArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutpostArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutpostArn")(js.undefined)
        ret
    }
    @scala.inline
    def withOutpostId(value: OutpostId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutpostId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutpostId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutpostId")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerId(value: OwnerId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(js.undefined)
        ret
    }
    @scala.inline
    def withSiteId(value: SiteId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SiteId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSiteId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SiteId")(js.undefined)
        ret
    }
  }
  
}

