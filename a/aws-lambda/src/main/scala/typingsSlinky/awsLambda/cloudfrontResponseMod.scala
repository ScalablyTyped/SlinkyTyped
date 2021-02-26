package typingsSlinky.awsLambda

import typingsSlinky.awsLambda.anon.CfCloudFrontEventreadonlyre
import typingsSlinky.awsLambda.cloudfrontMod.CloudFrontResultResponse
import typingsSlinky.awsLambda.handlerMod.Callback
import typingsSlinky.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudfrontResponseMod {
  
  type CloudFrontResponseCallback = Callback[CloudFrontResponseResult]
  
  @js.native
  trait CloudFrontResponseEvent extends StObject {
    
    var Records: js.Array[CfCloudFrontEventreadonlyre] = js.native
  }
  object CloudFrontResponseEvent {
    
    @scala.inline
    def apply(Records: js.Array[CfCloudFrontEventreadonlyre]): CloudFrontResponseEvent = {
      val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudFrontResponseEvent]
    }
    
    @scala.inline
    implicit class CloudFrontResponseEventMutableBuilder[Self <: CloudFrontResponseEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRecords(value: js.Array[CfCloudFrontEventreadonlyre]): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordsVarargs(value: CfCloudFrontEventreadonlyre*): Self = StObject.set(x, "Records", js.Array(value :_*))
    }
  }
  
  type CloudFrontResponseHandler = Handler[CloudFrontResponseEvent, CloudFrontResponseResult]
  
  type CloudFrontResponseResult = js.UndefOr[Null | CloudFrontResultResponse]
}
