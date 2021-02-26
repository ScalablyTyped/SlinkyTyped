package typingsSlinky.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullsMergeResponseData extends StObject {
  
  var merged: Boolean = js.native
  
  var message: String = js.native
  
  var sha: String = js.native
}
object PullsMergeResponseData {
  
  @scala.inline
  def apply(merged: Boolean, message: String, sha: String): PullsMergeResponseData = {
    val __obj = js.Dynamic.literal(merged = merged.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsMergeResponseData]
  }
  
  @scala.inline
  implicit class PullsMergeResponseDataMutableBuilder[Self <: PullsMergeResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMerged(value: Boolean): Self = StObject.set(x, "merged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
  }
}
