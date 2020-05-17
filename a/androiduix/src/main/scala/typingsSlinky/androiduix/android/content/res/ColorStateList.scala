package typingsSlinky.androiduix.android.content.res

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorStateList extends js.Object {
  var mColors: js.Array[Double] = js.native
  var mDefaultColor: Double = js.native
  var mStateSpecs: js.Array[js.Array[Double]] = js.native
  def getColorForState(stateSet: js.Array[Double], defaultColor: Double): Double = js.native
  def getDefaultColor(): Double = js.native
  def isStateful(): Boolean = js.native
  def withAlpha(alpha: Double): ColorStateList = js.native
}

object ColorStateList {
  @scala.inline
  def apply(
    getColorForState: (js.Array[Double], Double) => Double,
    getDefaultColor: () => Double,
    isStateful: () => Boolean,
    mColors: js.Array[Double],
    mDefaultColor: Double,
    mStateSpecs: js.Array[js.Array[Double]],
    withAlpha: Double => ColorStateList
  ): ColorStateList = {
    val __obj = js.Dynamic.literal(getColorForState = js.Any.fromFunction2(getColorForState), getDefaultColor = js.Any.fromFunction0(getDefaultColor), isStateful = js.Any.fromFunction0(isStateful), mColors = mColors.asInstanceOf[js.Any], mDefaultColor = mDefaultColor.asInstanceOf[js.Any], mStateSpecs = mStateSpecs.asInstanceOf[js.Any], withAlpha = js.Any.fromFunction1(withAlpha))
    __obj.asInstanceOf[ColorStateList]
  }
  @scala.inline
  implicit class ColorStateListOps[Self <: ColorStateList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetColorForState(value: (js.Array[Double], Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColorForState")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetDefaultColor(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultColor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsStateful(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStateful")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMColors(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDefaultColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDefaultColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMStateSpecs(value: js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mStateSpecs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWithAlpha(value: Double => ColorStateList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withAlpha")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

