package typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QualitativeRange extends js.Object {
  /** Specifies the ending range to which the qualitative ranges will render.
    * @Default {3}
    */
  var rangeEnd: js.UndefOr[Double] = js.native
  /** Specifies the opacity for the qualitative ranges.
    * @Default {1}
    */
  var rangeOpacity: js.UndefOr[Double] = js.native
  /** Specifies the stroke for the qualitative ranges.
    * @Default {null}
    */
  var rangeStroke: js.UndefOr[String] = js.native
}

object QualitativeRange {
  @scala.inline
  def apply(): QualitativeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QualitativeRange]
  }
  @scala.inline
  implicit class QualitativeRangeOps[Self <: QualitativeRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRangeEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeStroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeStroke")(js.undefined)
        ret
    }
  }
  
}

