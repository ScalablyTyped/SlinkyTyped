package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationConfigurationDescription extends StObject {
  
  /**
    * The details about the application code for a Flink-based Kinesis Data Analytics application.
    */
  var ApplicationCodeConfigurationDescription: js.UndefOr[
    typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationCodeConfigurationDescription
  ] = js.native
  
  /**
    * Describes whether snapshots are enabled for a Flink-based Kinesis Data Analytics application.
    */
  var ApplicationSnapshotConfigurationDescription: js.UndefOr[
    typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationSnapshotConfigurationDescription
  ] = js.native
  
  /**
    * Describes execution properties for a Flink-based Kinesis Data Analytics application.
    */
  var EnvironmentPropertyDescriptions: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.EnvironmentPropertyDescriptions] = js.native
  
  /**
    * The details about a Flink-based Kinesis Data Analytics application.
    */
  var FlinkApplicationConfigurationDescription: js.UndefOr[
    typingsSlinky.awsSdk.kinesisanalyticsv2Mod.FlinkApplicationConfigurationDescription
  ] = js.native
  
  /**
    * The details about the starting properties for a Kinesis Data Analytics application.
    */
  var RunConfigurationDescription: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.RunConfigurationDescription] = js.native
  
  /**
    * The details about inputs, outputs, and reference data sources for a SQL-based Kinesis Data Analytics application.
    */
  var SqlApplicationConfigurationDescription: js.UndefOr[
    typingsSlinky.awsSdk.kinesisanalyticsv2Mod.SqlApplicationConfigurationDescription
  ] = js.native
  
  /**
    * The array of descriptions of VPC configurations available to the application.
    */
  var VpcConfigurationDescriptions: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.VpcConfigurationDescriptions] = js.native
}
object ApplicationConfigurationDescription {
  
  @scala.inline
  def apply(): ApplicationConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationConfigurationDescription]
  }
  
  @scala.inline
  implicit class ApplicationConfigurationDescriptionMutableBuilder[Self <: ApplicationConfigurationDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationCodeConfigurationDescription(value: ApplicationCodeConfigurationDescription): Self = StObject.set(x, "ApplicationCodeConfigurationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationCodeConfigurationDescriptionUndefined: Self = StObject.set(x, "ApplicationCodeConfigurationDescription", js.undefined)
    
    @scala.inline
    def setApplicationSnapshotConfigurationDescription(value: ApplicationSnapshotConfigurationDescription): Self = StObject.set(x, "ApplicationSnapshotConfigurationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationSnapshotConfigurationDescriptionUndefined: Self = StObject.set(x, "ApplicationSnapshotConfigurationDescription", js.undefined)
    
    @scala.inline
    def setEnvironmentPropertyDescriptions(value: EnvironmentPropertyDescriptions): Self = StObject.set(x, "EnvironmentPropertyDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentPropertyDescriptionsUndefined: Self = StObject.set(x, "EnvironmentPropertyDescriptions", js.undefined)
    
    @scala.inline
    def setFlinkApplicationConfigurationDescription(value: FlinkApplicationConfigurationDescription): Self = StObject.set(x, "FlinkApplicationConfigurationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlinkApplicationConfigurationDescriptionUndefined: Self = StObject.set(x, "FlinkApplicationConfigurationDescription", js.undefined)
    
    @scala.inline
    def setRunConfigurationDescription(value: RunConfigurationDescription): Self = StObject.set(x, "RunConfigurationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunConfigurationDescriptionUndefined: Self = StObject.set(x, "RunConfigurationDescription", js.undefined)
    
    @scala.inline
    def setSqlApplicationConfigurationDescription(value: SqlApplicationConfigurationDescription): Self = StObject.set(x, "SqlApplicationConfigurationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlApplicationConfigurationDescriptionUndefined: Self = StObject.set(x, "SqlApplicationConfigurationDescription", js.undefined)
    
    @scala.inline
    def setVpcConfigurationDescriptions(value: VpcConfigurationDescriptions): Self = StObject.set(x, "VpcConfigurationDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConfigurationDescriptionsUndefined: Self = StObject.set(x, "VpcConfigurationDescriptions", js.undefined)
    
    @scala.inline
    def setVpcConfigurationDescriptionsVarargs(value: VpcConfigurationDescription*): Self = StObject.set(x, "VpcConfigurationDescriptions", js.Array(value :_*))
  }
}
