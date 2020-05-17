package typingsSlinky.cypress.anon

import typingsSlinky.cypress.JQuery.SpeedSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Complete[TElement] extends SpeedSettings[TElement] {
  /**
    * A function to call once the animation is complete.
    */
  def complete(): Unit = js.native
}

object Complete {
  @scala.inline
  def apply[TElement](complete: () => Unit): Complete[TElement] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[Complete[TElement]]
  }
  @scala.inline
  implicit class CompleteOps[Self[telement] <: Complete[telement], TElement] (val x: Self[TElement]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TElement] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TElement]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TElement] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TElement] with Other]
    @scala.inline
    def withComplete(value: () => Unit): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

