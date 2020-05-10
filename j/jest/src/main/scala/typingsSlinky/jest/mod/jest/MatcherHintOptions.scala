package typingsSlinky.jest.mod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatcherHintOptions extends js.Object {
  var comment: js.UndefOr[String] = js.native
  var expectedColor: js.UndefOr[MatcherHintColor] = js.native
  var isDirectExpectCall: js.UndefOr[Boolean] = js.native
  var isNot: js.UndefOr[Boolean] = js.native
  var promise: js.UndefOr[String] = js.native
  var receivedColor: js.UndefOr[MatcherHintColor] = js.native
  var secondArgument: js.UndefOr[String] = js.native
  var secondArgumentColor: js.UndefOr[MatcherHintColor] = js.native
}

object MatcherHintOptions {
  @scala.inline
  def apply(): MatcherHintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatcherHintOptions]
  }
  @scala.inline
  implicit class MatcherHintOptionsOps[Self <: MatcherHintOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def withExpectedColor(value: /* arg */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExpectedColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedColor")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDirectExpectCall(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDirectExpectCall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDirectExpectCall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDirectExpectCall")(js.undefined)
        ret
    }
    @scala.inline
    def withIsNot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsNot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNot")(js.undefined)
        ret
    }
    @scala.inline
    def withPromise(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromise: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promise")(js.undefined)
        ret
    }
    @scala.inline
    def withReceivedColor(value: /* arg */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receivedColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReceivedColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receivedColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondArgument(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondArgument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondArgument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondArgument")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondArgumentColor(value: /* arg */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondArgumentColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSecondArgumentColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondArgumentColor")(js.undefined)
        ret
    }
  }
  
}

