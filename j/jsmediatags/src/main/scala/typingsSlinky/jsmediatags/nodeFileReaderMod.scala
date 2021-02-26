package typingsSlinky.jsmediatags

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeFileReaderMod {
  
  @JSImport("jsmediatags/build2/NodeFileReader", JSImport.Default)
  @js.native
  class default protected () extends NodeFileReader {
    def this(path: String) = this()
  }
  /* static members */
  object default {
    
    @JSImport("jsmediatags/build2/NodeFileReader", "default.canReadFile")
    @js.native
    def canReadFile(file: js.Any): Boolean = js.native
  }
  
  @js.native
  trait NodeFileReader
    extends typingsSlinky.jsmediatags.mediaFileReaderMod.default {
    
    var _fileData: typingsSlinky.jsmediatags.chunkedFileDataMod.default = js.native
    
    var _path: String = js.native
  }
}
