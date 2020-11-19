package typingsSlinky.cordovaPluginFile

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  class FileError protected ()
    extends typingsSlinky.cordovaPluginFile.FileError {
    def this(code: Double) = this()
  }
  @js.native
  object FileError
    extends Instantiable1[/* code */ Double, typingsSlinky.cordovaPluginFile.FileError] {
    
    var ABORT_ERR: Double = js.native
    
    var ENCODING_ERR: Double = js.native
    
    var INVALID_MODIFICATION_ERR: Double = js.native
    
    var INVALID_STATE_ERR: Double = js.native
    
    var NOT_FOUND_ERR: Double = js.native
    
    var NOT_READABLE_ERR: Double = js.native
    
    var NO_MODIFICATION_ALLOWED_ERR: Double = js.native
    
    var PATH_EXISTS_ERR: Double = js.native
    
    var QUOTA_EXCEEDED_ERR: Double = js.native
    
    var SECURITY_ERR: Double = js.native
    
    var SYNTAX_ERR: Double = js.native
    
    var TYPE_MISMATCH_ERR: Double = js.native
  }
  
  /* FileWriter states */
  @js.native
  object FileWriter extends js.Object {
    
    var DONE: Double = js.native
    
    var INIT: Double = js.native
    
    var WRITING: Double = js.native
  }
  
  @js.native
  object LocalFileSystem extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.cordovaPluginFile.LocalFileSystem with Double] = js.native
    
    /* 1 */ val PERSISTENT: typingsSlinky.cordovaPluginFile.LocalFileSystem.PERSISTENT with Double = js.native
    
    /* 0 */ val TEMPORARY: typingsSlinky.cordovaPluginFile.LocalFileSystem.TEMPORARY with Double = js.native
  }
}
