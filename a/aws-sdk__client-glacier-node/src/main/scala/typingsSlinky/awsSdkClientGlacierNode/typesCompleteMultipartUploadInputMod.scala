package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod._InputTypesUnion
import typingsSlinky.awsSdkTypes.abortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCompleteMultipartUploadInputMod {
  
  @js.native
  trait CompleteMultipartUploadInput extends _InputTypesUnion {
    
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.native
    
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
      ] = js.native
    
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.native
    
    /**
      * <p>The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID.</p>
      */
    var accountId: String = js.native
    
    /**
      * <p>The total size, in bytes, of the entire archive. This value should be the sum of all the sizes of the individual parts that you uploaded.</p>
      */
    var archiveSize: js.UndefOr[String] = js.native
    
    /**
      * <p>The SHA256 tree hash of the entire archive. It is the tree hash of SHA256 tree hash of the individual parts. If the value you specify in the request does not match the SHA256 tree hash of the final assembled archive as computed by Amazon Glacier, Amazon Glacier returns an error and the request fails.</p>
      */
    var checksum: js.UndefOr[String] = js.native
    
    /**
      * <p>The upload ID of the multipart upload.</p>
      */
    var uploadId: String = js.native
    
    /**
      * <p>The name of the vault.</p>
      */
    var vaultName: String = js.native
  }
  object CompleteMultipartUploadInput {
    
    @scala.inline
    def apply(accountId: String, uploadId: String, vaultName: String): CompleteMultipartUploadInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompleteMultipartUploadInput]
    }
    
    @scala.inline
    implicit class CompleteMultipartUploadInputMutableBuilder[Self <: CompleteMultipartUploadInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      @scala.inline
      def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      @scala.inline
      def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      @scala.inline
      def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArchiveSize(value: String): Self = StObject.set(x, "archiveSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArchiveSizeUndefined: Self = StObject.set(x, "archiveSize", js.undefined)
      
      @scala.inline
      def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
      
      @scala.inline
      def setUploadId(value: String): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVaultName(value: String): Self = StObject.set(x, "vaultName", value.asInstanceOf[js.Any])
    }
  }
}
