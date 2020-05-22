package typingsSlinky.rcMentions.mentionsContextMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.web.SyntheticFocusEvent
import typingsSlinky.rcMentions.optionMod.OptionProps
import typingsSlinky.react.mod.FocusEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MentionsContextProps extends js.Object {
  var activeIndex: Double
  var notFoundContent: TagMod[Any]
  var onBlur: FocusEventHandler[HTMLElement]
  var onFocus: FocusEventHandler[HTMLElement]
  def selectOption(option: OptionProps): Unit
  def setActiveIndex(index: Double): Unit
}

object MentionsContextProps {
  @scala.inline
  def apply(
    activeIndex: Double,
    onBlur: SyntheticFocusEvent[HTMLElement] => Unit,
    onFocus: SyntheticFocusEvent[HTMLElement] => Unit,
    selectOption: OptionProps => Unit,
    setActiveIndex: Double => Unit,
    notFoundContent: TagMod[Any] = null
  ): MentionsContextProps = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onFocus = js.Any.fromFunction1(onFocus), selectOption = js.Any.fromFunction1(selectOption), setActiveIndex = js.Any.fromFunction1(setActiveIndex))
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[MentionsContextProps]
  }
}

