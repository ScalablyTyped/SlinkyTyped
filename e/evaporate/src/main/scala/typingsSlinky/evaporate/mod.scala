package typingsSlinky.evaporate

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.experimental.ReadableStream
import org.scalajs.dom.raw.File
import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.evaporate.evaporateStrings.`2`
import typingsSlinky.evaporate.evaporateStrings.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("evaporate", JSImport.Namespace)
  @js.native
  class ^ protected () extends Evaporate {
    def this(config: CreateConfig) = this()
  }
  
  @JSImport("evaporate", "create")
  @js.native
  def create(config: CreateConfig): js.Promise[Evaporate] = js.native
  
  @js.native
  trait AddConfig extends StObject {
    
    var beforeSigner: js.UndefOr[js.Function2[/* xhr */ XMLHttpRequest, /* url */ String, Unit]] = js.native
    
    var cancelled: js.UndefOr[js.Function0[Unit]] = js.native
    
    var complete: js.UndefOr[
        js.Function3[/* xhr */ XMLHttpRequest, /* awsObjectKey */ String, /* stats */ TransferStats, Unit]
      ] = js.native
    
    var contentType: js.UndefOr[String] = js.native
    
    var error: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.native
    
    var file: File = js.native
    
    var info: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.native
    
    var name: String = js.native
    
    var nameChanged: js.UndefOr[js.Function1[/* awsObjectKey */ String, Unit]] = js.native
    
    var notSignedHeadersAtInitiate: js.UndefOr[StringDictionary[String]] = js.native
    
    var paused: js.UndefOr[js.Function1[/* file_key */ String, Unit]] = js.native
    
    var pausing: js.UndefOr[js.Function1[/* file_key */ String, Unit]] = js.native
    
    var progress: js.UndefOr[js.Function2[/* p */ Double, /* stats */ TransferStats, Unit]] = js.native
    
    var resumed: js.UndefOr[js.Function1[/* file_key */ String, Unit]] = js.native
    
    var started: js.UndefOr[js.Function1[/* file_key */ String, Unit]] = js.native
    
    var uploadInitiated: js.UndefOr[js.Function1[/* s3UploadId */ js.UndefOr[String], Unit]] = js.native
    
    var warn: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.native
    
    var xAmzHeadersAtComplete: js.UndefOr[StringDictionary[String]] = js.native
    
    var xAmzHeadersAtInitiate: js.UndefOr[StringDictionary[String]] = js.native
    
    var xAmzHeadersAtUpload: js.UndefOr[StringDictionary[String]] = js.native
    
    var xAmzHeadersCommon: js.UndefOr[StringDictionary[String]] = js.native
  }
  object AddConfig {
    
    @scala.inline
    def apply(file: File, name: String): AddConfig = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddConfig]
    }
    
    @scala.inline
    implicit class AddConfigMutableBuilder[Self <: AddConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBeforeSigner(value: (/* xhr */ XMLHttpRequest, /* url */ String) => Unit): Self = StObject.set(x, "beforeSigner", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBeforeSignerUndefined: Self = StObject.set(x, "beforeSigner", js.undefined)
      
      @scala.inline
      def setCancelled(value: () => Unit): Self = StObject.set(x, "cancelled", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCancelledUndefined: Self = StObject.set(x, "cancelled", js.undefined)
      
      @scala.inline
      def setComplete(value: (/* xhr */ XMLHttpRequest, /* awsObjectKey */ String, /* stats */ TransferStats) => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setError(value: /* msg */ String => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setFile(value: File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfo(value: /* msg */ String => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameChanged(value: /* awsObjectKey */ String => Unit): Self = StObject.set(x, "nameChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNameChangedUndefined: Self = StObject.set(x, "nameChanged", js.undefined)
      
      @scala.inline
      def setNotSignedHeadersAtInitiate(value: StringDictionary[String]): Self = StObject.set(x, "notSignedHeadersAtInitiate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotSignedHeadersAtInitiateUndefined: Self = StObject.set(x, "notSignedHeadersAtInitiate", js.undefined)
      
      @scala.inline
      def setPaused(value: /* file_key */ String => Unit): Self = StObject.set(x, "paused", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
      
      @scala.inline
      def setPausing(value: /* file_key */ String => Unit): Self = StObject.set(x, "pausing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPausingUndefined: Self = StObject.set(x, "pausing", js.undefined)
      
      @scala.inline
      def setProgress(value: (/* p */ Double, /* stats */ TransferStats) => Unit): Self = StObject.set(x, "progress", js.Any.fromFunction2(value))
      
      @scala.inline
      def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      @scala.inline
      def setResumed(value: /* file_key */ String => Unit): Self = StObject.set(x, "resumed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResumedUndefined: Self = StObject.set(x, "resumed", js.undefined)
      
      @scala.inline
      def setStarted(value: /* file_key */ String => Unit): Self = StObject.set(x, "started", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartedUndefined: Self = StObject.set(x, "started", js.undefined)
      
      @scala.inline
      def setUploadInitiated(value: /* s3UploadId */ js.UndefOr[String] => Unit): Self = StObject.set(x, "uploadInitiated", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUploadInitiatedUndefined: Self = StObject.set(x, "uploadInitiated", js.undefined)
      
      @scala.inline
      def setWarn(value: /* msg */ String => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
      
      @scala.inline
      def setXAmzHeadersAtComplete(value: StringDictionary[String]): Self = StObject.set(x, "xAmzHeadersAtComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXAmzHeadersAtCompleteUndefined: Self = StObject.set(x, "xAmzHeadersAtComplete", js.undefined)
      
      @scala.inline
      def setXAmzHeadersAtInitiate(value: StringDictionary[String]): Self = StObject.set(x, "xAmzHeadersAtInitiate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXAmzHeadersAtInitiateUndefined: Self = StObject.set(x, "xAmzHeadersAtInitiate", js.undefined)
      
      @scala.inline
      def setXAmzHeadersAtUpload(value: StringDictionary[String]): Self = StObject.set(x, "xAmzHeadersAtUpload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXAmzHeadersAtUploadUndefined: Self = StObject.set(x, "xAmzHeadersAtUpload", js.undefined)
      
      @scala.inline
      def setXAmzHeadersCommon(value: StringDictionary[String]): Self = StObject.set(x, "xAmzHeadersCommon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXAmzHeadersCommonUndefined: Self = StObject.set(x, "xAmzHeadersCommon", js.undefined)
    }
  }
  
  /* Inlined std.Exclude<keyof evaporate.evaporate.CreateConfig, evaporate.evaporate.ImmutableOptionKeys> */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.evaporate.evaporateStrings.maxRetryBackoffSecs
    - typingsSlinky.evaporate.evaporateStrings.signerUrl
    - typingsSlinky.evaporate.evaporateStrings.abortCompletionThrottlingMs
    - typingsSlinky.evaporate.evaporateStrings.readableStreams
    - typingsSlinky.evaporate.evaporateStrings.sendCanonicalRequestToSignerUrl
    - typingsSlinky.evaporate.evaporateStrings.customAuthMethod
    - typingsSlinky.evaporate.evaporateStrings.signResponseHandler
    - typingsSlinky.evaporate.evaporateStrings.bucket
    - typingsSlinky.evaporate.evaporateStrings.s3FileCacheHoursAgo
    - typingsSlinky.evaporate.evaporateStrings.retryBackoffPower
    - typingsSlinky.evaporate.evaporateStrings.xhrWithCredentials
    - typingsSlinky.evaporate.evaporateStrings.progressIntervalMS
    - typingsSlinky.evaporate.evaporateStrings.maxFileSize
    - typingsSlinky.evaporate.evaporateStrings.partSize
    - typingsSlinky.evaporate.evaporateStrings.s3Acceleration
    - typingsSlinky.evaporate.evaporateStrings.aws_key
    - typingsSlinky.evaporate.evaporateStrings.signHeaders
    - typingsSlinky.evaporate.evaporateStrings.signParams
    - typingsSlinky.evaporate.evaporateStrings.readableStreamPartMethod
    - typingsSlinky.evaporate.evaporateStrings.localTimeOffset
    - typingsSlinky.evaporate.evaporateStrings.mockLocalStorage
    - typingsSlinky.evaporate.evaporateStrings.aws_url
  */
  trait AddOverrideOptionKeys extends StObject
  object AddOverrideOptionKeys {
    
    @scala.inline
    def abortCompletionThrottlingMs: typingsSlinky.evaporate.evaporateStrings.abortCompletionThrottlingMs = "abortCompletionThrottlingMs".asInstanceOf[typingsSlinky.evaporate.evaporateStrings.abortCompletionThrottlingMs]
    
    @scala.inline
    def aws_key: typingsSlinky.evaporate.evaporateStrings.aws_key = "aws_key".asInstanceOf[typingsSlinky.evaporate.evaporateStrings.aws_key]
    
    @scala.inline
    def aws_url: typingsSlinky.evaporate.evaporateStrings.aws_url = "aws_url".asInstanceOf[typingsSlinky.evaporate.evaporateStrings.aws_url]
    
    @scala.inline
    def bucket: typingsSlinky.evaporate.evaporateStrings.bucket = "bucket".asInstanceOf[typingsSlinky.evaporate.evaporateStrings.bucket]
    
    @scala.inline
    def customAuthMethod: typingsSlinky.evaporate.evaporateStrings.customAuthMethod = "customAuthMethod".asInstanceOf[typingsSlinky.evaporate.evaporateStrings.customAuthMethod]
    
    @scala.inline
    def localTimeOffset: typingsSlinky.evaporate.evaporateStrings.localTimeOffset = "localTimeOffset".asInstanceOf[typingsSlinky.evaporate.evaporateStrings.localTimeOffset]
    
    @scala.inline
    def maxFileSize: typingsSlinky.evaporate.evaporateStrings.maxFileSize = "maxFileSize".asInstanceOf[typingsSlinky.evaporate.evaporateStrings.maxFileSize]
    
    @scala.inline
    def maxRetryBackoffSecs: typingsSlinky.evaporate.evaporateStrings.maxRetryBackoffSecs = "maxRetryBackoffSecs".asInstanceOf[typingsSlinky.evaporate.evaporateStrings.maxRetryBackoffSecs]
    
    @scala.inline
    def mockLocalStorage: typingsSlinky.evaporate.evaporateStrings.mockLocalStorage = "mockLocalStorage".asInstanceOf[typingsSlinky.evaporate.evaporateStrings.mockLocalStorage]
    
    @scala.inline
    def partSize: typingsSlinky.evaporate.evaporateStrings.partSize = "partSize".asInstanceOf[typingsSlinky.evaporate.evaporateStrings.partSize]
    
    @scala.inline
    def progressIntervalMS: typingsSlinky.evaporate.evaporateStrings.progressIntervalMS = "progressIntervalMS".asInstanceOf[typingsSlinky.evaporate.evaporateStrings.progressIntervalMS]
    
    @scala.inline
    def readableStreamPartMethod: typingsSlinky.evaporate.evaporateStrings.readableStreamPartMethod = "readableStreamPartMethod".asInstanceOf[typingsSlinky.evaporate.evaporateStrings.readableStreamPartMethod]
    
    @scala.inline
    def readableStreams: typingsSlinky.evaporate.evaporateStrings.readableStreams = "readableStreams".asInstanceOf[typingsSlinky.evaporate.evaporateStrings.readableStreams]
    
    @scala.inline
    def retryBackoffPower: typingsSlinky.evaporate.evaporateStrings.retryBackoffPower = "retryBackoffPower".asInstanceOf[typingsSlinky.evaporate.evaporateStrings.retryBackoffPower]
    
    @scala.inline
    def s3Acceleration: typingsSlinky.evaporate.evaporateStrings.s3Acceleration = "s3Acceleration".asInstanceOf[typingsSlinky.evaporate.evaporateStrings.s3Acceleration]
    
    @scala.inline
    def s3FileCacheHoursAgo: typingsSlinky.evaporate.evaporateStrings.s3FileCacheHoursAgo = "s3FileCacheHoursAgo".asInstanceOf[typingsSlinky.evaporate.evaporateStrings.s3FileCacheHoursAgo]
    
    @scala.inline
    def sendCanonicalRequestToSignerUrl: typingsSlinky.evaporate.evaporateStrings.sendCanonicalRequestToSignerUrl = "sendCanonicalRequestToSignerUrl".asInstanceOf[typingsSlinky.evaporate.evaporateStrings.sendCanonicalRequestToSignerUrl]
    
    @scala.inline
    def signHeaders: typingsSlinky.evaporate.evaporateStrings.signHeaders = "signHeaders".asInstanceOf[typingsSlinky.evaporate.evaporateStrings.signHeaders]
    
    @scala.inline
    def signParams: typingsSlinky.evaporate.evaporateStrings.signParams = "signParams".asInstanceOf[typingsSlinky.evaporate.evaporateStrings.signParams]
    
    @scala.inline
    def signResponseHandler: typingsSlinky.evaporate.evaporateStrings.signResponseHandler = "signResponseHandler".asInstanceOf[typingsSlinky.evaporate.evaporateStrings.signResponseHandler]
    
    @scala.inline
    def signerUrl: typingsSlinky.evaporate.evaporateStrings.signerUrl = "signerUrl".asInstanceOf[typingsSlinky.evaporate.evaporateStrings.signerUrl]
    
    @scala.inline
    def xhrWithCredentials: typingsSlinky.evaporate.evaporateStrings.xhrWithCredentials = "xhrWithCredentials".asInstanceOf[typingsSlinky.evaporate.evaporateStrings.xhrWithCredentials]
  }
  
  /* Inlined parent std.Pick<evaporate.evaporate.CreateConfig, evaporate.evaporate.AddOverrideOptionKeys> */
  @js.native
  trait AddOverrideOptions extends StObject {
    
    var abortCompletionThrottlingMs: js.UndefOr[Double] = js.native
    
    var aws_key: js.UndefOr[String] = js.native
    
    var aws_url: js.UndefOr[String] = js.native
    
    var bucket: String = js.native
    
    var customAuthMethod: js.UndefOr[
        Null | (js.Function5[
          /* signParams */ String, 
          /* signHeaders */ String, 
          /* stringToSign */ String, 
          /* signatureDateTime */ String, 
          /* canonicalRequest */ String, 
          js.Promise[String]
        ])
      ] = js.native
    
    var localTimeOffset: js.UndefOr[Double] = js.native
    
    var maxFileSize: js.UndefOr[Double] = js.native
    
    var maxRetryBackoffSecs: js.UndefOr[Double] = js.native
    
    var mockLocalStorage: js.UndefOr[Boolean] = js.native
    
    var partSize: js.UndefOr[Double] = js.native
    
    var progressIntervalMS: js.UndefOr[Double] = js.native
    
    var readableStreamPartMethod: js.UndefOr[
        Null | (js.Function3[/* file */ File, /* start */ Double, /* end */ Double, ReadableStream[_]])
      ] = js.native
    
    var readableStreams: js.UndefOr[Boolean] = js.native
    
    var retryBackoffPower: js.UndefOr[Double] = js.native
    
    var s3Acceleration: js.UndefOr[Boolean] = js.native
    
    var s3FileCacheHoursAgo: js.UndefOr[Null | Double] = js.native
    
    var sendCanonicalRequestToSignerUrl: js.UndefOr[Boolean] = js.native
    
    var signHeaders: js.UndefOr[js.Object] = js.native
    
    var signParams: js.UndefOr[js.Object] = js.native
    
    var signResponseHandler: js.UndefOr[
        Null | (js.Function3[
          /* response */ js.Any, 
          /* stringToSign */ String, 
          /* signatureDateTime */ String, 
          js.Promise[String]
        ])
      ] = js.native
    
    var signerUrl: js.UndefOr[String] = js.native
    
    var xhrWithCredentials: js.UndefOr[Boolean] = js.native
  }
  object AddOverrideOptions {
    
    @scala.inline
    def apply(bucket: String): AddOverrideOptions = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddOverrideOptions]
    }
    
    @scala.inline
    implicit class AddOverrideOptionsMutableBuilder[Self <: AddOverrideOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbortCompletionThrottlingMs(value: Double): Self = StObject.set(x, "abortCompletionThrottlingMs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbortCompletionThrottlingMsUndefined: Self = StObject.set(x, "abortCompletionThrottlingMs", js.undefined)
      
      @scala.inline
      def setAws_key(value: String): Self = StObject.set(x, "aws_key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAws_keyUndefined: Self = StObject.set(x, "aws_key", js.undefined)
      
      @scala.inline
      def setAws_url(value: String): Self = StObject.set(x, "aws_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAws_urlUndefined: Self = StObject.set(x, "aws_url", js.undefined)
      
      @scala.inline
      def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomAuthMethod(
        value: (/* signParams */ String, /* signHeaders */ String, /* stringToSign */ String, /* signatureDateTime */ String, /* canonicalRequest */ String) => js.Promise[String]
      ): Self = StObject.set(x, "customAuthMethod", js.Any.fromFunction5(value))
      
      @scala.inline
      def setCustomAuthMethodNull: Self = StObject.set(x, "customAuthMethod", null)
      
      @scala.inline
      def setCustomAuthMethodUndefined: Self = StObject.set(x, "customAuthMethod", js.undefined)
      
      @scala.inline
      def setLocalTimeOffset(value: Double): Self = StObject.set(x, "localTimeOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalTimeOffsetUndefined: Self = StObject.set(x, "localTimeOffset", js.undefined)
      
      @scala.inline
      def setMaxFileSize(value: Double): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFileSizeUndefined: Self = StObject.set(x, "maxFileSize", js.undefined)
      
      @scala.inline
      def setMaxRetryBackoffSecs(value: Double): Self = StObject.set(x, "maxRetryBackoffSecs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRetryBackoffSecsUndefined: Self = StObject.set(x, "maxRetryBackoffSecs", js.undefined)
      
      @scala.inline
      def setMockLocalStorage(value: Boolean): Self = StObject.set(x, "mockLocalStorage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMockLocalStorageUndefined: Self = StObject.set(x, "mockLocalStorage", js.undefined)
      
      @scala.inline
      def setPartSize(value: Double): Self = StObject.set(x, "partSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartSizeUndefined: Self = StObject.set(x, "partSize", js.undefined)
      
      @scala.inline
      def setProgressIntervalMS(value: Double): Self = StObject.set(x, "progressIntervalMS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressIntervalMSUndefined: Self = StObject.set(x, "progressIntervalMS", js.undefined)
      
      @scala.inline
      def setReadableStreamPartMethod(value: (/* file */ File, /* start */ Double, /* end */ Double) => ReadableStream[_]): Self = StObject.set(x, "readableStreamPartMethod", js.Any.fromFunction3(value))
      
      @scala.inline
      def setReadableStreamPartMethodNull: Self = StObject.set(x, "readableStreamPartMethod", null)
      
      @scala.inline
      def setReadableStreamPartMethodUndefined: Self = StObject.set(x, "readableStreamPartMethod", js.undefined)
      
      @scala.inline
      def setReadableStreams(value: Boolean): Self = StObject.set(x, "readableStreams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadableStreamsUndefined: Self = StObject.set(x, "readableStreams", js.undefined)
      
      @scala.inline
      def setRetryBackoffPower(value: Double): Self = StObject.set(x, "retryBackoffPower", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryBackoffPowerUndefined: Self = StObject.set(x, "retryBackoffPower", js.undefined)
      
      @scala.inline
      def setS3Acceleration(value: Boolean): Self = StObject.set(x, "s3Acceleration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3AccelerationUndefined: Self = StObject.set(x, "s3Acceleration", js.undefined)
      
      @scala.inline
      def setS3FileCacheHoursAgo(value: Double): Self = StObject.set(x, "s3FileCacheHoursAgo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3FileCacheHoursAgoNull: Self = StObject.set(x, "s3FileCacheHoursAgo", null)
      
      @scala.inline
      def setS3FileCacheHoursAgoUndefined: Self = StObject.set(x, "s3FileCacheHoursAgo", js.undefined)
      
      @scala.inline
      def setSendCanonicalRequestToSignerUrl(value: Boolean): Self = StObject.set(x, "sendCanonicalRequestToSignerUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSendCanonicalRequestToSignerUrlUndefined: Self = StObject.set(x, "sendCanonicalRequestToSignerUrl", js.undefined)
      
      @scala.inline
      def setSignHeaders(value: js.Object): Self = StObject.set(x, "signHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignHeadersUndefined: Self = StObject.set(x, "signHeaders", js.undefined)
      
      @scala.inline
      def setSignParams(value: js.Object): Self = StObject.set(x, "signParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignParamsUndefined: Self = StObject.set(x, "signParams", js.undefined)
      
      @scala.inline
      def setSignResponseHandler(
        value: (/* response */ js.Any, /* stringToSign */ String, /* signatureDateTime */ String) => js.Promise[String]
      ): Self = StObject.set(x, "signResponseHandler", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSignResponseHandlerNull: Self = StObject.set(x, "signResponseHandler", null)
      
      @scala.inline
      def setSignResponseHandlerUndefined: Self = StObject.set(x, "signResponseHandler", js.undefined)
      
      @scala.inline
      def setSignerUrl(value: String): Self = StObject.set(x, "signerUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignerUrlUndefined: Self = StObject.set(x, "signerUrl", js.undefined)
      
      @scala.inline
      def setXhrWithCredentials(value: Boolean): Self = StObject.set(x, "xhrWithCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXhrWithCredentialsUndefined: Self = StObject.set(x, "xhrWithCredentials", js.undefined)
    }
  }
  
  @js.native
  trait CreateConfig extends StObject {
    
    var abortCompletionThrottlingMs: js.UndefOr[Double] = js.native
    
    var allowS3ExistenceOptimization: js.UndefOr[Boolean] = js.native
    
    var awsRegion: js.UndefOr[String] = js.native
    
    var awsSignatureVersion: js.UndefOr[`2` | `4`] = js.native
    
    var aws_key: js.UndefOr[String] = js.native
    
    var aws_url: js.UndefOr[String] = js.native
    
    var bucket: String = js.native
    
    var cloudfront: js.UndefOr[Boolean] = js.native
    
    var computeContentMd5: js.UndefOr[Boolean] = js.native
    
    var cryptoHexEncodedHash256: js.UndefOr[
        Null | (js.Function1[/* data */ String | js.typedarray.ArrayBuffer | Null, String])
      ] = js.native
    
    var cryptoMd5Method: js.UndefOr[Null | (js.Function1[/* data */ js.typedarray.ArrayBuffer, String])] = js.native
    
    var customAuthMethod: js.UndefOr[
        Null | (js.Function5[
          /* signParams */ String, 
          /* signHeaders */ String, 
          /* stringToSign */ String, 
          /* signatureDateTime */ String, 
          /* canonicalRequest */ String, 
          js.Promise[String]
        ])
      ] = js.native
    
    var encodeFilename: js.UndefOr[Boolean] = js.native
    
    var evaporateChanged: js.UndefOr[js.Function2[/* evaporate */ Evaporate, /* evaporatingCount */ Double, Unit]] = js.native
    
    var localTimeOffset: js.UndefOr[Double] = js.native
    
    var logging: js.UndefOr[Boolean] = js.native
    
    var maxConcurrentParts: js.UndefOr[Double] = js.native
    
    var maxFileSize: js.UndefOr[Double] = js.native
    
    var maxRetryBackoffSecs: js.UndefOr[Double] = js.native
    
    var mockLocalStorage: js.UndefOr[Boolean] = js.native
    
    var onlyRetryForSameFileName: js.UndefOr[Boolean] = js.native
    
    var partSize: js.UndefOr[Double] = js.native
    
    var progressIntervalMS: js.UndefOr[Double] = js.native
    
    var readableStreamPartMethod: js.UndefOr[
        Null | (js.Function3[/* file */ File, /* start */ Double, /* end */ Double, ReadableStream[_]])
      ] = js.native
    
    var readableStreams: js.UndefOr[Boolean] = js.native
    
    var retryBackoffPower: js.UndefOr[Double] = js.native
    
    var s3Acceleration: js.UndefOr[Boolean] = js.native
    
    var s3FileCacheHoursAgo: js.UndefOr[Null | Double] = js.native
    
    var sendCanonicalRequestToSignerUrl: js.UndefOr[Boolean] = js.native
    
    var signHeaders: js.UndefOr[js.Object] = js.native
    
    var signParams: js.UndefOr[js.Object] = js.native
    
    var signResponseHandler: js.UndefOr[
        Null | (js.Function3[
          /* response */ js.Any, 
          /* stringToSign */ String, 
          /* signatureDateTime */ String, 
          js.Promise[String]
        ])
      ] = js.native
    
    var signerUrl: js.UndefOr[String] = js.native
    
    var timeUrl: js.UndefOr[String] = js.native
    
    var xhrWithCredentials: js.UndefOr[Boolean] = js.native
  }
  object CreateConfig {
    
    @scala.inline
    def apply(bucket: String): CreateConfig = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateConfig]
    }
    
    @scala.inline
    implicit class CreateConfigMutableBuilder[Self <: CreateConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbortCompletionThrottlingMs(value: Double): Self = StObject.set(x, "abortCompletionThrottlingMs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbortCompletionThrottlingMsUndefined: Self = StObject.set(x, "abortCompletionThrottlingMs", js.undefined)
      
      @scala.inline
      def setAllowS3ExistenceOptimization(value: Boolean): Self = StObject.set(x, "allowS3ExistenceOptimization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowS3ExistenceOptimizationUndefined: Self = StObject.set(x, "allowS3ExistenceOptimization", js.undefined)
      
      @scala.inline
      def setAwsRegion(value: String): Self = StObject.set(x, "awsRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAwsRegionUndefined: Self = StObject.set(x, "awsRegion", js.undefined)
      
      @scala.inline
      def setAwsSignatureVersion(value: `2` | `4`): Self = StObject.set(x, "awsSignatureVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAwsSignatureVersionUndefined: Self = StObject.set(x, "awsSignatureVersion", js.undefined)
      
      @scala.inline
      def setAws_key(value: String): Self = StObject.set(x, "aws_key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAws_keyUndefined: Self = StObject.set(x, "aws_key", js.undefined)
      
      @scala.inline
      def setAws_url(value: String): Self = StObject.set(x, "aws_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAws_urlUndefined: Self = StObject.set(x, "aws_url", js.undefined)
      
      @scala.inline
      def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudfront(value: Boolean): Self = StObject.set(x, "cloudfront", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudfrontUndefined: Self = StObject.set(x, "cloudfront", js.undefined)
      
      @scala.inline
      def setComputeContentMd5(value: Boolean): Self = StObject.set(x, "computeContentMd5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComputeContentMd5Undefined: Self = StObject.set(x, "computeContentMd5", js.undefined)
      
      @scala.inline
      def setCryptoHexEncodedHash256(value: /* data */ String | js.typedarray.ArrayBuffer | Null => String): Self = StObject.set(x, "cryptoHexEncodedHash256", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCryptoHexEncodedHash256Null: Self = StObject.set(x, "cryptoHexEncodedHash256", null)
      
      @scala.inline
      def setCryptoHexEncodedHash256Undefined: Self = StObject.set(x, "cryptoHexEncodedHash256", js.undefined)
      
      @scala.inline
      def setCryptoMd5Method(value: /* data */ js.typedarray.ArrayBuffer => String): Self = StObject.set(x, "cryptoMd5Method", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCryptoMd5MethodNull: Self = StObject.set(x, "cryptoMd5Method", null)
      
      @scala.inline
      def setCryptoMd5MethodUndefined: Self = StObject.set(x, "cryptoMd5Method", js.undefined)
      
      @scala.inline
      def setCustomAuthMethod(
        value: (/* signParams */ String, /* signHeaders */ String, /* stringToSign */ String, /* signatureDateTime */ String, /* canonicalRequest */ String) => js.Promise[String]
      ): Self = StObject.set(x, "customAuthMethod", js.Any.fromFunction5(value))
      
      @scala.inline
      def setCustomAuthMethodNull: Self = StObject.set(x, "customAuthMethod", null)
      
      @scala.inline
      def setCustomAuthMethodUndefined: Self = StObject.set(x, "customAuthMethod", js.undefined)
      
      @scala.inline
      def setEncodeFilename(value: Boolean): Self = StObject.set(x, "encodeFilename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodeFilenameUndefined: Self = StObject.set(x, "encodeFilename", js.undefined)
      
      @scala.inline
      def setEvaporateChanged(value: (/* evaporate */ Evaporate, /* evaporatingCount */ Double) => Unit): Self = StObject.set(x, "evaporateChanged", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEvaporateChangedUndefined: Self = StObject.set(x, "evaporateChanged", js.undefined)
      
      @scala.inline
      def setLocalTimeOffset(value: Double): Self = StObject.set(x, "localTimeOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalTimeOffsetUndefined: Self = StObject.set(x, "localTimeOffset", js.undefined)
      
      @scala.inline
      def setLogging(value: Boolean): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
      
      @scala.inline
      def setMaxConcurrentParts(value: Double): Self = StObject.set(x, "maxConcurrentParts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxConcurrentPartsUndefined: Self = StObject.set(x, "maxConcurrentParts", js.undefined)
      
      @scala.inline
      def setMaxFileSize(value: Double): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFileSizeUndefined: Self = StObject.set(x, "maxFileSize", js.undefined)
      
      @scala.inline
      def setMaxRetryBackoffSecs(value: Double): Self = StObject.set(x, "maxRetryBackoffSecs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRetryBackoffSecsUndefined: Self = StObject.set(x, "maxRetryBackoffSecs", js.undefined)
      
      @scala.inline
      def setMockLocalStorage(value: Boolean): Self = StObject.set(x, "mockLocalStorage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMockLocalStorageUndefined: Self = StObject.set(x, "mockLocalStorage", js.undefined)
      
      @scala.inline
      def setOnlyRetryForSameFileName(value: Boolean): Self = StObject.set(x, "onlyRetryForSameFileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyRetryForSameFileNameUndefined: Self = StObject.set(x, "onlyRetryForSameFileName", js.undefined)
      
      @scala.inline
      def setPartSize(value: Double): Self = StObject.set(x, "partSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartSizeUndefined: Self = StObject.set(x, "partSize", js.undefined)
      
      @scala.inline
      def setProgressIntervalMS(value: Double): Self = StObject.set(x, "progressIntervalMS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressIntervalMSUndefined: Self = StObject.set(x, "progressIntervalMS", js.undefined)
      
      @scala.inline
      def setReadableStreamPartMethod(value: (/* file */ File, /* start */ Double, /* end */ Double) => ReadableStream[_]): Self = StObject.set(x, "readableStreamPartMethod", js.Any.fromFunction3(value))
      
      @scala.inline
      def setReadableStreamPartMethodNull: Self = StObject.set(x, "readableStreamPartMethod", null)
      
      @scala.inline
      def setReadableStreamPartMethodUndefined: Self = StObject.set(x, "readableStreamPartMethod", js.undefined)
      
      @scala.inline
      def setReadableStreams(value: Boolean): Self = StObject.set(x, "readableStreams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadableStreamsUndefined: Self = StObject.set(x, "readableStreams", js.undefined)
      
      @scala.inline
      def setRetryBackoffPower(value: Double): Self = StObject.set(x, "retryBackoffPower", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryBackoffPowerUndefined: Self = StObject.set(x, "retryBackoffPower", js.undefined)
      
      @scala.inline
      def setS3Acceleration(value: Boolean): Self = StObject.set(x, "s3Acceleration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3AccelerationUndefined: Self = StObject.set(x, "s3Acceleration", js.undefined)
      
      @scala.inline
      def setS3FileCacheHoursAgo(value: Double): Self = StObject.set(x, "s3FileCacheHoursAgo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3FileCacheHoursAgoNull: Self = StObject.set(x, "s3FileCacheHoursAgo", null)
      
      @scala.inline
      def setS3FileCacheHoursAgoUndefined: Self = StObject.set(x, "s3FileCacheHoursAgo", js.undefined)
      
      @scala.inline
      def setSendCanonicalRequestToSignerUrl(value: Boolean): Self = StObject.set(x, "sendCanonicalRequestToSignerUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSendCanonicalRequestToSignerUrlUndefined: Self = StObject.set(x, "sendCanonicalRequestToSignerUrl", js.undefined)
      
      @scala.inline
      def setSignHeaders(value: js.Object): Self = StObject.set(x, "signHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignHeadersUndefined: Self = StObject.set(x, "signHeaders", js.undefined)
      
      @scala.inline
      def setSignParams(value: js.Object): Self = StObject.set(x, "signParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignParamsUndefined: Self = StObject.set(x, "signParams", js.undefined)
      
      @scala.inline
      def setSignResponseHandler(
        value: (/* response */ js.Any, /* stringToSign */ String, /* signatureDateTime */ String) => js.Promise[String]
      ): Self = StObject.set(x, "signResponseHandler", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSignResponseHandlerNull: Self = StObject.set(x, "signResponseHandler", null)
      
      @scala.inline
      def setSignResponseHandlerUndefined: Self = StObject.set(x, "signResponseHandler", js.undefined)
      
      @scala.inline
      def setSignerUrl(value: String): Self = StObject.set(x, "signerUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignerUrlUndefined: Self = StObject.set(x, "signerUrl", js.undefined)
      
      @scala.inline
      def setTimeUrl(value: String): Self = StObject.set(x, "timeUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeUrlUndefined: Self = StObject.set(x, "timeUrl", js.undefined)
      
      @scala.inline
      def setXhrWithCredentials(value: Boolean): Self = StObject.set(x, "xhrWithCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXhrWithCredentialsUndefined: Self = StObject.set(x, "xhrWithCredentials", js.undefined)
    }
  }
  
  @js.native
  trait Evaporate extends StObject {
    
    def add(config: AddConfig): js.Promise[String] = js.native
    def add(config: AddConfig, options: AddOverrideOptions): js.Promise[String] = js.native
    
    def cancel(): js.Promise[js.Array[js.UndefOr[scala.Nothing]]] = js.native
    def cancel(file_key: String): js.Promise[js.Array[js.UndefOr[scala.Nothing]]] = js.native
    
    def pause(): js.Promise[js.Array[js.UndefOr[scala.Nothing]]] = js.native
    def pause(file_key: js.UndefOr[scala.Nothing], options: js.Object): js.Promise[js.Array[js.UndefOr[scala.Nothing]]] = js.native
    def pause(file_key: String): js.Promise[js.Array[js.UndefOr[scala.Nothing]]] = js.native
    def pause(file_key: String, options: js.Object): js.Promise[js.Array[js.UndefOr[scala.Nothing]]] = js.native
    
    def resume(): js.Promise[js.Array[js.UndefOr[scala.Nothing]]] = js.native
    def resume(file_key: String): js.Promise[js.Array[js.UndefOr[scala.Nothing]]] = js.native
    
    var supported: Boolean = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.evaporate.evaporateStrings.maxConcurrentParts
    - typingsSlinky.evaporate.evaporateStrings.logging
    - typingsSlinky.evaporate.evaporateStrings.cloudfront
    - typingsSlinky.evaporate.evaporateStrings.encodeFilename
    - typingsSlinky.evaporate.evaporateStrings.computeContentMd5
    - typingsSlinky.evaporate.evaporateStrings.allowS3ExistenceOptimization
    - typingsSlinky.evaporate.evaporateStrings.onlyRetryForSameFileName
    - typingsSlinky.evaporate.evaporateStrings.timeUrl
    - typingsSlinky.evaporate.evaporateStrings.cryptoMd5Method
    - typingsSlinky.evaporate.evaporateStrings.cryptoHexEncodedHash256
    - typingsSlinky.evaporate.evaporateStrings.awsRegion
    - typingsSlinky.evaporate.evaporateStrings.awsSignatureVersion
    - typingsSlinky.evaporate.evaporateStrings.evaporateChanged
  */
  trait ImmutableOptionKeys extends StObject
  object ImmutableOptionKeys {
    
    @scala.inline
    def allowS3ExistenceOptimization: typingsSlinky.evaporate.evaporateStrings.allowS3ExistenceOptimization = "allowS3ExistenceOptimization".asInstanceOf[typingsSlinky.evaporate.evaporateStrings.allowS3ExistenceOptimization]
    
    @scala.inline
    def awsRegion: typingsSlinky.evaporate.evaporateStrings.awsRegion = "awsRegion".asInstanceOf[typingsSlinky.evaporate.evaporateStrings.awsRegion]
    
    @scala.inline
    def awsSignatureVersion: typingsSlinky.evaporate.evaporateStrings.awsSignatureVersion = "awsSignatureVersion".asInstanceOf[typingsSlinky.evaporate.evaporateStrings.awsSignatureVersion]
    
    @scala.inline
    def cloudfront: typingsSlinky.evaporate.evaporateStrings.cloudfront = "cloudfront".asInstanceOf[typingsSlinky.evaporate.evaporateStrings.cloudfront]
    
    @scala.inline
    def computeContentMd5: typingsSlinky.evaporate.evaporateStrings.computeContentMd5 = "computeContentMd5".asInstanceOf[typingsSlinky.evaporate.evaporateStrings.computeContentMd5]
    
    @scala.inline
    def cryptoHexEncodedHash256: typingsSlinky.evaporate.evaporateStrings.cryptoHexEncodedHash256 = "cryptoHexEncodedHash256".asInstanceOf[typingsSlinky.evaporate.evaporateStrings.cryptoHexEncodedHash256]
    
    @scala.inline
    def cryptoMd5Method: typingsSlinky.evaporate.evaporateStrings.cryptoMd5Method = "cryptoMd5Method".asInstanceOf[typingsSlinky.evaporate.evaporateStrings.cryptoMd5Method]
    
    @scala.inline
    def encodeFilename: typingsSlinky.evaporate.evaporateStrings.encodeFilename = "encodeFilename".asInstanceOf[typingsSlinky.evaporate.evaporateStrings.encodeFilename]
    
    @scala.inline
    def evaporateChanged: typingsSlinky.evaporate.evaporateStrings.evaporateChanged = "evaporateChanged".asInstanceOf[typingsSlinky.evaporate.evaporateStrings.evaporateChanged]
    
    @scala.inline
    def logging: typingsSlinky.evaporate.evaporateStrings.logging = "logging".asInstanceOf[typingsSlinky.evaporate.evaporateStrings.logging]
    
    @scala.inline
    def maxConcurrentParts: typingsSlinky.evaporate.evaporateStrings.maxConcurrentParts = "maxConcurrentParts".asInstanceOf[typingsSlinky.evaporate.evaporateStrings.maxConcurrentParts]
    
    @scala.inline
    def onlyRetryForSameFileName: typingsSlinky.evaporate.evaporateStrings.onlyRetryForSameFileName = "onlyRetryForSameFileName".asInstanceOf[typingsSlinky.evaporate.evaporateStrings.onlyRetryForSameFileName]
    
    @scala.inline
    def timeUrl: typingsSlinky.evaporate.evaporateStrings.timeUrl = "timeUrl".asInstanceOf[typingsSlinky.evaporate.evaporateStrings.timeUrl]
  }
  
  @js.native
  trait PauseConfig extends StObject {
    
    var force: js.UndefOr[Boolean] = js.native
  }
  object PauseConfig {
    
    @scala.inline
    def apply(): PauseConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PauseConfig]
    }
    
    @scala.inline
    implicit class PauseConfigMutableBuilder[Self <: PauseConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    }
  }
  
  @js.native
  trait TransferStats extends StObject {
    
    var fileSize: Double = js.native
    
    var loaded: Double = js.native
    
    var readableSpeed: String = js.native
    
    var remainingSize: Double = js.native
    
    var secondsLeft: Double = js.native
    
    var speed: Double = js.native
    
    var totalUploaded: Double = js.native
  }
  object TransferStats {
    
    @scala.inline
    def apply(
      fileSize: Double,
      loaded: Double,
      readableSpeed: String,
      remainingSize: Double,
      secondsLeft: Double,
      speed: Double,
      totalUploaded: Double
    ): TransferStats = {
      val __obj = js.Dynamic.literal(fileSize = fileSize.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], readableSpeed = readableSpeed.asInstanceOf[js.Any], remainingSize = remainingSize.asInstanceOf[js.Any], secondsLeft = secondsLeft.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], totalUploaded = totalUploaded.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransferStats]
    }
    
    @scala.inline
    implicit class TransferStatsMutableBuilder[Self <: TransferStats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadableSpeed(value: String): Self = StObject.set(x, "readableSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemainingSize(value: Double): Self = StObject.set(x, "remainingSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondsLeft(value: Double): Self = StObject.set(x, "secondsLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalUploaded(value: Double): Self = StObject.set(x, "totalUploaded", value.asInstanceOf[js.Any])
    }
  }
}
