package typingsSlinky.babylonjs.global

import typingsSlinky.std.DOMPointInit
import typingsSlinky.std.DOMPointReadOnly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Experimental(er) features
@JSGlobal("XRRay")
@js.native
class XRRay protected ()
  extends typingsSlinky.babylonjs.XRRay {
  def this(transformOrOrigin: typingsSlinky.babylonjs.XRRigidTransform) = this()
  def this(transformOrOrigin: DOMPointInit) = this()
  def this(transformOrOrigin: typingsSlinky.babylonjs.XRRigidTransform, direction: DOMPointInit) = this()
  def this(transformOrOrigin: DOMPointInit, direction: DOMPointInit) = this()
  /* CompleteClass */
  override var direction: DOMPointReadOnly = js.native
  /* CompleteClass */
  override var matrix: js.typedarray.Float32Array = js.native
  /* CompleteClass */
  override var origin: DOMPointReadOnly = js.native
}

