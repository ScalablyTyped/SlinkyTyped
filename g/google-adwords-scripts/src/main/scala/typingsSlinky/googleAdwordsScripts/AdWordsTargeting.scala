package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdWordsTargeting[A, E] extends js.Object {
  def audiences(): AdWordsSelector[A] = js.native
  def exculdedAudiences(): AdWordsSelector[E] = js.native
}

object AdWordsTargeting {
  @scala.inline
  def apply[A, E](audiences: () => AdWordsSelector[A], exculdedAudiences: () => AdWordsSelector[E]): AdWordsTargeting[A, E] = {
    val __obj = js.Dynamic.literal(audiences = js.Any.fromFunction0(audiences), exculdedAudiences = js.Any.fromFunction0(exculdedAudiences))
    __obj.asInstanceOf[AdWordsTargeting[A, E]]
  }
  @scala.inline
  implicit class AdWordsTargetingOps[Self[a, e] <: AdWordsTargeting[a, e], A, E] (val x: Self[A, E]) extends AnyVal {
    @scala.inline
    def duplicate: Self[A, E] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[A, E]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[A, E]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[A, E]) with Other]
    @scala.inline
    def withAudiences(value: () => AdWordsSelector[A]): Self[A, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audiences")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExculdedAudiences(value: () => AdWordsSelector[E]): Self[A, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exculdedAudiences")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

