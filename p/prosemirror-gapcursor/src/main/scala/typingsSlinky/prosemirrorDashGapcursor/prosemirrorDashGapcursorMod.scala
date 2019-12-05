package typingsSlinky.prosemirrorDashGapcursor

import typingsSlinky.prosemirrorDashState.prosemirrorDashStateMod.Plugin
import typingsSlinky.prosemirrorDashState.prosemirrorDashStateMod.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-gapcursor", JSImport.Namespace)
@js.native
object prosemirrorDashGapcursorMod extends js.Object {
  @js.native
  class GapCursor ()
    extends Selection[js.Any]
  
  def gapCursor(): Plugin[_, _] = js.native
}

