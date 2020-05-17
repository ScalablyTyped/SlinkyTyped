package typingsSlinky.jsplumb.anon

import typingsSlinky.jsplumb.mod.ContinuousAnchorFace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Faces extends js.Object {
  var faces: js.UndefOr[js.Array[ContinuousAnchorFace]] = js.native
}

object Faces {
  @scala.inline
  def apply(): Faces = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Faces]
  }
  @scala.inline
  implicit class FacesOps[Self <: Faces] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFaces(value: js.Array[ContinuousAnchorFace]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faces")(js.undefined)
        ret
    }
  }
  
}

