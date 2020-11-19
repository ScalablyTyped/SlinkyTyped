package typingsSlinky.ol.fullScreenMod

import typingsSlinky.ol.eventsMod.EventsKey
import typingsSlinky.ol.objectMod.ObjectEvent
import typingsSlinky.ol.olStrings.enterfullscreen
import typingsSlinky.ol.olStrings.leavefullscreen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FullScreen
  extends typingsSlinky.ol.controlControlMod.default {
  
  @JSName("on")
  def on_enterfullscreen(`type`: enterfullscreen, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_leavefullscreen(`type`: leavefullscreen, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  
  @JSName("once")
  def once_enterfullscreen(`type`: enterfullscreen, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_leavefullscreen(`type`: leavefullscreen, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  
  @JSName("un")
  def un_enterfullscreen(`type`: enterfullscreen, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_leavefullscreen(`type`: leavefullscreen, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
}
