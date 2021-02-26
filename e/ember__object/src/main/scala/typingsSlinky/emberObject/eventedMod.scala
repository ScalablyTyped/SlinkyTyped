package typingsSlinky.emberObject

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventedMod extends Shortcut {
  
  @JSImport("@ember/object/evented", JSImport.Default)
  @js.native
  val default: typingsSlinky.emberObject.mixinMod.default[Evented, typingsSlinky.emberObject.mod.default] = js.native
  
  @JSImport("@ember/object/evented", "on")
  @js.native
  def on(
    eventName: String,
    eventName2: String,
    eventName3: String,
    eventName4: String,
    eventName5: String,
    eventName6: String,
    func: js.Function1[/* repeated */ js.Any, Unit]
  ): js.Function1[/* repeated */ js.Any, Unit] = js.native
  @JSImport("@ember/object/evented", "on")
  @js.native
  def on(
    eventName: String,
    eventName2: String,
    eventName3: String,
    eventName4: String,
    eventName5: String,
    func: js.Function1[/* repeated */ js.Any, Unit]
  ): js.Function1[/* repeated */ js.Any, Unit] = js.native
  @JSImport("@ember/object/evented", "on")
  @js.native
  def on(
    eventName: String,
    eventName2: String,
    eventName3: String,
    eventName4: String,
    func: js.Function1[/* repeated */ js.Any, Unit]
  ): js.Function1[/* repeated */ js.Any, Unit] = js.native
  @JSImport("@ember/object/evented", "on")
  @js.native
  def on(
    eventName: String,
    eventName2: String,
    eventName3: String,
    func: js.Function1[/* repeated */ js.Any, Unit]
  ): js.Function1[/* repeated */ js.Any, Unit] = js.native
  @JSImport("@ember/object/evented", "on")
  @js.native
  def on(eventName: String, eventName2: String, func: js.Function1[/* repeated */ js.Any, Unit]): js.Function1[/* repeated */ js.Any, Unit] = js.native
  @JSImport("@ember/object/evented", "on")
  @js.native
  def on(eventName: String, func: js.Function1[/* repeated */ js.Any, Unit]): js.Function1[/* repeated */ js.Any, Unit] = js.native
  
  /**
    * This mixin allows for Ember objects to subscribe to and emit events.
    */
  @js.native
  trait Evented extends StObject {
    
    /**
      * Checks to see if object has any subscriptions for named event.
      */
    def has(name: String): Boolean = js.native
    
    def off(name: String, method: String): this.type = js.native
    def off(name: String, method: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /**
      * Cancels subscription for given name, target, and method.
      */
    def off[Target](name: String, target: Target, method: String): this.type = js.native
    def off[Target](
      name: String,
      target: Target,
      method: js.ThisFunction1[/* this */ Target, /* repeated */ js.Any, Unit]
    ): this.type = js.native
    
    def on(name: String, method: String): this.type = js.native
    def on(name: String, method: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /**
      * Subscribes to a named event with given function.
      */
    def on[Target](name: String, target: Target, method: String): this.type = js.native
    def on[Target](
      name: String,
      target: Target,
      method: js.ThisFunction1[/* this */ Target, /* repeated */ js.Any, Unit]
    ): this.type = js.native
    
    def one(name: String, method: String): this.type = js.native
    def one(name: String, method: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /**
      * Subscribes a function to a named event and then cancels the subscription
      * after the first time the event is triggered. It is good to use ``one`` when
      * you only care about the first time an event has taken place.
      */
    def one[Target](name: String, target: Target, method: String): this.type = js.native
    def one[Target](
      name: String,
      target: Target,
      method: js.ThisFunction1[/* this */ Target, /* repeated */ js.Any, Unit]
    ): this.type = js.native
    
    /**
      * Triggers a named event for the object. Any additional arguments
      * will be passed as parameters to the functions that are subscribed to the
      * event.
      */
    def trigger(name: String, args: js.Any*): js.Any = js.native
  }
  
  type _To = typingsSlinky.emberObject.mixinMod.default[Evented, typingsSlinky.emberObject.mod.default]
  
  /* This means you don't have to write `default`, but can instead just say `eventedMod.foo` */
  override def _to: typingsSlinky.emberObject.mixinMod.default[Evented, typingsSlinky.emberObject.mod.default] = default
}
