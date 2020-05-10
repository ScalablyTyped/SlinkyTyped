package typingsSlinky.graphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMaxErrors extends js.Object {
  var maxErrors: js.UndefOr[Double] = js.native
}

object AnonMaxErrors {
  @scala.inline
  def apply(): AnonMaxErrors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonMaxErrors]
  }
  @scala.inline
  implicit class AnonMaxErrorsOps[Self <: AnonMaxErrors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxErrors(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxErrors")(js.undefined)
        ret
    }
  }
  
}

