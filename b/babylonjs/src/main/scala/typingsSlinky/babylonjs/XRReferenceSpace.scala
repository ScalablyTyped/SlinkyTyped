package typingsSlinky.babylonjs

import typingsSlinky.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRReferenceSpace extends EventTarget {
  
  def getOffsetReferenceSpace(originOffset: XRRigidTransform): XRReferenceSpace = js.native
  
  def onreset(callback: js.Any): Unit = js.native
  @JSName("onreset")
  var onreset_Original: XREventHandler = js.native
}
