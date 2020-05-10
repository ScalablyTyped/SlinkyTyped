package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceDetails extends js.Object {
  /**
    * The Amazon EC2 instances that AWS recommends that you purchase.
    */
  var EC2InstanceDetails: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.EC2InstanceDetails] = js.native
  /**
    * The Amazon ES instances that AWS recommends that you purchase.
    */
  var ESInstanceDetails: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.ESInstanceDetails] = js.native
  /**
    * The ElastiCache instances that AWS recommends that you purchase.
    */
  var ElastiCacheInstanceDetails: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.ElastiCacheInstanceDetails] = js.native
  /**
    * The Amazon RDS instances that AWS recommends that you purchase.
    */
  var RDSInstanceDetails: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.RDSInstanceDetails] = js.native
  /**
    * The Amazon Redshift instances that AWS recommends that you purchase.
    */
  var RedshiftInstanceDetails: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.RedshiftInstanceDetails] = js.native
}

object InstanceDetails {
  @scala.inline
  def apply(): InstanceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceDetails]
  }
  @scala.inline
  implicit class InstanceDetailsOps[Self <: InstanceDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEC2InstanceDetails(value: EC2InstanceDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EC2InstanceDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEC2InstanceDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EC2InstanceDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withESInstanceDetails(value: ESInstanceDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ESInstanceDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutESInstanceDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ESInstanceDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withElastiCacheInstanceDetails(value: ElastiCacheInstanceDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElastiCacheInstanceDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElastiCacheInstanceDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElastiCacheInstanceDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withRDSInstanceDetails(value: RDSInstanceDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RDSInstanceDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRDSInstanceDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RDSInstanceDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withRedshiftInstanceDetails(value: RedshiftInstanceDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RedshiftInstanceDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedshiftInstanceDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RedshiftInstanceDetails")(js.undefined)
        ret
    }
  }
  
}

