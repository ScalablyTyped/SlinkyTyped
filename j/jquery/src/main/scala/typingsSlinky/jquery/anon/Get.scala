package typingsSlinky.jquery.anon

import typingsSlinky.jquery.JQuery.PropHook
import typingsSlinky.jquery.JQuery.Tween
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Get[TElement] extends PropHook[TElement] {
  /**
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tween-hooks }\`
    * @since 1.8
    */
  def get(tween: Tween[TElement]): js.Any = js.native
}

object Get {
  @scala.inline
  def apply[TElement](get: Tween[TElement] => js.Any): Get[TElement] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[Get[TElement]]
  }
  @scala.inline
  implicit class GetOps[Self[telement] <: Get[telement], TElement] (val x: Self[TElement]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TElement] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TElement]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TElement] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TElement] with Other]
    @scala.inline
    def withGet(value: Tween[TElement] => js.Any): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

