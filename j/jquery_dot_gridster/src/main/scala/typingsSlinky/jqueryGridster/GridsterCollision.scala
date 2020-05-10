package typingsSlinky.jqueryGridster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridsterCollision extends js.Object {
  def on_overlap(data: GridsterCollisionData): Unit = js.native
  def on_overlap_start(data: GridsterCollisionData): Unit = js.native
  def on_overlap_stop(data: GridsterCollisionData): Unit = js.native
}

object GridsterCollision {
  @scala.inline
  def apply(
    on_overlap: GridsterCollisionData => Unit,
    on_overlap_start: GridsterCollisionData => Unit,
    on_overlap_stop: GridsterCollisionData => Unit
  ): GridsterCollision = {
    val __obj = js.Dynamic.literal(on_overlap = js.Any.fromFunction1(on_overlap), on_overlap_start = js.Any.fromFunction1(on_overlap_start), on_overlap_stop = js.Any.fromFunction1(on_overlap_stop))
    __obj.asInstanceOf[GridsterCollision]
  }
  @scala.inline
  implicit class GridsterCollisionOps[Self <: GridsterCollision] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOn_overlap(value: GridsterCollisionData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_overlap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOn_overlap_start(value: GridsterCollisionData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_overlap_start")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOn_overlap_stop(value: GridsterCollisionData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_overlap_stop")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

