package typingsSlinky.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeStackSetInput extends StObject {
  
  /**
    * The name or unique ID of the stack set whose description you want.
    */
  var StackSetName: typingsSlinky.awsSdk.cloudformationMod.StackSetName = js.native
}
object DescribeStackSetInput {
  
  @scala.inline
  def apply(StackSetName: StackSetName): DescribeStackSetInput = {
    val __obj = js.Dynamic.literal(StackSetName = StackSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStackSetInput]
  }
  
  @scala.inline
  implicit class DescribeStackSetInputMutableBuilder[Self <: DescribeStackSetInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStackSetName(value: StackSetName): Self = StObject.set(x, "StackSetName", value.asInstanceOf[js.Any])
  }
}
