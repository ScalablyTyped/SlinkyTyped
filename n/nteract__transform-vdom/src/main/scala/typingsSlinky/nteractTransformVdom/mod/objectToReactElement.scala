package typingsSlinky.nteractTransformVdom.mod

import slinky.core.facade.ReactElement
import typingsSlinky.nteractTransformVdom.eventToObjectMod.SerializedEvent
import typingsSlinky.nteractTransformVdom.objectToReactMod.VDOMEl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@nteract/transform-vdom", "objectToReactElement")
@js.native
object objectToReactElement extends js.Object {
  
  def apply(
    obj: VDOMEl,
    onVDOMEvent: js.Function2[/* targetName */ String, /* event */ SerializedEvent[_], Unit]
  ): ReactElement = js.native
}
