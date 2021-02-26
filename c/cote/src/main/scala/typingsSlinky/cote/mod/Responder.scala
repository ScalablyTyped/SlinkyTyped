package typingsSlinky.cote.mod

import typingsSlinky.cote.coteStrings.coteColonadded
import typingsSlinky.cote.coteStrings.coteColonremoved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cote", "Responder")
@js.native
class Responder protected () extends Component {
  def this(/**
    * Configuration which controls the data being advertised for auto-discovery.
    */
  advertisement: ResponderAdvertisement) = this()
  def this(
    /**
    * Configuration which controls the data being advertised for auto-discovery.
    */
  advertisement: ResponderAdvertisement,
    /**
    * Controls the network-layer configuration and environments for components.
    */
  discoveryOptions: DiscoveryOptions
  ) = this()
  
  def on[T /* <: Event */](`type`: String, listener: js.Function1[/* event */ T, js.Promise[_]]): this.type = js.native
  /**
    * Responds to certain requests from a Requester.
    *
    * @param type Type. May be wildcarded or namespaced like in EventEmitter2.
    * @param listener Callback. Should return a result.
    */
  def on[T /* <: Event */](
    `type`: String,
    listener: js.Function2[
      /* event */ T, 
      /* callback */ js.Function2[/* error */ js.Any, /* result */ js.Any, Unit], 
      Unit
    ]
  ): this.type = js.native
  def on[T /* <: Event */](`type`: js.Array[String], listener: js.Function1[/* event */ T, js.Promise[_]]): this.type = js.native
  def on[T /* <: Event */](
    `type`: js.Array[String],
    listener: js.Function2[
      /* event */ T, 
      /* callback */ js.Function2[/* error */ js.Any, /* result */ js.Any, Unit], 
      Unit
    ]
  ): this.type = js.native
  /**
    * Listens to internal `cote:added` and `cote:removed` events.
    *
    * @param listener Callback.
    */
  @JSName("on")
  def on_coteadded(`type`: coteColonadded, listener: js.Function1[/* event */ Status, Unit]): this.type = js.native
  @JSName("on")
  def on_coteremoved(`type`: coteColonremoved, listener: js.Function1[/* event */ Status, Unit]): this.type = js.native
}
