package typingsSlinky.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materialLinearProgress.adapterMod.MDCLinearProgressAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "linearProgress")
@js.native
object linearProgress extends js.Object {
  @js.native
  class MDCLinearProgress ()
    extends typingsSlinky.materialLinearProgress.mod.MDCLinearProgress
  
  @js.native
  class MDCLinearProgressFoundation ()
    extends typingsSlinky.materialLinearProgress.mod.MDCLinearProgressFoundation
  
  /* static members */
  @js.native
  object MDCLinearProgress extends js.Object {
    def attachTo(root: Element): typingsSlinky.materialLinearProgress.mod.MDCLinearProgress = js.native
  }
  
  /* static members */
  @js.native
  object MDCLinearProgressFoundation extends js.Object {
    val cssClasses: typingsSlinky.materialLinearProgress.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCLinearProgressAdapter = js.native
    val strings: typingsSlinky.materialLinearProgress.constantsMod.strings = js.native
  }
  
}

