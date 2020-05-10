package typingsSlinky.reactWaypoint.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactWaypoint.mod.Waypoint.CallbackArgs
import typingsSlinky.reactWaypoint.mod.Waypoint.WaypointProps
import typingsSlinky.reactWaypoint.mod.Waypoint_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Waypoint {
  @JSImport("react-waypoint", "Waypoint")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, Waypoint_] {
    @scala.inline
    def bottomOffset(value: String | Double): this.type = set("bottomOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def debug(value: Boolean): this.type = set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def fireOnRapidScroll(value: Boolean): this.type = set("fireOnRapidScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def onEnter(value: /* args */ CallbackArgs => Unit): this.type = set("onEnter", js.Any.fromFunction1(value))
    @scala.inline
    def onLeave(value: /* args */ CallbackArgs => Unit): this.type = set("onLeave", js.Any.fromFunction1(value))
    @scala.inline
    def onPositionChange(value: /* args */ CallbackArgs => Unit): this.type = set("onPositionChange", js.Any.fromFunction1(value))
    @scala.inline
    def scrollableAncestor(value: js.Any): this.type = set("scrollableAncestor", value.asInstanceOf[js.Any])
    @scala.inline
    def topOffset(value: String | Double): this.type = set("topOffset", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: WaypointProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Waypoint.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

