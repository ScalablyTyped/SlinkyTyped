package typingsSlinky.materialDashComponentsDashWeb.materialDashComponentsDashWebMod

import org.scalajs.dom.raw.Element
import typingsSlinky.atMaterialSnackbar.adapterMod.MDCSnackbarAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "snackbar")
@js.native
object snackbar extends js.Object {
  @js.native
  class MDCSnackbar ()
    extends typingsSlinky.atMaterialSnackbar.atMaterialSnackbarMod.MDCSnackbar
  
  @js.native
  class MDCSnackbarFoundation ()
    extends typingsSlinky.atMaterialSnackbar.atMaterialSnackbarMod.MDCSnackbarFoundation
  
  /* static members */
  @js.native
  object MDCSnackbar extends js.Object {
    def attachTo(root: Element): typingsSlinky.atMaterialSnackbar.atMaterialSnackbarMod.MDCSnackbar = js.native
  }
  
  /* static members */
  @js.native
  object MDCSnackbarFoundation extends js.Object {
    val cssClasses: typingsSlinky.atMaterialSnackbar.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCSnackbarAdapter = js.native
    val strings: typingsSlinky.atMaterialSnackbar.constantsMod.strings = js.native
  }
  
}

