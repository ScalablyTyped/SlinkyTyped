package typingsSlinky.prosemirrorCollab

import typingsSlinky.prosemirrorCollab.anon.ClientID
import typingsSlinky.prosemirrorCollab.anon.MapSelectionBackward
import typingsSlinky.prosemirrorCollab.anon.Origins
import typingsSlinky.prosemirrorModel.mod.Schema
import typingsSlinky.prosemirrorState.mod.EditorState
import typingsSlinky.prosemirrorState.mod.Plugin
import typingsSlinky.prosemirrorState.mod.Transaction
import typingsSlinky.prosemirrorTransform.mod.Step
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-collab", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def collab(): Plugin[_, _] = js.native
  def collab(config: ClientID): Plugin[_, _] = js.native
  def getVersion(state: EditorState[_]): Double = js.native
  def receiveTransaction[S /* <: Schema[_, _] */](state: EditorState[S], steps: js.Array[Step[S]], clientIDs: js.Array[Double | String]): Transaction[S] = js.native
  def receiveTransaction[S /* <: Schema[_, _] */](
    state: EditorState[S],
    steps: js.Array[Step[S]],
    clientIDs: js.Array[Double | String],
    options: MapSelectionBackward
  ): Transaction[S] = js.native
  def sendableSteps[S /* <: Schema[_, _] */](state: EditorState[S]): js.UndefOr[Origins[S] | Null] = js.native
}

