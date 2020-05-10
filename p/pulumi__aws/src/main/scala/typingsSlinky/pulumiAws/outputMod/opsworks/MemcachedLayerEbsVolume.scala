package typingsSlinky.pulumiAws.outputMod.opsworks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemcachedLayerEbsVolume extends js.Object {
  var encrypted: js.UndefOr[Boolean] = js.native
  var iops: js.UndefOr[Double] = js.native
  var mountPoint: String = js.native
  var numberOfDisks: Double = js.native
  var raidLevel: js.UndefOr[String] = js.native
  var size: Double = js.native
  var `type`: js.UndefOr[String] = js.native
}

object MemcachedLayerEbsVolume {
  @scala.inline
  def apply(mountPoint: String, numberOfDisks: Double, size: Double): MemcachedLayerEbsVolume = {
    val __obj = js.Dynamic.literal(mountPoint = mountPoint.asInstanceOf[js.Any], numberOfDisks = numberOfDisks.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemcachedLayerEbsVolume]
  }
  @scala.inline
  implicit class MemcachedLayerEbsVolumeOps[Self <: MemcachedLayerEbsVolume] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMountPoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberOfDisks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfDisks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncrypted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encrypted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncrypted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encrypted")(js.undefined)
        ret
    }
    @scala.inline
    def withIops(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIops: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iops")(js.undefined)
        ret
    }
    @scala.inline
    def withRaidLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raidLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaidLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raidLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

