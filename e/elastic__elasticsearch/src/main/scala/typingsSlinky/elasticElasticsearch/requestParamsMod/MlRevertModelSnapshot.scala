package typingsSlinky.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MlRevertModelSnapshot[T] extends Generic {
  
  var body: js.UndefOr[T] = js.native
  
  var delete_intervening_results: js.UndefOr[Boolean] = js.native
  
  var job_id: String = js.native
  
  var snapshot_id: String = js.native
}
object MlRevertModelSnapshot {
  
  @scala.inline
  def apply[T](job_id: String, snapshot_id: String): MlRevertModelSnapshot[T] = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any], snapshot_id = snapshot_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlRevertModelSnapshot[T]]
  }
  
  @scala.inline
  implicit class MlRevertModelSnapshotMutableBuilder[Self <: MlRevertModelSnapshot[_], T] (val x: Self with MlRevertModelSnapshot[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setDelete_intervening_results(value: Boolean): Self = StObject.set(x, "delete_intervening_results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete_intervening_resultsUndefined: Self = StObject.set(x, "delete_intervening_results", js.undefined)
    
    @scala.inline
    def setJob_id(value: String): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshot_id(value: String): Self = StObject.set(x, "snapshot_id", value.asInstanceOf[js.Any])
  }
}
