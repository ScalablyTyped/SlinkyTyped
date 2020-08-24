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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMHandler(value: Handler): Self = this.set("mHandler", value.asInstanceOf[js.Any])
    @scala.inline
    def setMHasWindowFocus(value: Boolean): Self = this.set("mHasWindowFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def setMInvalidateChildLocationVarargs(value: Double*): Self = this.set("mInvalidateChildLocation", js.Array(value :_*))
    @scala.inline
    def setMInvalidateChildLocation(value: js.Array[Double]): Self = this.set("mInvalidateChildLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setMKeyDispatchState(value: DispatcherState): Self = this.set("mKeyDispatchState", value.asInstanceOf[js.Any])
    @scala.inline
    def setMPoint(value: Point): Self = this.set("mPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setMRootView(value: typingsSlinky.androiduix.android.view.View): Self = this.set("mRootView", value.asInstanceOf[js.Any])
    @scala.inline
    def setMScrollContainers(value: Set[typingsSlinky.androiduix.android.view.View]): Self = this.set("mScrollContainers", value.asInstanceOf[js.Any])
    @scala.inline
    def setMTmpInvalRect(value: Rect): Self = this.set("mTmpInvalRect", value.asInstanceOf[js.Any])
    @scala.inline
    def setMTmpMatrix(value: Matrix): Self = this.set("mTmpMatrix", value.asInstanceOf[js.Any])
    @scala.inline
    def setMTmpTransformLocationVarargs(value: Double*): Self = this.set("mTmpTransformLocation", js.Array(value :_*))
    @scala.inline
    def setMTmpTransformLocation(value: js.Array[Double]): Self = this.set("mTmpTransformLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setMTmpTransformRect(value: Rect): Self = this.set("mTmpTransformRect", value.asInstanceOf[js.Any])
    @scala.inline
    def setMTmpTransformation(value: Transformation): Self = this.set("mTmpTransformation", value.asInstanceOf[js.Any])
    @scala.inline
    def setMViewRequestingLayout(value: typingsSlinky.androiduix.android.view.View): Self = this.set("mViewRequestingLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def setMViewRootImpl(value: ViewRootImpl): Self = this.set("mViewRootImpl", value.asInstanceOf[js.Any])
    @scala.inline
    def setMWindowVisibility(value: Double): Self = this.set("mWindowVisibility", value.asInstanceOf[js.Any])
  }
  
}

