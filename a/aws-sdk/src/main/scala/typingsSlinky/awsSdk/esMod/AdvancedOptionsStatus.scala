package typingsSlinky.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdvancedOptionsStatus extends StObject {
  
  /**
    *  Specifies the status of advanced options for the specified Elasticsearch domain.
    */
  var Options: AdvancedOptions = js.native
  
  /**
    *  Specifies the status of OptionStatus for advanced options for the specified Elasticsearch domain.
    */
  var Status: OptionStatus = js.native
}
object AdvancedOptionsStatus {
  
  @scala.inline
  def apply(Options: AdvancedOptions, Status: OptionStatus): AdvancedOptionsStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvancedOptionsStatus]
  }
  
  @scala.inline
  implicit class AdvancedOptionsStatusMutableBuilder[Self <: AdvancedOptionsStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: AdvancedOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: OptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
