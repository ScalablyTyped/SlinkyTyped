package typingsSlinky.algoliaRequesterCommon

import typingsSlinky.algoliaRequesterCommon.anon.ReadonlyPromiseResponse
import typingsSlinky.algoliaRequesterCommon.anon.ReadonlyPromisevoid
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@algolia/requester-common", "MethodEnum")
  @js.native
  val MethodEnum: Record[String, MethodType] = js.native
  
  @js.native
  trait Destroyable extends StObject {
    
    /**
      * Destroy any sockets that are currently in use by the agent.
      *
      * It is usually not necessary to do this. However, if using an agent with keepAlive enabled, then
      * it is best to explicitly shut down the agent when it will no longer be used. Otherwise, sockets
      * may hang open for quite a long time before the server terminates them.
      */
    def destroy(): ReadonlyPromisevoid = js.native
  }
  object Destroyable {
    
    @scala.inline
    def apply(destroy: () => ReadonlyPromisevoid): Destroyable = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
      __obj.asInstanceOf[Destroyable]
    }
    
    @scala.inline
    implicit class DestroyableMutableBuilder[Self <: Destroyable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => ReadonlyPromisevoid): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.algoliaRequesterCommon.algoliaRequesterCommonStrings.DELETE
    - typingsSlinky.algoliaRequesterCommon.algoliaRequesterCommonStrings.GET
    - typingsSlinky.algoliaRequesterCommon.algoliaRequesterCommonStrings.POST
    - typingsSlinky.algoliaRequesterCommon.algoliaRequesterCommonStrings.PUT
  */
  trait MethodType extends StObject
  object MethodType {
    
    @scala.inline
    def DELETE: typingsSlinky.algoliaRequesterCommon.algoliaRequesterCommonStrings.DELETE = "DELETE".asInstanceOf[typingsSlinky.algoliaRequesterCommon.algoliaRequesterCommonStrings.DELETE]
    
    @scala.inline
    def GET: typingsSlinky.algoliaRequesterCommon.algoliaRequesterCommonStrings.GET = "GET".asInstanceOf[typingsSlinky.algoliaRequesterCommon.algoliaRequesterCommonStrings.GET]
    
    @scala.inline
    def POST: typingsSlinky.algoliaRequesterCommon.algoliaRequesterCommonStrings.POST = "POST".asInstanceOf[typingsSlinky.algoliaRequesterCommon.algoliaRequesterCommonStrings.POST]
    
    @scala.inline
    def PUT: typingsSlinky.algoliaRequesterCommon.algoliaRequesterCommonStrings.PUT = "PUT".asInstanceOf[typingsSlinky.algoliaRequesterCommon.algoliaRequesterCommonStrings.PUT]
  }
  
  @js.native
  trait Request extends StObject {
    
    /**
      * The timeout to stablish a connection with the server.
      */
    val connectTimeout: Double = js.native
    
    /**
      * The data to be transfered to the server.
      */
    val data: js.UndefOr[String] = js.native
    
    /**
      * The headers of the request.
      */
    val headers: Record[String, String] = js.native
    
    /**
      * The method of the request. `GET`, etc.
      */
    val method: MethodType = js.native
    
    /**
      * The timeout to receive the response.
      */
    val responseTimeout: Double = js.native
    
    /**
      * The complete url of the request, with the protocol.
      */
    val url: String = js.native
  }
  object Request {
    
    @scala.inline
    def apply(
      connectTimeout: Double,
      headers: Record[String, String],
      method: MethodType,
      responseTimeout: Double,
      url: String
    ): Request = {
      val __obj = js.Dynamic.literal(connectTimeout = connectTimeout.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], responseTimeout = responseTimeout.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    @scala.inline
    implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: MethodType): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTimeout(value: Double): Self = StObject.set(x, "responseTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Requester extends StObject {
    
    /**
      * Sends the given `request` to the server.
      */
    def send(request: Request): ReadonlyPromiseResponse = js.native
  }
  object Requester {
    
    @scala.inline
    def apply(send: Request => ReadonlyPromiseResponse): Requester = {
      val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send))
      __obj.asInstanceOf[Requester]
    }
    
    @scala.inline
    implicit class RequesterMutableBuilder[Self <: Requester] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSend(value: Request => ReadonlyPromiseResponse): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Response extends StObject {
    
    /**
      * The raw response from the server.
      */
    var content: String = js.native
    
    /**
      * If the request timeouted.
      */
    var isTimedOut: Boolean = js.native
    
    /**
      * The http status code.
      */
    var status: Double = js.native
  }
  object Response {
    
    @scala.inline
    def apply(content: String, isTimedOut: Boolean, status: Double): Response = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], isTimedOut = isTimedOut.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    @scala.inline
    implicit class ResponseMutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTimedOut(value: Boolean): Self = StObject.set(x, "isTimedOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
