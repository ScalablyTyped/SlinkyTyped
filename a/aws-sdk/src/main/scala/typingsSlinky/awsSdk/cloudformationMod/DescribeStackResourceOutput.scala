package typingsSlinky.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeStackResourceOutput extends StObject {
  
  /**
    * A StackResourceDetail structure containing the description of the specified resource in the specified stack.
    */
  var StackResourceDetail: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.StackResourceDetail] = js.native
}
object DescribeStackResourceOutput {
  
  @scala.inline
  def apply(): DescribeStackResourceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStackResourceOutput]
  }
  
  @scala.inline
  implicit class DescribeStackResourceOutputMutableBuilder[Self <: DescribeStackResourceOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStackResourceDetail(value: StackResourceDetail): Self = StObject.set(x, "StackResourceDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackResourceDetailUndefined: Self = StObject.set(x, "StackResourceDetail", js.undefined)
  }
}
