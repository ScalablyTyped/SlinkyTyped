package typingsSlinky.aframe.anon

import typingsSlinky.aframe.mod.Component
import typingsSlinky.aframe.mod.Entity
import typingsSlinky.aframe.mod.ObjectMap
import typingsSlinky.aframe.mod.System
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMeshMixin extends js.Object {
  var primitives: ObjectMap[Entity[ObjectMap[Component[_, System[_]]]]] = js.native
  def getMeshMixin(): DefaultComponents = js.native
}

object GetMeshMixin {
  @scala.inline
  def apply(
    getMeshMixin: () => DefaultComponents,
    primitives: ObjectMap[Entity[ObjectMap[Component[_, System[_]]]]]
  ): GetMeshMixin = {
    val __obj = js.Dynamic.literal(getMeshMixin = js.Any.fromFunction0(getMeshMixin), primitives = primitives.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMeshMixin]
  }
  @scala.inline
  implicit class GetMeshMixinOps[Self <: GetMeshMixin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetMeshMixin(value: () => DefaultComponents): Self = {
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

