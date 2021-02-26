package typingsSlinky.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutConfigurationAggregatorResponse extends StObject {
  
  /**
    * Returns a ConfigurationAggregator object.
    */
  var ConfigurationAggregator: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ConfigurationAggregator] = js.native
}
object PutConfigurationAggregatorResponse {
  
  @scala.inline
  def apply(): PutConfigurationAggregatorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutConfigurationAggregatorResponse]
  }
  
  @scala.inline
  implicit class PutConfigurationAggregatorResponseMutableBuilder[Self <: PutConfigurationAggregatorResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationAggregator(value: ConfigurationAggregator): Self = StObject.set(x, "ConfigurationAggregator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationAggregatorUndefined: Self = StObject.set(x, "ConfigurationAggregator", js.undefined)
  }
}
