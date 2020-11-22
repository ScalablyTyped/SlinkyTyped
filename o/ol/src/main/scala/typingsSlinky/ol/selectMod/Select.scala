package typingsSlinky.ol.selectMod

import typingsSlinky.ol.eventsMod.EventsKey
import typingsSlinky.ol.olFeatureMod.FeatureLike
import typingsSlinky.ol.olStrings.select
import typingsSlinky.ol.styleStyleMod.StyleLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Select
  extends typingsSlinky.ol.interactionInteractionMod.default {
  
  /**
    * Get the selected features.
    */
  def getFeatures(): typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]] = js.native
  
  /**
    * Returns the Hit-detection tolerance.
    */
  def getHitTolerance(): Double = js.native
  
  /**
    * Returns the associated {@link module:ol/layer/Vector~Vector vectorlayer} of
    * the (last) selected feature. Note that this will not work with any
    * programmatic method like pushing features to
    * {@link module:ol/interaction/Select~Select#getFeatures collection}.
    */
  def getLayer(feature: FeatureLike): typingsSlinky.ol.vectorMod.default = js.native
  
  def getStyle(): StyleLike | Null = js.native
  
  @JSName("on")
  def on_select(`type`: select, listener: js.Function1[/* evt */ SelectEvent, Unit]): EventsKey = js.native
  
  @JSName("once")
  def once_select(`type`: select, listener: js.Function1[/* evt */ SelectEvent, Unit]): EventsKey = js.native
  
  /**
    * Hit-detection tolerance. Pixels inside the radius around the given position
    * will be checked for features.
    */
  def setHitTolerance(hitTolerance: Double): Unit = js.native
  
  @JSName("un")
  def un_select(`type`: select, listener: js.Function1[/* evt */ SelectEvent, Unit]): Unit = js.native
}
