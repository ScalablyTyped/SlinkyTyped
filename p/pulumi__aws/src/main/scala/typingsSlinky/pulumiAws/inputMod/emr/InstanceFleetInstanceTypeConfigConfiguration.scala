package typingsSlinky.pulumiAws.inputMod.emr

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceFleetInstanceTypeConfigConfiguration extends StObject {
  
  /**
    * The classification within a configuration.
    */
  var classification: js.UndefOr[Input[String]] = js.native
  
  /**
    * A map of properties specified within a configuration classification
    */
  var properties: js.UndefOr[Input[StringDictionary[_]]] = js.native
}
object InstanceFleetInstanceTypeConfigConfiguration {
  
  @scala.inline
  def apply(): InstanceFleetInstanceTypeConfigConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceFleetInstanceTypeConfigConfiguration]
  }
  
  @scala.inline
  implicit class InstanceFleetInstanceTypeConfigConfigurationMutableBuilder[Self <: InstanceFleetInstanceTypeConfigConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassification(value: Input[String]): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassificationUndefined: Self = StObject.set(x, "classification", js.undefined)
    
    @scala.inline
    def setProperties(value: Input[StringDictionary[_]]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
