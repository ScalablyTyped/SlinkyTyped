package typingsSlinky.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowCxV3ResponseMessageLiveAgentHandoff extends StObject {
  
  /** Custom metadata for your handoff procedure. Dialogflow doesn't impose any structure on this. */
  var metadata: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typingsSlinky.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowCxV3ResponseMessageLiveAgentHandoff with TopLevel[js.Any]
  ] = js.native
}
object GoogleCloudDialogflowCxV3ResponseMessageLiveAgentHandoff {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowCxV3ResponseMessageLiveAgentHandoff = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3ResponseMessageLiveAgentHandoff]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowCxV3ResponseMessageLiveAgentHandoffMutableBuilder[Self <: GoogleCloudDialogflowCxV3ResponseMessageLiveAgentHandoff] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typingsSlinky.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowCxV3ResponseMessageLiveAgentHandoff with TopLevel[js.Any]
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
