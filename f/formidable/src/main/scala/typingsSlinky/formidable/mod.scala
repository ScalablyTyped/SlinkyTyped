package typingsSlinky.formidable

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.eventsMod.EventEmitterOptions
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("formidable", "IncomingForm")
  @js.native
  class IncomingForm () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    var bytesExpected: Double = js.native
    
    var bytesReceived: Double = js.native
    
    var encoding: String = js.native
    
    def handlePart(part: Part): Unit = js.native
    
    var hash: String | Boolean = js.native
    
    var keepExtensions: Boolean = js.native
    
    var maxFields: Double = js.native
    
    var maxFieldsSize: Double = js.native
    
    var maxFileSize: Double = js.native
    
    var multiples: Boolean = js.native
    
    def onPart(part: Part): Unit = js.native
    
    def parse(req: IncomingMessage): Unit = js.native
    def parse(
      req: IncomingMessage,
      callback: js.Function3[/* err */ js.Any, /* fields */ Fields, /* files */ Files, _]
    ): Unit = js.native
    
    var `type`: String = js.native
    
    var uploadDir: String = js.native
  }
  
  type Fields = StringDictionary[String | js.Array[String]]
  
  @js.native
  trait File extends StObject {
    
    var hash: js.UndefOr[String] = js.native
    
    var lastModifiedDate: js.UndefOr[js.Date] = js.native
    
    var name: String = js.native
    
    var path: String = js.native
    
    var size: Double = js.native
    
    def toJSON(): js.Object = js.native
    
    var `type`: String = js.native
  }
  object File {
    
    @scala.inline
    def apply(name: String, path: String, size: Double, toJSON: () => js.Object, `type`: String): File = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    @scala.inline
    implicit class FileMutableBuilder[Self <: File] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      @scala.inline
      def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Object): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Files = StringDictionary[File]
  
  @js.native
  trait Part extends Stream {
    
    var filename: js.UndefOr[String] = js.native
    
    var headers: StringDictionary[String] = js.native
    
    var mime: js.UndefOr[String] = js.native
    
    var name: String = js.native
  }
}
