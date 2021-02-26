package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IKEVersionsRequestListValue extends StObject {
  
  /**
    * The IKE version.
    */
  var Value: js.UndefOr[String] = js.native
}
object IKEVersionsRequestListValue {
  
  @scala.inline
  def apply(): IKEVersionsRequestListValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IKEVersionsRequestListValue]
  }
  
  @scala.inline
  implicit class IKEVersionsRequestListValueMutableBuilder[Self <: IKEVersionsRequestListValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
