package typingsSlinky.pulumiAws.inputMod.wafv2

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclLoggingConfigurationRedactedFieldSingleHeader extends StObject {
  
  /**
    * The name of the query header to redact. This setting must be provided as lower case characters.
    */
  var name: Input[String] = js.native
}
object WebAclLoggingConfigurationRedactedFieldSingleHeader {
  
  @scala.inline
  def apply(name: Input[String]): WebAclLoggingConfigurationRedactedFieldSingleHeader = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclLoggingConfigurationRedactedFieldSingleHeader]
  }
  
  @scala.inline
  implicit class WebAclLoggingConfigurationRedactedFieldSingleHeaderMutableBuilder[Self <: WebAclLoggingConfigurationRedactedFieldSingleHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
