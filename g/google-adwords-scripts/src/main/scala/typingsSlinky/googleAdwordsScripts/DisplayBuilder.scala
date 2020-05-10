package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Display
@js.native
trait DisplayBuilder[T] extends AdWordsBuilder[T] {
  def exclude(): AdWordsOperation[T] = js.native
  def withCpc(cpc: Double): T = js.native
  def withCpm(cpm: Double): T = js.native
}

object DisplayBuilder {
  @scala.inline
  def apply[T](
    build: () => AdWordsOperation[T],
    exclude: () => AdWordsOperation[T],
    withCpc: Double => T,
    withCpm: Double => T
  ): DisplayBuilder[T] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), exclude = js.Any.fromFunction0(exclude), withCpc = js.Any.fromFunction1(withCpc), withCpm = js.Any.fromFunction1(withCpm))
    __obj.asInstanceOf[DisplayBuilder[T]]
  }
  @scala.inline
  implicit class DisplayBuilderOps[Self[t] <: DisplayBuilder[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withExclude(value: () => AdWordsOperation[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWithCpc(value: Double => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCpc")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithCpm(value: Double => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCpm")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

