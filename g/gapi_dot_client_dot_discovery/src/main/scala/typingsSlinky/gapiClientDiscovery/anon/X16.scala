package typingsSlinky.gapiClientDiscovery.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait X16 extends js.Object {
  /** The URL of the 16x16 icon. */
  var x16: js.UndefOr[String] = js.native
  /** The URL of the 32x32 icon. */
  var x32: js.UndefOr[String] = js.native
}

object X16 {
  @scala.inline
  def apply(): X16 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[X16]
  }
  @scala.inline
  implicit class X16Ops[Self <: X16] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withX16(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x16")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX16: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x16")(js.undefined)
        ret
    }
    @scala.inline
    def withX32(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x32")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX32: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x32")(js.undefined)
        ret
    }
  }
  
}

