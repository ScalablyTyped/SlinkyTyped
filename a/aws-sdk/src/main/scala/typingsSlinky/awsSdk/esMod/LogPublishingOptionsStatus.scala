package typingsSlinky.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogPublishingOptionsStatus extends StObject {
  
  /**
    * The log publishing options configured for the Elasticsearch domain.
    */
  var Options: js.UndefOr[LogPublishingOptions] = js.native
  
  /**
    * The status of the log publishing options for the Elasticsearch domain. See OptionStatus for the status information that's included. 
    */
  var Status: js.UndefOr[OptionStatus] = js.native
}
object LogPublishingOptionsStatus {
  
  @scala.inline
  def apply(): LogPublishingOptionsStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogPublishingOptionsStatus]
  }
  
  @scala.inline
  implicit class LogPublishingOptionsStatusMutableBuilder[Self <: LogPublishingOptionsStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: LogPublishingOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    @scala.inline
    def setStatus(value: OptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
