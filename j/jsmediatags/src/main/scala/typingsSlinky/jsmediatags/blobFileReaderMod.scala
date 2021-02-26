package typingsSlinky.jsmediatags

import org.scalajs.dom.raw.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blobFileReaderMod {
  
  @JSImport("jsmediatags/build2/BlobFileReader", JSImport.Default)
  @js.native
  class default protected () extends BlobFileReader {
    def this(blob: Blob) = this()
  }
  /* static members */
  object default {
    
    @JSImport("jsmediatags/build2/BlobFileReader", "default.canReadFile")
    @js.native
    def canReadFile(file: js.Any): Boolean = js.native
  }
  
  @js.native
  trait BlobFileReader
    extends typingsSlinky.jsmediatags.mediaFileReaderMod.default {
    
    var _blob: Blob = js.native
    
    var _fileData: typingsSlinky.jsmediatags.chunkedFileDataMod.default = js.native
  }
}
