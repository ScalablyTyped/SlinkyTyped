package typingsSlinky.reactBootstrapTableNext

import typingsSlinky.reactBootstrapTableNext.mod.ColumnDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOnClick[T /* <: js.Object */, E] extends js.Object {
  def onClick(e: js.Any, column: ColumnDescription[T, E], columnIndex: Double): Unit = js.native
}

object AnonOnClick {
  @scala.inline
  def apply[T, E](onClick: (js.Any, ColumnDescription[T, E], Double) => Unit): AnonOnClick[T, E] = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction3(onClick))
    __obj.asInstanceOf[AnonOnClick[T, E]]
  }
  @scala.inline
  implicit class AnonOnClickOps[Self[t, e] <: AnonOnClick[t, e], T, E] (val x: Self[T, E]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, E] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, E]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, E]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, E]) with Other]
    @scala.inline
    def withOnClick(value: (js.Any, ColumnDescription[T, E], Double) => Unit): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

