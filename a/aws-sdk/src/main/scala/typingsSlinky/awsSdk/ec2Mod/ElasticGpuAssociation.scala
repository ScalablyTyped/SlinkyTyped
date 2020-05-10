package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticGpuAssociation extends js.Object {
  /**
    * The ID of the association.
    */
  var ElasticGpuAssociationId: js.UndefOr[String] = js.native
  /**
    * The state of the association between the instance and the Elastic Graphics accelerator.
    */
  var ElasticGpuAssociationState: js.UndefOr[String] = js.native
  /**
    * The time the Elastic Graphics accelerator was associated with the instance.
    */
  var ElasticGpuAssociationTime: js.UndefOr[String] = js.native
  /**
    * The ID of the Elastic Graphics accelerator.
    */
  var ElasticGpuId: js.UndefOr[String] = js.native
}

object ElasticGpuAssociation {
  @scala.inline
  def apply(): ElasticGpuAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElasticGpuAssociation]
  }
  @scala.inline
  implicit class ElasticGpuAssociationOps[Self <: ElasticGpuAssociation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElasticGpuAssociationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticGpuAssociationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticGpuAssociationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticGpuAssociationId")(js.undefined)
        ret
    }
    @scala.inline
    def withElasticGpuAssociationState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticGpuAssociationState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticGpuAssociationState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticGpuAssociationState")(js.undefined)
        ret
    }
    @scala.inline
    def withElasticGpuAssociationTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticGpuAssociationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticGpuAssociationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticGpuAssociationTime")(js.undefined)
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
  }
  
}

