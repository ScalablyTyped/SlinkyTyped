package typingsSlinky.jsforce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExtIdField extends js.Object {
  var extIdField: js.UndefOr[String] = js.native
}

object AnonExtIdField {
  @scala.inline
  def apply(): AnonExtIdField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonExtIdField]
  }
  @scala.inline
  implicit class AnonExtIdFieldOps[Self <: AnonExtIdField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtIdField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extIdField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtIdField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extIdField")(js.undefined)
        ret
    }
  }
  
}

