package typingsSlinky.ethersprojectWeb

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ethersprojectWeb.ethersprojectWebStrings.block
import typingsSlinky.ethersprojectWeb.ethersprojectWebStrings.poll
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/web", "_fetchData")
  @js.native
  def fetchData[T](connection: String): js.Promise[T] = js.native
  @JSImport("@ethersproject/web", "_fetchData")
  @js.native
  def fetchData[T](
    connection: String,
    body: js.UndefOr[scala.Nothing],
    processFunc: js.Function2[/* value */ js.typedarray.Uint8Array, /* response */ FetchJsonResponse, T]
  ): js.Promise[T] = js.native
  @JSImport("@ethersproject/web", "_fetchData")
  @js.native
  def fetchData[T](connection: String, body: js.typedarray.Uint8Array): js.Promise[T] = js.native
  @JSImport("@ethersproject/web", "_fetchData")
  @js.native
  def fetchData[T](
    connection: String,
    body: js.typedarray.Uint8Array,
    processFunc: js.Function2[/* value */ js.typedarray.Uint8Array, /* response */ FetchJsonResponse, T]
  ): js.Promise[T] = js.native
  @JSImport("@ethersproject/web", "_fetchData")
  @js.native
  def fetchData[T](connection: ConnectionInfo): js.Promise[T] = js.native
  @JSImport("@ethersproject/web", "_fetchData")
  @js.native
  def fetchData[T](
    connection: ConnectionInfo,
    body: js.UndefOr[scala.Nothing],
    processFunc: js.Function2[/* value */ js.typedarray.Uint8Array, /* response */ FetchJsonResponse, T]
  ): js.Promise[T] = js.native
  @JSImport("@ethersproject/web", "_fetchData")
  @js.native
  def fetchData[T](connection: ConnectionInfo, body: js.typedarray.Uint8Array): js.Promise[T] = js.native
  @JSImport("@ethersproject/web", "_fetchData")
  @js.native
  def fetchData[T](
    connection: ConnectionInfo,
    body: js.typedarray.Uint8Array,
    processFunc: js.Function2[/* value */ js.typedarray.Uint8Array, /* response */ FetchJsonResponse, T]
  ): js.Promise[T] = js.native
  
  @JSImport("@ethersproject/web", "fetchJson")
  @js.native
  def fetchJson(connection: String): js.Promise[_] = js.native
  @JSImport("@ethersproject/web", "fetchJson")
  @js.native
  def fetchJson(
    connection: String,
    json: js.UndefOr[scala.Nothing],
    processFunc: js.Function2[/* value */ js.Any, /* response */ FetchJsonResponse, _]
  ): js.Promise[_] = js.native
  @JSImport("@ethersproject/web", "fetchJson")
  @js.native
  def fetchJson(connection: String, json: String): js.Promise[_] = js.native
  @JSImport("@ethersproject/web", "fetchJson")
  @js.native
  def fetchJson(
    connection: String,
    json: String,
    processFunc: js.Function2[/* value */ js.Any, /* response */ FetchJsonResponse, _]
  ): js.Promise[_] = js.native
  @JSImport("@ethersproject/web", "fetchJson")
  @js.native
  def fetchJson(connection: ConnectionInfo): js.Promise[_] = js.native
  @JSImport("@ethersproject/web", "fetchJson")
  @js.native
  def fetchJson(
    connection: ConnectionInfo,
    json: js.UndefOr[scala.Nothing],
    processFunc: js.Function2[/* value */ js.Any, /* response */ FetchJsonResponse, _]
  ): js.Promise[_] = js.native
  @JSImport("@ethersproject/web", "fetchJson")
  @js.native
  def fetchJson(connection: ConnectionInfo, json: String): js.Promise[_] = js.native
  @JSImport("@ethersproject/web", "fetchJson")
  @js.native
  def fetchJson(
    connection: ConnectionInfo,
    json: String,
    processFunc: js.Function2[/* value */ js.Any, /* response */ FetchJsonResponse, _]
  ): js.Promise[_] = js.native
  
  @JSImport("@ethersproject/web", "poll")
  @js.native
  def poll[T](func: js.Function0[js.Promise[T]]): js.Promise[T] = js.native
  @JSImport("@ethersproject/web", "poll")
  @js.native
  def poll[T](func: js.Function0[js.Promise[T]], options: PollOptions): js.Promise[T] = js.native
  
  @js.native
  trait ConnectionInfo extends StObject {
    
    var allowGzip: js.UndefOr[Boolean] = js.native
    
    var allowInsecureAuthentication: js.UndefOr[Boolean] = js.native
    
    var headers: js.UndefOr[StringDictionary[String | Double]] = js.native
    
    var password: js.UndefOr[String] = js.native
    
    var throttleCallback: js.UndefOr[js.Function2[/* attempt */ Double, /* url */ String, js.Promise[Boolean]]] = js.native
    
    var throttleLimit: js.UndefOr[Double] = js.native
    
    var throttleSlotInterval: js.UndefOr[Double] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var url: String = js.native
    
    var user: js.UndefOr[String] = js.native
  }
  object ConnectionInfo {
    
    @scala.inline
    def apply(url: String): ConnectionInfo = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionInfo]
    }
    
    @scala.inline
    implicit class ConnectionInfoMutableBuilder[Self <: ConnectionInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowGzip(value: Boolean): Self = StObject.set(x, "allowGzip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowGzipUndefined: Self = StObject.set(x, "allowGzip", js.undefined)
      
      @scala.inline
      def setAllowInsecureAuthentication(value: Boolean): Self = StObject.set(x, "allowInsecureAuthentication", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowInsecureAuthenticationUndefined: Self = StObject.set(x, "allowInsecureAuthentication", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String | Double]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setThrottleCallback(value: (/* attempt */ Double, /* url */ String) => js.Promise[Boolean]): Self = StObject.set(x, "throttleCallback", js.Any.fromFunction2(value))
      
      @scala.inline
      def setThrottleCallbackUndefined: Self = StObject.set(x, "throttleCallback", js.undefined)
      
      @scala.inline
      def setThrottleLimit(value: Double): Self = StObject.set(x, "throttleLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottleLimitUndefined: Self = StObject.set(x, "throttleLimit", js.undefined)
      
      @scala.inline
      def setThrottleSlotInterval(value: Double): Self = StObject.set(x, "throttleSlotInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottleSlotIntervalUndefined: Self = StObject.set(x, "throttleSlotInterval", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  @js.native
  trait FetchJsonResponse extends StObject {
    
    var headers: StringDictionary[String] = js.native
    
    var statusCode: Double = js.native
  }
  object FetchJsonResponse {
    
    @scala.inline
    def apply(headers: StringDictionary[String], statusCode: Double): FetchJsonResponse = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchJsonResponse]
    }
    
    @scala.inline
    implicit class FetchJsonResponseMutableBuilder[Self <: FetchJsonResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OnceBlockable extends StObject {
    
    @JSName("once")
    def once_block(eventName: block, handler: js.Function0[Unit]): Unit = js.native
  }
  object OnceBlockable {
    
    @scala.inline
    def apply(once: (block, js.Function0[Unit]) => Unit): OnceBlockable = {
      val __obj = js.Dynamic.literal(once = js.Any.fromFunction2(once))
      __obj.asInstanceOf[OnceBlockable]
    }
    
    @scala.inline
    implicit class OnceBlockableMutableBuilder[Self <: OnceBlockable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnce(value: (block, js.Function0[Unit]) => Unit): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait OncePollable extends StObject {
    
    @JSName("once")
    def once_poll(eventName: poll, handler: js.Function0[Unit]): Unit = js.native
  }
  object OncePollable {
    
    @scala.inline
    def apply(once: (poll, js.Function0[Unit]) => Unit): OncePollable = {
      val __obj = js.Dynamic.literal(once = js.Any.fromFunction2(once))
      __obj.asInstanceOf[OncePollable]
    }
    
    @scala.inline
    implicit class OncePollableMutableBuilder[Self <: OncePollable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnce(value: (poll, js.Function0[Unit]) => Unit): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait PollOptions extends StObject {
    
    var ceiling: js.UndefOr[Double] = js.native
    
    var floor: js.UndefOr[Double] = js.native
    
    var interval: js.UndefOr[Double] = js.native
    
    var onceBlock: js.UndefOr[OnceBlockable] = js.native
    
    var oncePoll: js.UndefOr[OncePollable] = js.native
    
    var retryLimit: js.UndefOr[Double] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object PollOptions {
    
    @scala.inline
    def apply(): PollOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PollOptions]
    }
    
    @scala.inline
    implicit class PollOptionsMutableBuilder[Self <: PollOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCeiling(value: Double): Self = StObject.set(x, "ceiling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCeilingUndefined: Self = StObject.set(x, "ceiling", js.undefined)
      
      @scala.inline
      def setFloor(value: Double): Self = StObject.set(x, "floor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloorUndefined: Self = StObject.set(x, "floor", js.undefined)
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setOnceBlock(value: OnceBlockable): Self = StObject.set(x, "onceBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnceBlockUndefined: Self = StObject.set(x, "onceBlock", js.undefined)
      
      @scala.inline
      def setOncePoll(value: OncePollable): Self = StObject.set(x, "oncePoll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOncePollUndefined: Self = StObject.set(x, "oncePoll", js.undefined)
      
      @scala.inline
      def setRetryLimit(value: Double): Self = StObject.set(x, "retryLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryLimitUndefined: Self = StObject.set(x, "retryLimit", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
