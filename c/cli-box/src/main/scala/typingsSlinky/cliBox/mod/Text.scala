package typingsSlinky.cliBox.mod

import typingsSlinky.cliBox.cliBoxStrings.bottom
import typingsSlinky.cliBox.cliBoxStrings.center
import typingsSlinky.cliBox.cliBoxStrings.left
import typingsSlinky.cliBox.cliBoxStrings.middle
import typingsSlinky.cliBox.cliBoxStrings.right
import typingsSlinky.cliBox.cliBoxStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Text extends js.Object {
  var autoEOL: js.UndefOr[Boolean] = js.native
  var hAlign: js.UndefOr[left | middle | right] = js.native
  var stretch: js.UndefOr[Boolean] = js.native
  var text: js.UndefOr[String] = js.native
  var vAlign: js.UndefOr[top | center | bottom] = js.native
}

object Text {
  @scala.inline
  def apply(): Text = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Text]
  }
  @scala.inline
  implicit class TextOps[Self <: Text] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoEOL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoEOL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoEOL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoEOL")(js.undefined)
        ret
    }
    @scala.inline
    def withHAlign(value: left | middle | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withStretch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStretch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretch")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withVAlign(value: top | center | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vAlign")(js.undefined)
        ret
    }
  }
  
}

