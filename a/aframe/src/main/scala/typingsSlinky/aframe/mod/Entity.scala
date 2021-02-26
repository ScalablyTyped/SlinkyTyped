package typingsSlinky.aframe.mod

import org.scalajs.dom.raw.Event
import typingsSlinky.aframe.aframeStrings.`child-attached`
import typingsSlinky.aframe.aframeStrings.`child-detached`
import typingsSlinky.aframe.aframeStrings.componentchanged
import typingsSlinky.aframe.aframeStrings.componentinitialized
import typingsSlinky.aframe.aframeStrings.componentremoved
import typingsSlinky.aframe.aframeStrings.loaded
import typingsSlinky.aframe.aframeStrings.pause
import typingsSlinky.aframe.aframeStrings.play
import typingsSlinky.aframe.aframeStrings.position
import typingsSlinky.aframe.aframeStrings.rotation
import typingsSlinky.aframe.aframeStrings.scale
import typingsSlinky.aframe.aframeStrings.schemachanged
import typingsSlinky.aframe.aframeStrings.stateadded
import typingsSlinky.aframe.aframeStrings.stateremoved
import typingsSlinky.aframe.anon.ComponentName
import typingsSlinky.aframe.anon.Data
import typingsSlinky.aframe.anon.El
import typingsSlinky.aframe.anon.Id
import typingsSlinky.aframe.anon.Name
import typingsSlinky.aframe.anon.State
import typingsSlinky.std.EventListener
import typingsSlinky.three.mod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Entity[C]
  extends typingsSlinky.aframe.mod.ANode {
  
  // addEventListener specific usages
  @JSName("addEventListener")
  def addEventListener_childattached(`type`: `child-attached`, listener: js.Function1[/* event */ Event with DetailEvent[El], Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_childattached(
    `type`: `child-attached`,
    listener: js.Function1[/* event */ Event with DetailEvent[El], Unit],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_childdetached(`type`: `child-detached`, listener: js.Function1[/* event */ Event with DetailEvent[El], Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_childdetached(
    `type`: `child-detached`,
    listener: js.Function1[/* event */ Event with DetailEvent[El], Unit],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_componentchanged(`type`: componentchanged, listener: js.Function1[/* event */ Event with DetailEvent[Id], Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_componentchanged(
    `type`: componentchanged,
    listener: js.Function1[/* event */ Event with DetailEvent[Id], Unit],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_componentinitialized(
    `type`: componentinitialized,
    listener: js.Function1[/* event */ Event with DetailEvent[Data], Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_componentinitialized(
    `type`: componentinitialized,
    listener: js.Function1[/* event */ Event with DetailEvent[Data], Unit],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_componentremoved(`type`: componentremoved, listener: js.Function1[/* event */ Event with DetailEvent[Name], Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_componentremoved(
    `type`: componentremoved,
    listener: js.Function1[/* event */ Event with DetailEvent[Name], Unit],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loaded(`type`: loaded, listener: js.Function1[/* event */ Event with EventListener, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loaded(
    `type`: loaded,
    listener: js.Function1[/* event */ Event with EventListener, Unit],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(`type`: pause, listener: js.Function1[/* event */ Event with EventListener, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pause,
    listener: js.Function1[/* event */ Event with EventListener, Unit],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(`type`: play, listener: js.Function1[/* event */ Event with EventListener, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: play,
    listener: js.Function1[/* event */ Event with EventListener, Unit],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_schemachanged(
    `type`: schemachanged,
    listener: js.Function1[/* event */ Event with DetailEvent[ComponentName], Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_schemachanged(
    `type`: schemachanged,
    listener: js.Function1[/* event */ Event with DetailEvent[ComponentName], Unit],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stateadded(`type`: stateadded, listener: js.Function1[/* event */ Event with DetailEvent[State], Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stateadded(
    `type`: stateadded,
    listener: js.Function1[/* event */ Event with DetailEvent[State], Unit],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stateremoved(`type`: stateremoved, listener: js.Function1[/* event */ Event with DetailEvent[State], Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stateremoved(
    `type`: stateremoved,
    listener: js.Function1[/* event */ Event with DetailEvent[State], Unit],
    useCapture: Boolean
  ): Unit = js.native
  
  def addState(name: String): Unit = js.native
  
  var components: C with DefaultComponents = js.native
  
  def destroy(): Unit = js.native
  
  def flushToDOM(): Unit = js.native
  def flushToDOM(recursive: Boolean): Unit = js.native
  
  @JSName("getAttribute")
  def getAttribute_position(`type`: position): Coordinate = js.native
  @JSName("getAttribute")
  def getAttribute_rotation(`type`: rotation): Coordinate = js.native
  @JSName("getAttribute")
  def getAttribute_scale(`type`: scale): Coordinate = js.native
  
  /**
    * @deprecated since 0.4.0
    */
  def getComputedAttribute(attr: String): Component[_, System[_]] = js.native
  
  def getDOMAttribute(attr: String): js.Any = js.native
  
  def getObject3D(`type`: String): Object3D = js.native
  
  def getOrCreateObject3D(`type`: String, construct: js.Any): Object3D = js.native
  
  def is(stateName: String): Boolean = js.native
  
  var isPlaying: Boolean = js.native
  
  var object3D: Object3D = js.native
  
  var object3DMap: ObjectMap[Object3D] = js.native
  
  def pause(): Unit = js.native
  
  def play(): Unit = js.native
  
  def removeAttribute(attr: String, property: String): Unit = js.native
  
  def removeObject3D(`type`: String): Unit = js.native
  
  def removeState(stateName: String): Unit = js.native
  
  var sceneEl: js.UndefOr[Scene] = js.native
  
  def setAttribute(attr: String, property: String, componentAttrValue: js.Any): Unit = js.native
  @JSName("setAttribute")
  def setAttribute_position(`type`: position, value: Coordinate): Unit = js.native
  @JSName("setAttribute")
  def setAttribute_rotation(`type`: rotation, value: Coordinate): Unit = js.native
  @JSName("setAttribute")
  def setAttribute_scale(`type`: scale, value: Coordinate): Unit = js.native
  
  def setObject3D(`type`: String, obj: Object3D): Unit = js.native
}
