package typingsSlinky.jsmediatags

import org.scalajs.dom.raw.Blob
import typingsSlinky.jsmediatags.build2BlobFileReaderMod.BlobFileReader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsmediatags/build2/BlobFileReader", JSImport.Namespace)
@js.native
object build2BlobFileReaderMod extends js.Object {
  @js.native
  trait BlobFileReader
    extends typingsSlinky.jsmediatags.build2MediaFileReaderMod.default {
    var _blob: Blob = js.native
    var _fileData: typingsSlinky.jsmediatags.build2ChunkedFileDataMod.default = js.native
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

