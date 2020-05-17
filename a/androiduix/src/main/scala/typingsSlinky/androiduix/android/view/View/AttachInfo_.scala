package typingsSlinky.androiduix.android.view.View

import typingsSlinky.androiduix.android.graphics.Matrix
import typingsSlinky.androiduix.android.graphics.Point
import typingsSlinky.androiduix.android.graphics.Rect
import typingsSlinky.androiduix.android.os.Handler
import typingsSlinky.androiduix.android.view.KeyEvent.DispatcherState
import typingsSlinky.androiduix.android.view.ViewRootImpl
import typingsSlinky.androiduix.android.view.animation.Transformation
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachInfo_ extends js.Object {
  var mHandler: Handler = js.native
  var mHasWindowFocus: Boolean = js.native
  var mInvalidateChildLocation: js.Array[Double] = js.native
  var mKeyDispatchState: DispatcherState = js.native
  var mPoint: Point = js.native
  var mRootView: typingsSlinky.androiduix.android.view.View = js.native
  var mScrollContainers: Set[typingsSlinky.androiduix.android.view.View] = js.native
  var mTmpInvalRect: Rect = js.native
  var mTmpMatrix: Matrix = js.native
  var mTmpTransformLocation: js.Array[Double] = js.native
  var mTmpTransformRect: Rect = js.native
  var mTmpTransformation: Transformation = js.native
  var mViewRequestingLayout: typingsSlinky.androiduix.android.view.View = js.native
  var mViewRootImpl: ViewRootImpl = js.native
  var mWindowVisibility: Double = js.native
}

object AttachInfo_ {
  @scala.inline
  def apply(
    mHandler: Handler,
    mHasWindowFocus: Boolean,
    mInvalidateChildLocation: js.Array[Double],
    mKeyDispatchState: DispatcherState,
    mPoint: Point,
    mRootView: typingsSlinky.androiduix.android.view.View,
    mScrollContainers: Set[typingsSlinky.androiduix.android.view.View],
    mTmpInvalRect: Rect,
    mTmpMatrix: Matrix,
    mTmpTransformLocation: js.Array[Double],
    mTmpTransformRect: Rect,
    mTmpTransformation: Transformation,
    mViewRequestingLayout: typingsSlinky.androiduix.android.view.View,
    mViewRootImpl: ViewRootImpl,
    mWindowVisibility: Double
  ): AttachInfo_ = {
    val __obj = js.Dynamic.literal(mHandler = mHandler.asInstanceOf[js.Any], mHasWindowFocus = mHasWindowFocus.asInstanceOf[js.Any], mInvalidateChildLocation = mInvalidateChildLocation.asInstanceOf[js.Any], mKeyDispatchState = mKeyDispatchState.asInstanceOf[js.Any], mPoint = mPoint.asInstanceOf[js.Any], mRootView = mRootView.asInstanceOf[js.Any], mScrollContainers = mScrollContainers.asInstanceOf[js.Any], mTmpInvalRect = mTmpInvalRect.asInstanceOf[js.Any], mTmpMatrix = mTmpMatrix.asInstanceOf[js.Any], mTmpTransformLocation = mTmpTransformLocation.asInstanceOf[js.Any], mTmpTransformRect = mTmpTransformRect.asInstanceOf[js.Any], mTmpTransformation = mTmpTransformation.asInstanceOf[js.Any], mViewRequestingLayout = mViewRequestingLayout.asInstanceOf[js.Any], mViewRootImpl = mViewRootImpl.asInstanceOf[js.Any], mWindowVisibility = mWindowVisibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachInfo_]
  }
  @scala.inline
  implicit class AttachInfo_Ops[Self <: AttachInfo_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMHandler(value: Handler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMHasWindowFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mHasWindowFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMInvalidateChildLocation(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mInvalidateChildLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMKeyDispatchState(value: DispatcherState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mKeyDispatchState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMPoint(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMRootView(value: typingsSlinky.androiduix.android.view.View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mRootView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMScrollContainers(value: Set[typingsSlinky.androiduix.android.view.View]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mScrollContainers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMTmpInvalRect(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mTmpInvalRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMTmpMatrix(value: Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mTmpMatrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMTmpTransformLocation(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mTmpTransformLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMTmpTransformRect(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mTmpTransformRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMTmpTransformation(value: Transformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mTmpTransformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMViewRequestingLayout(value: typingsSlinky.androiduix.android.view.View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mViewRequestingLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMViewRootImpl(value: ViewRootImpl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mViewRootImpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMWindowVisibility(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mWindowVisibility")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

