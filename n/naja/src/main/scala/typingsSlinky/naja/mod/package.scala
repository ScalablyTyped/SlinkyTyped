package typingsSlinky.naja

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type NajaEventListener[T /* <: org.scalajs.dom.raw.Event */] = (js.Function1[/* event */ T, js.Promise[scala.Unit] | scala.Unit]) | typingsSlinky.naja.anon.`0`[T]
  type RequestData = scala.Null | java.lang.String | scala.Double | js.Array[js.Any] | js.Object | js.typedarray.ArrayBuffer | org.scalajs.dom.raw.Blob | org.scalajs.dom.raw.FormData
  type SnippetUpdateListener = (js.Function1[
    /* event */ typingsSlinky.naja.mod.SnippetUpdateEvent, 
    js.Promise[scala.Unit] | scala.Unit
  ]) | typingsSlinky.naja.anon.HandleEvent
}
