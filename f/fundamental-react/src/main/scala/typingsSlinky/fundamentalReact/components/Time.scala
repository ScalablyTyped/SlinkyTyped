package typingsSlinky.fundamentalReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fundamentalReact.AnonHour
import typingsSlinky.fundamentalReact.AnonMeridiemAM
import typingsSlinky.fundamentalReact.timeMod.TimeProps
import typingsSlinky.fundamentalReact.timeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Time {
  @JSImport("fundamental-react/lib/Time/Time", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def disableStyles(value: Boolean): this.type = set("disableStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def format12Hours(value: Boolean): this.type = set("format12Hours", value.asInstanceOf[js.Any])
    @scala.inline
    def hoursDownButtonProps(value: js.Any): this.type = set("hoursDownButtonProps", value.asInstanceOf[js.Any])
    @scala.inline
    def hoursInputProps(value: js.Any): this.type = set("hoursInputProps", value.asInstanceOf[js.Any])
    @scala.inline
    def hoursUpButtonProps(value: js.Any): this.type = set("hoursUpButtonProps", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def localizedText(value: AnonMeridiemAM): this.type = set("localizedText", value.asInstanceOf[js.Any])
    @scala.inline
    def meridiemDownButtonProps(value: js.Any): this.type = set("meridiemDownButtonProps", value.asInstanceOf[js.Any])
    @scala.inline
    def meridiemInputProps(value: js.Any): this.type = set("meridiemInputProps", value.asInstanceOf[js.Any])
    @scala.inline
    def meridiemUpButtonProps(value: js.Any): this.type = set("meridiemUpButtonProps", value.asInstanceOf[js.Any])
    @scala.inline
    def minutesDownButtonProps(value: js.Any): this.type = set("minutesDownButtonProps", value.asInstanceOf[js.Any])
    @scala.inline
    def minutesInputProps(value: js.Any): this.type = set("minutesInputProps", value.asInstanceOf[js.Any])
    @scala.inline
    def minutesUpButtonProps(value: js.Any): this.type = set("minutesUpButtonProps", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* time */ AnonHour => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def secondsDownButtonProps(value: js.Any): this.type = set("secondsDownButtonProps", value.asInstanceOf[js.Any])
    @scala.inline
    def secondsInputProps(value: js.Any): this.type = set("secondsInputProps", value.asInstanceOf[js.Any])
    @scala.inline
    def secondsUpButtonProps(value: js.Any): this.type = set("secondsUpButtonProps", value.asInstanceOf[js.Any])
    @scala.inline
    def showHour(value: Boolean): this.type = set("showHour", value.asInstanceOf[js.Any])
    @scala.inline
    def showMinute(value: Boolean): this.type = set("showMinute", value.asInstanceOf[js.Any])
    @scala.inline
    def showSecond(value: Boolean): this.type = set("showSecond", value.asInstanceOf[js.Any])
    @scala.inline
    def spinners(value: Boolean): this.type = set("spinners", value.asInstanceOf[js.Any])
    @scala.inline
    def time(value: AnonHour): this.type = set("time", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TimeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Time.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

