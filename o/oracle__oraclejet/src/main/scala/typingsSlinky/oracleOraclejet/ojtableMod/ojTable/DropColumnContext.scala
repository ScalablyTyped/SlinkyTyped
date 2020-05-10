package typingsSlinky.oracleOraclejet.ojtableMod.ojTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait DropColumnContext extends js.Object {
  var columnIndex: Double = js.native
}

object DropColumnContext {
  @scala.inline
  def apply(columnIndex: Double): DropColumnContext = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropColumnContext]
  }
  @scala.inline
  implicit class DropColumnContextOps[Self <: DropColumnContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

