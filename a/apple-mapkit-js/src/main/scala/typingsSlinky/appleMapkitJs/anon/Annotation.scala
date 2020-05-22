package typingsSlinky.appleMapkitJs.anon

import typingsSlinky.appleMapkitJs.mapkit.Overlay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Annotation extends js.Object {
  var annotation: js.UndefOr[typingsSlinky.appleMapkitJs.mapkit.Annotation] = js.undefined
  var overlay: js.UndefOr[Overlay] = js.undefined
}

object Annotation {
  @scala.inline
  def apply(annotation: typingsSlinky.appleMapkitJs.mapkit.Annotation = null, overlay: Overlay = null): Annotation = {
    val __obj = js.Dynamic.literal()
    if (annotation != null) __obj.updateDynamic("annotation")(annotation.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annotation]
  }
}

