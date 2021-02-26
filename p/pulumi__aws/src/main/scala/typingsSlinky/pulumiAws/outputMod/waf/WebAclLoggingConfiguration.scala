package typingsSlinky.pulumiAws.outputMod.waf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclLoggingConfiguration extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of Kinesis Firehose Delivery Stream
    */
  var logDestination: String = js.native
  
  /**
    * Configuration block containing parts of the request that you want redacted from the logs. Detailed below.
    */
  var redactedFields: js.UndefOr[WebAclLoggingConfigurationRedactedFields] = js.native
}
object WebAclLoggingConfiguration {
  
  @scala.inline
  def apply(logDestination: String): WebAclLoggingConfiguration = {
    val __obj = js.Dynamic.literal(logDestination = logDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclLoggingConfiguration]
  }
  
  @scala.inline
  implicit class WebAclLoggingConfigurationMutableBuilder[Self <: WebAclLoggingConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogDestination(value: String): Self = StObject.set(x, "logDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedactedFields(value: WebAclLoggingConfigurationRedactedFields): Self = StObject.set(x, "redactedFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedactedFieldsUndefined: Self = StObject.set(x, "redactedFields", js.undefined)
  }
}
