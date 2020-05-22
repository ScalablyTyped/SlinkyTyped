package typingsSlinky.baidumapWebSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Overlay extends js.Object {
  var overlay: typingsSlinky.baidumapWebSdk.BMap.Overlay
  var pixel: typingsSlinky.baidumapWebSdk.BMap.Pixel
  var point: typingsSlinky.baidumapWebSdk.BMap.Point
  var target: js.Any
  var `type`: String
}

object Overlay {
  @scala.inline
  def apply(
    overlay: typingsSlinky.baidumapWebSdk.BMap.Overlay,
    pixel: typingsSlinky.baidumapWebSdk.BMap.Pixel,
    point: typingsSlinky.baidumapWebSdk.BMap.Point,
    target: js.Any,
    `type`: String
  ): Overlay = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any], pixel = pixel.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overlay]
  }
}

