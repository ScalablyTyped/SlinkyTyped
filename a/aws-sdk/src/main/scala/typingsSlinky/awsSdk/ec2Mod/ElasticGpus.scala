package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticGpus extends js.Object {
  /**
    * The Availability Zone in the which the Elastic Graphics accelerator resides.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The status of the Elastic Graphics accelerator.
    */
  var ElasticGpuHealth: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.ElasticGpuHealth] = js.native
  /**
    * The ID of the Elastic Graphics accelerator.
    */
  var ElasticGpuId: js.UndefOr[String] = js.native
  /**
    * The state of the Elastic Graphics accelerator.
    */
  var ElasticGpuState: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.ElasticGpuState] = js.native
  /**
    * The type of Elastic Graphics accelerator.
    */
  var ElasticGpuType: js.UndefOr[String] = js.native
  /**
    * The ID of the instance to which the Elastic Graphics accelerator is attached.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The tags assigned to the Elastic Graphics accelerator.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object ElasticGpus {
  @scala.inline
  def apply(): ElasticGpus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElasticGpus]
  }
  @scala.inline
  implicit class ElasticGpusOps[Self <: ElasticGpus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailabilityZone(value: String): Self = {
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
    def withElasticGpuHealth(value: ElasticGpuHealth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticGpuHealth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticGpuHealth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticGpuHealth")(js.undefined)
        ret
    }
    @scala.inline
    def withElasticGpuId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticGpuId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticGpuId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticGpuId")(js.undefined)
        ret
    }
    @scala.inline
    def withElasticGpuState(value: ElasticGpuState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticGpuState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticGpuState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticGpuState")(js.undefined)
        ret
    }
    @scala.inline
    def withElasticGpuType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticGpuType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticGpuType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticGpuType")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceId(value: String): Self = {
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
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

