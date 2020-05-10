package typingsSlinky.reactNativeJoi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonWrapArrays extends js.Object {
  var wrapArrays: js.UndefOr[Boolean] = js.native
}

object AnonWrapArrays {
  @scala.inline
  def apply(): AnonWrapArrays = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonWrapArrays]
  }
  @scala.inline
  implicit class AnonWrapArraysOps[Self <: AnonWrapArrays] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWrapArrays(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapArrays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapArrays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapArrays")(js.undefined)
        ret
    }
  }
  
}

