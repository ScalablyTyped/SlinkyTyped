package typingsSlinky.gestalt.anon

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `3` extends js.Object {
  
  var event: slinky.core.SyntheticEvent[
    org.scalajs.dom.raw.Event, 
    SyntheticKeyboardEvent[HTMLDivElement] | SyntheticMouseEvent[HTMLDivElement]
  ] = js.native
}
object `3` {
  
  @scala.inline
  def apply(
    event: slinky.core.SyntheticEvent[
      org.scalajs.dom.raw.Event, 
      SyntheticKeyboardEvent[HTMLDivElement] | SyntheticMouseEvent[HTMLDivElement]
    ]
  ): `3` = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit class `3Ops`[Self <: `3`] (val x: Self) extends AnyVal {
    
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
    def setEvent(
      value: slinky.core.SyntheticEvent[
          org.scalajs.dom.raw.Event, 
          SyntheticKeyboardEvent[HTMLDivElement] | SyntheticMouseEvent[HTMLDivElement]
        ]
    ): Self = this.set("event", value.asInstanceOf[js.Any])
  }
}
