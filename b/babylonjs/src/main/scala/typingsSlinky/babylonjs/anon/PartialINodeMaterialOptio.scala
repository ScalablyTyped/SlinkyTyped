package typingsSlinky.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<babylonjs.BABYLON.INodeMaterialOptions> */
@js.native
trait PartialINodeMaterialOptio extends js.Object {
  var emitComments: js.UndefOr[Boolean] = js.native
}

object PartialINodeMaterialOptio {
  @scala.inline
  def apply(): PartialINodeMaterialOptio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialINodeMaterialOptio]
  }
  @scala.inline
  implicit class PartialINodeMaterialOptioOps[Self <: PartialINodeMaterialOptio] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmitComments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmitComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitComments")(js.undefined)
        ret
    }
  }
  
}

