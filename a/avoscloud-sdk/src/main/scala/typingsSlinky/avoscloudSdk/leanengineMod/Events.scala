package typingsSlinky.avoscloudSdk.leanengineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @class
  *
  * <p>AV.Events is a fork of Backbone's Events module, provided for your
  * convenience.</p>
  *
  * <p>A module that can be mixed in to any object in order to provide
  * it with custom events. You may bind callback functions to an event
  * with `on`, or remove these functions with `off`.
  * Triggering an event fires all callbacks in the order that `on` was
  * called.
  *
  * <pre>
  *     var object = {};
  *     _.extend(object, AV.Events);
  *     object.on('expand', function(){ alert('expanded'); });
  *     object.trigger('expand');</pre></p>
  *
  * <p>For more information, see the
  * <a href="http://documentcloud.github.com/backbone/#Events">Backbone
  * documentation</a>.</p>
  */
@JSImport("leanengine", "Events")
@js.native
class Events ()
  extends typingsSlinky.avoscloudSdk.mod.Events
/* static members */
@JSImport("leanengine", "Events")
@js.native
object Events extends js.Object {
  
  def bind(): typingsSlinky.avoscloudSdk.mod.Events = js.native
  
  def off(events: js.Array[String]): typingsSlinky.avoscloudSdk.mod.Events = js.native
  def off(events: js.Array[String], callback: js.UndefOr[scala.Nothing], context: js.Any): typingsSlinky.avoscloudSdk.mod.Events = js.native
  def off(events: js.Array[String], callback: js.Function): typingsSlinky.avoscloudSdk.mod.Events = js.native
  def off(events: js.Array[String], callback: js.Function, context: js.Any): typingsSlinky.avoscloudSdk.mod.Events = js.native
  
  def on(events: js.Array[String]): typingsSlinky.avoscloudSdk.mod.Events = js.native
  def on(events: js.Array[String], callback: js.UndefOr[scala.Nothing], context: js.Any): typingsSlinky.avoscloudSdk.mod.Events = js.native
  def on(events: js.Array[String], callback: js.Function): typingsSlinky.avoscloudSdk.mod.Events = js.native
  def on(events: js.Array[String], callback: js.Function, context: js.Any): typingsSlinky.avoscloudSdk.mod.Events = js.native
  
  def trigger(events: js.Array[String]): typingsSlinky.avoscloudSdk.mod.Events = js.native
  
  def unbind(): typingsSlinky.avoscloudSdk.mod.Events = js.native
}
