package typingsSlinky.grommet.anon

import typingsSlinky.grommet.grommetStrings.all
import typingsSlinky.grommet.grommetStrings.bottom
import typingsSlinky.grommet.grommetStrings.horizontal
import typingsSlinky.grommet.grommetStrings.large
import typingsSlinky.grommet.grommetStrings.left
import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.right
import typingsSlinky.grommet.grommetStrings.small
import typingsSlinky.grommet.grommetStrings.top
import typingsSlinky.grommet.grommetStrings.vertical
import typingsSlinky.grommet.grommetStrings.xlarge
import typingsSlinky.grommet.grommetStrings.xsmall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Footer extends js.Object {
  var body: js.UndefOr[Boolean | top | left | bottom | right | horizontal | vertical | all | Side] = js.native
  var color: js.UndefOr[String | Light] = js.native
  var footer: js.UndefOr[Boolean | top | left | bottom | right | horizontal | vertical | all | Side] = js.native
  var header: js.UndefOr[Boolean | top | left | bottom | right | horizontal | vertical | all | Side] = js.native
  var side: js.UndefOr[top | left | bottom | right | horizontal | vertical | all] = js.native
  var size: js.UndefOr[xsmall | small | medium | large | xlarge | String] = js.native
}

object Footer {
  @scala.inline
  def apply(): Footer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Footer]
  }
  @scala.inline
  implicit class FooterOps[Self <: Footer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: Boolean | top | left | bottom | right | horizontal | vertical | all | Side): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String | Light): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withFooter(value: Boolean | top | left | bottom | right | horizontal | vertical | all | Side): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: Boolean | top | left | bottom | right | horizontal | vertical | all | Side): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withSide(value: top | left | bottom | right | horizontal | vertical | all): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: xsmall | small | medium | large | xlarge | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

