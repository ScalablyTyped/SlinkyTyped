package typingsSlinky.googleCloudPaginator

import typingsSlinky.googleCloudPaginator.googleCloudPaginatorStrings.data
import typingsSlinky.googleCloudPaginator.mod.ParsedArguments
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.anon.End
import typingsSlinky.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourceStreamMod {
  
  @JSImport("@google-cloud/paginator/build/src/resource-stream", "ResourceStream")
  @js.native
  class ResourceStream[T] protected ()
    extends Transform
       with ResourceEvents[T] {
    def this(args: ParsedArguments, requestFn: js.Function) = this()
    
    var _ended: Boolean = js.native
    
    var _maxApiCalls: Double = js.native
    
    var _nextQuery: js.Object | Null = js.native
    
    def _read(): Unit = js.native
    
    var _reading: Boolean = js.native
    
    var _requestFn: js.Function = js.native
    
    var _requestsMade: Double = js.native
    
    var _resultsToSend: Double = js.native
    
    def end(args: js.Any*): Unit = js.native
    
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T): T = js.native
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
  }
  
  @js.native
  trait ResourceEvents[T] extends StObject {
    
    @JSName("addListener")
    def addListener_data(event: data, listener: js.Function1[/* data */ T, Unit]): this.type = js.native
    
    @JSName("emit")
    def emit_data(event: data, data: T): Boolean = js.native
    
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* data */ T, Unit]): this.type = js.native
    
    @JSName("once")
    def once_data(event: data, listener: js.Function1[/* data */ T, Unit]): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_data(event: data, listener: js.Function1[/* data */ T, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_data(event: data, listener: js.Function1[/* data */ T, Unit]): this.type = js.native
    
    @JSName("removeListener")
    def removeListener_data(event: data, listener: js.Function1[/* data */ T, Unit]): this.type = js.native
  }
  object ResourceEvents {
    
    @scala.inline
    def apply[T](
      addListener: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T],
      emit: (data, T) => Boolean,
      on: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T],
      once: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T],
      prependListener: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T],
      prependOnceListener: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T],
      removeListener: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T]
    ): ResourceEvents[T] = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), emit = js.Any.fromFunction2(emit), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), prependListener = js.Any.fromFunction2(prependListener), prependOnceListener = js.Any.fromFunction2(prependOnceListener), removeListener = js.Any.fromFunction2(removeListener))
      __obj.asInstanceOf[ResourceEvents[T]]
    }
    
    @scala.inline
    implicit class ResourceEventsMutableBuilder[Self <: ResourceEvents[_], T] (val x: Self with ResourceEvents[T]) extends AnyVal {
      
      @scala.inline
      def setAddListener(value: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T]): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEmit(value: (data, T) => Boolean): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOn(value: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T]): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnce(value: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T]): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPrependListener(value: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T]): Self = StObject.set(x, "prependListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPrependOnceListener(value: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T]): Self = StObject.set(x, "prependOnceListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveListener(value: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T]): Self = StObject.set(x, "removeListener", js.Any.fromFunction2(value))
    }
  }
}
