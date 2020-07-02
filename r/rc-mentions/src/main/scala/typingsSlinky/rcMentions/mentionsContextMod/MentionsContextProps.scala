package typingsSlinky.rcMentions.mentionsContextMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import typingsSlinky.rcMentions.optionMod.OptionProps
import typingsSlinky.react.mod.FocusEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MentionsContextProps extends js.Object {
  var activeIndex: Double
  var notFoundContent: ReactElement
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActiveIndex(value: Double): Self = this.set("activeIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnBlur(value: SyntheticFocusEvent[HTMLElement] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def setOnFocus(value: SyntheticFocusEvent[HTMLElement] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def setSelectOption(value: OptionProps => Unit): Self = this.set("selectOption", js.Any.fromFunction1(value))
    @scala.inline
    def setSetActiveIndex(value: Double => Unit): Self = this.set("setActiveIndex", js.Any.fromFunction1(value))
    @scala.inline
    def setNotFoundContent(value: ReactElement): Self = this.set("notFoundContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotFoundContent: Self = this.set("notFoundContent", js.undefined)
  }
  
}

