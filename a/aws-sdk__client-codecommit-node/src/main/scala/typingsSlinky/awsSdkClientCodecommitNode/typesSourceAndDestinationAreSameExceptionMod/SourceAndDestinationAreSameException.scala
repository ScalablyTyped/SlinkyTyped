package typingsSlinky.awsSdkClientCodecommitNode.typesSourceAndDestinationAreSameExceptionMod

import typingsSlinky.awsSdkClientCodecommitNode.createPullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceAndDestinationAreSameException
  extends ServiceException[SourceAndDestinationAreSameExceptionDetails]
     with CreatePullRequestExceptionsUnion {
  
  @JSName("name")
  var name_SourceAndDestinationAreSameException: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.SourceAndDestinationAreSameException = js.native
}
object SourceAndDestinationAreSameException {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: SourceAndDestinationAreSameExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.SourceAndDestinationAreSameException
  ): SourceAndDestinationAreSameException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceAndDestinationAreSameException]
  }
  
  @scala.inline
  implicit class SourceAndDestinationAreSameExceptionOps[Self <: SourceAndDestinationAreSameException] (val x: Self) extends AnyVal {
    
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
      value: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.SourceAndDestinationAreSameException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
