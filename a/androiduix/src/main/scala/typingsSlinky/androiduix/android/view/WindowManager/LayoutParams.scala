package typingsSlinky.androiduix.android.view.WindowManager

import typingsSlinky.androiduix.android.content.res.TypedArray
import typingsSlinky.androiduix.android.view.animation.Animation
import typingsSlinky.androiduix.androidui.attr.AttrBinder
import typingsSlinky.androiduix.androidui.attr.AttrBinder.ClassBinderMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutParams
  extends typingsSlinky.androiduix.android.widget.FrameLayout.LayoutParams {
  var dimAmount: Double = js.native
  var enterAnimation: Animation = js.native
  var exitAnimation: Animation = js.native
  var flags: Double = js.native
  var hideAnimation: Animation = js.native
  var mTitle: js.Any = js.native
  var resumeAnimation: Animation = js.native
  var `type`: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def copyFrom(o: LayoutParams): Double = js.native
  def getTitle(): String = js.native
  /* private */ def isFloating(): js.Any = js.native
  /* private */ def isFocusable(): js.Any = js.native
  /* private */ def isSplitTouch(): js.Any = js.native
  /* private */ def isTouchModal(): js.Any = js.native
  /* private */ def isTouchable(): js.Any = js.native
  /* private */ def isWatchTouchOutside(): js.Any = js.native
  def setTitle(title: String): Unit = js.native
}

object LayoutParams {
  @scala.inline
  def apply(
    _attrBinder: js.Any,
    bottomMargin: Double,
    copyFrom: LayoutParams => Double,
    createClassAttrBinder: () => ClassBinderMap,
    dimAmount: Double,
    enterAnimation: Animation,
    equals: js.Any => Boolean,
    exitAnimation: Animation,
    flags: Double,
    getAttrBinder: () => AttrBinder,
    getLayoutDirection: () => Double,
    getTitle: () => String,
    gravity: Double,
    hash: js.Any,
    height: Double,
    hideAnimation: Animation,
    initBindAttr: () => js.Any,
    isFloating: () => js.Any,
    isFocusable: () => js.Any,
    isLayoutRtl: () => Boolean,
    isSplitTouch: () => js.Any,
    isTouchModal: () => js.Any,
    isTouchable: () => js.Any,
    isWatchTouchOutside: () => js.Any,
    leftMargin: Double,
    mTitle: js.Any,
    resolveLayoutDirection: Double => Unit,
    resumeAnimation: Animation,
    rightMargin: Double,
    setBaseAttributes: (TypedArray, String, String) => Unit,
    setLayoutDirection: Double => Unit,
    setMargins: (Double, Double, Double, Double) => Unit,
    setTitle: String => Unit,
    topMargin: Double,
    `type`: Double,
    width: Double,
    x: Double,
    y: Double
  ): LayoutParams = {
    val __obj = js.Dynamic.literal(_attrBinder = _attrBinder.asInstanceOf[js.Any], bottomMargin = bottomMargin.asInstanceOf[js.Any], copyFrom = js.Any.fromFunction1(copyFrom), createClassAttrBinder = js.Any.fromFunction0(createClassAttrBinder), dimAmount = dimAmount.asInstanceOf[js.Any], enterAnimation = enterAnimation.asInstanceOf[js.Any], equals = js.Any.fromFunction1(equals), exitAnimation = exitAnimation.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], getAttrBinder = js.Any.fromFunction0(getAttrBinder), getLayoutDirection = js.Any.fromFunction0(getLayoutDirection), getTitle = js.Any.fromFunction0(getTitle), gravity = gravity.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], hideAnimation = hideAnimation.asInstanceOf[js.Any], initBindAttr = js.Any.fromFunction0(initBindAttr), isFloating = js.Any.fromFunction0(isFloating), isFocusable = js.Any.fromFunction0(isFocusable), isLayoutRtl = js.Any.fromFunction0(isLayoutRtl), isSplitTouch = js.Any.fromFunction0(isSplitTouch), isTouchModal = js.Any.fromFunction0(isTouchModal), isTouchable = js.Any.fromFunction0(isTouchable), isWatchTouchOutside = js.Any.fromFunction0(isWatchTouchOutside), leftMargin = leftMargin.asInstanceOf[js.Any], mTitle = mTitle.asInstanceOf[js.Any], resolveLayoutDirection = js.Any.fromFunction1(resolveLayoutDirection), resumeAnimation = resumeAnimation.asInstanceOf[js.Any], rightMargin = rightMargin.asInstanceOf[js.Any], setBaseAttributes = js.Any.fromFunction3(setBaseAttributes), setLayoutDirection = js.Any.fromFunction1(setLayoutDirection), setMargins = js.Any.fromFunction4(setMargins), setTitle = js.Any.fromFunction1(setTitle), topMargin = topMargin.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutParams]
  }
  @scala.inline
  implicit class LayoutParamsOps[Self <: LayoutParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopyFrom(value: LayoutParams => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyFrom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDimAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnterAnimation(value: Animation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExitAnimation(value: Animation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlags(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetTitle(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTitle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHideAnimation(value: Animation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFloating(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFloating")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsFocusable(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFocusable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsSplitTouch(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSplitTouch")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsTouchModal(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTouchModal")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsTouchable(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTouchable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsWatchTouchOutside(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWatchTouchOutside")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMTitle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResumeAnimation(value: Animation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetTitle(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

