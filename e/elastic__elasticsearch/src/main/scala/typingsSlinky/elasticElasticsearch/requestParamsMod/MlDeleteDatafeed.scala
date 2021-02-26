package typingsSlinky.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MlDeleteDatafeed extends Generic {
  
  var datafeed_id: String = js.native
  
  var force: js.UndefOr[Boolean] = js.native
}
object MlDeleteDatafeed {
  
  @scala.inline
  def apply(datafeed_id: String): MlDeleteDatafeed = {
    val __obj = js.Dynamic.literal(datafeed_id = datafeed_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDeleteDatafeed]
  }
  
  @scala.inline
  implicit class MlDeleteDatafeedMutableBuilder[Self <: MlDeleteDatafeed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatafeed_id(value: String): Self = StObject.set(x, "datafeed_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
  }
}
