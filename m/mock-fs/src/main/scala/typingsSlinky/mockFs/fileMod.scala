package typingsSlinky.mockFs

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileMod {
  
  @JSImport("mock-fs/lib/file", JSImport.Namespace)
  @js.native
  class ^ () extends File
  
  @js.native
  trait File
    extends typingsSlinky.mockFs.itemMod.^ {
    
    /** Get the file contents. */
    def getContent(): Buffer = js.native
    
    /** Set the file contents. */
    def setContent(content: String): Unit = js.native
    def setContent(content: Buffer): Unit = js.native
  }
}
