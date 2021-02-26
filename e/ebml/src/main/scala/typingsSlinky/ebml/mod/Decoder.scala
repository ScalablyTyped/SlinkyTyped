package typingsSlinky.ebml.mod

import typingsSlinky.ebml.ebmlStrings.close
import typingsSlinky.ebml.ebmlStrings.data
import typingsSlinky.ebml.ebmlStrings.end
import typingsSlinky.ebml.ebmlStrings.error
import typingsSlinky.ebml.ebmlStrings.readable
import typingsSlinky.ebml.mod.Decoder.State
import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Transform
import typingsSlinky.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ebml", "Decoder")
@js.native
class Decoder () extends Transform {
  def this(opts: TransformOptions) = this()
  
  // #region Duplex methods overloadings
  def addListener[K /* <: /* keyof ebml.ebml.Decoder.EventListenerMap */ data | close | end | readable | error */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.Decoder.EventListenerMap[K] */ js.Any
  ): this.type = js.native
  
  var buffer: Buffer = js.native
  
  var cursor: Double = js.native
  
  def end(chunk: Buffer): Unit = js.native
  def end(chunk: Buffer, cb: js.Function0[Unit]): Unit = js.native
  def end(chunk: Buffer, encoding: js.UndefOr[scala.Nothing], cb: js.Function0[Unit]): Unit = js.native
  def end(chunk: Buffer, encoding: String): Unit = js.native
  def end(chunk: Buffer, encoding: String, cb: js.Function0[Unit]): Unit = js.native
  
  def on[K /* <: /* keyof ebml.ebml.Decoder.EventListenerMap */ data | close | end | readable | error */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.Decoder.EventListenerMap[K] */ js.Any
  ): this.type = js.native
  
  def once[K /* <: /* keyof ebml.ebml.Decoder.EventListenerMap */ data | close | end | readable | error */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.Decoder.EventListenerMap[K] */ js.Any
  ): this.type = js.native
  
  def prependListener[K /* <: /* keyof ebml.ebml.Decoder.EventListenerMap */ data | close | end | readable | error */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.Decoder.EventListenerMap[K] */ js.Any
  ): this.type = js.native
  
  def prependOnceListener[K /* <: /* keyof ebml.ebml.Decoder.EventListenerMap */ data | close | end | readable | error */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.Decoder.EventListenerMap[K] */ js.Any
  ): this.type = js.native
  
  def readContent(): Boolean = js.native
  
  def readSize(): Boolean = js.native
  
  def readTag(): Boolean = js.native
  
  def removeListener[K /* <: /* keyof ebml.ebml.Decoder.EventListenerMap */ data | close | end | readable | error */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.Decoder.EventListenerMap[K] */ js.Any
  ): this.type = js.native
  
  var state: State = js.native
  
  var tagStack: js.Array[TagMetadata] = js.native
  
  var total: Double = js.native
  
  def write(chunk: Buffer): Boolean = js.native
  def write(chunk: Buffer, cb: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Boolean = js.native
  def write(
    chunk: Buffer,
    encoding: js.UndefOr[scala.Nothing],
    cb: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
  ): Boolean = js.native
  def write(chunk: Buffer, encoding: String): Boolean = js.native
  def write(chunk: Buffer, encoding: String, cb: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Boolean = js.native
}
/* static members */
object Decoder {
  
  @JSImport("ebml", "Decoder.getSchemaInfo")
  @js.native
  def getSchemaInfo(tag: Double): EBMLTagSchema = js.native
  
  @js.native
  trait EventListenerMap extends StObject {
    
    def close(): Unit = js.native
    
    def data(chunk: StateAndTagData): Unit = js.native
    
    def end(): Unit = js.native
    
    def error(err: js.Error): Unit = js.native
    
    def readable(): Unit = js.native
  }
  object EventListenerMap {
    
    @scala.inline
    def apply(
      close: () => Unit,
      data: StateAndTagData => Unit,
      end: () => Unit,
      error: js.Error => Unit,
      readable: () => Unit
    ): EventListenerMap = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), data = js.Any.fromFunction1(data), end = js.Any.fromFunction0(end), error = js.Any.fromFunction1(error), readable = js.Any.fromFunction0(readable))
      __obj.asInstanceOf[EventListenerMap]
    }
    
    @scala.inline
    implicit class EventListenerMapMutableBuilder[Self <: EventListenerMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setData(value: StateAndTagData => Unit): Self = StObject.set(x, "data", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      @scala.inline
      def setError(value: js.Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReadable(value: () => Unit): Self = StObject.set(x, "readable", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.ebml.ebmlNumbers.`1`
    - typingsSlinky.ebml.ebmlNumbers.`2`
    - typingsSlinky.ebml.ebmlNumbers.`3`
  */
  trait State extends StObject
  object State {
    
    @scala.inline
    def `1`: typingsSlinky.ebml.ebmlNumbers.`1` = 1.asInstanceOf[typingsSlinky.ebml.ebmlNumbers.`1`]
    
    @scala.inline
    def `2`: typingsSlinky.ebml.ebmlNumbers.`2` = 2.asInstanceOf[typingsSlinky.ebml.ebmlNumbers.`2`]
    
    @scala.inline
    def `3`: typingsSlinky.ebml.ebmlNumbers.`3` = 3.asInstanceOf[typingsSlinky.ebml.ebmlNumbers.`3`]
  }
}
