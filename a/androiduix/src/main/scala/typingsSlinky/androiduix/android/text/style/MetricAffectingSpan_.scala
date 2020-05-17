package typingsSlinky.androiduix.android.text.style

import typingsSlinky.androiduix.android.text.TextPaint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricAffectingSpan_
  extends CharacterStyle
     with UpdateAppearance {
  /* InferMemberOverrides */
  override def getUnderlying(): CharacterStyle = js.native
  /* InferMemberOverrides */
  override def updateDrawState(tp: TextPaint): Unit = js.native
  def updateMeasureState(p: TextPaint): Unit = js.native
}

object MetricAffectingSpan_ {
  @scala.inline
  def apply(
    getUnderlying: () => CharacterStyle,
    mType: js.Symbol,
    updateDrawState: TextPaint => Unit,
    updateMeasureState: TextPaint => Unit
  ): MetricAffectingSpan_ = {
    val __obj = js.Dynamic.literal(getUnderlying = js.Any.fromFunction0(getUnderlying), mType = mType.asInstanceOf[js.Any], updateDrawState = js.Any.fromFunction1(updateDrawState), updateMeasureState = js.Any.fromFunction1(updateMeasureState))
    __obj.asInstanceOf[MetricAffectingSpan_]
  }
  @scala.inline
  implicit class MetricAffectingSpan_Ops[Self <: MetricAffectingSpan_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetUnderlying(value: () => CharacterStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUnderlying")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdateDrawState(value: TextPaint => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDrawState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateMeasureState(value: TextPaint => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMeasureState")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

