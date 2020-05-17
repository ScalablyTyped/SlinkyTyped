package typingsSlinky.d3pie.anon

import typingsSlinky.d3pie.d3pieStrings.caption
import typingsSlinky.d3pie.d3pieStrings.placeholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaceholderParser extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.native
  var placeholderParser: js.UndefOr[js.Function2[/* index */ Double, /* data */ Percentage, Unit]] = js.native
  var string: js.UndefOr[String] = js.native
  var styles: js.UndefOr[BackgroundColor] = js.native
  var `type`: js.UndefOr[placeholder | caption] = js.native
}

object PlaceholderParser {
  @scala.inline
  def apply(): PlaceholderParser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaceholderParser]
  }
  @scala.inline
  implicit class PlaceholderParserOps[Self <: PlaceholderParser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholderParser(value: (/* index */ Double, /* data */ Percentage) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderParser")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPlaceholderParser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderParser")(js.undefined)
        ret
    }
    @scala.inline
    def withString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(js.undefined)
        ret
    }
    @scala.inline
    def withStyles(value: BackgroundColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: placeholder | caption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

