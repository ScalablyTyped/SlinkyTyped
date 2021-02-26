package typingsSlinky.rxjs

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.rxjs.ajaxObservableMod.AjaxCreationMethod
import typingsSlinky.rxjs.ajaxObservableMod.AjaxErrorCtor
import typingsSlinky.rxjs.ajaxObservableMod.AjaxRequest
import typingsSlinky.rxjs.ajaxObservableMod.AjaxTimeoutErrorCtor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ajaxMod {
  
  @JSImport("rxjs/ajax", "AjaxError")
  @js.native
  val AjaxError: AjaxErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/ajax", "AjaxError")
  @js.native
  class AjaxErrorCls protected ()
    extends typingsSlinky.rxjs.ajaxObservableMod.AjaxError {
    def this(message: String, xhr: XMLHttpRequest, request: AjaxRequest) = this()
  }
  
  @JSImport("rxjs/ajax", "AjaxResponse")
  @js.native
  class AjaxResponse protected ()
    extends typingsSlinky.rxjs.ajaxObservableMod.AjaxResponse {
    def this(originalEvent: Event, xhr: XMLHttpRequest, request: AjaxRequest) = this()
  }
  
  @JSImport("rxjs/ajax", "AjaxTimeoutError")
  @js.native
  val AjaxTimeoutError: AjaxTimeoutErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/ajax", "AjaxTimeoutError")
  @js.native
  class AjaxTimeoutErrorCls protected ()
    extends typingsSlinky.rxjs.ajaxObservableMod.AjaxError {
    def this(xhr: XMLHttpRequest, request: AjaxRequest) = this()
  }
  
  @JSImport("rxjs/ajax", "ajax")
  @js.native
  val ajax: AjaxCreationMethod = js.native
}
