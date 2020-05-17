package typingsSlinky.phantom.mod

import typingsSlinky.phantom.anon.Bottom
import typingsSlinky.phantom.anon.Contents
import typingsSlinky.phantom.phantomStrings.A3
import typingsSlinky.phantom.phantomStrings.A4
import typingsSlinky.phantom.phantomStrings.A5
import typingsSlinky.phantom.phantomStrings.Legal
import typingsSlinky.phantom.phantomStrings.Letter
import typingsSlinky.phantom.phantomStrings.Tabloid
import typingsSlinky.phantom.phantomStrings.landscape
import typingsSlinky.phantom.phantomStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPaperSizeOptions extends js.Object {
  var footer: js.UndefOr[Contents] = js.native
  var format: js.UndefOr[A3 | A4 | A5 | Legal | Letter | Tabloid] = js.native
  var header: js.UndefOr[Contents] = js.native
  var height: js.UndefOr[String] = js.native
  var margin: js.UndefOr[String | Bottom] = js.native
  var orientation: js.UndefOr[portrait | landscape] = js.native
  var width: js.UndefOr[String] = js.native
}

object IPaperSizeOptions {
  @scala.inline
  def apply(): IPaperSizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPaperSizeOptions]
  }
  @scala.inline
  implicit class IPaperSizeOptionsOps[Self <: IPaperSizeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFooter(value: Contents): Self = {
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
    def withFormat(value: A3 | A4 | A5 | Legal | Letter | Tabloid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: Contents): Self = {
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
    def withHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: String | Bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: portrait | landscape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

