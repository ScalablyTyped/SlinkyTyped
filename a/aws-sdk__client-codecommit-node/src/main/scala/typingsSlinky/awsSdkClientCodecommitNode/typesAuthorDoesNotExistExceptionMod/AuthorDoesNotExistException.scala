package typingsSlinky.awsSdkClientCodecommitNode.typesAuthorDoesNotExistExceptionMod

import typingsSlinky.awsSdkClientCodecommitNode.listPullRequestsExceptionsUnionMod.ListPullRequestsExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorDoesNotExistException
  extends ServiceException[AuthorDoesNotExistExceptionDetails]
     with ListPullRequestsExceptionsUnion {
  
  @JSName("name")
  var name_AuthorDoesNotExistException: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.AuthorDoesNotExistException = js.native
}
object AuthorDoesNotExistException {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: AuthorDoesNotExistExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.AuthorDoesNotExistException
  ): AuthorDoesNotExistException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorDoesNotExistException]
  }
  
  @scala.inline
  implicit class AuthorDoesNotExistExceptionOps[Self <: AuthorDoesNotExistException] (val x: Self) extends AnyVal {
    
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
      value: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.AuthorDoesNotExistException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
