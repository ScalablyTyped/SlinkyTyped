package typingsSlinky.babylonjs.global

import typingsSlinky.std.DOMPointInit
import typingsSlinky.std.DOMPointReadOnly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("XRRigidTransform")
@js.native
class XRRigidTransform protected ()
  extends typingsSlinky.babylonjs.XRRigidTransform {
  def this(matrix: DOMPointInit) = this()
  def this(matrix: js.typedarray.Float32Array) = this()
  def this(matrix: DOMPointInit, direction: DOMPointInit) = this()
  def this(matrix: js.typedarray.Float32Array, direction: DOMPointInit) = this()
  /* CompleteClass */
  override var inverse: typingsSlinky.babylonjs.XRRigidTransform = js.native
  /* CompleteClass */
  override var matrix: js.typedarray.Float32Array = js.native
  /* CompleteClass */
  override var orientation: DOMPointReadOnly = js.native
  /* CompleteClass */
  override var position: DOMPointReadOnly = js.native
}

