package typingsSlinky.activexScripting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object Scripting extends js.Object {
    
    /** Drive Object */
    @js.native
    class Drive protected ()
      extends typingsSlinky.activexScripting.Scripting.Drive
    
    /** File object */
    @js.native
    class File protected ()
      extends typingsSlinky.activexScripting.Scripting.File
    
    /** FileSystem Object */
    @js.native
    class FileSystemObject protected ()
      extends typingsSlinky.activexScripting.Scripting.FileSystemObject
    
    /** Folder object */
    @js.native
    class Folder protected ()
      extends typingsSlinky.activexScripting.Scripting.Folder
    
    /** TextStream object */
    @js.native
    class TextStream protected ()
      extends typingsSlinky.activexScripting.Scripting.TextStream
  }
}
