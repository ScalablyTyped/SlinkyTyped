package typingsSlinky.ol.selectMod

import typingsSlinky.ol.eventsMod.EventsKey
import typingsSlinky.ol.olFeatureMod.FeatureLike
import typingsSlinky.ol.olStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Select
  extends typingsSlinky.ol.interactionInteractionMod.default {
  def getFeatures(): typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]] = js.native
  def getHitTolerance(): Double = js.native
  def getLayer(feature: FeatureLike): typingsSlinky.ol.vectorMod.default = js.native
  @JSName("on")
  def on_select(`type`: select, listener: js.Function1[/* evt */ SelectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_select(`type`: select, listener: js.Function1[/* evt */ SelectEvent, Unit]): EventsKey = js.native
  def setHitTolerance(hitTolerance: Double): Unit = js.native
  @JSName("un")
  def un_select(`type`: select, listener: js.Function1[/* evt */ SelectEvent, Unit]): Unit = js.native
}

