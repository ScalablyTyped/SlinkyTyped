package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.ojganttMod.ojGantt.RowAxisLabelRendererContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon6[K2, D2] extends js.Object {
  def renderer(context: RowAxisLabelRendererContext[K2, D2]): AnonInsertElement = js.native
}

object Anon6 {
  @scala.inline
  def apply[K2, D2](renderer: RowAxisLabelRendererContext[K2, D2] => AnonInsertElement): Anon6[K2, D2] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[Anon6[K2, D2]]
  }
  @scala.inline
  implicit class Anon6Ops[Self[k2, d2] <: Anon6[k2, d2], K2, D2] (val x: Self[K2, D2]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K2, D2] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K2, D2]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K2, D2]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K2, D2]) with Other]
    @scala.inline
    def withRenderer(value: RowAxisLabelRendererContext[K2, D2] => AnonInsertElement): Self[K2, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

