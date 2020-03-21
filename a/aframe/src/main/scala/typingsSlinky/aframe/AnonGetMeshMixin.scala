package typingsSlinky.aframe

import typingsSlinky.aframe.mod.Component
import typingsSlinky.aframe.mod.Entity
import typingsSlinky.aframe.mod.ObjectMap
import typingsSlinky.aframe.mod.System
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetMeshMixin extends js.Object {
  var primitives: ObjectMap[Entity[ObjectMap[Component[_, System[_]]]]]
  def getMeshMixin(): AnonDefaultComponents
}

object AnonGetMeshMixin {
  @scala.inline
  def apply(
    getMeshMixin: () => AnonDefaultComponents,
    primitives: ObjectMap[Entity[ObjectMap[Component[_, System[_]]]]]
  ): AnonGetMeshMixin = {
    val __obj = js.Dynamic.literal(getMeshMixin = js.Any.fromFunction0(getMeshMixin), primitives = primitives.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGetMeshMixin]
  }
}

