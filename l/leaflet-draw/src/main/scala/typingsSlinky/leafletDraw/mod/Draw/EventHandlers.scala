package typingsSlinky.leafletDraw.mod.Draw

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.leafletDraw.leafletDrawStrings.drawColoncreated
import typingsSlinky.leafletDraw.leafletDrawStrings.drawColondeleted
import typingsSlinky.leafletDraw.leafletDrawStrings.drawColondeletestart
import typingsSlinky.leafletDraw.leafletDrawStrings.drawColondeletestop
import typingsSlinky.leafletDraw.leafletDrawStrings.drawColondrawstart
import typingsSlinky.leafletDraw.leafletDrawStrings.drawColondrawstop
import typingsSlinky.leafletDraw.leafletDrawStrings.drawColondrawvertex
import typingsSlinky.leafletDraw.leafletDrawStrings.drawColonedited
import typingsSlinky.leafletDraw.leafletDrawStrings.drawColoneditmove
import typingsSlinky.leafletDraw.leafletDrawStrings.drawColoneditresize
import typingsSlinky.leafletDraw.leafletDrawStrings.drawColoneditstart
import typingsSlinky.leafletDraw.leafletDrawStrings.drawColoneditstop
import typingsSlinky.leafletDraw.leafletDrawStrings.drawColoneditvertex
import typingsSlinky.leafletDraw.leafletDrawStrings.drawColonmarkercontext
import typingsSlinky.leafletDraw.leafletDrawStrings.drawColontoolbarclosed
import typingsSlinky.leafletDraw.leafletDrawStrings.drawColontoolbaropened
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EventHandlers to be used in looping over all events
  *
  * @example
  * for (const key in eventHandlers) { map.off(eventHandlers[key], LeafletFn); }
  */
@js.native
trait EventHandlers extends // Requires an index signature of type string to be properly useful
/* key */ StringDictionary[String] {
  var onCreated: drawColoncreated = js.native
  var onDeleteStart: drawColondeletestart = js.native
  var onDeleteStop: drawColondeletestop = js.native
  var onDeleted: drawColondeleted = js.native
  var onDrawStart: drawColondrawstart = js.native
  var onDrawStop: drawColondrawstop = js.native
  var onDrawVertex: drawColondrawvertex = js.native
  var onEditMove: drawColoneditmove = js.native
  var onEditResize: drawColoneditresize = js.native
  var onEditStart: drawColoneditstart = js.native
  var onEditStop: drawColoneditstop = js.native
  var onEditVertex: drawColoneditvertex = js.native
  var onEdited: drawColonedited = js.native
  var onMarkerContext: drawColonmarkercontext = js.native
  var onToolbarClosed: drawColontoolbarclosed = js.native
  var onToolbarOpened: drawColontoolbaropened = js.native
}

object EventHandlers {
  @scala.inline
  def apply(
    onCreated: drawColoncreated,
    onDeleteStart: drawColondeletestart,
    onDeleteStop: drawColondeletestop,
    onDeleted: drawColondeleted,
    onDrawStart: drawColondrawstart,
    onDrawStop: drawColondrawstop,
    onDrawVertex: drawColondrawvertex,
    onEditMove: drawColoneditmove,
    onEditResize: drawColoneditresize,
    onEditStart: drawColoneditstart,
    onEditStop: drawColoneditstop,
    onEditVertex: drawColoneditvertex,
    onEdited: drawColonedited,
    onMarkerContext: drawColonmarkercontext,
    onToolbarClosed: drawColontoolbarclosed,
    onToolbarOpened: drawColontoolbaropened
  ): EventHandlers = {
    val __obj = js.Dynamic.literal(onCreated = onCreated.asInstanceOf[js.Any], onDeleteStart = onDeleteStart.asInstanceOf[js.Any], onDeleteStop = onDeleteStop.asInstanceOf[js.Any], onDeleted = onDeleted.asInstanceOf[js.Any], onDrawStart = onDrawStart.asInstanceOf[js.Any], onDrawStop = onDrawStop.asInstanceOf[js.Any], onDrawVertex = onDrawVertex.asInstanceOf[js.Any], onEditMove = onEditMove.asInstanceOf[js.Any], onEditResize = onEditResize.asInstanceOf[js.Any], onEditStart = onEditStart.asInstanceOf[js.Any], onEditStop = onEditStop.asInstanceOf[js.Any], onEditVertex = onEditVertex.asInstanceOf[js.Any], onEdited = onEdited.asInstanceOf[js.Any], onMarkerContext = onMarkerContext.asInstanceOf[js.Any], onToolbarClosed = onToolbarClosed.asInstanceOf[js.Any], onToolbarOpened = onToolbarOpened.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventHandlers]
  }
  @scala.inline
  implicit class EventHandlersOps[Self <: EventHandlers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnCreated(value: drawColoncreated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnDeleteStart(value: drawColondeletestart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeleteStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnDeleteStop(value: drawColondeletestop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeleteStop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnDeleted(value: drawColondeleted): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnDrawStart(value: drawColondrawstart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrawStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnDrawStop(value: drawColondrawstop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrawStop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnDrawVertex(value: drawColondrawvertex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrawVertex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnEditMove(value: drawColoneditmove): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEditMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnEditResize(value: drawColoneditresize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEditResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnEditStart(value: drawColoneditstart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEditStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnEditStop(value: drawColoneditstop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEditStop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnEditVertex(value: drawColoneditvertex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEditVertex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnEdited(value: drawColonedited): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEdited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnMarkerContext(value: drawColonmarkercontext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMarkerContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnToolbarClosed(value: drawColontoolbarclosed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToolbarClosed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnToolbarOpened(value: drawColontoolbaropened): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToolbarOpened")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

