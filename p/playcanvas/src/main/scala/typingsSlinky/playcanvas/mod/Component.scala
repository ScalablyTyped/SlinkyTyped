package typingsSlinky.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base constructor for a Component.
  * @property system - The ComponentSystem used to create this Component.
  * @property entity - The Entity that this Component is attached to.
  * @property enabled - Enables or disables the component.
  * @param system - The ComponentSystem used to create this Component.
  * @param entity - The Entity that this Component is attached to.
  */
@JSImport("playcanvas", "Component")
@js.native
class Component protected ()
  extends typingsSlinky.playcanvas.pc.Component {
  def this(system: typingsSlinky.playcanvas.pc.ComponentSystem, entity: typingsSlinky.playcanvas.pc.Entity) = this()
}
