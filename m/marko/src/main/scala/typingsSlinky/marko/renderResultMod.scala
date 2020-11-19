package typingsSlinky.marko

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Node
import typingsSlinky.marko.componentMod.Component
import typingsSlinky.marko.domElementMod.DomElement
import typingsSlinky.marko.markoBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("marko/src/runtime/html/RenderResult", JSImport.Namespace)
@js.native
object renderResultMod extends js.Object {
  
  @js.native
  trait RenderResult extends DomElement {
    
    def apply(out: js.Any): this.type = js.native
    
    def afterInsert(doc: Document): this.type = js.native
    
    var document: Document | `false` = js.native
    
    def getComponent(): Component = js.native
    
    def getComponents(): js.Array[Component] = js.native
    def getComponents(selector: js.Any): js.Array[Component] = js.native
    
    def getNode(doc: Document): Node = js.native
    
    def getOutput(): js.Any = js.native
  }
}
