package typingsSlinky.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLocalGatewayVirtualInterfaceGroupsFilter extends StObject {
  
  /**
    * Name of the filter.
    */
  var name: String = js.native
  
  /**
    * List of one or more values for the filter.
    */
  var values: js.Array[String] = js.native
}
object GetLocalGatewayVirtualInterfaceGroupsFilter {
  
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetLocalGatewayVirtualInterfaceGroupsFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLocalGatewayVirtualInterfaceGroupsFilter]
  }
  
  @scala.inline
  implicit class GetLocalGatewayVirtualInterfaceGroupsFilterMutableBuilder[Self <: GetLocalGatewayVirtualInterfaceGroupsFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
