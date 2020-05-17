package typingsSlinky.androiduix.android.text.style.LeadingMarginSpan

import typingsSlinky.androiduix.android.graphics.Canvas
import typingsSlinky.androiduix.android.graphics.Paint
import typingsSlinky.androiduix.android.text.Layout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Standard
  extends typingsSlinky.androiduix.android.text.style.LeadingMarginSpan {
  var mFirst: js.Any = js.native
  var mRest: js.Any = js.native
  def describeContents(): Double = js.native
  def getSpanTypeId(): Double = js.native
}

object Standard {
  @scala.inline
  def apply(
    describeContents: () => Double,
    drawLeadingMargin: (Canvas, Paint, Double, Double, Double, Double, Double, String, Double, Double, Boolean, Layout) => Unit,
    getLeadingMargin: Boolean => Double,
    getSpanTypeId: () => Double,
    mFirst: js.Any,
    mRest: js.Any
  ): Standard = {
    val __obj = js.Dynamic.literal(describeContents = js.Any.fromFunction0(describeContents), drawLeadingMargin = js.Any.fromFunction12(drawLeadingMargin), getLeadingMargin = js.Any.fromFunction1(getLeadingMargin), getSpanTypeId = js.Any.fromFunction0(getSpanTypeId), mFirst = mFirst.asInstanceOf[js.Any], mRest = mRest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Standard]
  }
  @scala.inline
  implicit class StandardOps[Self <: Standard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescribeContents(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("describeContents")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSpanTypeId(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSpanTypeId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMFirst(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMRest(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mRest")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

