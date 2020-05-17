package typingsSlinky.androiduix.android.view.ViewGroup

import typingsSlinky.androiduix.android.content.res.TypedArray
import typingsSlinky.androiduix.androidui.attr.AttrBinder
import typingsSlinky.androiduix.androidui.attr.AttrBinder.ClassBinderMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarginLayoutParams extends LayoutParams {
  var bottomMargin: Double = js.native
  var leftMargin: Double = js.native
  var rightMargin: Double = js.native
  var topMargin: Double = js.native
  def getLayoutDirection(): Double = js.native
  def isLayoutRtl(): Boolean = js.native
  def resolveLayoutDirection(layoutDirection: Double): Unit = js.native
  def setLayoutDirection(layoutDirection: Double): Unit = js.native
  def setMargins(left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
}

object MarginLayoutParams {
  @scala.inline
  def apply(
    _attrBinder: js.Any,
    bottomMargin: Double,
    createClassAttrBinder: () => ClassBinderMap,
    equals: js.Any => Boolean,
    getAttrBinder: () => AttrBinder,
    getLayoutDirection: () => Double,
    hash: js.Any,
    height: Double,
    initBindAttr: () => js.Any,
    isLayoutRtl: () => Boolean,
    leftMargin: Double,
    resolveLayoutDirection: Double => Unit,
    rightMargin: Double,
    setBaseAttributes: (TypedArray, String, String) => Unit,
    setLayoutDirection: Double => Unit,
    setMargins: (Double, Double, Double, Double) => Unit,
    topMargin: Double,
    width: Double
  ): MarginLayoutParams = {
    val __obj = js.Dynamic.literal(_attrBinder = _attrBinder.asInstanceOf[js.Any], bottomMargin = bottomMargin.asInstanceOf[js.Any], createClassAttrBinder = js.Any.fromFunction0(createClassAttrBinder), equals = js.Any.fromFunction1(equals), getAttrBinder = js.Any.fromFunction0(getAttrBinder), getLayoutDirection = js.Any.fromFunction0(getLayoutDirection), hash = hash.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], initBindAttr = js.Any.fromFunction0(initBindAttr), isLayoutRtl = js.Any.fromFunction0(isLayoutRtl), leftMargin = leftMargin.asInstanceOf[js.Any], resolveLayoutDirection = js.Any.fromFunction1(resolveLayoutDirection), rightMargin = rightMargin.asInstanceOf[js.Any], setBaseAttributes = js.Any.fromFunction3(setBaseAttributes), setLayoutDirection = js.Any.fromFunction1(setLayoutDirection), setMargins = js.Any.fromFunction4(setMargins), topMargin = topMargin.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginLayoutParams]
  }
  @scala.inline
  implicit class MarginLayoutParamsOps[Self <: MarginLayoutParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottomMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetLayoutDirection(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLayoutDirection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsLayoutRtl(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLayoutRtl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLeftMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolveLayoutDirection(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveLayoutDirection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRightMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetLayoutDirection(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLayoutDirection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMargins(value: (Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMargins")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withTopMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topMargin")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

