package typingsSlinky.sanitizeHtml.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.htmlparser2.mod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOptions extends js.Object {
  var allowIframeRelativeUrls: js.UndefOr[Boolean] = js.native
  var allowProtocolRelative: js.UndefOr[Boolean] = js.native
  var allowedAttributes: js.UndefOr[StringDictionary[js.Array[AllowedAttribute]] | Boolean] = js.native
  var allowedClasses: js.UndefOr[StringDictionary[js.Array[String]] | Boolean] = js.native
  var allowedIframeHostnames: js.UndefOr[js.Array[String]] = js.native
  var allowedSchemes: js.UndefOr[js.Array[String] | Boolean] = js.native
  var allowedSchemesAppliedToAttributes: js.UndefOr[js.Array[String]] = js.native
  var allowedSchemesByTag: js.UndefOr[StringDictionary[js.Array[String]] | Boolean] = js.native
  var allowedStyles: js.UndefOr[StringDictionary[StringDictionary[js.Array[js.RegExp]]]] = js.native
  var allowedTags: js.UndefOr[js.Array[String] | Boolean] = js.native
  var disallowedTagsMode: js.UndefOr[DisallowedTagsModes] = js.native
  var exclusiveFilter: js.UndefOr[js.Function1[/* frame */ IFrame, Boolean]] = js.native
  var nonTextTags: js.UndefOr[js.Array[String]] = js.native
  var parser: js.UndefOr[ParserOptions] = js.native
  var selfClosing: js.UndefOr[js.Array[String]] = js.native
  var textFilter: js.UndefOr[js.Function1[/* text */ String, String]] = js.native
  var transformTags: js.UndefOr[StringDictionary[String | Transformer]] = js.native
}

object IOptions {
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowIframeRelativeUrls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowIframeRelativeUrls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowIframeRelativeUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowIframeRelativeUrls")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowProtocolRelative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowProtocolRelative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowProtocolRelative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowProtocolRelative")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedAttributes(value: StringDictionary[js.Array[AllowedAttribute]] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedClasses(value: StringDictionary[js.Array[String]] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedClasses")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedIframeHostnames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedIframeHostnames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedIframeHostnames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedIframeHostnames")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedSchemes(value: js.Array[String] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedSchemes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedSchemes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedSchemes")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedSchemesAppliedToAttributes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedSchemesAppliedToAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedSchemesAppliedToAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedSchemesAppliedToAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedSchemesByTag(value: StringDictionary[js.Array[String]] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedSchemesByTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedSchemesByTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedSchemesByTag")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedStyles(value: StringDictionary[StringDictionary[js.Array[js.RegExp]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedTags(value: js.Array[String] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedTags")(js.undefined)
        ret
    }
    @scala.inline
    def withDisallowedTagsMode(value: DisallowedTagsModes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disallowedTagsMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisallowedTagsMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disallowedTagsMode")(js.undefined)
        ret
    }
    @scala.inline
    def withExclusiveFilter(value: /* frame */ IFrame => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusiveFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExclusiveFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusiveFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withNonTextTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonTextTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonTextTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonTextTags")(js.undefined)
        ret
    }
    @scala.inline
    def withParser(value: ParserOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parser")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfClosing(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfClosing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfClosing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfClosing")(js.undefined)
        ret
    }
    @scala.inline
    def withTextFilter(value: /* text */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTextFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformTags(value: StringDictionary[String | Transformer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformTags")(js.undefined)
        ret
    }
  }
  
}

