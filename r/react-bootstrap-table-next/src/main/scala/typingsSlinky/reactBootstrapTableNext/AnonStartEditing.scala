package typingsSlinky.reactBootstrapTableNext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStartEditing extends js.Object {
  def startEditing(rowIndex: Double, columnIndex: Double): Unit = js.native
}

object AnonStartEditing {
  @scala.inline
  def apply(startEditing: (Double, Double) => Unit): AnonStartEditing = {
    val __obj = js.Dynamic.literal(startEditing = js.Any.fromFunction2(startEditing))
    __obj.asInstanceOf[AnonStartEditing]
  }
  @scala.inline
  implicit class AnonStartEditingOps[Self <: AnonStartEditing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStartEditing(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startEditing")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

