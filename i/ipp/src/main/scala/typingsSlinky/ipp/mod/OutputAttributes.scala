package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputAttributes extends js.Object {
  var `noise-removal`: js.UndefOr[Double] = js.native
  var `output-compression-quality-factor`: js.UndefOr[Double] = js.native
}

object OutputAttributes {
  @scala.inline
  def apply(): OutputAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputAttributes]
  }
  @scala.inline
  implicit class OutputAttributesOps[Self <: OutputAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withNoise-removal`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noise-removal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNoise-removal`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noise-removal")(js.undefined)
        ret
    }
    @scala.inline
    def `withOutput-compression-quality-factor`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output-compression-quality-factor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOutput-compression-quality-factor`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output-compression-quality-factor")(js.undefined)
        ret
    }
  }
  
}

