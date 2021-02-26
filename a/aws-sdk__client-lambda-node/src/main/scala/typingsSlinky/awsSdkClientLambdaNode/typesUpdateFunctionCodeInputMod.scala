package typingsSlinky.awsSdkClientLambdaNode

import typingsSlinky.awsSdkClientLambdaNode.inputTypesUnionMod._InputTypesUnion
import typingsSlinky.awsSdkTypes.abortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUpdateFunctionCodeInputMod {
  
  @js.native
  trait UpdateFunctionCodeInput extends _InputTypesUnion {
    
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
      * <p>This boolean parameter can be used to test your request to AWS Lambda to update the Lambda function and publish a version as an atomic operation. It will do all necessary computation and validation of your code but will not upload it or a publish a version. Each time this operation is invoked, the <code>CodeSha256</code> hash value of the provided code will also be computed and returned in the response.</p>
      */
    var DryRun: js.UndefOr[Boolean] = js.native
    
    /**
      * <p>The name of the lambda function.</p> <p class="title"> <b>Name formats</b> </p> <ul> <li> <p> <b>Function name</b> - <code>MyFunction</code>.</p> </li> <li> <p> <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction</code>.</p> </li> <li> <p> <b>Partial ARN</b> - <code>123456789012:function:MyFunction</code>.</p> </li> </ul> <p>The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.</p>
      */
    var FunctionName: String = js.native
    
    /**
      * <p>This boolean parameter can be used to request AWS Lambda to update the Lambda function and publish a version as an atomic operation.</p>
      */
    var Publish: js.UndefOr[Boolean] = js.native
    
    /**
      * <p>An optional value you can use to ensure you are updating the latest update of the function version or alias. If the <code>RevisionID</code> you pass doesn't match the latest <code>RevisionId</code> of the function or alias, it will fail with an error message, advising you to retrieve the latest function version or alias <code>RevisionID</code> using either using using either <a>GetFunction</a> or <a>GetAlias</a>.</p>
      */
    var RevisionId: js.UndefOr[String] = js.native
    
    /**
      * <p>Amazon S3 bucket name where the .zip file containing your deployment package is stored. This bucket must reside in the same AWS Region where you are creating the Lambda function.</p>
      */
    var S3Bucket: js.UndefOr[String] = js.native
    
    /**
      * <p>The Amazon S3 object (the deployment package) key name you want to upload.</p>
      */
    var S3Key: js.UndefOr[String] = js.native
    
    /**
      * <p>The Amazon S3 object (the deployment package) version you want to upload.</p>
      */
    var S3ObjectVersion: js.UndefOr[String] = js.native
    
    /**
      * <p>The contents of your zip file containing your deployment package. If you are using the web API directly, the contents of the zip file must be base64-encoded. If you are using the AWS SDKs or the AWS CLI, the SDKs or CLI will do the encoding for you. For more information about creating a .zip file, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html#lambda-intro-execution-role.html">Execution Permissions</a>. </p>
      */
    var ZipFile: js.UndefOr[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String] = js.native
  }
  object UpdateFunctionCodeInput {
    
    @scala.inline
    def apply(FunctionName: String): UpdateFunctionCodeInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateFunctionCodeInput]
    }
    
    @scala.inline
    implicit class UpdateFunctionCodeInputMutableBuilder[Self <: UpdateFunctionCodeInput] (val x: Self) extends AnyVal {
      
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
      def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
      
      @scala.inline
      def setFunctionName(value: String): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublish(value: Boolean): Self = StObject.set(x, "Publish", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublishUndefined: Self = StObject.set(x, "Publish", js.undefined)
      
      @scala.inline
      def setRevisionId(value: String): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevisionIdUndefined: Self = StObject.set(x, "RevisionId", js.undefined)
      
      @scala.inline
      def setS3Bucket(value: String): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3BucketUndefined: Self = StObject.set(x, "S3Bucket", js.undefined)
      
      @scala.inline
      def setS3Key(value: String): Self = StObject.set(x, "S3Key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3KeyUndefined: Self = StObject.set(x, "S3Key", js.undefined)
      
      @scala.inline
      def setS3ObjectVersion(value: String): Self = StObject.set(x, "S3ObjectVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3ObjectVersionUndefined: Self = StObject.set(x, "S3ObjectVersion", js.undefined)
      
      @scala.inline
      def setZipFile(value: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String): Self = StObject.set(x, "ZipFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZipFileArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "ZipFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZipFileArrayBufferView(value: js.typedarray.ArrayBufferView): Self = StObject.set(x, "ZipFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZipFileUndefined: Self = StObject.set(x, "ZipFile", js.undefined)
    }
  }
}
