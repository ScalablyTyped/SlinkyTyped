package typingsSlinky.figma.mod.global

import typingsSlinky.figma.figmaStrings.BACK
import typingsSlinky.figma.figmaStrings.CLOSE
import typingsSlinky.figma.figmaStrings.NODE
import typingsSlinky.figma.figmaStrings.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.figma.anon.Type
  - typingsSlinky.figma.anon.Url
  - typingsSlinky.figma.anon.DestinationId
*/
trait Action extends js.Object

object Action {
  @scala.inline
  def Type(`type`: BACK | CLOSE): Action = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def Url(`type`: URL, url: String): Action = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def DestinationId(
    navigation: Navigation,
    preserveScrollPosition: Boolean,
    `type`: NODE,
    destinationId: String = null,
    overlayRelativePosition: Vector = null,
    transition: Transition = null
  ): Action = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], preserveScrollPosition = preserveScrollPosition.asInstanceOf[js.Any], destinationId = destinationId.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (overlayRelativePosition != null) __obj.updateDynamic("overlayRelativePosition")(overlayRelativePosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

