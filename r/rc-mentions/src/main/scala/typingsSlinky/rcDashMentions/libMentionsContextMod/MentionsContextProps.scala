package typingsSlinky.rcDashMentions.libMentionsContextMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.web.SyntheticFocusEvent
import typingsSlinky.rcDashMentions.libOptionMod.OptionProps
import typingsSlinky.react.reactMod.FocusEventHandler
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
    notFoundContent: TagMod[Any],
    onBlur: SyntheticFocusEvent[HTMLElement] => Unit,
    onFocus: SyntheticFocusEvent[HTMLElement] => Unit,
    selectOption: OptionProps => Unit,
    setActiveIndex: Double => Unit
  ): MentionsContextProps = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], notFoundContent = notFoundContent.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onFocus = js.Any.fromFunction1(onFocus), selectOption = js.Any.fromFunction1(selectOption), setActiveIndex = js.Any.fromFunction1(setActiveIndex))
  
    __obj.asInstanceOf[MentionsContextProps]
  }
}

