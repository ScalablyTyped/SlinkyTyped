package typingsSlinky.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materialLineRipple.adapterMod.MDCLineRippleAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "lineRipple")
@js.native
object lineRipple extends js.Object {
  @js.native
  class MDCLineRipple ()
    extends typingsSlinky.materialLineRipple.mod.MDCLineRipple
  
  @js.native
  class MDCLineRippleFoundation ()
    extends typingsSlinky.materialLineRipple.mod.MDCLineRippleFoundation
  
  /* static members */
  @js.native
  object MDCLineRipple extends js.Object {
    def attachTo(root: Element): typingsSlinky.materialLineRipple.mod.MDCLineRipple = js.native
  }
  
  /* static members */
  @js.native
  object MDCLineRippleFoundation extends js.Object {
    val cssClasses: typingsSlinky.materialLineRipple.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCLineRippleAdapter = js.native
  }
  
}

