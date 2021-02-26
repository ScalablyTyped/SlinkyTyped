package typingsSlinky.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MlOpenJob extends Generic {
  
  var job_id: String = js.native
}
object MlOpenJob {
  
  @scala.inline
  def apply(job_id: String): MlOpenJob = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlOpenJob]
  }
  
  @scala.inline
  implicit class MlOpenJobMutableBuilder[Self <: MlOpenJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJob_id(value: String): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
  }
}
