package typingsSlinky.commonErrors.anon

import typingsSlinky.commonErrors.mod.Error
import typingsSlinky.commonErrors.mod.GenerateMessageMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Args extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.native
  var `extends`: js.UndefOr[Error] = js.native
  var generateMessage: js.UndefOr[GenerateMessageMethod] = js.native
  var globalize: js.UndefOr[Boolean] = js.native
}

object Args {
  @scala.inline
  def apply(): Args = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Args]
  }
  @scala.inline
  implicit class ArgsOps[Self <: Args] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withExtends(value: Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtends: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extends")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerateMessage(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateMessage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGenerateMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalize")(js.undefined)
        ret
    }
  }
  
}

