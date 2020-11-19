package typingsSlinky.awsSdkClientCodecommitNode.typesMaximumBranchesExceededExceptionMod

import typingsSlinky.awsSdkClientCodecommitNode.putRepositoryTriggersExceptionsUnionMod.PutRepositoryTriggersExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.testRepositoryTriggersExceptionsUnionMod.TestRepositoryTriggersExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaximumBranchesExceededException
  extends ServiceException[MaximumBranchesExceededExceptionDetails]
     with PutRepositoryTriggersExceptionsUnion
     with TestRepositoryTriggersExceptionsUnion {
  
  @JSName("name")
  var name_MaximumBranchesExceededException: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MaximumBranchesExceededException = js.native
}
object MaximumBranchesExceededException {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: MaximumBranchesExceededExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MaximumBranchesExceededException
  ): MaximumBranchesExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaximumBranchesExceededException]
  }
  
  @scala.inline
  implicit class MaximumBranchesExceededExceptionOps[Self <: MaximumBranchesExceededException] (val x: Self) extends AnyVal {
    
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
    def setName(
      value: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MaximumBranchesExceededException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
