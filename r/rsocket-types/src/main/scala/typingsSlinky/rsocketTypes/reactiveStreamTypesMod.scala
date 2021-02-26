package typingsSlinky.rsocketTypes

import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactiveStreamTypesMod {
  
  @js.native
  trait IPublisher[T] extends StObject {
    
    def map[R](fn: js.Function1[/* data */ T, R]): IPublisher[R] = js.native
    
    def subscribe(): Unit = js.native
    def subscribe(subscriber: Partial[ISubscriber[T]]): Unit = js.native
  }
  
  @js.native
  trait ISubject[T] extends StObject {
    
    def onComplete(): Unit = js.native
    
    def onError(error: js.Error): Unit = js.native
    
    def onNext(value: T): Unit = js.native
  }
  object ISubject {
    
    @scala.inline
    def apply[T](onComplete: () => Unit, onError: js.Error => Unit, onNext: T => Unit): ISubject[T] = {
      val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), onError = js.Any.fromFunction1(onError), onNext = js.Any.fromFunction1(onNext))
      __obj.asInstanceOf[ISubject[T]]
    }
    
    @scala.inline
    implicit class ISubjectMutableBuilder[Self <: ISubject[_], T] (val x: Self with ISubject[T]) extends AnyVal {
      
      @scala.inline
      def setOnComplete(value: () => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnError(value: js.Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnNext(value: T => Unit): Self = StObject.set(x, "onNext", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ISubscriber[T] extends StObject {
    
    def onComplete(): Unit = js.native
    
    def onError(error: js.Error): Unit = js.native
    
    def onNext(value: T): Unit = js.native
    
    def onSubscribe(subscription: ISubscription): Unit = js.native
  }
  object ISubscriber {
    
    @scala.inline
    def apply[T](
      onComplete: () => Unit,
      onError: js.Error => Unit,
      onNext: T => Unit,
      onSubscribe: ISubscription => Unit
    ): ISubscriber[T] = {
      val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), onError = js.Any.fromFunction1(onError), onNext = js.Any.fromFunction1(onNext), onSubscribe = js.Any.fromFunction1(onSubscribe))
      __obj.asInstanceOf[ISubscriber[T]]
    }
    
    @scala.inline
    implicit class ISubscriberMutableBuilder[Self <: ISubscriber[_], T] (val x: Self with ISubscriber[T]) extends AnyVal {
      
      @scala.inline
      def setOnComplete(value: () => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnError(value: js.Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnNext(value: T => Unit): Self = StObject.set(x, "onNext", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSubscribe(value: ISubscription => Unit): Self = StObject.set(x, "onSubscribe", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ISubscription extends StObject {
    
    def cancel(): Unit = js.native
    
    def request(n: Double): Unit = js.native
  }
  object ISubscription {
    
    @scala.inline
    def apply(cancel: () => Unit, request: Double => Unit): ISubscription = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), request = js.Any.fromFunction1(request))
      __obj.asInstanceOf[ISubscription]
    }
    
    @scala.inline
    implicit class ISubscriptionMutableBuilder[Self <: ISubscription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRequest(value: Double => Unit): Self = StObject.set(x, "request", js.Any.fromFunction1(value))
    }
  }
}
