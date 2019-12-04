package typingsSlinky.rxjs.ajaxMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.rxjs.internalObservableDomAjaxObservableMod.AjaxRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/ajax", "AjaxResponse")
@js.native
class AjaxResponse protected ()
  extends typingsSlinky.rxjs.internalObservableDomAjaxObservableMod.AjaxResponse {
  def this(originalEvent: Event, xhr: XMLHttpRequest, request: AjaxRequest) = this()
}

