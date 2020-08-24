package typingsSlinky.rxDom.mod.rxAugmentingMod.DOM

import typingsSlinky.rx.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "DOM.ajax")
@js.native
object ajax extends js.Object {
  def apply(settingsOrUrl: String): Observable[AjaxSuccessResponse] = js.native
  // Ajax
  def apply(settingsOrUrl: AjaxSettings): Observable[AjaxSuccessResponse] = js.native
}

