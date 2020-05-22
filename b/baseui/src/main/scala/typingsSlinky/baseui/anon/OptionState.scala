package typingsSlinky.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionState extends js.Object {
  var option: typingsSlinky.baseui.selectMod.Option
  var optionState: IsHighlighted
}

object OptionState {
  @scala.inline
  def apply(option: typingsSlinky.baseui.selectMod.Option, optionState: IsHighlighted): OptionState = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any], optionState = optionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionState]
  }
}

