package typingsSlinky.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.SkinInstance
  * @classdesc A skin instance is responsible for generating the matrix palette that is used to
  * skin vertices from object space to world space.
  * @param {pc.Skin} skin - The skin that will provide the inverse bind pose matrices to
  * generate the final matrix palette.
  * @property {pc.GraphNode[]} bones An array of nodes representing each bone in this skin instance.
  */
@js.native
trait SkinInstance extends js.Object {
  /**
    * An array of nodes representing each bone in this skin instance.
    */
  var bones: js.Array[GraphNode] = js.native
}

object SkinInstance {
  @scala.inline
  def apply(bones: js.Array[GraphNode]): SkinInstance = {
    val __obj = js.Dynamic.literal(bones = bones.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkinInstance]
  }
  @scala.inline
  implicit class SkinInstanceOps[Self <: SkinInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBones(value: js.Array[GraphNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bones")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

