package typingsSlinky.awsSdk

import typingsSlinky.awsSdk.awsSdkStrings.httpUploadProgress
import typingsSlinky.awsSdk.errorMod.AWSError
import typingsSlinky.awsSdk.managedUploadMod.ManagedUpload.ManagedUploadOptions
import typingsSlinky.awsSdk.managedUploadMod.ManagedUpload.Progress
import typingsSlinky.awsSdk.managedUploadMod.ManagedUpload.SendData
import typingsSlinky.awsSdk.s3Mod.PutObjectRequest
import typingsSlinky.awsSdk.s3Mod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object managedUploadMod {
  
  @JSImport("aws-sdk/lib/s3/managed_upload", "ManagedUpload")
  @js.native
  class ManagedUpload protected () extends StObject {
    /**
      * Creates a managed upload object with a set of configuration options.
      */
    def this(options: ManagedUploadOptions) = this()
    
    /**
      * Aborts a managed upload, including all concurrent upload requests.
      */
    def abort(): Unit = js.native
    
    /**
      * Adds a listener that is triggered when theuploader has uploaded more data.
      *
      * @param {string} event - httpUploadProgress: triggered when the uploader has uploaded more data.
      * @param {function} listener - Callback to run when the uploader has uploaded more data.
      */
    @JSName("on")
    def on_httpUploadProgress(event: httpUploadProgress, listener: js.Function1[/* progress */ Progress, Unit]): js.Any = js.native
    
    /**
      * Returns a 'thenable' promise.
      */
    def promise(): js.Promise[SendData] = js.native
    
    /**
      * Initiates the managed upload for the payload.
      */
    def send(): Unit = js.native
    def send(callback: js.Function2[/* err */ AWSError, /* data */ SendData, Unit]): Unit = js.native
  }
  /* static members */
  object ManagedUpload {
    
    @JSImport("aws-sdk/lib/s3/managed_upload", "ManagedUpload")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Default value: 10000
      */
    @JSImport("aws-sdk/lib/s3/managed_upload", "ManagedUpload.maxTotalParts")
    @js.native
    def maxTotalParts: Double = js.native
    @scala.inline
    def maxTotalParts_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxTotalParts")(x.asInstanceOf[js.Any])
    
    /**
      * Returns the minimum number of bytes for an individual part upload.
      * Note: Minimum allowed size is 5 MB.
      * 1024 * 5
      */
    @JSImport("aws-sdk/lib/s3/managed_upload", "ManagedUpload.minPartSize")
    @js.native
    def minPartSize: Double = js.native
    @scala.inline
    def minPartSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minPartSize")(x.asInstanceOf[js.Any])
    
    @js.native
    trait ManagedUploadOptions extends StObject {
      
      /**
        * Default: false
        * Whether to abort the multipart upload if an error occurs. Set to true if you want to handle failures manually.
        */
      var leavePartsOnError: js.UndefOr[Boolean] = js.native
      
      /**
        * A map of parameters to pass to the upload requests.
        * The "Body" parameter is required to be specified either on the service or in the params option.
        */
      var params: js.UndefOr[PutObjectRequest] = js.native
      
      /**
        * Default: 5 mb
        * The size in bytes for each individual part to be uploaded. Adjust the part size to ensure the number of parts does not exceed maxTotalParts. See minPartSize for the minimum allowed part size.
        */
      var partSize: js.UndefOr[Double] = js.native
      
      /**
        * The size of the concurrent queue manager to upload parts in parallel. Set to 1 for synchronous uploading of parts. Note that the uploader will buffer at most queueSize * partSize bytes into memory at any given time.
        * default: 4
        */
      var queueSize: js.UndefOr[Double] = js.native
      
      /**
        * An optional S3 service object to use for requests.
        * This object might have bound parameters used by the uploader.
        */
      var service: js.UndefOr[typingsSlinky.awsSdk.s3Mod.^] = js.native
      
      /**
        * The tags to apply to the object.
        */
      var tags: js.UndefOr[js.Array[Tag]] = js.native
    }
    object ManagedUploadOptions {
      
      @scala.inline
      def apply(): ManagedUploadOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ManagedUploadOptions]
      }
      
      @scala.inline
      implicit class ManagedUploadOptionsMutableBuilder[Self <: ManagedUploadOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLeavePartsOnError(value: Boolean): Self = StObject.set(x, "leavePartsOnError", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLeavePartsOnErrorUndefined: Self = StObject.set(x, "leavePartsOnError", js.undefined)
        
        @scala.inline
        def setParams(value: PutObjectRequest): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
        
        @scala.inline
        def setPartSize(value: Double): Self = StObject.set(x, "partSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPartSizeUndefined: Self = StObject.set(x, "partSize", js.undefined)
        
        @scala.inline
        def setQueueSize(value: Double): Self = StObject.set(x, "queueSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQueueSizeUndefined: Self = StObject.set(x, "queueSize", js.undefined)
        
        @scala.inline
        def setService(value: typingsSlinky.awsSdk.s3Mod.^): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
        
        @scala.inline
        def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
        
        @scala.inline
        def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
      }
    }
    
    @js.native
    trait Progress extends StObject {
      
      var loaded: Double = js.native
      
      var total: Double = js.native
    }
    object Progress {
      
      @scala.inline
      def apply(loaded: Double, total: Double): Progress = {
        val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
        __obj.asInstanceOf[Progress]
      }
      
      @scala.inline
      implicit class ProgressMutableBuilder[Self <: Progress] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait SendData extends StObject {
      
      /**
        * Bucket to which the object was uploaded.
        */
      var Bucket: String = js.native
      
      /**
        * ETag of the uploaded object.
        */
      var ETag: String = js.native
      
      /**
        * Key to which the object was uploaded.
        */
      var Key: String = js.native
      
      /**
        * URL of the uploaded object.
        */
      var Location: String = js.native
    }
    object SendData {
      
      @scala.inline
      def apply(Bucket: String, ETag: String, Key: String, Location: String): SendData = {
        val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], ETag = ETag.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any])
        __obj.asInstanceOf[SendData]
      }
      
      @scala.inline
      implicit class SendDataMutableBuilder[Self <: SendData] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBucket(value: String): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocation(value: String): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
      }
    }
  }
}
