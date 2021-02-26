package typingsSlinky.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotGetParams extends GenericParams {
  
  var ignoreUnavailable: js.UndefOr[Boolean] = js.native
  
  var masterTimeout: js.UndefOr[TimeSpan] = js.native
  
  var repository: String = js.native
  
  var snapshot: NameList = js.native
}
object SnapshotGetParams {
  
  @scala.inline
  def apply(repository: String, snapshot: NameList): SnapshotGetParams = {
    val __obj = js.Dynamic.literal(repository = repository.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotGetParams]
  }
  
  @scala.inline
  implicit class SnapshotGetParamsMutableBuilder[Self <: SnapshotGetParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnoreUnavailable(value: Boolean): Self = StObject.set(x, "ignoreUnavailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreUnavailableUndefined: Self = StObject.set(x, "ignoreUnavailable", js.undefined)
    
    @scala.inline
    def setMasterTimeout(value: TimeSpan): Self = StObject.set(x, "masterTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterTimeoutUndefined: Self = StObject.set(x, "masterTimeout", js.undefined)
    
    @scala.inline
    def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshot(value: NameList): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotVarargs(value: String*): Self = StObject.set(x, "snapshot", js.Array(value :_*))
  }
}
