package typingsSlinky.rxjs.internalCompatibilityMod

import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.rxjs.ajaxObservableMod.AjaxRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal-compatibility", "AjaxError")
@js.native
class AjaxErrorCls protected ()
  extends typingsSlinky.rxjs.ajaxObservableMod.AjaxError {
  def this(message: String, xhr: XMLHttpRequest, request: AjaxRequest) = this()
}
