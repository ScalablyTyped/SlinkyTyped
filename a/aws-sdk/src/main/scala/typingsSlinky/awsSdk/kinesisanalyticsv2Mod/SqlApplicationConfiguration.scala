package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqlApplicationConfiguration extends StObject {
  
  /**
    * The array of Input objects describing the input streams used by the application.
    */
  var Inputs: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.Inputs] = js.native
  
  /**
    * The array of Output objects describing the destination streams used by the application.
    */
  var Outputs: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.Outputs] = js.native
  
  /**
    * The array of ReferenceDataSource objects describing the reference data sources used by the application.
    */
  var ReferenceDataSources: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ReferenceDataSources] = js.native
}
object SqlApplicationConfiguration {
  
  @scala.inline
  def apply(): SqlApplicationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlApplicationConfiguration]
  }
  
  @scala.inline
  implicit class SqlApplicationConfigurationMutableBuilder[Self <: SqlApplicationConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputs(value: Inputs): Self = StObject.set(x, "Inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsUndefined: Self = StObject.set(x, "Inputs", js.undefined)
    
    @scala.inline
    def setInputsVarargs(value: Input*): Self = StObject.set(x, "Inputs", js.Array(value :_*))
    
    @scala.inline
    def setOutputs(value: Outputs): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsUndefined: Self = StObject.set(x, "Outputs", js.undefined)
    
    @scala.inline
    def setOutputsVarargs(value: Output*): Self = StObject.set(x, "Outputs", js.Array(value :_*))
    
    @scala.inline
    def setReferenceDataSources(value: ReferenceDataSources): Self = StObject.set(x, "ReferenceDataSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceDataSourcesUndefined: Self = StObject.set(x, "ReferenceDataSources", js.undefined)
    
    @scala.inline
    def setReferenceDataSourcesVarargs(value: ReferenceDataSource*): Self = StObject.set(x, "ReferenceDataSources", js.Array(value :_*))
  }
}
