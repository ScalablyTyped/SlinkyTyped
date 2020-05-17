package typingsSlinky.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @component
  * @class
  * @name pc.ScriptComponent
  * @augments pc.Component
  * @classdesc The ScriptComponent allows you to extend the functionality of an Entity by attaching your own Script Types defined in JavaScript files
  * to be executed with access to the Entity. For more details on scripting see <a href="//developer.playcanvas.com/user-manual/scripting/">Scripting</a>.
  * @param {pc.ScriptComponentSystem} system - The ComponentSystem that created this Component.
  * @param {pc.Entity} entity - The Entity that this Component is attached to.
  * @property {pc.ScriptType[]} scripts An array of all script instances attached to an entity. This Array shall not be modified by developer.
  */
@JSGlobal("pc.ScriptComponent")
@js.native
class ScriptComponent protected ()
  extends typingsSlinky.playcanvas.pc.ScriptComponent {
  def this(
    system: typingsSlinky.playcanvas.pc.ScriptComponentSystem,
    entity: typingsSlinky.playcanvas.pc.Entity
  ) = this()
}

