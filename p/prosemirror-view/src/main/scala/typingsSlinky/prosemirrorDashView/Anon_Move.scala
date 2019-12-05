package typingsSlinky.prosemirrorDashView

import typingsSlinky.prosemirrorDashModel.prosemirrorDashModelMod.Schema
import typingsSlinky.prosemirrorDashModel.prosemirrorDashModelMod.Slice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Move[S /* <: Schema[_, _] */] extends js.Object {
  var move: Boolean
  var slice: Slice[S]
}

object Anon_Move {
  @scala.inline
  def apply[S /* <: Schema[_, _] */](move: Boolean, slice: Slice[S]): Anon_Move[S] = {
    val __obj = js.Dynamic.literal(move = move.asInstanceOf[js.Any], slice = slice.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Move[S]]
  }
}

