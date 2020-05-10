package typingsSlinky.reactTooltip.components

import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLSpanElement
import slinky.core.TagMod
import slinky.web.html.span.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactTooltip.AnonLeft
import typingsSlinky.reactTooltip.mod.Effect
import typingsSlinky.reactTooltip.mod.GetContent
import typingsSlinky.reactTooltip.mod.Offset
import typingsSlinky.reactTooltip.mod.Place
import typingsSlinky.reactTooltip.mod.TooltipProps
import typingsSlinky.reactTooltip.mod.Type
import typingsSlinky.reactTooltip.mod.default
import typingsSlinky.reactTooltip.reactTooltipStrings.div
import typingsSlinky.reactTooltip.reactTooltipStrings.span
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactTooltip {
  @JSImport("react-tooltip", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def afterHide(value: /* repeated */ js.Any => Unit): this.type = set("afterHide", js.Any.fromFunction1(value))
    @scala.inline
    def afterShow(value: /* repeated */ js.Any => Unit): this.type = set("afterShow", js.Any.fromFunction1(value))
    @scala.inline
    def arrowColor(value: String): this.type = set("arrowColor", value.asInstanceOf[js.Any])
    @scala.inline
    def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def bodyMode(value: Boolean): this.type = set("bodyMode", value.asInstanceOf[js.Any])
    @scala.inline
    def border(value: Boolean): this.type = set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def borderColor(value: String): this.type = set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def `class`(value: String): this.type = set("class", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def clickable(value: Boolean): this.type = set("clickable", value.asInstanceOf[js.Any])
    @scala.inline
    def delayHide(value: Double): this.type = set("delayHide", value.asInstanceOf[js.Any])
    @scala.inline
    def delayShow(value: Double): this.type = set("delayShow", value.asInstanceOf[js.Any])
    @scala.inline
    def delayUpdate(value: Double): this.type = set("delayUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def disable(value: Boolean): this.type = set("disable", value.asInstanceOf[js.Any])
    @scala.inline
    def effect(value: Effect): this.type = set("effect", value.asInstanceOf[js.Any])
    @scala.inline
    def event(value: String): this.type = set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def eventOff(value: String): this.type = set("eventOff", value.asInstanceOf[js.Any])
    @scala.inline
    def getContentFunction1(value: /* toolTipStr */ String => TagMod[Any]): this.type = set("getContent", js.Any.fromFunction1(value))
    @scala.inline
    def getContent(value: GetContent): this.type = set("getContent", value.asInstanceOf[js.Any])
    @scala.inline
    def globalEventOff(value: String): this.type = set("globalEventOff", value.asInstanceOf[js.Any])
    @scala.inline
    def html(value: Boolean): this.type = set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def insecure(value: Boolean): this.type = set("insecure", value.asInstanceOf[js.Any])
    @scala.inline
    def isCapture(value: Boolean): this.type = set("isCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def multiline(value: Boolean): this.type = set("multiline", value.asInstanceOf[js.Any])
    @scala.inline
    def offset(value: Offset): this.type = set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def overridePosition(
      value: (/* position */ AnonLeft, /* currentEvent */ Event_, /* currentTarget */ EventTarget, /* refNode */ Null | HTMLDivElement | HTMLSpanElement, /* place */ Place, /* desiredPlace */ Place, /* effect */ Effect, /* offset */ Offset) => AnonLeft
    ): this.type = set("overridePosition", js.Any.fromFunction8(value))
    @scala.inline
    def place(value: Place): this.type = set("place", value.asInstanceOf[js.Any])
    @scala.inline
    def possibleCustomEvents(value: String): this.type = set("possibleCustomEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def possibleCustomEventsOff(value: String): this.type = set("possibleCustomEventsOff", value.asInstanceOf[js.Any])
    @scala.inline
    def resizeHide(value: Boolean): this.type = set("resizeHide", value.asInstanceOf[js.Any])
    @scala.inline
    def scrollHide(value: Boolean): this.type = set("scrollHide", value.asInstanceOf[js.Any])
    @scala.inline
    def textColor(value: String): this.type = set("textColor", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: Type): this.type = set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def uuid(value: String): this.type = set("uuid", value.asInstanceOf[js.Any])
    @scala.inline
    def wrapper(value: div | span): this.type = set("wrapper", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TooltipProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactTooltip.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

