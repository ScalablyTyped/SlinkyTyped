package typingsSlinky.reactInfiniteCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistanceInWords extends js.Object {
  def distanceInWords(token: js.Any, count: js.Any, options: js.Any): js.Any = js.native
  def format(): js.Any = js.native
}

object DistanceInWords {
  @scala.inline
  def apply(distanceInWords: (js.Any, js.Any, js.Any) => js.Any, format: () => js.Any): DistanceInWords = {
    val __obj = js.Dynamic.literal(distanceInWords = js.Any.fromFunction3(distanceInWords), format = js.Any.fromFunction0(format))
    __obj.asInstanceOf[DistanceInWords]
  }
  @scala.inline
  implicit class DistanceInWordsOps[Self <: DistanceInWords] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistanceInWords(value: (js.Any, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceInWords")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withFormat(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

