package typingsSlinky.javascriptObfuscator.estreeMod

import typingsSlinky.javascriptObfuscator.mod.XVerbatimProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegExpLiteral extends BaseNode {
  @JSName("metadata")
  var metadata_RegExpLiteral: js.UndefOr[LiteralNodeMetadata] = js.native
  var `x-verbatim-property`: js.UndefOr[XVerbatimProperty] = js.native
}

object RegExpLiteral {
  @scala.inline
  def apply(): RegExpLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegExpLiteral]
  }
  @scala.inline
  implicit class RegExpLiteralOps[Self <: RegExpLiteral] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetadata(value: LiteralNodeMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def `withX-verbatim-property`(value: XVerbatimProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-verbatim-property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutX-verbatim-property`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-verbatim-property")(js.undefined)
        ret
    }
  }
  
}

