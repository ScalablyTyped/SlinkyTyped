package typingsSlinky.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddTagsToOnPremisesInstancesInput extends StObject {
  
  /**
    * The names of the on-premises instances to which to add tags.
    */
  var instanceNames: InstanceNameList = js.native
  
  /**
    * The tag key-value pairs to add to the on-premises instances. Keys and values are both required. Keys cannot be null or empty strings. Value-only tags are not allowed.
    */
  var tags: TagList = js.native
}
object AddTagsToOnPremisesInstancesInput {
  
  @scala.inline
  def apply(instanceNames: InstanceNameList, tags: TagList): AddTagsToOnPremisesInstancesInput = {
    val __obj = js.Dynamic.literal(instanceNames = instanceNames.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTagsToOnPremisesInstancesInput]
  }
  
  @scala.inline
  implicit class AddTagsToOnPremisesInstancesInputMutableBuilder[Self <: AddTagsToOnPremisesInstancesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceNames(value: InstanceNameList): Self = StObject.set(x, "instanceNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceNamesVarargs(value: InstanceName*): Self = StObject.set(x, "instanceNames", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
