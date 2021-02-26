package typingsSlinky.consoleUi

import typingsSlinky.consoleUi.mod.WriteLevel
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Ci extends StObject {
    
    var ci: js.UndefOr[Boolean] = js.native
    
    var errorStream: js.UndefOr[WritableStream] = js.native
    
    var inputStream: js.UndefOr[ReadableStream] = js.native
    
    var outputStream: js.UndefOr[WritableStream] = js.native
    
    var writeLevel: js.UndefOr[WriteLevel] = js.native
  }
  object Ci {
    
    @scala.inline
    def apply(): Ci = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ci]
    }
    
    @scala.inline
    implicit class CiMutableBuilder[Self <: Ci] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCi(value: Boolean): Self = StObject.set(x, "ci", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCiUndefined: Self = StObject.set(x, "ci", js.undefined)
      
      @scala.inline
      def setErrorStream(value: WritableStream): Self = StObject.set(x, "errorStream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorStreamUndefined: Self = StObject.set(x, "errorStream", js.undefined)
      
      @scala.inline
      def setInputStream(value: ReadableStream): Self = StObject.set(x, "inputStream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputStreamUndefined: Self = StObject.set(x, "inputStream", js.undefined)
      
      @scala.inline
      def setOutputStream(value: WritableStream): Self = StObject.set(x, "outputStream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputStreamUndefined: Self = StObject.set(x, "outputStream", js.undefined)
      
      @scala.inline
      def setWriteLevel(value: WriteLevel): Self = StObject.set(x, "writeLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteLevelUndefined: Self = StObject.set(x, "writeLevel", js.undefined)
    }
  }
}
