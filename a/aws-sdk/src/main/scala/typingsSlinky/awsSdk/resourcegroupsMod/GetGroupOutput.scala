package typingsSlinky.awsSdk.resourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetGroupOutput extends StObject {
  
  /**
    * A full description of the resource group.
    */
  var Group: js.UndefOr[typingsSlinky.awsSdk.resourcegroupsMod.Group] = js.native
}
object GetGroupOutput {
  
  @scala.inline
  def apply(): GetGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGroupOutput]
  }
  
  @scala.inline
  implicit class GetGroupOutputMutableBuilder[Self <: GetGroupOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroup(value: Group): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
  }
}
