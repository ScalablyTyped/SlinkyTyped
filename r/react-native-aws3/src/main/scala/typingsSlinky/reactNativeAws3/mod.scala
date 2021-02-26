package typingsSlinky.reactNativeAws3

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.FormData
import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object RNS3 {
    
    @JSImport("react-native-aws3", "RNS3.put")
    @js.native
    def put(file: File, options: Options): Request = js.native
  }
  
  @js.native
  trait File extends StObject {
    
    /**
      * The name of the file, will be stored as such in S3
      */
    var name: String = js.native
    
    /**
      * The mime type, also used for Content-Type parameter in the S3 post policy
      */
    var `type`: String = js.native
    
    /**
      * File system URI, can be assets library path or file:// path
      */
    var uri: String = js.native
  }
  object File {
    
    @scala.inline
    def apply(name: String, `type`: String, uri: String): File = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    @scala.inline
    implicit class FileMutableBuilder[Self <: File] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Your S3 AWSAccessKeyId
      */
    var accessKey: String = js.native
    
    /**
      * The Access Control List of this object
      * @default "public-read"
      */
    var acl: js.UndefOr[String] = js.native
    
    /**
      * AWS S3 url
      * @default "s3.amazonaws.com"
      */
    var awsUrl: js.UndefOr[String] = js.native
    
    /**
      * Your S3 bucket
      */
    var bucket: String = js.native
    
    /**
      * Prefix, or path to the file on S3, i.e. uploads/ (note the trailing slash)
      */
    var keyPrefix: js.UndefOr[String] = js.native
    
    /**
      * The region of your S3 bucket
      */
    var region: String = js.native
    
    /**
      * Your S3 AWSSecretKey
      */
    var secretKey: String = js.native
    
    /**
      * HTTP response status if successful
      * @default 201
      */
    var successActionStatus: js.UndefOr[Double] = js.native
    
    /**
      * Devices time offset from world clock in milliseconds
      * @default 0
      */
    var timeDelta: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(accessKey: String, bucket: String, region: String, secretKey: String): Options = {
      val __obj = js.Dynamic.literal(accessKey = accessKey.asInstanceOf[js.Any], bucket = bucket.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcl(value: String): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAclUndefined: Self = StObject.set(x, "acl", js.undefined)
      
      @scala.inline
      def setAwsUrl(value: String): Self = StObject.set(x, "awsUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAwsUrlUndefined: Self = StObject.set(x, "awsUrl", js.undefined)
      
      @scala.inline
      def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyPrefix(value: String): Self = StObject.set(x, "keyPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyPrefixUndefined: Self = StObject.set(x, "keyPrefix", js.undefined)
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretKey(value: String): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessActionStatus(value: Double): Self = StObject.set(x, "successActionStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessActionStatusUndefined: Self = StObject.set(x, "successActionStatus", js.undefined)
      
      @scala.inline
      def setTimeDelta(value: Double): Self = StObject.set(x, "timeDelta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeDeltaUndefined: Self = StObject.set(x, "timeDelta", js.undefined)
    }
  }
  
  @js.native
  trait Progress extends StObject {
    
    /**
      * amount uploaded
      */
    var loaded: Double = js.native
    
    /**
      * number between 0 and 1 representing the percent completed
      */
    var percent: Double = js.native
    
    /**
      * total amount to upload
      */
    var total: Double = js.native
  }
  object Progress {
    
    @scala.inline
    def apply(loaded: Double, percent: Double, total: Double): Progress = {
      val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Progress]
    }
    
    @scala.inline
    implicit class ProgressMutableBuilder[Self <: Progress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Request extends StObject {
    
    var _formData: FormData = js.native
    
    var _promise: js.Promise[Response] = js.native
    
    var _xhr: XMLHttpRequest = js.native
    
    def abort(): this.type = js.native
    
    def `catch`(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<this['_promise']['catch']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: this['_promise']['catch'] */ js.Any
        ]
    ): this.type = js.native
    
    def header(key: String, value: String): this.type = js.native
    
    def progress(callback: js.Function1[/* progress */ Progress, _]): this.type = js.native
    
    def send(): this.type = js.native
    
    def set(key: String, value: String): this.type = js.native
    def set(key: String, value: Blob): this.type = js.native
    
    def `then`(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<this['_promise']['then']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: this['_promise']['then'] */ js.Any
        ]
    ): this.type = js.native
  }
  
  @js.native
  trait Response extends StObject {
    
    var headers: StringDictionary[String] = js.native
    
    var status: Double = js.native
    
    var text: String = js.native
  }
  object Response {
    
    @scala.inline
    def apply(headers: StringDictionary[String], status: Double, text: String): Response = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    @scala.inline
    implicit class ResponseMutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
