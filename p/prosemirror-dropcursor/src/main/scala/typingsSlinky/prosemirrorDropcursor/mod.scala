package typingsSlinky.prosemirrorDropcursor

import typingsSlinky.prosemirrorDropcursor.anon.Color
import typingsSlinky.prosemirrorState.mod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-dropcursor", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def dropCursor(): Plugin[_, _] = js.native
  def dropCursor(options: Color): Plugin[_, _] = js.native
}

