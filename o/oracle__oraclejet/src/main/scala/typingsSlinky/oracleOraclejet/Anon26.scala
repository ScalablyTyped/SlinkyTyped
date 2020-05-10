package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.ojtreemapMod.ojTreemap.NodeContentContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon26[K, D] extends js.Object {
  def renderer(context: NodeContentContext[K, D]): AnonInsert = js.native
}

object Anon26 {
  @scala.inline
  def apply[K, D](renderer: NodeContentContext[K, D] => AnonInsert): Anon26[K, D] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[Anon26[K, D]]
  }
  @scala.inline
  implicit class Anon26Ops[Self[k, d] <: Anon26[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, D]) with Other]
    @scala.inline
    def withRenderer(value: NodeContentContext[K, D] => AnonInsert): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

