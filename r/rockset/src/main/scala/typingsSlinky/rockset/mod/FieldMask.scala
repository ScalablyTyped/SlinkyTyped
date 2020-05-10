package typingsSlinky.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldMask extends js.Object {
  var input_path: js.Array[String] = js.native
  var mask: js.UndefOr[FieldMaskMask] = js.native
}

object FieldMask {
  @scala.inline
  def apply(input_path: js.Array[String]): FieldMask = {
    val __obj = js.Dynamic.literal(input_path = input_path.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldMask]
  }
  @scala.inline
  implicit class FieldMaskOps[Self <: FieldMask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInput_path(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMask(value: FieldMaskMask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(js.undefined)
        ret
    }
  }
  
}

