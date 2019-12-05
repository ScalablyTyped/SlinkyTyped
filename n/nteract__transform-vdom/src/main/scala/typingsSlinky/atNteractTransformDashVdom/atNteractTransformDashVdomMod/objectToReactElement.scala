package typingsSlinky.atNteractTransformDashVdom.atNteractTransformDashVdomMod

import slinky.core.facade.ReactElement
import typingsSlinky.atNteractTransformDashVdom.libEventDashToDashObjectMod.SerializedEvent
import typingsSlinky.atNteractTransformDashVdom.libObjectDashToDashReactMod.VDOMEl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nteract/transform-vdom", "objectToReactElement")
@js.native
object objectToReactElement extends js.Object {
  def apply(
    obj: VDOMEl,
    onVDOMEvent: js.Function2[/* targetName */ String, /* event */ SerializedEvent[_], Unit]
  ): ReactElement = js.native
}

