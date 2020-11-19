package typingsSlinky.prosemirrorMenu.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.prosemirrorMenu.anon.Dom
import typingsSlinky.prosemirrorModel.mod.Schema
import typingsSlinky.prosemirrorView.mod.EditorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prosemirror-menu", "DropdownSubmenu")
@js.native
class DropdownSubmenu[S /* <: Schema[_, _] */] protected () extends js.Object {
  /**
    * Creates a submenu for the given group of menu elements. The
    * following options are recognized:
    *
    * **`label`**`: string`
    * : The label to show on the submenu.
    */
  def this(content: js.Array[MenuElement[S]]) = this()
  def this(content: js.Array[MenuElement[S]], options: StringDictionary[js.Any]) = this()
  
  /**
    * Renders the submenu.
    */
  def render(view: EditorView[S]): Dom[S] = js.native
}
