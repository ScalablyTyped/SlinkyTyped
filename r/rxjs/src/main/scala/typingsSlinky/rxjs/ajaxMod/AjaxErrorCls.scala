package typingsSlinky.rxjs.ajaxMod

import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.rxjs.ajaxObservableMod.AjaxRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/ajax", "AjaxError")
@js.native
class AjaxErrorCls protected ()
  extends typingsSlinky.rxjs.ajaxObservableMod.AjaxError {
  def this(message: String, xhr: XMLHttpRequest, request: AjaxRequest) = this()
}

