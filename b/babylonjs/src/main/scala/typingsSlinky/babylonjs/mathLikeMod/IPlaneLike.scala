package typingsSlinky.babylonjs.mathLikeMod

import typingsSlinky.babylonjs.typesMod.float
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPlaneLike extends js.Object {
  var d: float = js.native
  var normal: IVector3Like = js.native
  def normalize(): Unit = js.native
}

object IPlaneLike {
  @scala.inline
  def apply(d: float, normal: IVector3Like, normalize: () => Unit): IPlaneLike = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], normalize = js.Any.fromFunction0(normalize))
    __obj.asInstanceOf[IPlaneLike]
  }
  @scala.inline
  implicit class IPlaneLikeOps[Self <: IPlaneLike] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withD(value: float): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormal(value: IVector3Like): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormalize(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

