package typingsSlinky.babylonjs

import org.scalajs.dom.raw.EventTarget
import typingsSlinky.babylonjs.anon.DetectedPlanes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRFrame extends js.Object {
  
  def getPose(space: EventTarget, baseSpace: EventTarget): js.UndefOr[XRPose] = js.native
  
  def getViewerPose(referenceSpace: XRReferenceSpace): js.UndefOr[XRViewerPose] = js.native
  
  var session: XRSession = js.native
  
  // Anchors
  var trackedAnchors: js.UndefOr[XRAnchorSet] = js.native
  
  // Planes
  var worldInformation: DetectedPlanes = js.native
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetPose(value: (EventTarget, EventTarget) => js.UndefOr[XRPose]): Self = this.set("getPose", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetViewerPose(value: XRReferenceSpace => js.UndefOr[XRViewerPose]): Self = this.set("getViewerPose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSession(value: XRSession): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldInformation(value: DetectedPlanes): Self = this.set("worldInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackedAnchors(value: XRAnchorSet): Self = this.set("trackedAnchors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackedAnchors: Self = this.set("trackedAnchors", js.undefined)
  }
}
