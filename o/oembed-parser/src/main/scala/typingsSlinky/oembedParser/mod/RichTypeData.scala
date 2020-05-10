package typingsSlinky.oembedParser.mod

import typingsSlinky.oembedParser.oembedParserStrings.rich
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RichTypeData extends OembedData {
  /** The height in pixels required to display the HTML. */
  var height: Double = js.native
  /**
    * The HTML required to display the resource.
    * The HTML should have no padding or margins.
    * Consumers may wish to load the HTML in an off-domain iframe to avoid XSS vulnerabilities.
    * The markup should be valid XHTML 1.0 Basic.
    */
  var html: String = js.native
  @JSName("type")
  val type_RichTypeData: rich = js.native
  /** The width in pixels required to display the HTML. */
  var width: Double = js.native
}

object RichTypeData {
  @scala.inline
  def apply(height: Double, html: String, `type`: rich, version: String, width: Double): RichTypeData = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RichTypeData]
  }
  @scala.inline
  implicit class RichTypeDataOps[Self <: RichTypeData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: rich): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

