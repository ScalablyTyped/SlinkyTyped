package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.TSTypeParameterInstantiationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSHasOptionalTypeParameterInstantiation extends js.Object {
  var typeParameters: TSTypeParameterInstantiationKind | Null = js.native
}

object TSHasOptionalTypeParameterInstantiation {
  @scala.inline
  def apply(): TSHasOptionalTypeParameterInstantiation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TSHasOptionalTypeParameterInstantiation]
  }
  @scala.inline
  implicit class TSHasOptionalTypeParameterInstantiationOps[Self <: TSHasOptionalTypeParameterInstantiation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTypeParameters(value: TSTypeParameterInstantiationKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeParametersNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeParameters")(null)
        ret
    }
  }
  
}

