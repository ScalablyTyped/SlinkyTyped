package typingsSlinky.awsSdk.cloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyHapgResponse extends StObject {
  
  /**
    * The ARN of the high-availability partition group.
    */
  var HapgArn: js.UndefOr[typingsSlinky.awsSdk.cloudhsmMod.HapgArn] = js.native
}
object ModifyHapgResponse {
  
  @scala.inline
  def apply(): ModifyHapgResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyHapgResponse]
  }
  
  @scala.inline
  implicit class ModifyHapgResponseMutableBuilder[Self <: ModifyHapgResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHapgArn(value: HapgArn): Self = StObject.set(x, "HapgArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHapgArnUndefined: Self = StObject.set(x, "HapgArn", js.undefined)
  }
}
