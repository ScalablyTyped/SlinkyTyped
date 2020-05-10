package typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawQualitativeRangesEventArgs extends js.Object {
  /** returns the object of the bullet graph.
    */
  var Object: js.UndefOr[js.Any] = js.native
  /** returns the end value of current range.
    */
  var rangeEndValue: js.UndefOr[Double] = js.native
  /** returns the index of current range.
    */
  var rangeIndex: js.UndefOr[Double] = js.native
  /** returns the settings for current range.
    */
  var rangeOptions: js.UndefOr[js.Any] = js.native
}

object DrawQualitativeRangesEventArgs {
  @scala.inline
  def apply(): DrawQualitativeRangesEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawQualitativeRangesEventArgs]
  }
  @scala.inline
  implicit class DrawQualitativeRangesEventArgsOps[Self <: DrawQualitativeRangesEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObject(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Object")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeEndValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeEndValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeEndValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeEndValue")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeOptions")(js.undefined)
        ret
    }
  }
  
}

