package typingsSlinky.nextgenEvents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Ack extends StObject {
    
    var ack: Boolean = js.native
    
    var emit: Boolean = js.native
    
    var listen: Boolean = js.native
  }
  object Ack {
    
    @scala.inline
    def apply(ack: Boolean, emit: Boolean, listen: Boolean): Ack = {
      val __obj = js.Dynamic.literal(ack = ack.asInstanceOf[js.Any], emit = emit.asInstanceOf[js.Any], listen = listen.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ack]
    }
    
    @scala.inline
    implicit class AckMutableBuilder[Self <: Ack] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAck(value: Boolean): Self = StObject.set(x, "ack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmit(value: Boolean): Self = StObject.set(x, "emit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListen(value: Boolean): Self = StObject.set(x, "listen", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Async extends StObject {
    
    var async: js.Any = js.native
    
    var context: js.UndefOr[String] = js.native
    
    var eventObject: js.Any = js.native
    
    var fn: js.Any = js.native
    
    var id: js.UndefOr[js.Any] = js.native
    
    var nice: js.UndefOr[Double] = js.native
    
    var once: js.Any = js.native
  }
  object Async {
    
    @scala.inline
    def apply(async: js.Any, eventObject: js.Any, fn: js.Any, once: js.Any): Async = {
      val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], eventObject = eventObject.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any], once = once.asInstanceOf[js.Any])
      __obj.asInstanceOf[Async]
    }
    
    @scala.inline
    implicit class AsyncMutableBuilder[Self <: Async] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: js.Any): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setEventObject(value: js.Any): Self = StObject.set(x, "eventObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFn(value: js.Any): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setNice(value: Double): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNiceUndefined: Self = StObject.set(x, "nice", js.undefined)
      
      @scala.inline
      def setOnce(value: js.Any): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
    }
  }
}
