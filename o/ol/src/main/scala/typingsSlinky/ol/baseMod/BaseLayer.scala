package typingsSlinky.ol.baseMod

import typingsSlinky.ol.eventsMod.EventsKey
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.layerLayerMod.State
import typingsSlinky.ol.objectMod.ObjectEvent
import typingsSlinky.ol.olStrings.changeColonextent
import typingsSlinky.ol.olStrings.changeColonmaxResolution
import typingsSlinky.ol.olStrings.changeColonmaxZoom
import typingsSlinky.ol.olStrings.changeColonminResolution
import typingsSlinky.ol.olStrings.changeColonminZoom
import typingsSlinky.ol.olStrings.changeColonopacity
import typingsSlinky.ol.olStrings.changeColonvisible
import typingsSlinky.ol.olStrings.changeColonzIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseLayer
  extends typingsSlinky.ol.objectMod.default {
  
  def getClassName(): String = js.native
  
  def getExtent(): Extent = js.native
  
  def getLayerState(): State = js.native
  def getLayerState(opt_managed: Boolean): State = js.native
  
  def getLayerStatesArray(): js.Array[State] = js.native
  def getLayerStatesArray(opt_states: js.Array[State]): js.Array[State] = js.native
  
  def getLayersArray(): js.Array[typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default]] = js.native
  def getLayersArray(
    opt_array: js.Array[typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default]]
  ): js.Array[typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default]] = js.native
  
  def getMaxResolution(): Double = js.native
  
  def getMaxZoom(): Double = js.native
  
  def getMinResolution(): Double = js.native
  
  def getMinZoom(): Double = js.native
  
  def getOpacity(): Double = js.native
  
  def getSourceState(): typingsSlinky.ol.stateMod.State = js.native
  
  def getVisible(): Boolean = js.native
  
  def getZIndex(): Double = js.native
  
  @JSName("on")
  def on_changeextent(`type`: changeColonextent, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changemaxResolution(`type`: changeColonmaxResolution, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changemaxZoom(`type`: changeColonmaxZoom, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeminResolution(`type`: changeColonminResolution, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeminZoom(`type`: changeColonminZoom, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeopacity(`type`: changeColonopacity, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changevisible(`type`: changeColonvisible, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changezIndex(`type`: changeColonzIndex, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  
  @JSName("once")
  def once_changeextent(`type`: changeColonextent, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changemaxResolution(`type`: changeColonmaxResolution, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changemaxZoom(`type`: changeColonmaxZoom, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeminResolution(`type`: changeColonminResolution, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeminZoom(`type`: changeColonminZoom, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeopacity(`type`: changeColonopacity, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changevisible(`type`: changeColonvisible, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changezIndex(`type`: changeColonzIndex, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  
  def setExtent(): Unit = js.native
  def setExtent(extent: Extent): Unit = js.native
  
  def setMaxResolution(maxResolution: Double): Unit = js.native
  
  def setMaxZoom(maxZoom: Double): Unit = js.native
  
  def setMinResolution(minResolution: Double): Unit = js.native
  
  def setMinZoom(minZoom: Double): Unit = js.native
  
  def setOpacity(opacity: Double): Unit = js.native
  
  def setVisible(visible: Boolean): Unit = js.native
  
  def setZIndex(zindex: Double): Unit = js.native
  
  @JSName("un")
  def un_changeextent(`type`: changeColonextent, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changemaxResolution(`type`: changeColonmaxResolution, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changemaxZoom(`type`: changeColonmaxZoom, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeminResolution(`type`: changeColonminResolution, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeminZoom(`type`: changeColonminZoom, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeopacity(`type`: changeColonopacity, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changevisible(`type`: changeColonvisible, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changezIndex(`type`: changeColonzIndex, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
}
