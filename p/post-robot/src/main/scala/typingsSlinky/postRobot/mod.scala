package typingsSlinky.postRobot

import org.scalajs.dom.raw.Window
import typingsSlinky.postRobot.anon.Data
import typingsSlinky.postRobot.postRobotBooleans.`false`
import typingsSlinky.postRobot.postRobotBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("post-robot", "on")
  @js.native
  def on(name: String, options: HandlerType): CancelableType = js.native
  @JSImport("post-robot", "on")
  @js.native
  def on(name: String, options: HandlerType, handler: HandlerType): CancelableType = js.native
  @JSImport("post-robot", "on")
  @js.native
  def on(name: String, options: ServerOptionsType): CancelableType = js.native
  @JSImport("post-robot", "on")
  @js.native
  def on(name: String, options: ServerOptionsType, handler: HandlerType): CancelableType = js.native
  
  @JSImport("post-robot", "once")
  @js.native
  def once(name: String): ZalgoPromise[Data] = js.native
  @JSImport("post-robot", "once")
  @js.native
  def once(name: String, options: js.UndefOr[scala.Nothing], handler: HandlerType): ZalgoPromise[Data] = js.native
  @JSImport("post-robot", "once")
  @js.native
  def once(name: String, options: HandlerType): ZalgoPromise[Data] = js.native
  @JSImport("post-robot", "once")
  @js.native
  def once(name: String, options: HandlerType, handler: HandlerType): ZalgoPromise[Data] = js.native
  @JSImport("post-robot", "once")
  @js.native
  def once(name: String, options: ServerOptionsType): ZalgoPromise[Data] = js.native
  @JSImport("post-robot", "once")
  @js.native
  def once(name: String, options: ServerOptionsType, handler: HandlerType): ZalgoPromise[Data] = js.native
  
  @JSImport("post-robot", "send")
  @js.native
  def send(win: CrossDomainWindowType, name: String): ZalgoPromise[ResponseMessageEvent] = js.native
  @JSImport("post-robot", "send")
  @js.native
  def send(
    win: CrossDomainWindowType,
    name: String,
    data: js.UndefOr[scala.Nothing],
    options: FireAndForgetRequestOptionsType with RegularRequestOptionsType
  ): ZalgoPromise[ResponseMessageEvent] = js.native
  @JSImport("post-robot", "send")
  @js.native
  def send(win: CrossDomainWindowType, name: String, data: js.Object): ZalgoPromise[ResponseMessageEvent] = js.native
  @JSImport("post-robot", "send")
  @js.native
  def send(
    win: CrossDomainWindowType,
    name: String,
    data: js.Object,
    options: FireAndForgetRequestOptionsType with RegularRequestOptionsType
  ): ZalgoPromise[ResponseMessageEvent] = js.native
  
  @js.native
  trait CancelableType extends StObject {
    
    def cancel(): Unit = js.native
  }
  object CancelableType {
    
    @scala.inline
    def apply(cancel: () => Unit): CancelableType = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
      __obj.asInstanceOf[CancelableType]
    }
    
    @scala.inline
    implicit class CancelableTypeMutableBuilder[Self <: CancelableType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    }
  }
  
  // For the purposes of using the library on it's own Window is CrossDomain enough
  type CrossDomainWindowType = Window | Null
  
  type DomainMatcher = String | js.RegExp | js.Array[String]
  
  type ErrorHandlerType = js.Function1[/* err */ js.Any, Unit]
  
  @js.native
  trait FireAndForgetRequestOptionsType extends StObject {
    
    var domain: js.UndefOr[DomainMatcher] = js.native
    
    var fireAndForget: js.UndefOr[`true`] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object FireAndForgetRequestOptionsType {
    
    @scala.inline
    def apply(): FireAndForgetRequestOptionsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FireAndForgetRequestOptionsType]
    }
    
    @scala.inline
    implicit class FireAndForgetRequestOptionsTypeMutableBuilder[Self <: FireAndForgetRequestOptionsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: DomainMatcher): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainRegExp(value: js.RegExp): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setDomainVarargs(value: String*): Self = StObject.set(x, "domain", js.Array(value :_*))
      
      @scala.inline
      def setFireAndForget(value: `true`): Self = StObject.set(x, "fireAndForget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFireAndForgetUndefined: Self = StObject.set(x, "fireAndForget", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  type HandlerType = js.Function3[
    /* source */ CrossDomainWindowType, 
    /* origin */ String, 
    /* data */ js.Object, 
    Unit | ZalgoPromise[js.Any]
  ]
  
  @js.native
  trait RegularRequestOptionsType extends StObject {
    
    var domain: js.UndefOr[DomainMatcher] = js.native
    
    var fireAndForget: js.UndefOr[`false`] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object RegularRequestOptionsType {
    
    @scala.inline
    def apply(): RegularRequestOptionsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegularRequestOptionsType]
    }
    
    @scala.inline
    implicit class RegularRequestOptionsTypeMutableBuilder[Self <: RegularRequestOptionsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: DomainMatcher): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainRegExp(value: js.RegExp): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setDomainVarargs(value: String*): Self = StObject.set(x, "domain", js.Array(value :_*))
      
      @scala.inline
      def setFireAndForget(value: `false`): Self = StObject.set(x, "fireAndForget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFireAndForgetUndefined: Self = StObject.set(x, "fireAndForget", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait ResponseMessageEvent extends StObject {
    
    var data: js.Object = js.native
    
    var origin: String = js.native
    
    var source: CrossDomainWindowType = js.native
  }
  object ResponseMessageEvent {
    
    @scala.inline
    def apply(data: js.Object, origin: String): ResponseMessageEvent = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponseMessageEvent]
    }
    
    @scala.inline
    implicit class ResponseMessageEventMutableBuilder[Self <: ResponseMessageEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: CrossDomainWindowType): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceNull: Self = StObject.set(x, "source", null)
    }
  }
  
  @js.native
  trait ServerOptionsType extends StObject {
    
    var domain: js.UndefOr[DomainMatcher] = js.native
    
    var errorHandler: js.UndefOr[ErrorHandlerType] = js.native
    
    var errorOnClose: js.UndefOr[Boolean] = js.native
    
    var handler: js.UndefOr[HandlerType] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var once: js.UndefOr[Boolean] = js.native
    
    var window: js.UndefOr[CrossDomainWindowType] = js.native
  }
  object ServerOptionsType {
    
    @scala.inline
    def apply(): ServerOptionsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerOptionsType]
    }
    
    @scala.inline
    implicit class ServerOptionsTypeMutableBuilder[Self <: ServerOptionsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: DomainMatcher): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainRegExp(value: js.RegExp): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setDomainVarargs(value: String*): Self = StObject.set(x, "domain", js.Array(value :_*))
      
      @scala.inline
      def setErrorHandler(value: /* err */ js.Any => Unit): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
      
      @scala.inline
      def setErrorOnClose(value: Boolean): Self = StObject.set(x, "errorOnClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorOnCloseUndefined: Self = StObject.set(x, "errorOnClose", js.undefined)
      
      @scala.inline
      def setHandler(
        value: (/* source */ CrossDomainWindowType, /* origin */ String, /* data */ js.Object) => Unit | ZalgoPromise[js.Any]
      ): Self = StObject.set(x, "handler", js.Any.fromFunction3(value))
      
      @scala.inline
      def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
      
      @scala.inline
      def setWindow(value: CrossDomainWindowType): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowNull: Self = StObject.set(x, "window", null)
      
      @scala.inline
      def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
  
  // Warning: This is not actually a Promise, but the interface is the same.
  type ZalgoPromise[T] = js.Promise[T]
}
