package typingsSlinky.reactPopperTooltip.typesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTooltipPropsArg
  extends /* key */ StringDictionary[js.Any] {
  var onMouseEnter: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, Element], Unit]] = js.native
  var onMouseLeave: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, Element], Unit]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object GetTooltipPropsArg {
  @scala.inline
  def apply(): GetTooltipPropsArg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTooltipPropsArg]
  }
  @scala.inline
  implicit class GetTooltipPropsArgOps[Self <: GetTooltipPropsArg] (val x: Self) extends AnyVal {
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
    def setOnMouseEnter(value: /* event */ SyntheticEvent[Event, Element] => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setOnMouseLeave(value: /* event */ SyntheticEvent[Event, Element] => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

