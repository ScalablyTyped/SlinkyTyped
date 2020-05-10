package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetWorkflowRequest extends js.Object {
  /**
    * Specifies whether to include a graph when returning the workflow resource metadata.
    */
  var IncludeGraph: js.UndefOr[NullableBoolean] = js.native
  /**
    * The name of the workflow to retrieve.
    */
  var Name: NameString = js.native
}

object GetWorkflowRequest {
  @scala.inline
  def apply(Name: NameString): GetWorkflowRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkflowRequest]
  }
  @scala.inline
  implicit class GetWorkflowRequestOps[Self <: GetWorkflowRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeGraph(value: NullableBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeGraph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeGraph: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeGraph")(js.undefined)
        ret
    }
  }
  
}

