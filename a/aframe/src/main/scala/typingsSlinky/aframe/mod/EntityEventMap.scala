package typingsSlinky.aframe.mod

import org.scalajs.dom.raw.Event
import typingsSlinky.aframe.anon.ComponentName
import typingsSlinky.aframe.anon.Data
import typingsSlinky.aframe.anon.El
import typingsSlinky.aframe.anon.Id
import typingsSlinky.aframe.anon.Name
import typingsSlinky.aframe.anon.State
import typingsSlinky.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntityEventMap extends StObject {
  
  var `child-attached`: DetailEvent[El] = js.native
  
  var `child-detached`: DetailEvent[El] = js.native
  
  var componentchanged: DetailEvent[Id] = js.native
  
  var componentinitialized: DetailEvent[Data] = js.native
  
  var componentremoved: DetailEvent[Name] = js.native
  
  def loaded(evt: Event): Unit = js.native
  @JSName("loaded")
  var loaded_Original: EventListener = js.native
  
  def pause(evt: Event): Unit = js.native
  @JSName("pause")
  var pause_Original: EventListener = js.native
  
  def play(evt: Event): Unit = js.native
  @JSName("play")
  var play_Original: EventListener = js.native
  
  var schemachanged: DetailEvent[ComponentName] = js.native
  
  var stateadded: DetailEvent[State] = js.native
  
  var stateremoved: DetailEvent[State] = js.native
}
