package typingsSlinky.ol

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/format/XML", JSImport.Namespace)
@js.native
object xmlMod extends js.Object {
  
  @js.native
  trait XML extends js.Object {
    
    def read(source: String): js.Any = js.native
    /**
      * Read the source document.
      */
    def read(source: Document): js.Any = js.native
    def read(source: Element): js.Any = js.native
    
    def readFromDocument(doc: Document): js.Any = js.native
    
    def readFromNode(node: Element): js.Any = js.native
  }
  
  @js.native
  abstract class default () extends XML
}
