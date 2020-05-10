package typingsSlinky.htmlWebpackPlugin.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HtmlTagObject extends js.Object {
  /**
  	 * Attributes of the html tag
  	 * E.g. `{'disabled': true, 'value': 'demo'}`
  	 */
  var attributes: StringDictionary[String | Boolean] = js.native
  /**
  	 * Inner HTML The
  	 */
  var innerHTML: js.UndefOr[String] = js.native
  /**
  	 * The tag name e.g. `'div'`
  	 */
  var tagName: String = js.native
  /**
  	 * Wether this html must not contain innerHTML
  	 * @see https://www.w3.org/TR/html5/syntax.html#void-elements
  	 */
  var voidTag: Boolean = js.native
}

object HtmlTagObject {
  @scala.inline
  def apply(attributes: StringDictionary[String | Boolean], tagName: String, voidTag: Boolean): HtmlTagObject = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], voidTag = voidTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlTagObject]
  }
  @scala.inline
  implicit class HtmlTagObjectOps[Self <: HtmlTagObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: StringDictionary[String | Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTagName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVoidTag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voidTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerHTML(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerHTML")(js.undefined)
        ret
    }
  }
  
}

