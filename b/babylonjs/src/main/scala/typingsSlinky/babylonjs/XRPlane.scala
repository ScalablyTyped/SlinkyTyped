package typingsSlinky.babylonjs

import org.scalajs.dom.raw.EventTarget
import typingsSlinky.babylonjs.babylonjsStrings.Horizontal
import typingsSlinky.babylonjs.babylonjsStrings.Vertical
import typingsSlinky.std.DOMPointReadOnly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XRPlane extends XRAnchorCreator {
  var lastChangedTime: Double = js.native
  var orientation: Horizontal | Vertical = js.native
  var planeSpace: EventTarget = js.native
  var polygon: js.Array[DOMPointReadOnly] = js.native
}

