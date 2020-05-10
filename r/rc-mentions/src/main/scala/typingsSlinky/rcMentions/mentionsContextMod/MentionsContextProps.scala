package typingsSlinky.rcMentions.mentionsContextMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.web.SyntheticFocusEvent
import typingsSlinky.rcMentions.optionMod.OptionProps
import typingsSlinky.react.mod.FocusEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MentionsContextProps extends js.Object {
  var activeIndex: Double = js.native
  var notFoundContent: TagMod[Any] = js.native
  var onBlur: FocusEventHandler[HTMLElement] = js.native
  var onFocus: FocusEventHandler[HTMLElement] = js.native
  def selectOption(option: OptionProps): Unit = js.native
  def setActiveIndex(index: Double): Unit = js.native
}

object MentionsContextProps {
  @scala.inline
  def apply(
    activeIndex: Double,
    onBlur: SyntheticFocusEvent[HTMLElement] => Unit,
    onFocus: SyntheticFocusEvent[HTMLElement] => Unit,
    selectOption: OptionProps => Unit,
    setActiveIndex: Double => Unit
  ): MentionsContextProps = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onFocus = js.Any.fromFunction1(onFocus), selectOption = js.Any.fromFunction1(selectOption), setActiveIndex = js.Any.fromFunction1(setActiveIndex))
    __obj.asInstanceOf[MentionsContextProps]
  }
  @scala.inline
  implicit class MentionsContextPropsOps[Self <: MentionsContextProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnBlur(value: SyntheticFocusEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnFocus(value: SyntheticFocusEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelectOption(value: OptionProps => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOption")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetActiveIndex(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActiveIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNotFoundContent(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFoundContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotFoundContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFoundContent")(js.undefined)
        ret
    }
  }
  
}

