package typingsSlinky.awsLambda

import typingsSlinky.awsLambda.anon.Cf
import typingsSlinky.awsLambda.cloudfrontMod.CloudFrontHeaders
import typingsSlinky.awsLambda.handlerMod.Callback
import typingsSlinky.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudfrontRequestMod {
  
  type CloudFrontRequestCallback = Callback[CloudFrontRequestResult]
  
  @js.native
  trait CloudFrontRequestEvent extends StObject {
    
    var Records: js.Array[Cf] = js.native
  }
  object CloudFrontRequestEvent {
    
    @scala.inline
    def apply(Records: js.Array[Cf]): CloudFrontRequestEvent = {
      val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudFrontRequestEvent]
    }
    
    @scala.inline
    implicit class CloudFrontRequestEventMutableBuilder[Self <: CloudFrontRequestEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRecords(value: js.Array[Cf]): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordsVarargs(value: Cf*): Self = StObject.set(x, "Records", js.Array(value :_*))
    }
  }
  
  type CloudFrontRequestHandler = Handler[CloudFrontRequestEvent, CloudFrontRequestResult]
  
  /* Rewritten from type alias, can be one of: 
    - js.UndefOr[scala.Nothing]
    - scala.Null
    - typingsSlinky.awsLambda.cloudfrontMod.CloudFrontResultResponse
    - typingsSlinky.awsLambda.cloudfrontMod.CloudFrontRequest
  */
  type CloudFrontRequestResult = js.UndefOr[_CloudFrontRequestResult | Null]
  
  trait _CloudFrontRequestResult extends StObject
  object _CloudFrontRequestResult {
    
    @scala.inline
    def CloudFrontRequest(clientIp: String, headers: CloudFrontHeaders, method: String, querystring: String, uri: String): typingsSlinky.awsLambda.cloudfrontMod.CloudFrontRequest = {
      val __obj = js.Dynamic.literal(clientIp = clientIp.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], querystring = querystring.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsLambda.cloudfrontMod.CloudFrontRequest]
    }
    
    @scala.inline
    def CloudFrontResultResponse(status: String): typingsSlinky.awsLambda.cloudfrontMod.CloudFrontResultResponse = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsLambda.cloudfrontMod.CloudFrontResultResponse]
    }
  }
}
