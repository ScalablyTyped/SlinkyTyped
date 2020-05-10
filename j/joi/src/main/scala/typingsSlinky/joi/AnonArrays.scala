package typingsSlinky.joi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArrays extends js.Object {
  var arrays: js.UndefOr[Boolean] = js.native
  var objects: js.UndefOr[Boolean] = js.native
}

object AnonArrays {
  @scala.inline
  def apply(): AnonArrays = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonArrays]
  }
  @scala.inline
  implicit class AnonArraysOps[Self <: AnonArrays] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrays(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrays")(js.undefined)
        ret
    }
    @scala.inline
    def withObjects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objects")(js.undefined)
        ret
    }
  }
  
}

