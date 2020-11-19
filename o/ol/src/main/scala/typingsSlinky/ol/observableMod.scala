package typingsSlinky.ol

import typingsSlinky.ol.eventsMod.EventsKey
import typingsSlinky.ol.eventsMod.ListenerFunction
import typingsSlinky.ol.olStrings.change
import typingsSlinky.ol.olStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/Observable", JSImport.Namespace)
@js.native
object observableMod extends js.Object {
  
  def unByKey(key: js.Array[EventsKey]): Unit = js.native
  def unByKey(key: EventsKey): Unit = js.native
  
  @js.native
  trait Observable
    extends typingsSlinky.ol.targetMod.default {
    
    def changed(): Unit = js.native
    
    def getRevision(): Double = js.native
    
    def on(`type`: String, listener: ListenerFunction): EventsKey | js.Array[EventsKey] = js.native
    def on(`type`: js.Array[String], listener: ListenerFunction): EventsKey | js.Array[EventsKey] = js.native
    @JSName("on")
    def on_change(`type`: change, listener: js.Function1[/* evt */ typingsSlinky.ol.eventMod.default, Unit]): EventsKey = js.native
    @JSName("on")
    def on_error(`type`: error, listener: js.Function1[/* evt */ typingsSlinky.ol.eventMod.default, Unit]): EventsKey = js.native
    
    def once(`type`: String, listener: js.Function1[/* p0 */ js.Any, _]): EventsKey | js.Array[EventsKey] = js.native
    def once(`type`: js.Array[String], listener: js.Function1[/* p0 */ js.Any, _]): EventsKey | js.Array[EventsKey] = js.native
    @JSName("once")
    def once_change(`type`: change, listener: js.Function1[/* evt */ typingsSlinky.ol.eventMod.default, Unit]): EventsKey = js.native
    @JSName("once")
    def once_error(`type`: error, listener: js.Function1[/* evt */ typingsSlinky.ol.eventMod.default, Unit]): EventsKey = js.native
    
    def un(`type`: String, listener: js.Function1[/* p0 */ js.Any, _]): Unit = js.native
    def un(`type`: js.Array[String], listener: js.Function1[/* p0 */ js.Any, _]): Unit = js.native
    @JSName("un")
    def un_change(`type`: change, listener: js.Function1[/* evt */ typingsSlinky.ol.eventMod.default, Unit]): Unit = js.native
    @JSName("un")
    def un_error(`type`: error, listener: js.Function1[/* evt */ typingsSlinky.ol.eventMod.default, Unit]): Unit = js.native
  }
  
  @js.native
  class default () extends Observable
}
