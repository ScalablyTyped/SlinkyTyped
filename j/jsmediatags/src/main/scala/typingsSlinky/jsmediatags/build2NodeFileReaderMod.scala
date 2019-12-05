package typingsSlinky.jsmediatags

import typingsSlinky.jsmediatags.build2NodeFileReaderMod.NodeFileReader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsmediatags/build2/NodeFileReader", JSImport.Namespace)
@js.native
object build2NodeFileReaderMod extends js.Object {
  @js.native
  trait NodeFileReader
    extends typingsSlinky.jsmediatags.build2MediaFileReaderMod.default {
    var _fileData: typingsSlinky.jsmediatags.build2ChunkedFileDataMod.default = js.native
    var _path: String = js.native
  }
  
  @js.native
  class default protected () extends NodeFileReader {
    def this(path: String) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def canReadFile(file: js.Any): Boolean = js.native
  }
  
}

