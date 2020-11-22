package typingsSlinky.ol.mousePositionMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.MouseEvent
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
  
  /**
    * Return the coordinate format type used to render the current position or
    * undefined.
    */
  def getCoordinateFormat(): js.UndefOr[CoordinateFormat] = js.native
  
  /**
    * Return the projection that is used to report the mouse position.
    */
  def getProjection(): js.UndefOr[typingsSlinky.ol.projectionMod.default] = js.native
  
  /* protected */ def handleMouseMove(event: MouseEvent): Unit = js.native
  
  /* protected */ def handleMouseOut(event: Event): Unit = js.native
  
  @JSName("on")
  def on_changecoordinateFormat(`type`: changeColoncoordinateFormat, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeprojection(`type`: changeColonprojection, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  
  @JSName("once")
  def once_changecoordinateFormat(`type`: changeColoncoordinateFormat, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeprojection(`type`: changeColonprojection, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  
  /**
    * Set the coordinate format type used to render the current position.
    */
  def setCoordinateFormat(format: CoordinateFormat): Unit = js.native
  
  /**
    * Set the projection that is used to report the mouse position.
    */
  def setProjection(projection: ProjectionLike): Unit = js.native
  
  @JSName("un")
  def un_changecoordinateFormat(`type`: changeColoncoordinateFormat, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeprojection(`type`: changeColonprojection, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
}
