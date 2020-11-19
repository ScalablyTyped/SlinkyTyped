package typingsSlinky.jsmediatags

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsmediatags/build2/NodeFileReader", JSImport.Namespace)
@js.native
object nodeFileReaderMod extends js.Object {
  
  @js.native
  trait NodeFileReader
    extends typingsSlinky.jsmediatags.mediaFileReaderMod.default {
    
    var _fileData: typingsSlinky.jsmediatags.chunkedFileDataMod.default = js.native
    
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
