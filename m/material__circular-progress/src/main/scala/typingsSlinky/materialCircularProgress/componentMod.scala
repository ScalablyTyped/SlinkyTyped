package typingsSlinky.materialCircularProgress

import org.scalajs.dom.raw.Element
import typingsSlinky.materialBase.componentMod.MDCComponent
import typingsSlinky.materialCircularProgress.foundationMod.MDCCircularProgressFoundation
import typingsSlinky.materialProgressIndicator.mod.MDCProgressIndicator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/circular-progress/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  
  @js.native
  class MDCCircularProgress ()
    extends MDCComponent[MDCCircularProgressFoundation]
       with MDCProgressIndicator {
    
    def initialize(): Unit = js.native
    
    /**
      * Whether the progress indicator is hidden.
      */
    def isClosed: Boolean = js.native
  }
  /* static members */
  @js.native
  object MDCCircularProgress extends js.Object {
    
    def attachTo(root: Element): MDCCircularProgress = js.native
  }
}
