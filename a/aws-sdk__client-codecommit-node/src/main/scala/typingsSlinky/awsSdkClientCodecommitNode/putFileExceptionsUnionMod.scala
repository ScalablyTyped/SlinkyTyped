package typingsSlinky.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object putFileExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientCodecommitNode.typesRepositoryNameRequiredExceptionMod.RepositoryNameRequiredException
    - typingsSlinky.awsSdkClientCodecommitNode.typesInvalidRepositoryNameExceptionMod.InvalidRepositoryNameException
    - typingsSlinky.awsSdkClientCodecommitNode.typesRepositoryDoesNotExistExceptionMod.RepositoryDoesNotExistException
    - typingsSlinky.awsSdkClientCodecommitNode.typesParentCommitIdRequiredExceptionMod.ParentCommitIdRequiredException
    - typingsSlinky.awsSdkClientCodecommitNode.typesInvalidParentCommitIdExceptionMod.InvalidParentCommitIdException
    - typingsSlinky.awsSdkClientCodecommitNode.typesParentCommitDoesNotExistExceptionMod.ParentCommitDoesNotExistException
    - typingsSlinky.awsSdkClientCodecommitNode.typesParentCommitIdOutdatedExceptionMod.ParentCommitIdOutdatedException
    - typingsSlinky.awsSdkClientCodecommitNode.typesFileContentRequiredExceptionMod.FileContentRequiredException
    - typingsSlinky.awsSdkClientCodecommitNode.typesFileContentSizeLimitExceededExceptionMod.FileContentSizeLimitExceededException
    - typingsSlinky.awsSdkClientCodecommitNode.typesPathRequiredExceptionMod.PathRequiredException
    - typingsSlinky.awsSdkClientCodecommitNode.typesInvalidPathExceptionMod.InvalidPathException
    - typingsSlinky.awsSdkClientCodecommitNode.typesBranchNameRequiredExceptionMod.BranchNameRequiredException
    - typingsSlinky.awsSdkClientCodecommitNode.typesInvalidBranchNameExceptionMod.InvalidBranchNameException
    - typingsSlinky.awsSdkClientCodecommitNode.typesBranchDoesNotExistExceptionMod.BranchDoesNotExistException
    - typingsSlinky.awsSdkClientCodecommitNode.typesBranchNameIsTagNameExceptionMod.BranchNameIsTagNameException
    - typingsSlinky.awsSdkClientCodecommitNode.typesInvalidFileModeExceptionMod.InvalidFileModeException
    - typingsSlinky.awsSdkClientCodecommitNode.typesNameLengthExceededExceptionMod.NameLengthExceededException
    - typingsSlinky.awsSdkClientCodecommitNode.typesInvalidEmailExceptionMod.InvalidEmailException
    - typingsSlinky.awsSdkClientCodecommitNode.typesCommitMessageLengthExceededExceptionMod.CommitMessageLengthExceededException
    - typingsSlinky.awsSdkClientCodecommitNode.typesInvalidDeletionParameterExceptionMod.InvalidDeletionParameterException
    - typingsSlinky.awsSdkClientCodecommitNode.typesEncryptionIntegrityChecksFailedExceptionMod.EncryptionIntegrityChecksFailedException
    - typingsSlinky.awsSdkClientCodecommitNode.typesEncryptionKeyAccessDeniedExceptionMod.EncryptionKeyAccessDeniedException
    - typingsSlinky.awsSdkClientCodecommitNode.typesEncryptionKeyDisabledExceptionMod.EncryptionKeyDisabledException
    - typingsSlinky.awsSdkClientCodecommitNode.typesEncryptionKeyNotFoundExceptionMod.EncryptionKeyNotFoundException
    - typingsSlinky.awsSdkClientCodecommitNode.typesEncryptionKeyUnavailableExceptionMod.EncryptionKeyUnavailableException
    - typingsSlinky.awsSdkClientCodecommitNode.typesSameFileContentExceptionMod.SameFileContentException
    - typingsSlinky.awsSdkClientCodecommitNode.typesFileNameConflictsWithDirectoryNameExceptionMod.FileNameConflictsWithDirectoryNameException
    - typingsSlinky.awsSdkClientCodecommitNode.typesDirectoryNameConflictsWithFileNameExceptionMod.DirectoryNameConflictsWithFileNameException
  */
  trait PutFileExceptionsUnion extends StObject
  object PutFileExceptionsUnion {
    
    @scala.inline
    def BranchDoesNotExistException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BranchDoesNotExistException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesBranchDoesNotExistExceptionMod.BranchDoesNotExistException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesBranchDoesNotExistExceptionMod.BranchDoesNotExistException]
    }
    
    @scala.inline
    def BranchNameIsTagNameException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BranchNameIsTagNameException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesBranchNameIsTagNameExceptionMod.BranchNameIsTagNameException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesBranchNameIsTagNameExceptionMod.BranchNameIsTagNameException]
    }
    
    @scala.inline
    def BranchNameRequiredException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BranchNameRequiredException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesBranchNameRequiredExceptionMod.BranchNameRequiredException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesBranchNameRequiredExceptionMod.BranchNameRequiredException]
    }
    
    @scala.inline
    def CommitMessageLengthExceededException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommitMessageLengthExceededException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesCommitMessageLengthExceededExceptionMod.CommitMessageLengthExceededException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesCommitMessageLengthExceededExceptionMod.CommitMessageLengthExceededException]
    }
    
    @scala.inline
    def DirectoryNameConflictsWithFileNameException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.DirectoryNameConflictsWithFileNameException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesDirectoryNameConflictsWithFileNameExceptionMod.DirectoryNameConflictsWithFileNameException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesDirectoryNameConflictsWithFileNameExceptionMod.DirectoryNameConflictsWithFileNameException]
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
    def FileContentRequiredException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileContentRequiredException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesFileContentRequiredExceptionMod.FileContentRequiredException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesFileContentRequiredExceptionMod.FileContentRequiredException]
    }
    
    @scala.inline
    def FileContentSizeLimitExceededException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileContentSizeLimitExceededException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesFileContentSizeLimitExceededExceptionMod.FileContentSizeLimitExceededException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesFileContentSizeLimitExceededExceptionMod.FileContentSizeLimitExceededException]
    }
    
    @scala.inline
    def FileNameConflictsWithDirectoryNameException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileNameConflictsWithDirectoryNameException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesFileNameConflictsWithDirectoryNameExceptionMod.FileNameConflictsWithDirectoryNameException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesFileNameConflictsWithDirectoryNameExceptionMod.FileNameConflictsWithDirectoryNameException]
    }
    
    @scala.inline
    def InvalidBranchNameException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidBranchNameException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesInvalidBranchNameExceptionMod.InvalidBranchNameException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesInvalidBranchNameExceptionMod.InvalidBranchNameException]
    }
    
    @scala.inline
    def InvalidDeletionParameterException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidDeletionParameterException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesInvalidDeletionParameterExceptionMod.InvalidDeletionParameterException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesInvalidDeletionParameterExceptionMod.InvalidDeletionParameterException]
    }
    
    @scala.inline
    def InvalidEmailException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidEmailException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesInvalidEmailExceptionMod.InvalidEmailException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesInvalidEmailExceptionMod.InvalidEmailException]
    }
    
    @scala.inline
    def InvalidFileModeException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidFileModeException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesInvalidFileModeExceptionMod.InvalidFileModeException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesInvalidFileModeExceptionMod.InvalidFileModeException]
    }
    
    @scala.inline
    def InvalidParentCommitIdException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidParentCommitIdException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesInvalidParentCommitIdExceptionMod.InvalidParentCommitIdException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesInvalidParentCommitIdExceptionMod.InvalidParentCommitIdException]
    }
    
    @scala.inline
    def InvalidPathException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidPathException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesInvalidPathExceptionMod.InvalidPathException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesInvalidPathExceptionMod.InvalidPathException]
    }
    
    @scala.inline
    def InvalidRepositoryNameException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRepositoryNameException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesInvalidRepositoryNameExceptionMod.InvalidRepositoryNameException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesInvalidRepositoryNameExceptionMod.InvalidRepositoryNameException]
    }
    
    @scala.inline
    def NameLengthExceededException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.NameLengthExceededException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesNameLengthExceededExceptionMod.NameLengthExceededException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesNameLengthExceededExceptionMod.NameLengthExceededException]
    }
    
    @scala.inline
    def ParentCommitDoesNotExistException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ParentCommitDoesNotExistException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesParentCommitDoesNotExistExceptionMod.ParentCommitDoesNotExistException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesParentCommitDoesNotExistExceptionMod.ParentCommitDoesNotExistException]
    }
    
    @scala.inline
    def ParentCommitIdOutdatedException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ParentCommitIdOutdatedException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesParentCommitIdOutdatedExceptionMod.ParentCommitIdOutdatedException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesParentCommitIdOutdatedExceptionMod.ParentCommitIdOutdatedException]
    }
    
    @scala.inline
    def ParentCommitIdRequiredException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ParentCommitIdRequiredException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesParentCommitIdRequiredExceptionMod.ParentCommitIdRequiredException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesParentCommitIdRequiredExceptionMod.ParentCommitIdRequiredException]
    }
    
    @scala.inline
    def PathRequiredException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PathRequiredException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesPathRequiredExceptionMod.PathRequiredException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesPathRequiredExceptionMod.PathRequiredException]
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
    
    @scala.inline
    def SameFileContentException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.SameFileContentException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesSameFileContentExceptionMod.SameFileContentException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesSameFileContentExceptionMod.SameFileContentException]
    }
  }
}
