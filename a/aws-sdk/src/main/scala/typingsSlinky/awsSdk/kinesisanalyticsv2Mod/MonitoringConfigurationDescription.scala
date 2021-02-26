package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitoringConfigurationDescription extends StObject {
  
  /**
    * Describes whether to use the default CloudWatch logging configuration for an application.
    */
  var ConfigurationType: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ConfigurationType] = js.native
  
  /**
    * Describes the verbosity of the CloudWatch Logs for an application.
    */
  var LogLevel: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.LogLevel] = js.native
  
  /**
    * Describes the granularity of the CloudWatch Logs for an application.
    */
  var MetricsLevel: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.MetricsLevel] = js.native
}
object MonitoringConfigurationDescription {
  
  @scala.inline
  def apply(): MonitoringConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitoringConfigurationDescription]
  }
  
  @scala.inline
  implicit class MonitoringConfigurationDescriptionMutableBuilder[Self <: MonitoringConfigurationDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationType(value: ConfigurationType): Self = StObject.set(x, "ConfigurationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationTypeUndefined: Self = StObject.set(x, "ConfigurationType", js.undefined)
    
    @scala.inline
    def setLogLevel(value: LogLevel): Self = StObject.set(x, "LogLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogLevelUndefined: Self = StObject.set(x, "LogLevel", js.undefined)
    
    @scala.inline
    def setMetricsLevel(value: MetricsLevel): Self = StObject.set(x, "MetricsLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsLevelUndefined: Self = StObject.set(x, "MetricsLevel", js.undefined)
  }
}
