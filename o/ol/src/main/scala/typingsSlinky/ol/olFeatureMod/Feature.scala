package typingsSlinky.ol.olFeatureMod

import typingsSlinky.ol.eventsMod.EventsKey
import typingsSlinky.ol.objectMod.ObjectEvent
import typingsSlinky.ol.olStrings.changeColongeometry
import typingsSlinky.ol.styleStyleMod.StyleFunction
import typingsSlinky.ol.styleStyleMod.StyleLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Feature[GeomType /* <: typingsSlinky.ol.geometryMod.default */]
  extends typingsSlinky.ol.objectMod.default
     with FeatureClass
     with FeatureLike {
  def getGeometry(): GeomType = js.native
  def getGeometryName(): String = js.native
  def getId(): Double | String = js.native
  def getStyle(): StyleLike = js.native
  def getStyleFunction(): StyleFunction = js.native
  @JSName("on")
  def on_changegeometry(`type`: changeColongeometry, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changegeometry(`type`: changeColongeometry, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  def setGeometry(): Unit = js.native
  def setGeometry(geometry: GeomType): Unit = js.native
  def setGeometryName(name: String): Unit = js.native
  def setId(): Unit = js.native
  def setId(id: String): Unit = js.native
  def setId(id: Double): Unit = js.native
  def setStyle(): Unit = js.native
  def setStyle(style: StyleLike): Unit = js.native
  @JSName("un")
  def un_changegeometry(`type`: changeColongeometry, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
}

