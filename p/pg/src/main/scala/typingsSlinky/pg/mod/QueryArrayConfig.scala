package typingsSlinky.pg.mod

import typingsSlinky.pg.pgStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryArrayConfig[I /* <: js.Array[_] */] extends QueryConfig[I] {
  var rowMode: array = js.native
}

object QueryArrayConfig {
  @scala.inline
  def apply[I](rowMode: array, text: String): QueryArrayConfig[I] = {
    val __obj = js.Dynamic.literal(rowMode = rowMode.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryArrayConfig[I]]
  }
  @scala.inline
  implicit class QueryArrayConfigOps[Self[i] <: QueryArrayConfig[i], I] (val x: Self[I]) extends AnyVal {
    @scala.inline
    def duplicate: Self[I] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[I]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[I] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[I] with Other]
    @scala.inline
    def withRowMode(value: array): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

