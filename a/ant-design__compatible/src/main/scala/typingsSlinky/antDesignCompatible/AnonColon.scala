package typingsSlinky.antDesignCompatible

import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLFormElement
import slinky.core.SyntheticEvent
import typingsSlinky.antDesignCompatible.antDesignCompatibleStrings.`inline`
import typingsSlinky.antDesignCompatible.antDesignCompatibleStrings.horizontal
import typingsSlinky.antDesignCompatible.antDesignCompatibleStrings.vertical
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonColon extends js.Object {
  var colon: Boolean = js.native
  var hideRequiredMark: Boolean = js.native
  var layout: `inline` | horizontal | vertical = js.native
  def onSubmit(e: SyntheticEvent[EventTarget with HTMLFormElement, Event_]): Unit = js.native
}

object AnonColon {
  @scala.inline
  def apply(
    colon: Boolean,
    hideRequiredMark: Boolean,
    layout: `inline` | horizontal | vertical,
    onSubmit: SyntheticEvent[EventTarget with HTMLFormElement, Event_] => Unit
  ): AnonColon = {
    val __obj = js.Dynamic.literal(colon = colon.asInstanceOf[js.Any], hideRequiredMark = hideRequiredMark.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], onSubmit = js.Any.fromFunction1(onSubmit))
    __obj.asInstanceOf[AnonColon]
  }
  @scala.inline
  implicit class AnonColonOps[Self <: AnonColon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideRequiredMark(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideRequiredMark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayout(value: `inline` | horizontal | vertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnSubmit(value: SyntheticEvent[EventTarget with HTMLFormElement, Event_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

