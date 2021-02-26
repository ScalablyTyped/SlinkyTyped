package typingsSlinky.electron.Electron

import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilePathWithHeaders extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/file-path-with-headers
  /**
    * Additional headers to be sent.
    */
  var headers: js.UndefOr[Record[String, String]] = js.native
  
  /**
    * The path to the file to send.
    */
  var path: String = js.native
}
object FilePathWithHeaders {
  
  @scala.inline
  def apply(path: String): FilePathWithHeaders = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePathWithHeaders]
  }
  
  @scala.inline
  implicit class FilePathWithHeadersMutableBuilder[Self <: FilePathWithHeaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
