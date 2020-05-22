package typingsSlinky.babylonjs

import typingsSlinky.std.DOMPointReadOnly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Experimental(er) features
trait XRRay extends js.Object {
  var direction: DOMPointReadOnly
  var matrix: js.typedarray.Float32Array
  var origin: DOMPointReadOnly
}

object XRRay {
  @scala.inline
  def apply(direction: DOMPointReadOnly, matrix: js.typedarray.Float32Array, origin: DOMPointReadOnly): XRRay = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRRay]
  }
}

