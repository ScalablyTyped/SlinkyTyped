package typingsSlinky.pulumiAws.getAutoscalingGroupsMod

import typingsSlinky.pulumiAws.outputMod.GetAutoscalingGroupsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAutoscalingGroupsResult extends js.Object {
  /**
    * A list of the Autoscaling Groups Arns in the current region.
    */
  val arns: js.Array[String] = js.native
  val filters: js.UndefOr[js.Array[GetAutoscalingGroupsFilter]] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * A list of the Autoscaling Groups in the current region.
    */
  val names: js.Array[String] = js.native
}

object GetAutoscalingGroupsResult {
  @scala.inline
  def apply(arns: js.Array[String], id: String, names: js.Array[String]): GetAutoscalingGroupsResult = {
    val __obj = js.Dynamic.literal(arns = arns.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAutoscalingGroupsResult]
  }
  @scala.inline
  implicit class GetAutoscalingGroupsResultOps[Self <: GetAutoscalingGroupsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilters(value: js.Array[GetAutoscalingGroupsFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
  }
  
}

