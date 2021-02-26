package typingsSlinky.bufferhelper

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bufferhelper", JSImport.Namespace)
  @js.native
  class ^ () extends BufferHelper
  
  @js.native
  trait BufferHelper extends StObject {
    
    def concat(buffer: js.Any): BufferHelper = js.native
    
    def empty(): BufferHelper = js.native
    
    def load(stream: js.Any, callback: js.Function1[/* arg */ js.Any, _]): Unit = js.native
    
    def toBuffer(): Buffer = js.native
    
    def toString(encoding: encoding): String = js.native
  }
  object BufferHelper {
    
    @scala.inline
    def apply(
      concat: js.Any => BufferHelper,
      empty: () => BufferHelper,
      load: (js.Any, js.Function1[/* arg */ js.Any, _]) => Unit,
      toBuffer: () => Buffer,
      toString_ : encoding => String
    ): BufferHelper = {
      val __obj = js.Dynamic.literal(concat = js.Any.fromFunction1(concat), empty = js.Any.fromFunction0(empty), load = js.Any.fromFunction2(load), toBuffer = js.Any.fromFunction0(toBuffer))
      __obj.updateDynamic("toString")(js.Any.fromFunction1(toString_))
      __obj.asInstanceOf[BufferHelper]
    }
    
    @scala.inline
    implicit class BufferHelperMutableBuilder[Self <: BufferHelper] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConcat(value: js.Any => BufferHelper): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEmpty(value: () => BufferHelper): Self = StObject.set(x, "empty", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLoad(value: (js.Any, js.Function1[/* arg */ js.Any, _]) => Unit): Self = StObject.set(x, "load", js.Any.fromFunction2(value))
      
      @scala.inline
      def setToBuffer(value: () => Buffer): Self = StObject.set(x, "toBuffer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToString_(value: encoding => String): Self = StObject.set(x, "toString", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.bufferhelper.bufferhelperStrings.ascii
    - typingsSlinky.bufferhelper.bufferhelperStrings.utf8
    - typingsSlinky.bufferhelper.bufferhelperStrings.utf16le
    - typingsSlinky.bufferhelper.bufferhelperStrings.ucs2
    - typingsSlinky.bufferhelper.bufferhelperStrings.base64
    - typingsSlinky.bufferhelper.bufferhelperStrings.binary
    - typingsSlinky.bufferhelper.bufferhelperStrings.hex
  */
  trait encoding extends StObject
  object encoding {
    
    @scala.inline
    def ascii: typingsSlinky.bufferhelper.bufferhelperStrings.ascii = "ascii".asInstanceOf[typingsSlinky.bufferhelper.bufferhelperStrings.ascii]
    
    @scala.inline
    def base64: typingsSlinky.bufferhelper.bufferhelperStrings.base64 = "base64".asInstanceOf[typingsSlinky.bufferhelper.bufferhelperStrings.base64]
    
    @scala.inline
    def binary: typingsSlinky.bufferhelper.bufferhelperStrings.binary = "binary".asInstanceOf[typingsSlinky.bufferhelper.bufferhelperStrings.binary]
    
    @scala.inline
    def hex: typingsSlinky.bufferhelper.bufferhelperStrings.hex = "hex".asInstanceOf[typingsSlinky.bufferhelper.bufferhelperStrings.hex]
    
    @scala.inline
    def ucs2: typingsSlinky.bufferhelper.bufferhelperStrings.ucs2 = "ucs2".asInstanceOf[typingsSlinky.bufferhelper.bufferhelperStrings.ucs2]
    
    @scala.inline
    def utf16le: typingsSlinky.bufferhelper.bufferhelperStrings.utf16le = "utf16le".asInstanceOf[typingsSlinky.bufferhelper.bufferhelperStrings.utf16le]
    
    @scala.inline
    def utf8: typingsSlinky.bufferhelper.bufferhelperStrings.utf8 = "utf8".asInstanceOf[typingsSlinky.bufferhelper.bufferhelperStrings.utf8]
  }
}
