package typingsSlinky.prosemirrorDevTools

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.prosemirrorModel.mod.Schema
import typingsSlinky.prosemirrorState.anon.Doc
import typingsSlinky.prosemirrorState.mod.EditorState
import typingsSlinky.prosemirrorState.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait TypeofEditorState
    extends Instantiable0[EditorState[Schema[js.Any, js.Any]]] {
    
    /**
      * Create a new state.
      */
    def create[S /* <: Schema[_, _] */](config: Doc[S]): EditorState[S] = js.native
    
    /**
      * Deserialize a JSON representation of a state. `config` should
      * have at least a `schema` field, and should contain array of
      * plugins to initialize the state with. `pluginFields` can be used
      * to deserialize the state of plugins, by associating plugin
      * instances with the property names they use in the JSON object.
      */
    def fromJSON[S /* <: Schema[_, _] */](config: typingsSlinky.prosemirrorState.anon.Schema[S], json: StringDictionary[js.Any]): EditorState[S] = js.native
    def fromJSON[S /* <: Schema[_, _] */](
      config: typingsSlinky.prosemirrorState.anon.Schema[S],
      json: StringDictionary[js.Any],
      pluginFields: StringDictionary[Plugin[_, S]]
    ): EditorState[S] = js.native
  }
}
