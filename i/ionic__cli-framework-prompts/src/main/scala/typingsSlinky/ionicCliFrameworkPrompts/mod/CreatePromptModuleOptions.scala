package typingsSlinky.ionicCliFrameworkPrompts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePromptModuleOptions extends js.Object {
  val interactive: js.UndefOr[Boolean] = js.native
  val onFallback: js.UndefOr[js.Function1[/* question */ PromptQuestion, PromptValue | Unit]] = js.native
}

object CreatePromptModuleOptions {
  @scala.inline
  def apply(): CreatePromptModuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePromptModuleOptions]
  }
  @scala.inline
  implicit class CreatePromptModuleOptionsOps[Self <: CreatePromptModuleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInteractive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactive")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFallback(value: /* question */ PromptQuestion => PromptValue | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFallback")(js.undefined)
        ret
    }
  }
  
}

