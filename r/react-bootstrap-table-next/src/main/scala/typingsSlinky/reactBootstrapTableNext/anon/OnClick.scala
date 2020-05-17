package typingsSlinky.reactBootstrapTableNext.anon

import typingsSlinky.reactBootstrapTableNext.mod.ColumnDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnClick[T /* <: js.Object */, E] extends js.Object {
  def onClick(e: js.Any, column: ColumnDescription[T, E], columnIndex: Double): Unit = js.native
}

object OnClick {
  @scala.inline
  def apply[T, E](onClick: (js.Any, ColumnDescription[T, E], Double) => Unit): OnClick[T, E] = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction3(onClick))
    __obj.asInstanceOf[OnClick[T, E]]
  }
  @scala.inline
  implicit class OnClickOps[Self[t, e] <: OnClick[t, e], T, E] (val x: Self[T, E]) extends AnyVal {
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

