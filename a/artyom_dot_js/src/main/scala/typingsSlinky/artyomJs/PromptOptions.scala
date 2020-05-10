package typingsSlinky.artyomJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromptOptions extends js.Object {
  var beforePrompt: js.UndefOr[js.Function] = js.native
  var onEndPrompt: js.UndefOr[js.Function] = js.native
  var onMatch: js.UndefOr[js.Function] = js.native
  var onStartPrompt: js.UndefOr[js.Function] = js.native
  var options: js.Any = js.native
  var question: String = js.native
  var smart: js.UndefOr[Boolean] = js.native
}

object PromptOptions {
  @scala.inline
  def apply(options: js.Any, question: String): PromptOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptOptions]
  }
  @scala.inline
  implicit class PromptOptionsOps[Self <: PromptOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuestion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("question")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforePrompt(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforePrompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforePrompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforePrompt")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEndPrompt(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEndPrompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnEndPrompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEndPrompt")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMatch(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStartPrompt(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartPrompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnStartPrompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartPrompt")(js.undefined)
        ret
    }
    @scala.inline
    def withSmart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smart")(js.undefined)
        ret
    }
  }
  
}

