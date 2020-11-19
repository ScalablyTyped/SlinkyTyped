package typingsSlinky.playcanvas.global.pc

import typingsSlinky.playcanvas.anon.TypeofScriptType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("pc.registerScript")
@js.native
object registerScript extends js.Object {
  
  /**
    * Register a existing class type as a Script Type to {@link pc.ScriptRegistry}.
    * Useful when defining a ES6 script class that extends {@link pc.ScriptType} (see example).
    * @example
    * // define a ES6 script class
    * class PlayerController extends pc.ScriptType {
    *
    *     initialize() {
    *         // called once on initialize
    *     }
    *
    *     update(dt) {
    *         // called each tick
    *     }
    * }
    *
    * // register the class as a script
    * pc.registerScript(PlayerController);
    *
    * // declare script attributes (Must be after pc.registerScript())
    * PlayerController.attributes.add('attribute1', {type: 'number'});
    * @param script - The existing class type (constructor function) to be registered as a Script Type.
    * Class must extend {@link pc.ScriptType} (see example). Please note: A class created using {@link pc.createScript} is auto-registered,
    * and should therefore not be pass into {@link pc.registerScript} (which would result in swapping out all related script instances).
    * @param [name] - Optional unique name of the Script Type. By default it will use the same name as the existing class.
    * If a Script Type with the same name has already been registered and the new one has a `swap` method defined in its prototype,
    * then it will perform hot swapping of existing Script Instances on entities using this new Script Type.
    * Note: There is a reserved list of names that cannot be used, such as list below as well as some starting from `_` (underscore):
    * system, entity, create, destroy, swap, move, scripts, onEnable, onDisable, onPostStateChange, has, on, off, fire, once, hasEvent.
    * @param [app] - Optional application handler, to choose which {@link pc.ScriptRegistry} to register the script type to.
    * By default it will use `pc.Application.getApplication()` to get current {@link pc.Application}.
    */
  def apply(script: TypeofScriptType): Unit = js.native
  def apply(
    script: TypeofScriptType,
    name: js.UndefOr[scala.Nothing],
    app: typingsSlinky.playcanvas.pc.Application
  ): Unit = js.native
  def apply(script: TypeofScriptType, name: String): Unit = js.native
  def apply(script: TypeofScriptType, name: String, app: typingsSlinky.playcanvas.pc.Application): Unit = js.native
}
