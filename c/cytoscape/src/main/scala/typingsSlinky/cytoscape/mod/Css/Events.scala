package typingsSlinky.cytoscape.mod.Css

import typingsSlinky.cytoscape.cytoscapeStrings.no
import typingsSlinky.cytoscape.cytoscapeStrings.yes
import typingsSlinky.cytoscape.mod.NodeSingular
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#style/events
  */
@js.native
trait Events extends js.Object {
  /**
    * Whether events should occur on an element (e.g.tap, mouseover, etc.).
    *  * For "no", the element receives no events and events simply pass through to the core/viewport.
    */
  var events: PropertyValueNode[yes | no] = js.native
  /**
    *  Whether events should occur on an element if the label receives an event.
    * You may want a style applied to the text on active so you know the text is activatable.
    */
  var `text-events`: PropertyValueNode[yes | no] = js.native
}

object Events {
  @scala.inline
  def apply(events: PropertyValueNode[yes | no], `text-events`: PropertyValueNode[yes | no]): Events = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.updateDynamic("text-events")(`text-events`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Events]
  }
  @scala.inline
  implicit class EventsOps[Self <: Events] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventsFunction1(value: NodeSingular => yes | no): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEvents(value: PropertyValueNode[yes | no]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withText-eventsFunction1`(value: NodeSingular => yes | no): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-events")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withText-events`(value: PropertyValueNode[yes | no]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-events")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

