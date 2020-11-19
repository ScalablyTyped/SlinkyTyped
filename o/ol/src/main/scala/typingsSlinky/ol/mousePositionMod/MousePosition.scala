package typingsSlinky.ol.mousePositionMod

import org.scalajs.dom.raw.Event
import typingsSlinky.ol.coordinateMod.CoordinateFormat
import typingsSlinky.ol.eventsMod.EventsKey
import typingsSlinky.ol.objectMod.ObjectEvent
import typingsSlinky.ol.olStrings.changeColoncoordinateFormat
import typingsSlinky.ol.olStrings.changeColonprojection
import typingsSlinky.ol.projMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MousePosition
  extends typingsSlinky.ol.controlControlMod.default {
  
  def getCoordinateFormat(): CoordinateFormat = js.native
  
  def getProjection(): typingsSlinky.ol.projectionMod.default = js.native
  
  /* protected */ def handleMouseMove(event: Event): Unit = js.native
  
  /* protected */ def handleMouseOut(event: Event): Unit = js.native
  
  @JSName("on")
  def on_changecoordinateFormat(`type`: changeColoncoordinateFormat, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeprojection(`type`: changeColonprojection, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  
  @JSName("once")
  def once_changecoordinateFormat(`type`: changeColoncoordinateFormat, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeprojection(`type`: changeColonprojection, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  
  def setCoordinateFormat(format: CoordinateFormat): Unit = js.native
  
  def setProjection(projection: ProjectionLike): Unit = js.native
  
  @JSName("un")
  def un_changecoordinateFormat(`type`: changeColoncoordinateFormat, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeprojection(`type`: changeColonprojection, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
}
