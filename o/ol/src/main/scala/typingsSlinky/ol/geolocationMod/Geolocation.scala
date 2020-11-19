package typingsSlinky.ol.geolocationMod

import org.scalajs.dom.raw.PositionOptions
import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.eventsMod.EventsKey
import typingsSlinky.ol.objectMod.ObjectEvent
import typingsSlinky.ol.olStrings.changeColonaccuracy
import typingsSlinky.ol.olStrings.changeColonaccuracyGeometry
import typingsSlinky.ol.olStrings.changeColonaltitude
import typingsSlinky.ol.olStrings.changeColonaltitudeAccuracy
import typingsSlinky.ol.olStrings.changeColonheading
import typingsSlinky.ol.olStrings.changeColonposition
import typingsSlinky.ol.olStrings.changeColonprojection
import typingsSlinky.ol.olStrings.changeColonspeed
import typingsSlinky.ol.olStrings.changeColontracking
import typingsSlinky.ol.olStrings.changeColontrackingOptions
import typingsSlinky.ol.projMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Geolocation
  extends typingsSlinky.ol.objectMod.default {
  
  def getAccuracy(): Double = js.native
  
  def getAccuracyGeometry(): typingsSlinky.ol.polygonMod.default = js.native
  
  def getAltitude(): Double = js.native
  
  def getAltitudeAccuracy(): Double = js.native
  
  def getHeading(): Double = js.native
  
  def getPosition(): Coordinate = js.native
  
  def getProjection(): typingsSlinky.ol.projectionMod.default = js.native
  
  def getSpeed(): Double = js.native
  
  def getTracking(): Boolean = js.native
  
  def getTrackingOptions(): PositionOptions = js.native
  
  @JSName("on")
  def on_changeaccuracy(`type`: changeColonaccuracy, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeaccuracyGeometry(`type`: changeColonaccuracyGeometry, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changealtitude(`type`: changeColonaltitude, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changealtitudeAccuracy(`type`: changeColonaltitudeAccuracy, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeheading(`type`: changeColonheading, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeposition(`type`: changeColonposition, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeprojection(`type`: changeColonprojection, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changespeed(`type`: changeColonspeed, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changetracking(`type`: changeColontracking, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changetrackingOptions(`type`: changeColontrackingOptions, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  
  @JSName("once")
  def once_changeaccuracy(`type`: changeColonaccuracy, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeaccuracyGeometry(`type`: changeColonaccuracyGeometry, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changealtitude(`type`: changeColonaltitude, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changealtitudeAccuracy(`type`: changeColonaltitudeAccuracy, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeheading(`type`: changeColonheading, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeposition(`type`: changeColonposition, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeprojection(`type`: changeColonprojection, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changespeed(`type`: changeColonspeed, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changetracking(`type`: changeColontracking, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changetrackingOptions(`type`: changeColontrackingOptions, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  
  def setProjection(projection: ProjectionLike): Unit = js.native
  
  def setTracking(tracking: Boolean): Unit = js.native
  
  def setTrackingOptions(options: PositionOptions): Unit = js.native
  
  @JSName("un")
  def un_changeaccuracy(`type`: changeColonaccuracy, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeaccuracyGeometry(`type`: changeColonaccuracyGeometry, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changealtitude(`type`: changeColonaltitude, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changealtitudeAccuracy(`type`: changeColonaltitudeAccuracy, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeheading(`type`: changeColonheading, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeposition(`type`: changeColonposition, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeprojection(`type`: changeColonprojection, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changespeed(`type`: changeColonspeed, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changetracking(`type`: changeColontracking, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changetrackingOptions(`type`: changeColontrackingOptions, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
}
