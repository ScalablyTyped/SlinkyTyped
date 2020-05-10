package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticInferenceAcceleratorAssociation extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the elastic inference accelerator. 
    */
  var ElasticInferenceAcceleratorArn: js.UndefOr[String] = js.native
  /**
    *  The ID of the association. 
    */
  var ElasticInferenceAcceleratorAssociationId: js.UndefOr[String] = js.native
  /**
    *  The state of the elastic inference accelerator. 
    */
  var ElasticInferenceAcceleratorAssociationState: js.UndefOr[String] = js.native
  /**
    *  The time at which the elastic inference accelerator is associated with an instance. 
    */
  var ElasticInferenceAcceleratorAssociationTime: js.UndefOr[js.Date] = js.native
}

object ElasticInferenceAcceleratorAssociation {
  @scala.inline
  def apply(): ElasticInferenceAcceleratorAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElasticInferenceAcceleratorAssociation]
  }
  @scala.inline
  implicit class ElasticInferenceAcceleratorAssociationOps[Self <: ElasticInferenceAcceleratorAssociation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElasticInferenceAcceleratorArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticInferenceAcceleratorArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticInferenceAcceleratorArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticInferenceAcceleratorArn")(js.undefined)
        ret
    }
    @scala.inline
    def withElasticInferenceAcceleratorAssociationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticInferenceAcceleratorAssociationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticInferenceAcceleratorAssociationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticInferenceAcceleratorAssociationId")(js.undefined)
        ret
    }
    @scala.inline
    def withElasticInferenceAcceleratorAssociationState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticInferenceAcceleratorAssociationState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticInferenceAcceleratorAssociationState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticInferenceAcceleratorAssociationState")(js.undefined)
        ret
    }
    @scala.inline
    def withElasticInferenceAcceleratorAssociationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticInferenceAcceleratorAssociationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticInferenceAcceleratorAssociationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticInferenceAcceleratorAssociationTime")(js.undefined)
        ret
    }
  }
  
}

