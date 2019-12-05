package typingsSlinky.aframe

import typingsSlinky.aframe.aframeMod.Component
import typingsSlinky.aframe.aframeMod.Entity
import typingsSlinky.aframe.aframeMod.ObjectMap
import typingsSlinky.aframe.aframeMod.System
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetMeshMixin extends js.Object {
  var primitives: ObjectMap[Entity[ObjectMap[Component[_, System[_]]]]]
  def getMeshMixin(): Anon_DefaultComponents
}

object Anon_GetMeshMixin {
  @scala.inline
  def apply(
    getMeshMixin: () => Anon_DefaultComponents,
    primitives: ObjectMap[Entity[ObjectMap[Component[_, System[_]]]]]
  ): Anon_GetMeshMixin = {
    val __obj = js.Dynamic.literal(getMeshMixin = js.Any.fromFunction0(getMeshMixin), primitives = primitives.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_GetMeshMixin]
  }
}

