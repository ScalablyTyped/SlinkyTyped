package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.ojtreemapMod.ojTreemap.NodeContentContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `26`[K, D] extends js.Object {
  def renderer(context: NodeContentContext[K, D]): Insert = js.native
}

object `26` {
  @scala.inline
  def apply[K, D](renderer: NodeContentContext[K, D] => Insert): `26`[K, D] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`26`[K, D]]
  }
  @scala.inline
  implicit class `26Ops`[Self[k, d] <: `26`[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, D]) with Other]
    @scala.inline
    def withRenderer(value: NodeContentContext[K, D] => Insert): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

