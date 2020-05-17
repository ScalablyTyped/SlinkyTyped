package typingsSlinky.rxjs.internalCompatibilityMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.rxjs.ajaxObservableMod.AjaxRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "AjaxResponse")
@js.native
class AjaxResponse protected ()
  extends typingsSlinky.rxjs.ajaxObservableMod.AjaxResponse {
  def this(originalEvent: Event, xhr: XMLHttpRequest, request: AjaxRequest) = this()
}

