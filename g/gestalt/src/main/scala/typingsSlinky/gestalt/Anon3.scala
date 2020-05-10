package typingsSlinky.gestalt

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.SyntheticEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon3 extends js.Object {
  var event: SyntheticEvent[
    Event_, 
    SyntheticKeyboardEvent[HTMLDivElement] | SyntheticMouseEvent[HTMLDivElement]
  ] = js.native
}

object Anon3 {
  @scala.inline
  def apply(
    event: SyntheticEvent[
      Event_, 
      SyntheticKeyboardEvent[HTMLDivElement] | SyntheticMouseEvent[HTMLDivElement]
    ]
  ): Anon3 = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon3]
  }
  @scala.inline
  implicit class Anon3Ops[Self <: Anon3] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent(
      value: SyntheticEvent[
          Event_, 
          SyntheticKeyboardEvent[HTMLDivElement] | SyntheticMouseEvent[HTMLDivElement]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

