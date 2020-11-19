package typingsSlinky.awsSdkClientCodecommitNode.typesRepositoryTriggerDestinationArnRequiredExceptionMod

import typingsSlinky.awsSdkClientCodecommitNode.putRepositoryTriggersExceptionsUnionMod.PutRepositoryTriggersExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.testRepositoryTriggersExceptionsUnionMod.TestRepositoryTriggersExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepositoryTriggerDestinationArnRequiredException
  extends ServiceException[RepositoryTriggerDestinationArnRequiredExceptionDetails]
     with PutRepositoryTriggersExceptionsUnion
     with TestRepositoryTriggersExceptionsUnion {
  
  @JSName("name")
  var name_RepositoryTriggerDestinationArnRequiredException: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryTriggerDestinationArnRequiredException = js.native
}
object RepositoryTriggerDestinationArnRequiredException {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: RepositoryTriggerDestinationArnRequiredExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryTriggerDestinationArnRequiredException
  ): RepositoryTriggerDestinationArnRequiredException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryTriggerDestinationArnRequiredException]
  }
  
  @scala.inline
  implicit class RepositoryTriggerDestinationArnRequiredExceptionOps[Self <: RepositoryTriggerDestinationArnRequiredException] (val x: Self) extends AnyVal {
    
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
      value: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryTriggerDestinationArnRequiredException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
