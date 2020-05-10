package typingsSlinky.mapboxGl.mod

import typingsSlinky.mapboxGl.mapboxGlStrings.bevel
import typingsSlinky.mapboxGl.mapboxGlStrings.butt
import typingsSlinky.mapboxGl.mapboxGlStrings.miter
import typingsSlinky.mapboxGl.mapboxGlStrings.round
import typingsSlinky.mapboxGl.mapboxGlStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineLayout
  extends Layout
     with _AnyLayout {
  var `line-cap`: js.UndefOr[butt | round | square] = js.native
  var `line-join`: js.UndefOr[bevel | round | miter | Expression] = js.native
  var `line-miter-limit`: js.UndefOr[Double | Expression] = js.native
  var `line-round-limit`: js.UndefOr[Double | Expression] = js.native
  var `line-sort-key`: js.UndefOr[Double] = js.native
}

object LineLayout {
  @scala.inline
  def apply(): LineLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineLayout]
  }
  @scala.inline
  implicit class LineLayoutOps[Self <: LineLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withLine-cap`(value: butt | round | square): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-cap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-cap`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-cap")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-join`(value: bevel | round | miter | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-join")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-join`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-join")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-miter-limit`(value: Double | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-miter-limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-miter-limit`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-miter-limit")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-round-limit`(value: Double | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-round-limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-round-limit`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-round-limit")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-sort-key`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-sort-key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-sort-key`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-sort-key")(js.undefined)
        ret
    }
  }
  
}

