package typingsSlinky.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createBranchExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientCodecommitNode.typesRepositoryNameRequiredExceptionMod.RepositoryNameRequiredException
    - typingsSlinky.awsSdkClientCodecommitNode.typesInvalidRepositoryNameExceptionMod.InvalidRepositoryNameException
    - typingsSlinky.awsSdkClientCodecommitNode.typesRepositoryDoesNotExistExceptionMod.RepositoryDoesNotExistException
    - typingsSlinky.awsSdkClientCodecommitNode.typesBranchNameRequiredExceptionMod.BranchNameRequiredException
    - typingsSlinky.awsSdkClientCodecommitNode.typesBranchNameExistsExceptionMod.BranchNameExistsException
    - typingsSlinky.awsSdkClientCodecommitNode.typesInvalidBranchNameExceptionMod.InvalidBranchNameException
    - typingsSlinky.awsSdkClientCodecommitNode.typesCommitIdRequiredExceptionMod.CommitIdRequiredException
    - typingsSlinky.awsSdkClientCodecommitNode.typesCommitDoesNotExistExceptionMod.CommitDoesNotExistException
    - typingsSlinky.awsSdkClientCodecommitNode.typesInvalidCommitIdExceptionMod.InvalidCommitIdException
    - typingsSlinky.awsSdkClientCodecommitNode.typesEncryptionIntegrityChecksFailedExceptionMod.EncryptionIntegrityChecksFailedException
    - typingsSlinky.awsSdkClientCodecommitNode.typesEncryptionKeyAccessDeniedExceptionMod.EncryptionKeyAccessDeniedException
    - typingsSlinky.awsSdkClientCodecommitNode.typesEncryptionKeyDisabledExceptionMod.EncryptionKeyDisabledException
    - typingsSlinky.awsSdkClientCodecommitNode.typesEncryptionKeyNotFoundExceptionMod.EncryptionKeyNotFoundException
    - typingsSlinky.awsSdkClientCodecommitNode.typesEncryptionKeyUnavailableExceptionMod.EncryptionKeyUnavailableException
  */
  trait CreateBranchExceptionsUnion extends StObject
  object CreateBranchExceptionsUnion {
    
    @scala.inline
    def BranchNameExistsException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BranchNameExistsException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesBranchNameExistsExceptionMod.BranchNameExistsException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesBranchNameExistsExceptionMod.BranchNameExistsException]
    }
    
    @scala.inline
    def BranchNameRequiredException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BranchNameRequiredException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesBranchNameRequiredExceptionMod.BranchNameRequiredException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesBranchNameRequiredExceptionMod.BranchNameRequiredException]
    }
    
    @scala.inline
    def CommitDoesNotExistException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommitDoesNotExistException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesCommitDoesNotExistExceptionMod.CommitDoesNotExistException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesCommitDoesNotExistExceptionMod.CommitDoesNotExistException]
    }
    
    @scala.inline
    def CommitIdRequiredException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommitIdRequiredException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesCommitIdRequiredExceptionMod.CommitIdRequiredException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesCommitIdRequiredExceptionMod.CommitIdRequiredException]
    }
    
    @scala.inline
    def EncryptionIntegrityChecksFailedException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.EncryptionIntegrityChecksFailedException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesEncryptionIntegrityChecksFailedExceptionMod.EncryptionIntegrityChecksFailedException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesEncryptionIntegrityChecksFailedExceptionMod.EncryptionIntegrityChecksFailedException]
    }
    
    @scala.inline
    def EncryptionKeyAccessDeniedException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.EncryptionKeyAccessDeniedException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesEncryptionKeyAccessDeniedExceptionMod.EncryptionKeyAccessDeniedException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesEncryptionKeyAccessDeniedExceptionMod.EncryptionKeyAccessDeniedException]
    }
    
    @scala.inline
    def EncryptionKeyDisabledException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.EncryptionKeyDisabledException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesEncryptionKeyDisabledExceptionMod.EncryptionKeyDisabledException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesEncryptionKeyDisabledExceptionMod.EncryptionKeyDisabledException]
    }
    
    @scala.inline
    def EncryptionKeyNotFoundException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.EncryptionKeyNotFoundException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesEncryptionKeyNotFoundExceptionMod.EncryptionKeyNotFoundException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesEncryptionKeyNotFoundExceptionMod.EncryptionKeyNotFoundException]
    }
    
    @scala.inline
    def EncryptionKeyUnavailableException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.EncryptionKeyUnavailableException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesEncryptionKeyUnavailableExceptionMod.EncryptionKeyUnavailableException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesEncryptionKeyUnavailableExceptionMod.EncryptionKeyUnavailableException]
    }
    
    @scala.inline
    def InvalidBranchNameException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidBranchNameException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesInvalidBranchNameExceptionMod.InvalidBranchNameException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesInvalidBranchNameExceptionMod.InvalidBranchNameException]
    }
    
    @scala.inline
    def InvalidCommitIdException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidCommitIdException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesInvalidCommitIdExceptionMod.InvalidCommitIdException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesInvalidCommitIdExceptionMod.InvalidCommitIdException]
    }
    
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
    def RepositoryNameRequiredException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryNameRequiredException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesRepositoryNameRequiredExceptionMod.RepositoryNameRequiredException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesRepositoryNameRequiredExceptionMod.RepositoryNameRequiredException]
    }
  }
}
