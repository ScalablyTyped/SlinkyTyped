package typingsSlinky.parse5SaxParser.mod

import typingsSlinky.parse5.mod.Attribute
import typingsSlinky.parse5.mod.StartTagLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartTagToken extends js.Object {
  /**
    * List of attributes.
    */
  var attrs: js.Array[Attribute] = js.native
  /**
    * Indicates if the tag is self-closing.
    */
  var selfClosing: Boolean = js.native
  /**
    * Start tag source code location info. Available if location info is enabled via {@link SAXParserOptions}.
    */
  var sourceCodeLocation: js.UndefOr[StartTagLocation] = js.native
  /**
    * Tag name.
    */
  var tagName: String = js.native
}

object StartTagToken {
  @scala.inline
  def apply(attrs: js.Array[Attribute], selfClosing: Boolean, tagName: String): StartTagToken = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTagToken]
  }
  @scala.inline
  implicit class StartTagTokenOps[Self <: StartTagToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttrs(value: js.Array[Attribute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelfClosing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfClosing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTagName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceCodeLocation(value: StartTagLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCodeLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceCodeLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCodeLocation")(js.undefined)
        ret
    }
  }
  
}

