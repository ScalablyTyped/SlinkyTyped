package typingsSlinky.mapsjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Idx extends js.Object {
  var idx: Double = js.native
  var setIdx: Double = js.native
}

object Idx {
  @scala.inline
  def apply(idx: Double, setIdx: Double): Idx = {
    val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], setIdx = setIdx.asInstanceOf[js.Any])
    __obj.asInstanceOf[Idx]
  }
  @scala.inline
  implicit class IdxOps[Self <: Idx] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetIdx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIdx")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

