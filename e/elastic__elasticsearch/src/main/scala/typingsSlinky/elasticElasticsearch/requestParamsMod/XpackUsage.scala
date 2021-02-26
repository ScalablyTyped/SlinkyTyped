package typingsSlinky.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XpackUsage extends Generic {
  
  var master_timeout: js.UndefOr[String] = js.native
}
object XpackUsage {
  
  @scala.inline
  def apply(): XpackUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XpackUsage]
  }
  
  @scala.inline
  implicit class XpackUsageMutableBuilder[Self <: XpackUsage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaster_timeout(value: String): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
  }
}
