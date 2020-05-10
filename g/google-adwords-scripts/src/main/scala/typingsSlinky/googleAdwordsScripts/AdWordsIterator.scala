package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdWordsIterator[E] extends js.Object {
  def hasNext(): Boolean = js.native
  def next(): E = js.native
  def totalNumEntities(): Double = js.native
}

object AdWordsIterator {
  @scala.inline
  def apply[E](hasNext: () => Boolean, next: () => E, totalNumEntities: () => Double): AdWordsIterator[E] = {
    val __obj = js.Dynamic.literal(hasNext = js.Any.fromFunction0(hasNext), next = js.Any.fromFunction0(next), totalNumEntities = js.Any.fromFunction0(totalNumEntities))
    __obj.asInstanceOf[AdWordsIterator[E]]
  }
  @scala.inline
  implicit class AdWordsIteratorOps[Self[e] <: AdWordsIterator[e], E] (val x: Self[E]) extends AnyVal {
    @scala.inline
    def duplicate: Self[E] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[E]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[E] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[E] with Other]
    @scala.inline
    def withHasNext(value: () => Boolean): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasNext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNext(value: () => E): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTotalNumEntities(value: () => Double): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalNumEntities")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

