package typingsSlinky.antvComponent.mod

import typingsSlinky.antvComponent.componentMod.default
import typingsSlinky.antvComponent.typesMod.ComponentCfg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component", "Component")
@js.native
abstract class Component[T /* <: ComponentCfg */] protected () extends default[T] {
  def this(cfg: T) = this()
}
