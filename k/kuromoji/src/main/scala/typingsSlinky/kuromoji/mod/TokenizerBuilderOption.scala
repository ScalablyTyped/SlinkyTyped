package typingsSlinky.kuromoji.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenizerBuilderOption extends js.Object {
  var dicPath: js.UndefOr[String] = js.native
}

object TokenizerBuilderOption {
  @scala.inline
  def apply(): TokenizerBuilderOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenizerBuilderOption]
  }
  @scala.inline
  implicit class TokenizerBuilderOptionOps[Self <: TokenizerBuilderOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDicPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dicPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDicPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dicPath")(js.undefined)
        ret
    }
  }
  
}

