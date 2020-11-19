package typingsSlinky.ol.layerLayerMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ol.eventsMod.EventsKey
import typingsSlinky.ol.objectMod.ObjectEvent
import typingsSlinky.ol.olStrings.changeColonsource
import typingsSlinky.ol.olStrings.postrender
import typingsSlinky.ol.olStrings.prerender
import typingsSlinky.ol.pixelMod.Pixel
import typingsSlinky.ol.pluggableMapMod.FrameState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Layer[SourceType /* <: typingsSlinky.ol.sourceSourceMod.default */]
  extends typingsSlinky.ol.baseMod.default {
  
  /* protected */ def createRenderer(): typingsSlinky.ol.rendererLayerMod.default[Layer[typingsSlinky.ol.sourceSourceMod.default]] = js.native
  
  def getFeatures(pixel: Pixel): js.Promise[
    js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]]
  ] = js.native
  
  def getRenderer(): typingsSlinky.ol.rendererLayerMod.default[Layer[typingsSlinky.ol.sourceSourceMod.default]] = js.native
  
  def getSource(): SourceType = js.native
  
  def hasRenderer(): Boolean = js.native
  
  @JSName("on")
  def on_changesource(`type`: changeColonsource, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_postrender(
    `type`: postrender,
    listener: js.Function1[/* evt */ typingsSlinky.ol.renderEventMod.default, Unit]
  ): EventsKey = js.native
  @JSName("on")
  def on_prerender(`type`: prerender, listener: js.Function1[/* evt */ typingsSlinky.ol.renderEventMod.default, Unit]): EventsKey = js.native
  
  @JSName("once")
  def once_changesource(`type`: changeColonsource, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_postrender(
    `type`: postrender,
    listener: js.Function1[/* evt */ typingsSlinky.ol.renderEventMod.default, Unit]
  ): EventsKey = js.native
  @JSName("once")
  def once_prerender(`type`: prerender, listener: js.Function1[/* evt */ typingsSlinky.ol.renderEventMod.default, Unit]): EventsKey = js.native
  
  def render(frameState: FrameState, target: HTMLElement): HTMLElement = js.native
  
  def setMap(map: typingsSlinky.ol.pluggableMapMod.default): Unit = js.native
  
  def setSource(source: SourceType): Unit = js.native
  
  @JSName("un")
  def un_changesource(`type`: changeColonsource, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_postrender(
    `type`: postrender,
    listener: js.Function1[/* evt */ typingsSlinky.ol.renderEventMod.default, Unit]
  ): Unit = js.native
  @JSName("un")
  def un_prerender(`type`: prerender, listener: js.Function1[/* evt */ typingsSlinky.ol.renderEventMod.default, Unit]): Unit = js.native
}
