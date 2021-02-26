package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpsResultAttribute extends StObject {
  
  /**
    * Name of the data type. Valid value: AWS:OpsItem, AWS:EC2InstanceInformation, AWS:OpsItemTrendline, or AWS:ComplianceSummary.
    */
  var TypeName: OpsDataTypeName = js.native
}
object OpsResultAttribute {
  
  @scala.inline
  def apply(TypeName: OpsDataTypeName): OpsResultAttribute = {
    val __obj = js.Dynamic.literal(TypeName = TypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpsResultAttribute]
  }
  
  @scala.inline
  implicit class OpsResultAttributeMutableBuilder[Self <: OpsResultAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTypeName(value: OpsDataTypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
  }
}
