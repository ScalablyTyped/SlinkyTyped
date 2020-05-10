package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceSpecification extends js.Object {
  /**
    * Excludes the root volume from being snapshotted.
    */
  var ExcludeBootVolume: js.UndefOr[Boolean] = js.native
  /**
    * The instance to specify which volumes should be snapshotted.
    */
  var InstanceId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.InstanceId] = js.native
}

object InstanceSpecification {
  @scala.inline
  def apply(): InstanceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceSpecification]
  }
  @scala.inline
  implicit class InstanceSpecificationOps[Self <: InstanceSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcludeBootVolume(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExcludeBootVolume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeBootVolume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExcludeBootVolume")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceId(value: InstanceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(js.undefined)
        ret
    }
  }
  
}

