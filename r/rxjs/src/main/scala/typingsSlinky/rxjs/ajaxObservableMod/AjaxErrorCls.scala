package typingsSlinky.rxjs.ajaxObservableMod

import org.scalajs.dom.raw.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/observable/dom/AjaxObservable", "AjaxError")
@js.native
class AjaxErrorCls protected () extends AjaxError {
  def this(message: String, xhr: XMLHttpRequest, request: AjaxRequest) = this()
}
