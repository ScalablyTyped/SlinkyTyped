package typingsSlinky.javascriptObfuscator.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiteralNodeMetadata extends BaseNodeMetadata {
  var replacedLiteral: js.UndefOr[Boolean] = js.native
}

object LiteralNodeMetadata {
  @scala.inline
  def apply(): LiteralNodeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiteralNodeMetadata]
  }
  @scala.inline
  implicit class LiteralNodeMetadataOps[Self <: LiteralNodeMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplacedLiteral(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacedLiteral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplacedLiteral: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacedLiteral")(js.undefined)
        ret
    }
  }
  
}

