package typingsSlinky.rxjs.internalCompatibilityMod

import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.rxjs.ajaxObservableMod.AjaxRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal-compatibility", "AjaxTimeoutError")
@js.native
class AjaxTimeoutErrorCls protected ()
  extends typingsSlinky.rxjs.ajaxObservableMod.AjaxError {
  def this(xhr: XMLHttpRequest, request: AjaxRequest) = this()
}
