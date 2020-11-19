package typingsSlinky.codemirror.mod

import typingsSlinky.codemirror.codemirrorStrings.unhide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("codemirror", "on")
@js.native
object on_unhide extends js.Object {
  
  /** Fired when, after the marker was removed by editing, a undo operation brought the marker back. */
  def apply(marker: TextMarker, eventName: unhide, handler: js.Function0[Unit]): Unit = js.native
}
