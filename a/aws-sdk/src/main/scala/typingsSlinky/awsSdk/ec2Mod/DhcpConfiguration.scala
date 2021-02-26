package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DhcpConfiguration extends StObject {
  
  /**
    * The name of a DHCP option.
    */
  var Key: js.UndefOr[String] = js.native
  
  /**
    * One or more values for the DHCP option.
    */
  var Values: js.UndefOr[DhcpConfigurationValueList] = js.native
}
object DhcpConfiguration {
  
  @scala.inline
  def apply(): DhcpConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DhcpConfiguration]
  }
  
  @scala.inline
  implicit class DhcpConfigurationMutableBuilder[Self <: DhcpConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    @scala.inline
    def setValues(value: DhcpConfigurationValueList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: AttributeValue*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
