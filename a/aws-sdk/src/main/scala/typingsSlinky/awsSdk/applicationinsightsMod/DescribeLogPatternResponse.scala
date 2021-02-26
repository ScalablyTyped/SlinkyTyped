package typingsSlinky.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLogPatternResponse extends StObject {
  
  /**
    * The successfully created log pattern.
    */
  var LogPattern: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.LogPattern] = js.native
  
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.ResourceGroupName] = js.native
}
object DescribeLogPatternResponse {
  
  @scala.inline
  def apply(): DescribeLogPatternResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLogPatternResponse]
  }
  
  @scala.inline
  implicit class DescribeLogPatternResponseMutableBuilder[Self <: DescribeLogPatternResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogPattern(value: LogPattern): Self = StObject.set(x, "LogPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogPatternUndefined: Self = StObject.set(x, "LogPattern", js.undefined)
    
    @scala.inline
    def setResourceGroupName(value: ResourceGroupName): Self = StObject.set(x, "ResourceGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceGroupNameUndefined: Self = StObject.set(x, "ResourceGroupName", js.undefined)
  }
}
