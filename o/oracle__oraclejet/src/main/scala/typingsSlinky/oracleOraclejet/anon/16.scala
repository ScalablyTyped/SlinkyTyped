package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.ojsunburstMod.ojSunburst.RootNodeContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `16`[K, D] extends js.Object {
  def renderer(context: RootNodeContext[K, D]): Insert = js.native
}

object `16` {
  @scala.inline
  def apply[K, D](renderer: RootNodeContext[K, D] => Insert): `16`[K, D] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`16`[K, D]]
  }
  @scala.inline
  implicit class `16Ops`[Self[k, d] <: `16`[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, D]) with Other]
    @scala.inline
    def withRenderer(value: RootNodeContext[K, D] => Insert): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

