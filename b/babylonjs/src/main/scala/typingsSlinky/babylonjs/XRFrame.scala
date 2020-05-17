package typingsSlinky.babylonjs

import org.scalajs.dom.raw.EventTarget
import typingsSlinky.babylonjs.anon.DetectedPlanes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XRFrame extends js.Object {
  var session: XRSession = js.native
  // Anchors
  var trackedAnchors: js.UndefOr[XRAnchorSet] = js.native
  // Planes
  var worldInformation: DetectedPlanes = js.native
  def getPose(space: EventTarget, baseSpace: EventTarget): js.UndefOr[XRPose] = js.native
  def getViewerPose(referenceSpace: XRReferenceSpace): js.UndefOr[XRViewerPose] = js.native
}

object XRFrame {
  @scala.inline
  def apply(
    getPose: (EventTarget, EventTarget) => js.UndefOr[XRPose],
    getViewerPose: XRReferenceSpace => js.UndefOr[XRViewerPose],
    session: XRSession,
    worldInformation: DetectedPlanes
  ): XRFrame = {
    val __obj = js.Dynamic.literal(getPose = js.Any.fromFunction2(getPose), getViewerPose = js.Any.fromFunction1(getViewerPose), session = session.asInstanceOf[js.Any], worldInformation = worldInformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRFrame]
  }
  @scala.inline
  implicit class XRFrameOps[Self <: XRFrame] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetPose(value: (EventTarget, EventTarget) => js.UndefOr[XRPose]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPose")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetViewerPose(value: XRReferenceSpace => js.UndefOr[XRViewerPose]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getViewerPose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSession(value: XRSession): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorldInformation(value: DetectedPlanes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worldInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackedAnchors(value: XRAnchorSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackedAnchors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackedAnchors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackedAnchors")(js.undefined)
        ret
    }
  }
  
}

