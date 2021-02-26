package typingsSlinky.railsActivestorage

import org.scalajs.dom.raw.File
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait DirectUploadData extends StObject {
    
    var directUploadData: Headers = js.native
    
    var file: File = js.native
  }
  object DirectUploadData {
    
    @scala.inline
    def apply(directUploadData: Headers, file: File): DirectUploadData = {
      val __obj = js.Dynamic.literal(directUploadData = directUploadData.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectUploadData]
    }
    
    @scala.inline
    implicit class DirectUploadDataMutableBuilder[Self <: DirectUploadData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirectUploadData(value: Headers): Self = StObject.set(x, "directUploadData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFile(value: File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Headers extends StObject {
    
    var headers: Record[String, String] = js.native
    
    var url: String = js.native
  }
  object Headers {
    
    @scala.inline
    def apply(headers: Record[String, String], url: String): Headers = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Headers]
    }
    
    @scala.inline
    implicit class HeadersMutableBuilder[Self <: Headers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
