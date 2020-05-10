package typingsSlinky.figma.mod._Global_

import typingsSlinky.figma.figmaStrings.BACK
import typingsSlinky.figma.figmaStrings.CLOSE
import typingsSlinky.figma.figmaStrings.NODE
import typingsSlinky.figma.figmaStrings.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.figma.AnonType
  - typingsSlinky.figma.AnonUrl
  - typingsSlinky.figma.AnonDestinationId
*/
trait Action extends js.Object

object Action {
  @scala.inline
  def AnonType(`type`: BACK | CLOSE): Action = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def AnonUrl(`type`: URL, url: String): Action = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def AnonDestinationId(navigation: Navigation, preserveScrollPosition: Boolean, `type`: NODE): Action = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], preserveScrollPosition = preserveScrollPosition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

