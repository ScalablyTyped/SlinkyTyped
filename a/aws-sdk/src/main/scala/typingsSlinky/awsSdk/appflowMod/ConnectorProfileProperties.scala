package typingsSlinky.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectorProfileProperties extends StObject {
  
  /**
    *  The connector-specific properties required by Amplitude. 
    */
  var Amplitude: js.UndefOr[AmplitudeConnectorProfileProperties] = js.native
  
  /**
    *  The connector-specific properties required by Datadog. 
    */
  var Datadog: js.UndefOr[DatadogConnectorProfileProperties] = js.native
  
  /**
    *  The connector-specific properties required by Dynatrace. 
    */
  var Dynatrace: js.UndefOr[DynatraceConnectorProfileProperties] = js.native
  
  /**
    *  The connector-specific properties required Google Analytics. 
    */
  var GoogleAnalytics: js.UndefOr[GoogleAnalyticsConnectorProfileProperties] = js.native
  
  /**
    *  The connector-specific properties required by Infor Nexus. 
    */
  var InforNexus: js.UndefOr[InforNexusConnectorProfileProperties] = js.native
  
  /**
    *  The connector-specific properties required by Marketo. 
    */
  var Marketo: js.UndefOr[MarketoConnectorProfileProperties] = js.native
  
  /**
    *  The connector-specific properties required by Amazon Redshift. 
    */
  var Redshift: js.UndefOr[RedshiftConnectorProfileProperties] = js.native
  
  /**
    *  The connector-specific properties required by Salesforce. 
    */
  var Salesforce: js.UndefOr[SalesforceConnectorProfileProperties] = js.native
  
  /**
    *  The connector-specific properties required by serviceNow. 
    */
  var ServiceNow: js.UndefOr[ServiceNowConnectorProfileProperties] = js.native
  
  /**
    *  The connector-specific properties required by Singular. 
    */
  var Singular: js.UndefOr[SingularConnectorProfileProperties] = js.native
  
  /**
    *  The connector-specific properties required by Slack. 
    */
  var Slack: js.UndefOr[SlackConnectorProfileProperties] = js.native
  
  /**
    *  The connector-specific properties required by Snowflake. 
    */
  var Snowflake: js.UndefOr[SnowflakeConnectorProfileProperties] = js.native
  
  /**
    *  The connector-specific properties required by Trend Micro. 
    */
  var Trendmicro: js.UndefOr[TrendmicroConnectorProfileProperties] = js.native
  
  /**
    *  The connector-specific properties required by Veeva. 
    */
  var Veeva: js.UndefOr[VeevaConnectorProfileProperties] = js.native
  
  /**
    *  The connector-specific properties required by Zendesk. 
    */
  var Zendesk: js.UndefOr[ZendeskConnectorProfileProperties] = js.native
}
object ConnectorProfileProperties {
  
  @scala.inline
  def apply(): ConnectorProfileProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorProfileProperties]
  }
  
  @scala.inline
  implicit class ConnectorProfilePropertiesMutableBuilder[Self <: ConnectorProfileProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmplitude(value: AmplitudeConnectorProfileProperties): Self = StObject.set(x, "Amplitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmplitudeUndefined: Self = StObject.set(x, "Amplitude", js.undefined)
    
    @scala.inline
    def setDatadog(value: DatadogConnectorProfileProperties): Self = StObject.set(x, "Datadog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatadogUndefined: Self = StObject.set(x, "Datadog", js.undefined)
    
    @scala.inline
    def setDynatrace(value: DynatraceConnectorProfileProperties): Self = StObject.set(x, "Dynatrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynatraceUndefined: Self = StObject.set(x, "Dynatrace", js.undefined)
    
    @scala.inline
    def setGoogleAnalytics(value: GoogleAnalyticsConnectorProfileProperties): Self = StObject.set(x, "GoogleAnalytics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogleAnalyticsUndefined: Self = StObject.set(x, "GoogleAnalytics", js.undefined)
    
    @scala.inline
    def setInforNexus(value: InforNexusConnectorProfileProperties): Self = StObject.set(x, "InforNexus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInforNexusUndefined: Self = StObject.set(x, "InforNexus", js.undefined)
    
    @scala.inline
    def setMarketo(value: MarketoConnectorProfileProperties): Self = StObject.set(x, "Marketo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarketoUndefined: Self = StObject.set(x, "Marketo", js.undefined)
    
    @scala.inline
    def setRedshift(value: RedshiftConnectorProfileProperties): Self = StObject.set(x, "Redshift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedshiftUndefined: Self = StObject.set(x, "Redshift", js.undefined)
    
    @scala.inline
    def setSalesforce(value: SalesforceConnectorProfileProperties): Self = StObject.set(x, "Salesforce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSalesforceUndefined: Self = StObject.set(x, "Salesforce", js.undefined)
    
    @scala.inline
    def setServiceNow(value: ServiceNowConnectorProfileProperties): Self = StObject.set(x, "ServiceNow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNowUndefined: Self = StObject.set(x, "ServiceNow", js.undefined)
    
    @scala.inline
    def setSingular(value: SingularConnectorProfileProperties): Self = StObject.set(x, "Singular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingularUndefined: Self = StObject.set(x, "Singular", js.undefined)
    
    @scala.inline
    def setSlack(value: SlackConnectorProfileProperties): Self = StObject.set(x, "Slack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlackUndefined: Self = StObject.set(x, "Slack", js.undefined)
    
    @scala.inline
    def setSnowflake(value: SnowflakeConnectorProfileProperties): Self = StObject.set(x, "Snowflake", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnowflakeUndefined: Self = StObject.set(x, "Snowflake", js.undefined)
    
    @scala.inline
    def setTrendmicro(value: TrendmicroConnectorProfileProperties): Self = StObject.set(x, "Trendmicro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrendmicroUndefined: Self = StObject.set(x, "Trendmicro", js.undefined)
    
    @scala.inline
    def setVeeva(value: VeevaConnectorProfileProperties): Self = StObject.set(x, "Veeva", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVeevaUndefined: Self = StObject.set(x, "Veeva", js.undefined)
    
    @scala.inline
    def setZendesk(value: ZendeskConnectorProfileProperties): Self = StObject.set(x, "Zendesk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZendeskUndefined: Self = StObject.set(x, "Zendesk", js.undefined)
  }
}
