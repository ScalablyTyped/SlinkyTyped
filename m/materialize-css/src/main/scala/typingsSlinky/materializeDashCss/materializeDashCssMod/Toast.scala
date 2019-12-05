package typingsSlinky.materializeDashCss.materializeDashCssMod

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeDashCss.M.ToastOptions
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Toast")
@js.native
class Toast ()
  extends typingsSlinky.materializeDashCss.M.Toast

/* static members */
@JSImport("materialize-css", "Toast")
@js.native
object Toast extends js.Object {
  /**
    * dismiss all toasts
    */
  def dismissAll(): Unit = js.native
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeDashCss.M.Toast = js.native
}

@JSImport("materialize-css", "toast")
@js.native
object toast extends js.Object {
  /**
    * Create a toast
    */
  def apply(options: Partial[ToastOptions]): typingsSlinky.materializeDashCss.M.Toast = js.native
}

