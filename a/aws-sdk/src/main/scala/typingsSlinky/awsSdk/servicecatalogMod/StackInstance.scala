package typingsSlinky.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackInstance extends StObject {
  
  /**
    * The name of the AWS account that the stack instance is associated with.
    */
  var Account: js.UndefOr[AccountId] = js.native
  
  /**
    * The name of the AWS region that the stack instance is associated with.
    */
  var Region: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.Region] = js.native
  
  /**
    * The status of the stack instance, in terms of its synchronization with its associated stack set.     INOPERABLE: A DeleteStackInstances operation has failed and left the stack in an unstable state. Stacks in this state are excluded from further UpdateStackSet operations. You might need to perform a DeleteStackInstances operation, with RetainStacks set to true, to delete the stack instance, and then delete the stack manually.     OUTDATED: The stack isn't currently up to date with the stack set because either the associated stack failed during a CreateStackSet or UpdateStackSet operation, or the stack was part of a CreateStackSet or UpdateStackSet operation that failed or was stopped before the stack was created or updated.    CURRENT: The stack is currently up to date with the stack set.  
    */
  var StackInstanceStatus: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.StackInstanceStatus] = js.native
}
object StackInstance {
  
  @scala.inline
  def apply(): StackInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackInstance]
  }
  
  @scala.inline
  implicit class StackInstanceMutableBuilder[Self <: StackInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: AccountId): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountUndefined: Self = StObject.set(x, "Account", js.undefined)
    
    @scala.inline
    def setRegion(value: Region): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    @scala.inline
    def setStackInstanceStatus(value: StackInstanceStatus): Self = StObject.set(x, "StackInstanceStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackInstanceStatusUndefined: Self = StObject.set(x, "StackInstanceStatus", js.undefined)
  }
}
