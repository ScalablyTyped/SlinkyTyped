package typingsSlinky.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTaskSetsRequest extends StObject {
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task sets exist in.
    */
  var cluster: String = js.native
  
  /**
    * Specifies whether to see the resource tags for the task set. If TAGS is specified, the tags are included in the response. If this field is omitted, tags are not included in the response.
    */
  var include: js.UndefOr[TaskSetFieldList] = js.native
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the service that the task sets exist in.
    */
  var service: String = js.native
  
  /**
    * The ID or full Amazon Resource Name (ARN) of task sets to describe.
    */
  var taskSets: js.UndefOr[StringList] = js.native
}
object DescribeTaskSetsRequest {
  
  @scala.inline
  def apply(cluster: String, service: String): DescribeTaskSetsRequest = {
    val __obj = js.Dynamic.literal(cluster = cluster.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTaskSetsRequest]
  }
  
  @scala.inline
  implicit class DescribeTaskSetsRequestMutableBuilder[Self <: DescribeTaskSetsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude(value: TaskSetFieldList): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: TaskSetField*): Self = StObject.set(x, "include", js.Array(value :_*))
    
    @scala.inline
    def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskSets(value: StringList): Self = StObject.set(x, "taskSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskSetsUndefined: Self = StObject.set(x, "taskSets", js.undefined)
    
    @scala.inline
    def setTaskSetsVarargs(value: String*): Self = StObject.set(x, "taskSets", js.Array(value :_*))
  }
}
