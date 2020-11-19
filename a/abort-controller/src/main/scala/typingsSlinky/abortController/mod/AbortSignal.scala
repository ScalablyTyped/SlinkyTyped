package typingsSlinky.abortController.mod

import typingsSlinky.abortController.abortControllerStrings.loose
import typingsSlinky.eventTargetShim.anon.AddEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The signal class.
  * @see https://dom.spec.whatwg.org/#abortsignal
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof abort-controller.abort-controller/dist/abort-controller.EventAttributes ]: event-target-shim.event-target-shim.EventTarget.FunctionListener<abort-controller.abort-controller/dist/abort-controller.EventAttributes[P]> | null}
- Dropped {[ P in keyof abort-controller.abort-controller/dist/abort-controller.EventAttributes ]: event-target-shim.event-target-shim.EventTarget.FunctionListener<abort-controller.abort-controller/dist/abort-controller.EventAttributes[P]> | null} */ @JSImport("abort-controller/dist/abort-controller", "AbortSignal")
@js.native
/**
  * AbortSignal cannot be constructed directly.
  */
class AbortSignal () extends AddEventListener[Events, loose] {
  
  /**
    * Returns `true` if this `AbortSignal`"s `AbortController` has signaled to abort, and `false` otherwise.
    */
  val aborted: Boolean = js.native
}
