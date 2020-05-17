package typingsSlinky.jointjs.mod.dia

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jointjs.mod.attributes.NativeSVGAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkupNodeJSON extends js.Object {
  var attributes: js.UndefOr[NativeSVGAttributes] = js.native
  var children: js.UndefOr[MarkupJSON] = js.native
  var className: js.UndefOr[String] = js.native
  var groupSelector: js.UndefOr[String] = js.native
  var namespaceUri: js.UndefOr[String] = js.native
  var selector: js.UndefOr[String] = js.native
  var style: js.UndefOr[StringDictionary[js.Any]] = js.native
  var tagName: String = js.native
  var textContent: js.UndefOr[String] = js.native
}

object MarkupNodeJSON {
  @scala.inline
  def apply(tagName: String): MarkupNodeJSON = {
    val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkupNodeJSON]
  }
  @scala.inline
  implicit class MarkupNodeJSONOps[Self <: MarkupNodeJSON] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTagName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributes(value: NativeSVGAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: MarkupJSON): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespaceUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespaceUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceUri")(js.undefined)
        ret
    }
    @scala.inline
    def withSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTextContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textContent")(js.undefined)
        ret
    }
  }
  
}

