package typingsSlinky.prosemirrorDashDevDashTools

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.prosemirrorDashModel.prosemirrorDashModelMod.Schema
import typingsSlinky.prosemirrorDashState.Anon_Doc
import typingsSlinky.prosemirrorDashState.Anon_PluginsSchema
import typingsSlinky.prosemirrorDashState.prosemirrorDashStateMod.EditorState
import typingsSlinky.prosemirrorDashState.prosemirrorDashStateMod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassEditorState
  extends Instantiable0[EditorState[Schema[js.Any, js.Any]]] {
  /**
    * Create a new state.
    */
  def create[S /* <: Schema[_, _] */](config: Anon_Doc[S]): EditorState[S] = js.native
  /**
    * Deserialize a JSON representation of a state. `config` should
    * have at least a `schema` field, and should contain array of
    * plugins to initialize the state with. `pluginFields` can be used
    * to deserialize the state of plugins, by associating plugin
    * instances with the property names they use in the JSON object.
    */
  def fromJSON[S /* <: Schema[_, _] */](config: Anon_PluginsSchema[S], json: StringDictionary[js.Any]): EditorState[S] = js.native
  def fromJSON[S /* <: Schema[_, _] */](
    config: Anon_PluginsSchema[S],
    json: StringDictionary[js.Any],
    pluginFields: StringDictionary[Plugin[_, S]]
  ): EditorState[S] = js.native
}

