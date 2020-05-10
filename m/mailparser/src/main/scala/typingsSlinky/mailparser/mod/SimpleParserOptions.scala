package typingsSlinky.mailparser.mod

import typingsSlinky.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleParserOptions extends TransformOptions {
  var keepCidLinks: js.UndefOr[Boolean] = js.native
}

object SimpleParserOptions {
  @scala.inline
  def apply(): SimpleParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleParserOptions]
  }
  @scala.inline
  implicit class SimpleParserOptionsOps[Self <: SimpleParserOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeepCidLinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepCidLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepCidLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepCidLinks")(js.undefined)
        ret
    }
  }
  
}

