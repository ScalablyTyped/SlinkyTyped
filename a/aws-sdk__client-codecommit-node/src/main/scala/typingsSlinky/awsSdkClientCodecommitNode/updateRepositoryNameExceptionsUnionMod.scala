package typingsSlinky.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateRepositoryNameExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientCodecommitNode.typesRepositoryDoesNotExistExceptionMod.RepositoryDoesNotExistException
    - typingsSlinky.awsSdkClientCodecommitNode.typesRepositoryNameExistsExceptionMod.RepositoryNameExistsException
    - typingsSlinky.awsSdkClientCodecommitNode.typesRepositoryNameRequiredExceptionMod.RepositoryNameRequiredException
    - typingsSlinky.awsSdkClientCodecommitNode.typesInvalidRepositoryNameExceptionMod.InvalidRepositoryNameException
  */
  trait UpdateRepositoryNameExceptionsUnion extends StObject
  object UpdateRepositoryNameExceptionsUnion {
    
    @scala.inline
    def InvalidRepositoryNameException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRepositoryNameException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesInvalidRepositoryNameExceptionMod.InvalidRepositoryNameException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesInvalidRepositoryNameExceptionMod.InvalidRepositoryNameException]
    }
    
    @scala.inline
    def RepositoryDoesNotExistException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryDoesNotExistException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesRepositoryDoesNotExistExceptionMod.RepositoryDoesNotExistException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesRepositoryDoesNotExistExceptionMod.RepositoryDoesNotExistException]
    }
    
    @scala.inline
    def RepositoryNameExistsException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryNameExistsException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesRepositoryNameExistsExceptionMod.RepositoryNameExistsException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesRepositoryNameExistsExceptionMod.RepositoryNameExistsException]
    }
    
    @scala.inline
    def RepositoryNameRequiredException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryNameRequiredException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesRepositoryNameRequiredExceptionMod.RepositoryNameRequiredException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesRepositoryNameRequiredExceptionMod.RepositoryNameRequiredException]
    }
  }
}
