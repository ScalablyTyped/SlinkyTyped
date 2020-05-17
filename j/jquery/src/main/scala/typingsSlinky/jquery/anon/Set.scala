package typingsSlinky.jquery.anon

import typingsSlinky.jquery.JQuery.PropHook
import typingsSlinky.jquery.JQuery.Tween
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Set[TElement] extends PropHook[TElement] {
  /**
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tween-hooks }\`
    * @since 1.8
    */
  def set(tween: Tween[TElement]): Unit = js.native
}

object Set {
  @scala.inline
  def apply[TElement](set: Tween[TElement] => Unit): Set[TElement] = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[Set[TElement]]
  }
  @scala.inline
  implicit class SetOps[Self[telement] <: Set[telement], TElement] (val x: Self[TElement]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TElement] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TElement]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TElement] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TElement] with Other]
    @scala.inline
    def withSet(value: Tween[TElement] => Unit): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

