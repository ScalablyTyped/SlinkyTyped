package typingsSlinky.awsSdk.anon

import typingsSlinky.awsSdk.ecsMod.String
import typingsSlinky.awsSdk.ecsMod.StringList
import typingsSlinky.awsSdk.ecsMod.TaskField
import typingsSlinky.awsSdk.ecsMod.TaskFieldList
import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/ecs.DescribeTasksRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
@js.native
trait DescribeTasksRequestwaite extends js.Object {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the task or tasks to describe. If you do not specify a cluster, the default cluster is assumed. This parameter is required if the task or tasks you are describing were launched in any cluster other than the default cluster.
    */
  var cluster: js.UndefOr[String] = js.native
  
  /**
    * Specifies whether you want to see the resource tags for the task. If TAGS is specified, the tags are included in the response. If this field is omitted, tags are not included in the response.
    */
  var include: js.UndefOr[TaskFieldList] = js.native
  
  /**
    * A list of up to 100 task IDs or full ARN entries.
    */
  var tasks: StringList = js.native
}
object DescribeTasksRequestwaite {
  
  @scala.inline
  def apply(tasks: StringList): DescribeTasksRequestwaite = {
    val __obj = js.Dynamic.literal(tasks = tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTasksRequestwaite]
  }
  
  @scala.inline
  implicit class DescribeTasksRequestwaiteOps[Self <: DescribeTasksRequestwaite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTasksVarargs(value: String*): Self = this.set("tasks", js.Array(value :_*))
    
    @scala.inline
    def setTasks(value: StringList): Self = this.set("tasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$waiter(value: WaiterConfiguration): Self = this.set("$waiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$waiter: Self = this.set("$waiter", js.undefined)
    
    @scala.inline
    def setCluster(value: String): Self = this.set("cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCluster: Self = this.set("cluster", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: TaskField*): Self = this.set("include", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: TaskFieldList): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
  }
}
