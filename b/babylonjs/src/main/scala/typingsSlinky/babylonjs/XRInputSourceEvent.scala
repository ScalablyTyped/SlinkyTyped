package typingsSlinky.babylonjs

import typingsSlinky.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XRInputSourceEvent extends Event {
  val frame: XRFrame = js.native
  val inputSource: XRInputSource = js.native
}

