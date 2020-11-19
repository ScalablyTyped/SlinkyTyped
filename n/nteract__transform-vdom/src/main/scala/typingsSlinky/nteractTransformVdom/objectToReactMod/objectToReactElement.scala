package typingsSlinky.nteractTransformVdom.objectToReactMod

import slinky.core.facade.ReactElement
import typingsSlinky.nteractTransformVdom.eventToObjectMod.SerializedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@nteract/transform-vdom/lib/object-to-react", "objectToReactElement")
@js.native
object objectToReactElement extends js.Object {
  
  def apply(
    obj: VDOMEl,
    onVDOMEvent: js.Function2[/* targetName */ String, /* event */ SerializedEvent[_], Unit]
  ): ReactElement = js.native
}
