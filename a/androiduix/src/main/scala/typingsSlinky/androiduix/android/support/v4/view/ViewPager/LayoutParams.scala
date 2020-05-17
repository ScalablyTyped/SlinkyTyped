package typingsSlinky.androiduix.android.support.v4.view.ViewPager

import typingsSlinky.androiduix.android.content.res.TypedArray
import typingsSlinky.androiduix.androidui.attr.AttrBinder
import typingsSlinky.androiduix.androidui.attr.AttrBinder.ClassBinderMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutParams
  extends typingsSlinky.androiduix.android.view.ViewGroup.LayoutParams {
  var childIndex: Double = js.native
  var gravity: Double = js.native
  var isDecor: Boolean = js.native
  var needsMeasure: Boolean = js.native
  var position: Double = js.native
  var widthFactor: Double = js.native
}

object LayoutParams {
  @scala.inline
  def apply(
    _attrBinder: js.Any,
    childIndex: Double,
    createClassAttrBinder: () => ClassBinderMap,
    equals: js.Any => Boolean,
    getAttrBinder: () => AttrBinder,
    gravity: Double,
    hash: js.Any,
    height: Double,
    initBindAttr: () => js.Any,
    isDecor: Boolean,
    needsMeasure: Boolean,
    position: Double,
    setBaseAttributes: (TypedArray, String, String) => Unit,
    width: Double,
    widthFactor: Double
  ): LayoutParams = {
    val __obj = js.Dynamic.literal(_attrBinder = _attrBinder.asInstanceOf[js.Any], childIndex = childIndex.asInstanceOf[js.Any], createClassAttrBinder = js.Any.fromFunction0(createClassAttrBinder), equals = js.Any.fromFunction1(equals), getAttrBinder = js.Any.fromFunction0(getAttrBinder), gravity = gravity.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], initBindAttr = js.Any.fromFunction0(initBindAttr), isDecor = isDecor.asInstanceOf[js.Any], needsMeasure = needsMeasure.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], setBaseAttributes = js.Any.fromFunction3(setBaseAttributes), width = width.asInstanceOf[js.Any], widthFactor = widthFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutParams]
  }
  @scala.inline
  implicit class LayoutParamsOps[Self <: LayoutParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGravity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDecor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDecor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNeedsMeasure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needsMeasure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidthFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthFactor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

