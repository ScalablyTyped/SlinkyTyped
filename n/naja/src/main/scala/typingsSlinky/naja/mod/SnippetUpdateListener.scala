package typingsSlinky.naja.mod

import typingsSlinky.naja.anon.HandleEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function1[
/ * event * / typingsSlinky.naja.mod.SnippetUpdateEvent, 
js.Promise[scala.Unit] | scala.Unit]
  - typingsSlinky.naja.anon.HandleEvent
*/
trait SnippetUpdateListener extends js.Object

object SnippetUpdateListener {
  @scala.inline
  implicit def apply(value: js.Function1[/* event */ SnippetUpdateEvent, js.Promise[Unit] | Unit]): SnippetUpdateListener = value.asInstanceOf[SnippetUpdateListener]
  @scala.inline
  implicit def apply(value: HandleEvent): SnippetUpdateListener = value.asInstanceOf[SnippetUpdateListener]
}

