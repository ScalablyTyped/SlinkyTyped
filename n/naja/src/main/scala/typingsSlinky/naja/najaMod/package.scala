package typingsSlinky.naja

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object najaMod {
  import org.scalajs.dom.raw.Blob
  import org.scalajs.dom.raw.Event
  import org.scalajs.dom.raw.FormData
  import typingsSlinky.naja.Anon_Event
  import typingsSlinky.naja.Anon_EventHandleEvent

  type NajaEventListener[T /* <: Event */] = (js.Function1[/* event */ T, js.Promise[Unit] | Unit]) | Anon_EventHandleEvent[T]
  type RequestData = Null | String | Double | js.Array[js.Any] | js.Object | scala.scalajs.js.typedarray.ArrayBuffer | Blob | FormData
  type SnippetUpdateListener = (js.Function1[/* event */ SnippetUpdateEvent, js.Promise[Unit] | Unit]) | Anon_Event
}
