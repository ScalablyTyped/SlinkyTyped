package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchListObjectPolicies extends js.Object {
  
  /**
    * The maximum number of results to retrieve.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.native
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.NextToken] = js.native
  
  /**
    * The reference that identifies the object whose attributes will be listed.
    */
  var ObjectReference: typingsSlinky.awsSdk.clouddirectoryMod.ObjectReference = js.native
}
object BatchListObjectPolicies {
  
  @scala.inline
  def apply(ObjectReference: ObjectReference): BatchListObjectPolicies = {
    val __obj = js.Dynamic.literal(ObjectReference = ObjectReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchListObjectPolicies]
  }
  
  @scala.inline
  implicit class BatchListObjectPoliciesOps[Self <: BatchListObjectPolicies] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setObjectReference(value: ObjectReference): Self = this.set("ObjectReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: NumberResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
