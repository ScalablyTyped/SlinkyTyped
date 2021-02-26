package typingsSlinky.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedConfigurationTemplate extends StObject {
  
  /** Optional, a map containing configuration variables defined for the configuration. */
  var configurationVariables: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typingsSlinky.maximMazurokGapiClientAndroidmanagement.maximMazurokGapiClientAndroidmanagementStrings.ManagedConfigurationTemplate with TopLevel[js.Any]
  ] = js.native
  
  /** The ID of the managed configurations template. */
  var templateId: js.UndefOr[String] = js.native
}
object ManagedConfigurationTemplate {
  
  @scala.inline
  def apply(): ManagedConfigurationTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedConfigurationTemplate]
  }
  
  @scala.inline
  implicit class ManagedConfigurationTemplateMutableBuilder[Self <: ManagedConfigurationTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationVariables(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typingsSlinky.maximMazurokGapiClientAndroidmanagement.maximMazurokGapiClientAndroidmanagementStrings.ManagedConfigurationTemplate with TopLevel[js.Any]
    ): Self = StObject.set(x, "configurationVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationVariablesUndefined: Self = StObject.set(x, "configurationVariables", js.undefined)
    
    @scala.inline
    def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
  }
}
