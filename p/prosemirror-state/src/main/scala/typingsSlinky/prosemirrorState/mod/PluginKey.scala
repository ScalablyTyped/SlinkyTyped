package typingsSlinky.prosemirrorState.mod

import typingsSlinky.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prosemirror-state", "PluginKey")
@js.native
/**
  * Create a plugin key.
  */
class PluginKey[T, S /* <: Schema[_, _] */] () extends js.Object {
  def this(name: String) = this()
  
  /**
    * Get the active plugin with this key, if any, from an editor
    * state.
    */
  def get(state: EditorState[S]): js.UndefOr[(Plugin[T, S]) | Null] = js.native
  
  /**
    * Get the plugin's state from an editor state.
    */
  def getState(state: EditorState[S]): js.UndefOr[T | Null] = js.native
}
