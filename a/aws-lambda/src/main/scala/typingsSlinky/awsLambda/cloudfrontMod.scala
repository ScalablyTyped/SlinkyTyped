package typingsSlinky.awsLambda

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsLambda.anon.Action
import typingsSlinky.awsLambda.anon.DistributionDomainName
import typingsSlinky.awsLambda.anon.Key
import typingsSlinky.awsLambda.awsLambdaStrings.`origin-access-identity`
import typingsSlinky.awsLambda.awsLambdaStrings.base64
import typingsSlinky.awsLambda.awsLambdaStrings.http
import typingsSlinky.awsLambda.awsLambdaStrings.https
import typingsSlinky.awsLambda.awsLambdaStrings.none_
import typingsSlinky.awsLambda.awsLambdaStrings.text_
import typingsSlinky.awsLambda.cloudfrontRequestMod._CloudFrontRequestResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudfrontMod {
  
  @js.native
  trait CloudFrontCustomOrigin extends StObject {
    
    var customHeaders: CloudFrontHeaders = js.native
    
    var domainName: String = js.native
    
    var keepaliveTimeout: Double = js.native
    
    var path: String = js.native
    
    var port: Double = js.native
    
    var protocol: http | https = js.native
    
    var readTimeout: Double = js.native
    
    var sslProtocols: js.Array[String] = js.native
  }
  object CloudFrontCustomOrigin {
    
    @scala.inline
    def apply(
      customHeaders: CloudFrontHeaders,
      domainName: String,
      keepaliveTimeout: Double,
      path: String,
      port: Double,
      protocol: http | https,
      readTimeout: Double,
      sslProtocols: js.Array[String]
    ): CloudFrontCustomOrigin = {
      val __obj = js.Dynamic.literal(customHeaders = customHeaders.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any], keepaliveTimeout = keepaliveTimeout.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], readTimeout = readTimeout.asInstanceOf[js.Any], sslProtocols = sslProtocols.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudFrontCustomOrigin]
    }
    
    @scala.inline
    implicit class CloudFrontCustomOriginMutableBuilder[Self <: CloudFrontCustomOrigin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomHeaders(value: CloudFrontHeaders): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepaliveTimeout(value: Double): Self = StObject.set(x, "keepaliveTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: http | https): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadTimeout(value: Double): Self = StObject.set(x, "readTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslProtocols(value: js.Array[String]): Self = StObject.set(x, "sslProtocols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslProtocolsVarargs(value: String*): Self = StObject.set(x, "sslProtocols", js.Array(value :_*))
    }
  }
  
  @js.native
  trait CloudFrontEvent extends StObject {
    
    var config: DistributionDomainName = js.native
  }
  object CloudFrontEvent {
    
    @scala.inline
    def apply(config: DistributionDomainName): CloudFrontEvent = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudFrontEvent]
    }
    
    @scala.inline
    implicit class CloudFrontEventMutableBuilder[Self <: CloudFrontEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: DistributionDomainName): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    }
  }
  
  type CloudFrontHeaders = StringDictionary[js.Array[Key]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsLambda.anon.Custom
    - typingsSlinky.awsLambda.anon.S3
  */
  trait CloudFrontOrigin extends StObject
  object CloudFrontOrigin {
    
    @scala.inline
    def Custom(s3: CloudFrontS3Origin): typingsSlinky.awsLambda.anon.Custom = {
      val __obj = js.Dynamic.literal(s3 = s3.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsLambda.anon.Custom]
    }
    
    @scala.inline
    def S3(custom: CloudFrontCustomOrigin): typingsSlinky.awsLambda.anon.S3 = {
      val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsLambda.anon.S3]
    }
  }
  
  @js.native
  trait CloudFrontRequest extends _CloudFrontRequestResult {
    
    var body: js.UndefOr[Action] = js.native
    
    val clientIp: String = js.native
    
    var headers: CloudFrontHeaders = js.native
    
    val method: String = js.native
    
    var origin: js.UndefOr[CloudFrontOrigin] = js.native
    
    var querystring: String = js.native
    
    var uri: String = js.native
  }
  object CloudFrontRequest {
    
    @scala.inline
    def apply(clientIp: String, headers: CloudFrontHeaders, method: String, querystring: String, uri: String): CloudFrontRequest = {
      val __obj = js.Dynamic.literal(clientIp = clientIp.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], querystring = querystring.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudFrontRequest]
    }
    
    @scala.inline
    implicit class CloudFrontRequestMutableBuilder[Self <: CloudFrontRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: Action): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setClientIp(value: String): Self = StObject.set(x, "clientIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: CloudFrontHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrigin(value: CloudFrontOrigin): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      @scala.inline
      def setQuerystring(value: String): Self = StObject.set(x, "querystring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CloudFrontResponse extends StObject {
    
    var headers: CloudFrontHeaders = js.native
    
    var status: String = js.native
    
    var statusDescription: String = js.native
  }
  object CloudFrontResponse {
    
    @scala.inline
    def apply(headers: CloudFrontHeaders, status: String, statusDescription: String): CloudFrontResponse = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusDescription = statusDescription.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudFrontResponse]
    }
    
    @scala.inline
    implicit class CloudFrontResponseMutableBuilder[Self <: CloudFrontResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: CloudFrontHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusDescription(value: String): Self = StObject.set(x, "statusDescription", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CloudFrontResultResponse extends _CloudFrontRequestResult {
    
    var body: js.UndefOr[String] = js.native
    
    var bodyEncoding: js.UndefOr[text_ | base64] = js.native
    
    var headers: js.UndefOr[CloudFrontHeaders] = js.native
    
    var status: String = js.native
    
    var statusDescription: js.UndefOr[String] = js.native
  }
  object CloudFrontResultResponse {
    
    @scala.inline
    def apply(status: String): CloudFrontResultResponse = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudFrontResultResponse]
    }
    
    @scala.inline
    implicit class CloudFrontResultResponseMutableBuilder[Self <: CloudFrontResultResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyEncoding(value: text_ | base64): Self = StObject.set(x, "bodyEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyEncodingUndefined: Self = StObject.set(x, "bodyEncoding", js.undefined)
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setHeaders(value: CloudFrontHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusDescription(value: String): Self = StObject.set(x, "statusDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusDescriptionUndefined: Self = StObject.set(x, "statusDescription", js.undefined)
    }
  }
  
  @js.native
  trait CloudFrontS3Origin extends StObject {
    
    var authMethod: `origin-access-identity` | none_ = js.native
    
    var customHeaders: CloudFrontHeaders = js.native
    
    var domainName: String = js.native
    
    var path: String = js.native
    
    var region: String = js.native
  }
  object CloudFrontS3Origin {
    
    @scala.inline
    def apply(
      authMethod: `origin-access-identity` | none_,
      customHeaders: CloudFrontHeaders,
      domainName: String,
      path: String,
      region: String
    ): CloudFrontS3Origin = {
      val __obj = js.Dynamic.literal(authMethod = authMethod.asInstanceOf[js.Any], customHeaders = customHeaders.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudFrontS3Origin]
    }
    
    @scala.inline
    implicit class CloudFrontS3OriginMutableBuilder[Self <: CloudFrontS3Origin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthMethod(value: `origin-access-identity` | none_): Self = StObject.set(x, "authMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomHeaders(value: CloudFrontHeaders): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    }
  }
}
