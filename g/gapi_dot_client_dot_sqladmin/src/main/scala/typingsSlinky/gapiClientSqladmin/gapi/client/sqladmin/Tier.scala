package typingsSlinky.gapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tier extends js.Object {
  /** The maximum disk size of this tier in bytes. */
  var DiskQuota: js.UndefOr[String] = js.native
  /** The maximum RAM usage of this tier in bytes. */
  var RAM: js.UndefOr[String] = js.native
  /** This is always sql#tier. */
  var kind: js.UndefOr[String] = js.native
  /** The applicable regions for this tier. */
  var region: js.UndefOr[js.Array[String]] = js.native
  /** An identifier for the service tier, for example D1, D2 etc. For related information, see Pricing. */
  var tier: js.UndefOr[String] = js.native
}

object Tier {
  @scala.inline
  def apply(): Tier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tier]
  }
  @scala.inline
  implicit class TierOps[Self <: Tier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiskQuota(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiskQuota")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskQuota: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiskQuota")(js.undefined)
        ret
    }
    @scala.inline
    def withRAM(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RAM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRAM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RAM")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withTier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tier")(js.undefined)
        ret
    }
  }
  
}

