package typingsSlinky.ol.baseTileMod

import typingsSlinky.ol.eventsMod.EventsKey
import typingsSlinky.ol.objectMod.ObjectEvent
import typingsSlinky.ol.olStrings.changeColonpreload
import typingsSlinky.ol.olStrings.changeColonuseInterimTilesOnError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseTileLayer
  extends typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceTileMod.default] {
  
  def getPreload(): Double = js.native
  
  def getUseInterimTilesOnError(): Boolean = js.native
  
  @JSName("on")
  def on_changepreload(`type`: changeColonpreload, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeuseInterimTilesOnError(`type`: changeColonuseInterimTilesOnError, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  
  @JSName("once")
  def once_changepreload(`type`: changeColonpreload, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeuseInterimTilesOnError(`type`: changeColonuseInterimTilesOnError, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  
  def setPreload(preload: Double): Unit = js.native
  
  def setUseInterimTilesOnError(useInterimTilesOnError: Boolean): Unit = js.native
  
  @JSName("un")
  def un_changepreload(`type`: changeColonpreload, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeuseInterimTilesOnError(`type`: changeColonuseInterimTilesOnError, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
}
