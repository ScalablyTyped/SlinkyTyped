package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRAnchorCreator extends js.Object {
  
  // AR Anchors
  def createAnchor(pose: XRPose, referenceSpace: XRReferenceSpace): js.Promise[XRAnchor] = js.native
  def createAnchor(pose: XRRigidTransform, referenceSpace: XRReferenceSpace): js.Promise[XRAnchor] = js.native
}
