package typingsSlinky.parse5SaxParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SAXParserOptions extends js.Object {
  /**
    * Enables source code location information for the tokens.
    * When enabled, each token event handler will receive {@link Location} (or {@link StartTagLocation})
    * object as its last argument.
    */
  var sourceCodeLocationInfo: js.UndefOr[Boolean] = js.native
}

object SAXParserOptions {
  @scala.inline
  def apply(): SAXParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SAXParserOptions]
  }
  @scala.inline
  implicit class SAXParserOptionsOps[Self <: SAXParserOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceCodeLocationInfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCodeLocationInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceCodeLocationInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCodeLocationInfo")(js.undefined)
        ret
    }
  }
  
}

