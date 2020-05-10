package typingsSlinky.atom.statusBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tile extends js.Object {
  /** Remove the Tile from the status bar. */
  def destroy(): Unit = js.native
  /** Retrieve the Tile's item. */
  def getItem(): js.Object = js.native
  /** Retrieve the priority that was assigned to the Tile when it was created. */
  def getPriority(): Double = js.native
}

object Tile {
  @scala.inline
  def apply(destroy: () => Unit, getItem: () => js.Object, getPriority: () => Double): Tile = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getItem = js.Any.fromFunction0(getItem), getPriority = js.Any.fromFunction0(getPriority))
    __obj.asInstanceOf[Tile]
  }
  @scala.inline
  implicit class TileOps[Self <: Tile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetItem(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPriority(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPriority")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

