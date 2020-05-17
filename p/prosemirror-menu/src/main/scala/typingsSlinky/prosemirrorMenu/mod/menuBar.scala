package typingsSlinky.prosemirrorMenu.mod

import typingsSlinky.prosemirrorMenu.anon.Content
import typingsSlinky.prosemirrorModel.mod.Schema
import typingsSlinky.prosemirrorState.mod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-menu", "menuBar")
@js.native
object menuBar extends js.Object {
  def apply[S /* <: Schema[_, _] */](options: Content[S]): Plugin[S, _] = js.native
}

