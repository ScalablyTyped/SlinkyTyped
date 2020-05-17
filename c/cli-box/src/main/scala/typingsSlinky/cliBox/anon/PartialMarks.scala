package typingsSlinky.cliBox.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cli-box.cli-box.Marks> */
@js.native
trait PartialMarks extends js.Object {
  var b: js.UndefOr[String] = js.native
  var e: js.UndefOr[String] = js.native
  var n: js.UndefOr[String] = js.native
  @JSName("ne")
  var ne_FPartialMarks: js.UndefOr[String] = js.native
  var nw: js.UndefOr[String] = js.native
  var s: js.UndefOr[String] = js.native
  var se: js.UndefOr[String] = js.native
  var sw: js.UndefOr[String] = js.native
  var w: js.UndefOr[String] = js.native
}

object PartialMarks {
  @scala.inline
  def apply(): PartialMarks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMarks]
  }
  @scala.inline
  implicit class PartialMarksOps[Self <: PartialMarks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withB(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b")(js.undefined)
        ret
    }
    @scala.inline
    def withE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("e")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("e")(js.undefined)
        ret
    }
    @scala.inline
    def withN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n")(js.undefined)
        ret
    }
    @scala.inline
    def withNe(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ne")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ne")(js.undefined)
        ret
    }
    @scala.inline
    def withNw(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nw")(js.undefined)
        ret
    }
    @scala.inline
    def withS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s")(js.undefined)
        ret
    }
    @scala.inline
    def withSe(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("se")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("se")(js.undefined)
        ret
    }
    @scala.inline
    def withSw(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sw")(js.undefined)
        ret
    }
    @scala.inline
    def withW(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("w")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutW: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("w")(js.undefined)
        ret
    }
  }
  
}

