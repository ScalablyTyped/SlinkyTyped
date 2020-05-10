package typingsSlinky.d3Delaunay.mod.Delaunay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for the closePath() method of the CanvasPathMethods API.
  */
@js.native
trait ClosableContext extends js.Object {
  /**
    * closePath() method of the CanvasPathMethods API.
    */
  def closePath(): Unit = js.native
}

object ClosableContext {
  @scala.inline
  def apply(closePath: () => Unit): ClosableContext = {
    val __obj = js.Dynamic.literal(closePath = js.Any.fromFunction0(closePath))
    __obj.asInstanceOf[ClosableContext]
  }
  @scala.inline
  implicit class ClosableContextOps[Self <: ClosableContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClosePath(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closePath")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

