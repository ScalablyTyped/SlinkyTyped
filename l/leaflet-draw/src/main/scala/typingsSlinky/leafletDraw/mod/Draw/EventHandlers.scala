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
trait EventHandlers extends // Requires an index signature of type string to be properly useful
/* key */ StringDictionary[String] {
  var onCreated: drawColoncreated
  var onDeleteStart: drawColondeletestart
  var onDeleteStop: drawColondeletestop
  var onDeleted: drawColondeleted
  var onDrawStart: drawColondrawstart
  var onDrawStop: drawColondrawstop
  var onDrawVertex: drawColondrawvertex
  var onEditMove: drawColoneditmove
  var onEditResize: drawColoneditresize
  var onEditStart: drawColoneditstart
  var onEditStop: drawColoneditstop
  var onEditVertex: drawColoneditvertex
  var onEdited: drawColonedited
  var onMarkerContext: drawColonmarkercontext
  var onToolbarClosed: drawColontoolbarclosed
  var onToolbarOpened: drawColontoolbaropened
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
    onToolbarOpened: drawColontoolbaropened,
    StringDictionary: // Requires an index signature of type string to be properly useful
  /* key */ StringDictionary[String] = null
  ): EventHandlers = {
    val __obj = js.Dynamic.literal(onCreated = onCreated.asInstanceOf[js.Any], onDeleteStart = onDeleteStart.asInstanceOf[js.Any], onDeleteStop = onDeleteStop.asInstanceOf[js.Any], onDeleted = onDeleted.asInstanceOf[js.Any], onDrawStart = onDrawStart.asInstanceOf[js.Any], onDrawStop = onDrawStop.asInstanceOf[js.Any], onDrawVertex = onDrawVertex.asInstanceOf[js.Any], onEditMove = onEditMove.asInstanceOf[js.Any], onEditResize = onEditResize.asInstanceOf[js.Any], onEditStart = onEditStart.asInstanceOf[js.Any], onEditStop = onEditStop.asInstanceOf[js.Any], onEditVertex = onEditVertex.asInstanceOf[js.Any], onEdited = onEdited.asInstanceOf[js.Any], onMarkerContext = onMarkerContext.asInstanceOf[js.Any], onToolbarClosed = onToolbarClosed.asInstanceOf[js.Any], onToolbarOpened = onToolbarOpened.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[EventHandlers]
  }
}

