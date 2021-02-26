package typingsSlinky.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaNetworkConfiguration extends StObject {
  
  /**
    * The emulation rule applying to the download traffic.
    */
  var downRule: js.UndefOr[SchemaTrafficRule] = js.native
  
  /**
    * The unique opaque id for this network traffic configuration.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The emulation rule applying to the upload traffic.
    */
  var upRule: js.UndefOr[SchemaTrafficRule] = js.native
}
object SchemaNetworkConfiguration {
  
  @scala.inline
  def apply(): SchemaNetworkConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkConfiguration]
  }
  
  @scala.inline
  implicit class SchemaNetworkConfigurationMutableBuilder[Self <: SchemaNetworkConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDownRule(value: SchemaTrafficRule): Self = StObject.set(x, "downRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownRuleUndefined: Self = StObject.set(x, "downRule", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setUpRule(value: SchemaTrafficRule): Self = StObject.set(x, "upRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpRuleUndefined: Self = StObject.set(x, "upRule", js.undefined)
  }
}
