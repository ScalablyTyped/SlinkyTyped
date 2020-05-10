package typingsSlinky.jquery

import typingsSlinky.jquery.JQuery_.Tween
import typingsSlinky.jquery.JQuery_._PropHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSet[TElement] extends _PropHook[TElement] {
  /**
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tween-hooks }\`
    * @since 1.8
    */
  def set(tween: Tween[TElement]): Unit = js.native
}

object AnonSet {
  @scala.inline
  def apply[TElement](set: Tween[TElement] => Unit): AnonSet[TElement] = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[AnonSet[TElement]]
  }
  @scala.inline
  implicit class AnonSetOps[Self[telement] <: AnonSet[telement], TElement] (val x: Self[TElement]) extends AnyVal {
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

