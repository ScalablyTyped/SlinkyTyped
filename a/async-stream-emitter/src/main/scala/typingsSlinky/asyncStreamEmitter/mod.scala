package typingsSlinky.asyncStreamEmitter

import typingsSlinky.writableConsumableStream.consumerMod.ConsumerStats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("async-stream-emitter", JSImport.Namespace)
  @js.native
  class ^[T] () extends AsyncStreamEmitter[T]
  
  @js.native
  trait AsyncStreamEmitter[T] extends StObject {
    
    def closeAllListeners(): Unit = js.native
    
    def closeListener(eventName: String): Unit = js.native
    
    def emit(eventName: String, data: T): Unit = js.native
    
    def getAllListenersBackpressure(): Double = js.native
    
    def getAllListenersConsumerStatsList(): js.Array[ConsumerStats] = js.native
    
    def getListenerBackpressure(eventName: String): Double = js.native
    
    def getListenerConsumerBackpressure(consumerId: Double): Double = js.native
    
    def getListenerConsumerStats(consumerId: Double): ConsumerStats = js.native
    
    def getListenerConsumerStatsList(eventName: String): js.Array[ConsumerStats] = js.native
    
    def hasAnyListenerConsumer(consumerId: Double): Boolean = js.native
    
    def hasListenerConsumer(eventName: String, consumerId: Double): Boolean = js.native
    
    def killAllListeners(): Unit = js.native
    
    def killListener(eventName: String): Unit = js.native
    
    def killListenerConsumer(consumerId: Double): Unit = js.native
    
    def listener(eventName: String): typingsSlinky.consumableStream.mod.^[T] = js.native
  }
  object AsyncStreamEmitter {
    
    @scala.inline
    def apply[T](
      closeAllListeners: () => Unit,
      closeListener: String => Unit,
      emit: (String, T) => Unit,
      getAllListenersBackpressure: () => Double,
      getAllListenersConsumerStatsList: () => js.Array[ConsumerStats],
      getListenerBackpressure: String => Double,
      getListenerConsumerBackpressure: Double => Double,
      getListenerConsumerStats: Double => ConsumerStats,
      getListenerConsumerStatsList: String => js.Array[ConsumerStats],
      hasAnyListenerConsumer: Double => Boolean,
      hasListenerConsumer: (String, Double) => Boolean,
      killAllListeners: () => Unit,
      killListener: String => Unit,
      killListenerConsumer: Double => Unit,
      listener: String => typingsSlinky.consumableStream.mod.^[T]
    ): AsyncStreamEmitter[T] = {
      val __obj = js.Dynamic.literal(closeAllListeners = js.Any.fromFunction0(closeAllListeners), closeListener = js.Any.fromFunction1(closeListener), emit = js.Any.fromFunction2(emit), getAllListenersBackpressure = js.Any.fromFunction0(getAllListenersBackpressure), getAllListenersConsumerStatsList = js.Any.fromFunction0(getAllListenersConsumerStatsList), getListenerBackpressure = js.Any.fromFunction1(getListenerBackpressure), getListenerConsumerBackpressure = js.Any.fromFunction1(getListenerConsumerBackpressure), getListenerConsumerStats = js.Any.fromFunction1(getListenerConsumerStats), getListenerConsumerStatsList = js.Any.fromFunction1(getListenerConsumerStatsList), hasAnyListenerConsumer = js.Any.fromFunction1(hasAnyListenerConsumer), hasListenerConsumer = js.Any.fromFunction2(hasListenerConsumer), killAllListeners = js.Any.fromFunction0(killAllListeners), killListener = js.Any.fromFunction1(killListener), killListenerConsumer = js.Any.fromFunction1(killListenerConsumer), listener = js.Any.fromFunction1(listener))
      __obj.asInstanceOf[AsyncStreamEmitter[T]]
    }
    
    @scala.inline
    implicit class AsyncStreamEmitterMutableBuilder[Self <: AsyncStreamEmitter[_], T] (val x: Self with AsyncStreamEmitter[T]) extends AnyVal {
      
      @scala.inline
      def setCloseAllListeners(value: () => Unit): Self = StObject.set(x, "closeAllListeners", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCloseListener(value: String => Unit): Self = StObject.set(x, "closeListener", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEmit(value: (String, T) => Unit): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetAllListenersBackpressure(value: () => Double): Self = StObject.set(x, "getAllListenersBackpressure", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAllListenersConsumerStatsList(value: () => js.Array[ConsumerStats]): Self = StObject.set(x, "getAllListenersConsumerStatsList", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetListenerBackpressure(value: String => Double): Self = StObject.set(x, "getListenerBackpressure", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetListenerConsumerBackpressure(value: Double => Double): Self = StObject.set(x, "getListenerConsumerBackpressure", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetListenerConsumerStats(value: Double => ConsumerStats): Self = StObject.set(x, "getListenerConsumerStats", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetListenerConsumerStatsList(value: String => js.Array[ConsumerStats]): Self = StObject.set(x, "getListenerConsumerStatsList", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasAnyListenerConsumer(value: Double => Boolean): Self = StObject.set(x, "hasAnyListenerConsumer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasListenerConsumer(value: (String, Double) => Boolean): Self = StObject.set(x, "hasListenerConsumer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setKillAllListeners(value: () => Unit): Self = StObject.set(x, "killAllListeners", js.Any.fromFunction0(value))
      
      @scala.inline
      def setKillListener(value: String => Unit): Self = StObject.set(x, "killListener", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKillListenerConsumer(value: Double => Unit): Self = StObject.set(x, "killListenerConsumer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setListener(value: String => typingsSlinky.consumableStream.mod.^[T]): Self = StObject.set(x, "listener", js.Any.fromFunction1(value))
    }
  }
}
