package typingsSlinky.awsSdkClientCodecommitNode.typesAuthorDoesNotExistExceptionMod

import typingsSlinky.awsSdkClientCodecommitNode.listPullRequestsExceptionsUnionMod.ListPullRequestsExceptionsUnion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_AuthorDoesNotExistExceptionDetails> * / any */ @js.native
trait AuthorDoesNotExistException extends ListPullRequestsExceptionsUnion {
  
  var name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.AuthorDoesNotExistException = js.native
}
object AuthorDoesNotExistException {
  
  @scala.inline
  def apply(
    name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.AuthorDoesNotExistException
  ): AuthorDoesNotExistException = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
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
