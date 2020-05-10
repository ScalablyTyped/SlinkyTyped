package typingsSlinky.sailsIoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitialConnectionHeaders extends js.Object {
  var nosession: js.UndefOr[Boolean] = js.native
}

object InitialConnectionHeaders {
  @scala.inline
  def apply(): InitialConnectionHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitialConnectionHeaders]
  }
  @scala.inline
  implicit class InitialConnectionHeadersOps[Self <: InitialConnectionHeaders] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNosession(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nosession")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNosession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nosession")(js.undefined)
        ret
    }
  }
  
}

