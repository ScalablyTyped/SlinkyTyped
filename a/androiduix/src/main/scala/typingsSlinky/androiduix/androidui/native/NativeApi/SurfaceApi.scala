package typingsSlinky.androiduix.androidui.native.NativeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SurfaceApi extends js.Object {
  def createSurface(surfaceId: Double, left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
  def lockCanvas(surfaceId: Double, canvasId: Double, left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
  def onSurfaceBoundChange(surfaceId: Double, left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
  def showFps(fps: Double): Unit = js.native
  def unlockCanvasAndPost(surfaceId: Double, canvasId: Double): Unit = js.native
}

object SurfaceApi {
  @scala.inline
  def apply(
    createSurface: (Double, Double, Double, Double, Double) => Unit,
    lockCanvas: (Double, Double, Double, Double, Double, Double) => Unit,
    onSurfaceBoundChange: (Double, Double, Double, Double, Double) => Unit,
    showFps: Double => Unit,
    unlockCanvasAndPost: (Double, Double) => Unit
  ): SurfaceApi = {
    val __obj = js.Dynamic.literal(createSurface = js.Any.fromFunction5(createSurface), lockCanvas = js.Any.fromFunction6(lockCanvas), onSurfaceBoundChange = js.Any.fromFunction5(onSurfaceBoundChange), showFps = js.Any.fromFunction1(showFps), unlockCanvasAndPost = js.Any.fromFunction2(unlockCanvasAndPost))
    __obj.asInstanceOf[SurfaceApi]
  }
  @scala.inline
  implicit class SurfaceApiOps[Self <: SurfaceApi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateSurface(value: (Double, Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSurface")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withLockCanvas(value: (Double, Double, Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockCanvas")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withOnSurfaceBoundChange(value: (Double, Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSurfaceBoundChange")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withShowFps(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFps")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnlockCanvasAndPost(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlockCanvasAndPost")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

