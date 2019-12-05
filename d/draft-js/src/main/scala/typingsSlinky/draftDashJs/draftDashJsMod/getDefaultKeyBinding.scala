package typingsSlinky.draftDashJs.draftDashJsMod

import typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.Constants.DraftEditorCommand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("draft-js", "getDefaultKeyBinding")
@js.native
object getDefaultKeyBinding extends js.Object {
  /**
    * Retrieve a bound key command for the given event.
    */
  def apply(e: slinky.web.SyntheticKeyboardEvent[js.Object]): DraftEditorCommand | Null = js.native
}

