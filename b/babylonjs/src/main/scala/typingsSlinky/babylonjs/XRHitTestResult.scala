package typingsSlinky.babylonjs

import org.scalajs.dom.raw.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRHitTestResult extends js.Object {
  
  // When anchor system is enabled
  var createAnchor: js.UndefOr[js.Function1[/* pose */ XRRigidTransform, js.Promise[XRAnchor]]] = js.native
  
  def getPose(baseSpace: EventTarget): js.UndefOr[XRPose] = js.native
}
object XRHitTestResult {
  
  @scala.inline
  def apply(getPose: EventTarget => js.UndefOr[XRPose]): XRHitTestResult = {
    val __obj = js.Dynamic.literal(getPose = js.Any.fromFunction1(getPose))
    __obj.asInstanceOf[XRHitTestResult]
  }
  
  @scala.inline
  implicit class XRHitTestResultOps[Self <: XRHitTestResult] (val x: Self) extends AnyVal {
    
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
    def setGetPose(value: EventTarget => js.UndefOr[XRPose]): Self = this.set("getPose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateAnchor(value: /* pose */ XRRigidTransform => js.Promise[XRAnchor]): Self = this.set("createAnchor", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCreateAnchor: Self = this.set("createAnchor", js.undefined)
  }
}
