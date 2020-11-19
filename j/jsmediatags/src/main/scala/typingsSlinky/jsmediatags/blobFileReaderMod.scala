package typingsSlinky.jsmediatags

import org.scalajs.dom.raw.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsmediatags/build2/BlobFileReader", JSImport.Namespace)
@js.native
object blobFileReaderMod extends js.Object {
  
  @js.native
  trait BlobFileReader
    extends typingsSlinky.jsmediatags.mediaFileReaderMod.default {
    
    var _blob: Blob = js.native
    
    var _fileData: typingsSlinky.jsmediatags.chunkedFileDataMod.default = js.native
  }
  
  @js.native
  class default protected () extends BlobFileReader {
    def this(blob: Blob) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    def canReadFile(file: js.Any): Boolean = js.native
  }
}
