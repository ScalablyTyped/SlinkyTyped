package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowTypeDetail extends js.Object {
  /**
    * Configuration settings of the workflow type registered through RegisterWorkflowType 
    */
  var configuration: WorkflowTypeConfiguration = js.native
  /**
    * General information about the workflow type. The status of the workflow type (returned in the WorkflowTypeInfo structure) can be one of the following.    REGISTERED – The type is registered and available. Workers supporting this type should be running.    DEPRECATED – The type was deprecated using DeprecateWorkflowType, but is still in use. You should keep workers supporting this type running. You cannot create new workflow executions of this type.  
    */
  var typeInfo: WorkflowTypeInfo = js.native
}

object WorkflowTypeDetail {
  @scala.inline
  def apply(configuration: WorkflowTypeConfiguration, typeInfo: WorkflowTypeInfo): WorkflowTypeDetail = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], typeInfo = typeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowTypeDetail]
  }
  @scala.inline
  implicit class WorkflowTypeDetailOps[Self <: WorkflowTypeDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfiguration(value: WorkflowTypeConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeInfo(value: WorkflowTypeInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeInfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

