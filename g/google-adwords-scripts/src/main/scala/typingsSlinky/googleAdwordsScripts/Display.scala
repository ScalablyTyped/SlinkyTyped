package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Display extends js.Object {
  def audiences(): AdWordsSelector[Audience] = js.native
  def keywords(): AdWordsSelector[DisplayKeyword] = js.native
  def placements(): AdWordsSelector[Placement] = js.native
  def topics(): AdWordsSelector[Topic] = js.native
}

object Display {
  @scala.inline
  def apply(
    audiences: () => AdWordsSelector[Audience],
    keywords: () => AdWordsSelector[DisplayKeyword],
    placements: () => AdWordsSelector[Placement],
    topics: () => AdWordsSelector[Topic]
  ): Display = {
    val __obj = js.Dynamic.literal(audiences = js.Any.fromFunction0(audiences), keywords = js.Any.fromFunction0(keywords), placements = js.Any.fromFunction0(placements), topics = js.Any.fromFunction0(topics))
    __obj.asInstanceOf[Display]
  }
  @scala.inline
  implicit class DisplayOps[Self <: Display] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudiences(value: () => AdWordsSelector[Audience]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audiences")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withKeywords(value: () => AdWordsSelector[DisplayKeyword]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPlacements(value: () => AdWordsSelector[Placement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placements")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTopics(value: () => AdWordsSelector[Topic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topics")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

