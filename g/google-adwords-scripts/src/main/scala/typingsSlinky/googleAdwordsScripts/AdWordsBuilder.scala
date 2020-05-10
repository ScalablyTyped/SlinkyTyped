package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdWordsBuilder[E] extends js.Object {
  def build(): AdWordsOperation[E] = js.native
}

object AdWordsBuilder {
  @scala.inline
  def apply[E](build: () => AdWordsOperation[E]): AdWordsBuilder[E] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build))
    __obj.asInstanceOf[AdWordsBuilder[E]]
  }
  @scala.inline
  implicit class AdWordsBuilderOps[Self[e] <: AdWordsBuilder[e], E] (val x: Self[E]) extends AnyVal {
    @scala.inline
    def duplicate: Self[E] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[E]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[E] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[E] with Other]
    @scala.inline
    def withBuild(value: () => AdWordsOperation[E]): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

