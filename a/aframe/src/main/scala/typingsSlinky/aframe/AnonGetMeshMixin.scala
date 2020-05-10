package typingsSlinky.aframe

import typingsSlinky.aframe.mod.Component
import typingsSlinky.aframe.mod.Entity
import typingsSlinky.aframe.mod.ObjectMap
import typingsSlinky.aframe.mod.System
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGetMeshMixin extends js.Object {
  var primitives: ObjectMap[Entity[ObjectMap[Component[_, System[_]]]]] = js.native
  def getMeshMixin(): AnonDefaultComponents = js.native
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
  @scala.inline
  implicit class AnonGetMeshMixinOps[Self <: AnonGetMeshMixin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetMeshMixin(value: () => AnonDefaultComponents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMeshMixin")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrimitives(value: ObjectMap[Entity[ObjectMap[Component[_, System[_]]]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primitives")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

