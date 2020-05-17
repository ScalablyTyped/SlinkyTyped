package typingsSlinky.cliTable2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Head extends js.Object {
  var border: js.UndefOr[js.Array[String]] = js.native
  var head: js.UndefOr[js.Array[String]] = js.native
  var `padding-left`: js.UndefOr[Double] = js.native
  var `padding-right`: js.UndefOr[Double] = js.native
}

object Head {
  @scala.inline
  def apply(): Head = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Head]
  }
  @scala.inline
  implicit class HeadOps[Self <: Head] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorder(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
    @scala.inline
    def withHead(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("head")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("head")(js.undefined)
        ret
    }
    @scala.inline
    def `withPadding-left`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPadding-left`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-left")(js.undefined)
        ret
    }
    @scala.inline
    def `withPadding-right`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPadding-right`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-right")(js.undefined)
        ret
    }
  }
  
}

