package typingsSlinky.openjscad.CSG.Polygon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shared extends js.Object {
  var color: js.Any = js.native
  var tag: js.Any = js.native
  def getHash(): js.Any = js.native
  def getTag(): js.Any = js.native
}

object Shared {
  @scala.inline
  def apply(color: js.Any, getHash: () => js.Any, getTag: () => js.Any, tag: js.Any): Shared = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], getHash = js.Any.fromFunction0(getHash), getTag = js.Any.fromFunction0(getTag), tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shared]
  }
  @scala.inline
  implicit class SharedOps[Self <: Shared] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetHash(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHash")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTag(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTag")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTag(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

