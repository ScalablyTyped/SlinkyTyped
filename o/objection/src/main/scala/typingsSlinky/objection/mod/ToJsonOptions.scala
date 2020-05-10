package typingsSlinky.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToJsonOptions extends CloneOptions {
  var virtuals: js.UndefOr[Boolean | js.Array[String]] = js.native
}

object ToJsonOptions {
  @scala.inline
  def apply(): ToJsonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToJsonOptions]
  }
  @scala.inline
  implicit class ToJsonOptionsOps[Self <: ToJsonOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVirtuals(value: Boolean | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtuals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtuals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtuals")(js.undefined)
        ret
    }
  }
  
}

