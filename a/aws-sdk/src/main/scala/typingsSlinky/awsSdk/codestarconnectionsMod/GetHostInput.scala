package typingsSlinky.awsSdk.codestarconnectionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetHostInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the requested host.
    */
  var HostArn: typingsSlinky.awsSdk.codestarconnectionsMod.HostArn = js.native
}
object GetHostInput {
  
  @scala.inline
  def apply(HostArn: HostArn): GetHostInput = {
    val __obj = js.Dynamic.literal(HostArn = HostArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHostInput]
  }
  
  @scala.inline
  implicit class GetHostInputMutableBuilder[Self <: GetHostInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHostArn(value: HostArn): Self = StObject.set(x, "HostArn", value.asInstanceOf[js.Any])
  }
}
