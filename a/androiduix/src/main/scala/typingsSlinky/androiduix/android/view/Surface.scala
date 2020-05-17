package typingsSlinky.androiduix.android.view

import typingsSlinky.androiduix.android.graphics.Canvas
import typingsSlinky.androiduix.android.graphics.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Surface extends js.Object {
  var _showFPSNode: js.Any = js.native
  var mCanvasBound: Rect = js.native
  var mCanvasElement: js.Any = js.native
  var mLockSaveCount: js.Any = js.native
  var mLockedRect: js.Any = js.native
  var mSupportDirtyDraw: Boolean = js.native
  var viewRoot: js.Any = js.native
  /* protected */ def initCanvasBound(): Unit = js.native
  /* protected */ def initImpl(): Unit = js.native
  def isValid(): Boolean = js.native
  def lockCanvas(dirty: Rect): Canvas = js.native
  /* protected */ def lockCanvasImpl(left: Double, top: Double, width: Double, height: Double): Canvas = js.native
  def notifyBoundChange(): Unit = js.native
  def showFps(fps: Double): Unit = js.native
  def unlockCanvasAndPost(canvas: Canvas): Unit = js.native
}

object Surface {
  @scala.inline
  def apply(
    _showFPSNode: js.Any,
    initCanvasBound: () => Unit,
    initImpl: () => Unit,
    isValid: () => Boolean,
    lockCanvas: Rect => Canvas,
    lockCanvasImpl: (Double, Double, Double, Double) => Canvas,
    mCanvasBound: Rect,
    mCanvasElement: js.Any,
    mLockSaveCount: js.Any,
    mLockedRect: js.Any,
    mSupportDirtyDraw: Boolean,
    notifyBoundChange: () => Unit,
    showFps: Double => Unit,
    unlockCanvasAndPost: Canvas => Unit,
    viewRoot: js.Any
  ): Surface = {
    val __obj = js.Dynamic.literal(_showFPSNode = _showFPSNode.asInstanceOf[js.Any], initCanvasBound = js.Any.fromFunction0(initCanvasBound), initImpl = js.Any.fromFunction0(initImpl), isValid = js.Any.fromFunction0(isValid), lockCanvas = js.Any.fromFunction1(lockCanvas), lockCanvasImpl = js.Any.fromFunction4(lockCanvasImpl), mCanvasBound = mCanvasBound.asInstanceOf[js.Any], mCanvasElement = mCanvasElement.asInstanceOf[js.Any], mLockSaveCount = mLockSaveCount.asInstanceOf[js.Any], mLockedRect = mLockedRect.asInstanceOf[js.Any], mSupportDirtyDraw = mSupportDirtyDraw.asInstanceOf[js.Any], notifyBoundChange = js.Any.fromFunction0(notifyBoundChange), showFps = js.Any.fromFunction1(showFps), unlockCanvasAndPost = js.Any.fromFunction1(unlockCanvasAndPost), viewRoot = viewRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[Surface]
  }
  @scala.inline
  implicit class SurfaceOps[Self <: Surface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_showFPSNode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_showFPSNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitCanvasBound(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initCanvasBound")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInitImpl(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initImpl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsValid(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLockCanvas(value: Rect => Canvas): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockCanvas")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLockCanvasImpl(value: (Double, Double, Double, Double) => Canvas): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockCanvasImpl")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withMCanvasBound(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mCanvasBound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMCanvasElement(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mCanvasElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMLockSaveCount(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mLockSaveCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMLockedRect(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mLockedRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMSupportDirtyDraw(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mSupportDirtyDraw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotifyBoundChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyBoundChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShowFps(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFps")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnlockCanvasAndPost(value: Canvas => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlockCanvasAndPost")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withViewRoot(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewRoot")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

