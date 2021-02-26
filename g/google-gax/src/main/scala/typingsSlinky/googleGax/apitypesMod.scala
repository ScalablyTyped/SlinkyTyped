package typingsSlinky.googleGax

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleGax.anon.Deadline
import typingsSlinky.googleGax.callMod.CancellablePromise
import typingsSlinky.googleGax.gaxMod.CallOptions
import typingsSlinky.googleGax.googleErrorMod.GoogleError
import typingsSlinky.googleGax.longrunningMod.Operation_
import typingsSlinky.node.streamMod.Duplex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apitypesMod {
  
  type APICallback = js.Function4[
    /* err */ GoogleError | Null, 
    /* response */ js.UndefOr[ResponseType], 
    /* next */ js.UndefOr[NextPageRequestType], 
    /* rawResponse */ js.UndefOr[RawResponseType], 
    Unit
  ]
  
  type BiDiStreamingCall = js.Function2[/* metadata */ js.Object, /* options */ js.Object, Duplex with GRPCCallResult]
  
  type CancellableStream = Duplex with GRPCCallResult
  
  type ClientStreamingCall = js.Function3[
    /* metadata */ js.Object, 
    /* options */ js.Object, 
    /* callback */ js.UndefOr[APICallback], 
    Duplex with GRPCCallResult
  ]
  
  type GRPCCall = UnaryCall | ServerStreamingCall | ClientStreamingCall | BiDiStreamingCall
  
  @js.native
  trait GRPCCallOtherArgs extends StObject {
    
    var headers: js.UndefOr[js.Object] = js.native
    
    def metadataBuilder(): js.Object = js.native
    def metadataBuilder(abTests: js.UndefOr[scala.Nothing], headers: js.Object): js.Object = js.native
    def metadataBuilder(abTests: js.Object): js.Object = js.native
    def metadataBuilder(abTests: js.Object, headers: js.Object): js.Object = js.native
    
    var options: js.UndefOr[Deadline] = js.native
  }
  
  @js.native
  trait GRPCCallResult extends StObject {
    
    def cancel(): Unit = js.native
  }
  object GRPCCallResult {
    
    @scala.inline
    def apply(cancel: () => Unit): GRPCCallResult = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
      __obj.asInstanceOf[GRPCCallResult]
    }
    
    @scala.inline
    implicit class GRPCCallResultMutableBuilder[Self <: GRPCCallResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    }
  }
  
  type GaxCall = js.Function3[
    /* argument */ js.Object, 
    /* callOptions */ js.UndefOr[CallOptions], 
    /* callback */ js.UndefOr[APICallback], 
    GaxCallResult
  ]
  
  type GaxCallPromise = js.Function3[
    /* argument */ js.Object, 
    /* callOptions */ js.UndefOr[CallOptions], 
    /* callback */ js.UndefOr[APICallback], 
    CancellablePromise[ResultTuple]
  ]
  
  type GaxCallResult = CancellablePromise[ResultTuple] | CancellableStream
  
  type GaxCallStream = js.Function3[
    /* argument */ js.Object, 
    /* callOptions */ js.UndefOr[CallOptions], 
    /* callback */ js.UndefOr[APICallback], 
    CancellableStream
  ]
  
  type NextPageRequestType = (StringDictionary[String | Double | js.Object]) | Null
  
  type RawResponseType = Operation_ | js.Object | Null
  
  type RequestType = StringDictionary[String | Double | js.Object]
  
  type ResponseType = js.Object | Null
  
  type ResultTuple = js.Tuple3[
    ResponseType | js.Array[ResponseType], 
    js.UndefOr[NextPageRequestType], 
    js.UndefOr[RawResponseType]
  ]
  
  type ServerStreamingCall = js.Function3[
    /* argument */ js.Object, 
    /* metadata */ js.Object, 
    /* options */ js.Object, 
    Duplex with GRPCCallResult
  ]
  
  type SimpleCallbackFunction = js.Function2[/* request */ RequestType, /* callback */ APICallback, GRPCCallResult]
  
  type UnaryCall = js.Function4[
    /* argument */ js.Object, 
    /* metadata */ js.Object, 
    /* options */ js.Object, 
    /* callback */ APICallback, 
    GRPCCallResult
  ]
}
