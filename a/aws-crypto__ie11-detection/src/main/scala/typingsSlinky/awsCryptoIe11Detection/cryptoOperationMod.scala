package typingsSlinky.awsCryptoIe11Detection

import org.scalajs.dom.raw.Event
import typingsSlinky.awsCryptoIe11Detection.keyMod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cryptoOperationMod {
  
  @js.native
  trait CryptoOperation extends StObject {
    
    def abort(): Unit = js.native
    
    val algorithm: String = js.native
    
    def finish(): Unit = js.native
    
    val key: Key = js.native
    
    def onabort(event: Event): Unit = js.native
    
    def oncomplete(event: Event): Unit = js.native
    
    def onerror(event: Event): Unit = js.native
    
    def onprogress(event: Event): Unit = js.native
    
    def process(buffer: js.typedarray.ArrayBufferView): Unit = js.native
    
    val result: js.UndefOr[js.typedarray.ArrayBuffer] = js.native
  }
  object CryptoOperation {
    
    @scala.inline
    def apply(
      abort: () => Unit,
      algorithm: String,
      finish: () => Unit,
      key: Key,
      onabort: Event => Unit,
      oncomplete: Event => Unit,
      onerror: Event => Unit,
      onprogress: Event => Unit,
      process: js.typedarray.ArrayBufferView => Unit
    ): CryptoOperation = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), algorithm = algorithm.asInstanceOf[js.Any], finish = js.Any.fromFunction0(finish), key = key.asInstanceOf[js.Any], onabort = js.Any.fromFunction1(onabort), oncomplete = js.Any.fromFunction1(oncomplete), onerror = js.Any.fromFunction1(onerror), onprogress = js.Any.fromFunction1(onprogress), process = js.Any.fromFunction1(process))
      __obj.asInstanceOf[CryptoOperation]
    }
    
    @scala.inline
    implicit class CryptoOperationMutableBuilder[Self <: CryptoOperation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinish(value: () => Unit): Self = StObject.set(x, "finish", js.Any.fromFunction0(value))
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnabort(value: Event => Unit): Self = StObject.set(x, "onabort", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOncomplete(value: Event => Unit): Self = StObject.set(x, "oncomplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnerror(value: Event => Unit): Self = StObject.set(x, "onerror", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnprogress(value: Event => Unit): Self = StObject.set(x, "onprogress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProcess(value: js.typedarray.ArrayBufferView => Unit): Self = StObject.set(x, "process", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResult(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
}
