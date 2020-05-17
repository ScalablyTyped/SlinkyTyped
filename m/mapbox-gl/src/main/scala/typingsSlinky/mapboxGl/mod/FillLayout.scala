package typingsSlinky.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FillLayout
  extends Layout
     with AnyLayout {
  var `fill-sort-key`: js.UndefOr[Double] = js.native
}

object FillLayout {
  @scala.inline
  def apply(): FillLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillLayout]
  }
  @scala.inline
  implicit class FillLayoutOps[Self <: FillLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withFill-sort-key`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-sort-key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFill-sort-key`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-sort-key")(js.undefined)
        ret
    }
  }
  
}

