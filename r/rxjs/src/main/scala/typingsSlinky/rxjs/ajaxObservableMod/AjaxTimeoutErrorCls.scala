package typingsSlinky.rxjs.ajaxObservableMod

import org.scalajs.dom.raw.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/dom/AjaxObservable", "AjaxTimeoutError")
@js.native
class AjaxTimeoutErrorCls protected () extends AjaxError {
  def this(xhr: XMLHttpRequest, request: AjaxRequest) = this()
}

