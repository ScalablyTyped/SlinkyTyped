package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Actions extends js.Object {
  var actions: Nullable[_] = js.native
  var freezeWorldMatrix: Nullable[Boolean] = js.native
  var lods: Nullable[_] = js.native
}

object Actions {
  @scala.inline
  def apply(): Actions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Actions]
  }
  @scala.inline
  implicit class ActionsOps[Self <: Actions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: Nullable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(null)
        ret
    }
    @scala.inline
    def withFreezeWorldMatrix(value: Nullable[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freezeWorldMatrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFreezeWorldMatrixNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freezeWorldMatrix")(null)
        ret
    }
    @scala.inline
    def withLods(value: Nullable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLodsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lods")(null)
        ret
    }
  }
  
}

