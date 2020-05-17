package typingsSlinky.nivoCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  line  :std.Partial<react.react.CSSProperties>,   text  :std.Partial<react.react.CSSProperties>}> */
@js.native
trait PartiallinePartialCSSPropLine extends js.Object {
  var line: js.UndefOr[PartialCSSProperties] = js.native
  var text: js.UndefOr[PartialCSSProperties] = js.native
}

object PartiallinePartialCSSPropLine {
  @scala.inline
  def apply(): PartiallinePartialCSSPropLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartiallinePartialCSSPropLine]
  }
  @scala.inline
  implicit class PartiallinePartialCSSPropLineOps[Self <: PartiallinePartialCSSPropLine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLine(value: PartialCSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: PartialCSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

