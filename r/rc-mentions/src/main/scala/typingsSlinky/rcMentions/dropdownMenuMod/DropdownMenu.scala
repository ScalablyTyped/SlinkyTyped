package typingsSlinky.rcMentions.dropdownMenuMod

import slinky.core.facade.ReactElement
import typingsSlinky.rcMentions.mentionsContextMod.MentionsContextProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * We only use Menu to display the candidate.
  * The focus is controlled by textarea to make accessibility easy.
  */
@js.native
trait DropdownMenu
  extends Component[DropdownMenuProps, js.Object, js.Any] {
  def renderDropdown(hasNotFoundContentActiveIndexSetActiveIndexSelectOptionOnFocusOnBlur: MentionsContextProps): ReactElement = js.native
}

