package typingsSlinky.angularFileSaver.mod

import org.scalajs.dom.raw.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("angular", JSImport.Namespace)
@js.native
object angularAugmentingMod extends js.Object {
  
  @js.native
  trait FileSaver extends js.Object {
    
    /**
      * Immediately starts saving a file
      * @param data: a Blob instance;
      * @param filename: a String custom filename (an extension is optional);
      * @param disableAutoBOM : (optional) Boolean Disable automatically provided Unicode text encoding hints;
      */
    def saveAs(blob: Blob, fileName: String): Unit = js.native
    def saveAs(blob: Blob, fileName: String, disableBOM: Boolean): Unit = js.native
  }
}
