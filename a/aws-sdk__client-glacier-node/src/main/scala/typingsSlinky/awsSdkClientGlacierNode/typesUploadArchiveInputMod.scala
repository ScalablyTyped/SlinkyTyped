package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkTypes.abortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUploadArchiveInputMod {
  
  @js.native
  trait UploadArchiveInput[StreamType] extends StObject {
    
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
      * <p>The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID. </p>
      */
    var accountId: String = js.native
    
    /**
      * <p>The optional description of the archive you are uploading.</p>
      */
    var archiveDescription: js.UndefOr[String] = js.native
    
    /**
      * <p>The data to upload.</p>
      */
    var body: js.UndefOr[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String | StreamType] = js.native
    
    /**
      * <p>The SHA256 tree hash of the data being uploaded.</p>
      */
    var checksum: js.UndefOr[String] = js.native
    
    /**
      * <p>The name of the vault.</p>
      */
    var vaultName: String = js.native
  }
  object UploadArchiveInput {
    
    @scala.inline
    def apply[StreamType](accountId: String, vaultName: String): UploadArchiveInput[StreamType] = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadArchiveInput[StreamType]]
    }
    
    @scala.inline
    implicit class UploadArchiveInputMutableBuilder[Self <: UploadArchiveInput[_], StreamType] (val x: Self with UploadArchiveInput[StreamType]) extends AnyVal {
      
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
      def setArchiveDescription(value: String): Self = StObject.set(x, "archiveDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArchiveDescriptionUndefined: Self = StObject.set(x, "archiveDescription", js.undefined)
      
      @scala.inline
      def setBody(value: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String | StreamType): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyArrayBufferView(value: js.typedarray.ArrayBufferView): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
      
      @scala.inline
      def setVaultName(value: String): Self = StObject.set(x, "vaultName", value.asInstanceOf[js.Any])
    }
  }
}
