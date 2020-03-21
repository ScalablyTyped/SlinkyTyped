package typingsSlinky.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materialSnackbar.adapterMod.MDCSnackbarAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "snackbar")
@js.native
object snackbar extends js.Object {
  @js.native
  class MDCSnackbar ()
    extends typingsSlinky.materialSnackbar.mod.MDCSnackbar
  
  @js.native
  class MDCSnackbarFoundation ()
    extends typingsSlinky.materialSnackbar.mod.MDCSnackbarFoundation
  
  /* static members */
  @js.native
  object MDCSnackbar extends js.Object {
    def attachTo(root: Element): typingsSlinky.materialSnackbar.mod.MDCSnackbar = js.native
  }
  
  /* static members */
  @js.native
  object MDCSnackbarFoundation extends js.Object {
    val cssClasses: typingsSlinky.materialSnackbar.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCSnackbarAdapter = js.native
    val strings: typingsSlinky.materialSnackbar.constantsMod.strings = js.native
  }
  
}

