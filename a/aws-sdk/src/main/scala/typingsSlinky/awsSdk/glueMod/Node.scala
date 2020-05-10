package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends js.Object {
  /**
    * Details of the crawler when the node represents a crawler.
    */
  var CrawlerDetails: js.UndefOr[CrawlerNodeDetails] = js.native
  /**
    * Details of the Job when the node represents a Job.
    */
  var JobDetails: js.UndefOr[JobNodeDetails] = js.native
  /**
    * The name of the AWS Glue component represented by the node.
    */
  var Name: js.UndefOr[NameString] = js.native
  /**
    * Details of the Trigger when the node represents a Trigger.
    */
  var TriggerDetails: js.UndefOr[TriggerNodeDetails] = js.native
  /**
    * The type of AWS Glue component represented by the node.
    */
  var Type: js.UndefOr[NodeType] = js.native
  /**
    * The unique Id assigned to the node within the workflow.
    */
  var UniqueId: js.UndefOr[NameString] = js.native
}

object Node {
  @scala.inline
  def apply(): Node = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrawlerDetails(value: CrawlerNodeDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CrawlerDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrawlerDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CrawlerDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withJobDetails(value: JobNodeDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerDetails(value: TriggerNodeDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TriggerDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TriggerDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: NodeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
    @scala.inline
    def withUniqueId(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UniqueId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniqueId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UniqueId")(js.undefined)
        ret
    }
  }
  
}

