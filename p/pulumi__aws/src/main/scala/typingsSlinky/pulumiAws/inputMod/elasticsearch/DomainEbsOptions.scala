package typingsSlinky.pulumiAws.inputMod.elasticsearch

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainEbsOptions extends js.Object {
  /**
    * Whether EBS volumes are attached to data nodes in the domain.
    */
  var ebsEnabled: Input[Boolean] = js.native
  /**
    * The baseline input/output (I/O) performance of EBS volumes
    * attached to data nodes. Applicable only for the Provisioned IOPS EBS volume type.
    */
  var iops: js.UndefOr[Input[Double]] = js.native
  /**
    * The size of EBS volumes attached to data nodes (in GB).
    * **Required** if `ebsEnabled` is set to `true`.
    */
  var volumeSize: js.UndefOr[Input[Double]] = js.native
  /**
    * The type of EBS volumes attached to data nodes.
    */
  var volumeType: js.UndefOr[Input[String]] = js.native
}

object DomainEbsOptions {
  @scala.inline
  def apply(ebsEnabled: Input[Boolean]): DomainEbsOptions = {
    val __obj = js.Dynamic.literal(ebsEnabled = ebsEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainEbsOptions]
  }
  @scala.inline
  implicit class DomainEbsOptionsOps[Self <: DomainEbsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEbsEnabled(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ebsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIops(value: Input[Double]): Self = {
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
    def withVolumeSize(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeSize")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeType")(js.undefined)
        ret
    }
  }
  
}

