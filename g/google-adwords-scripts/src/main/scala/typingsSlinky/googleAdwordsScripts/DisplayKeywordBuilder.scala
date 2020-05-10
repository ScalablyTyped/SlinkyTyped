package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisplayKeywordBuilder[DisplayKeyword] extends DisplayBuilder[DisplayKeywordBuilder[DisplayKeyword]] {
  def withText(text: String): DisplayKeywordBuilder[DisplayKeyword] = js.native
}

object DisplayKeywordBuilder {
  @scala.inline
  def apply[DisplayKeyword](
    build: () => AdWordsOperation[DisplayKeywordBuilder[DisplayKeyword]],
    exclude: () => AdWordsOperation[DisplayKeywordBuilder[DisplayKeyword]],
    withCpc: Double => DisplayKeywordBuilder[DisplayKeyword],
    withCpm: Double => DisplayKeywordBuilder[DisplayKeyword],
    withText: String => DisplayKeywordBuilder[DisplayKeyword]
  ): DisplayKeywordBuilder[DisplayKeyword] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), exclude = js.Any.fromFunction0(exclude), withCpc = js.Any.fromFunction1(withCpc), withCpm = js.Any.fromFunction1(withCpm), withText = js.Any.fromFunction1(withText))
    __obj.asInstanceOf[DisplayKeywordBuilder[DisplayKeyword]]
  }
  @scala.inline
  implicit class DisplayKeywordBuilderOps[Self[displaykeyword] <: DisplayKeywordBuilder[displaykeyword], DisplayKeyword] (val x: Self[DisplayKeyword]) extends AnyVal {
    @scala.inline
    def duplicate: Self[DisplayKeyword] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[DisplayKeyword]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[DisplayKeyword] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[DisplayKeyword] with Other]
    @scala.inline
    def withWithText(value: String => DisplayKeywordBuilder[DisplayKeyword]): Self[DisplayKeyword] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withText")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

