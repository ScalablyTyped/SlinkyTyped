package typingsSlinky.htmlToText.mod

import typingsSlinky.htmlToText.AnonForceWrapOnLimit
import typingsSlinky.htmlToText.AnonIsAttributeValue
import typingsSlinky.htmlToText.htmlToTextBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HtmlToTextOptions extends js.Object {
  /**
    * defines the tags whose text content will be captured from the html.
    * All content will be captured below the baseElement tags and added to the
    * resulting text output. This option allows the user to specify an array
    * of elements as base elements using a single tag with css class and id
    * parameters e.g. `[p.class1.class2#id1#id2, p.class1.class2#id1#id2]`.
    * Default: `"body"`
    */
  var baseElement: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * defines the text decoding options given to `he.decode`
    * For more information see the [he](https://github.com/mathiasbynens/he) module
    */
  var decodeOptions: js.UndefOr[AnonIsAttributeValue] = js.native
  /**
    * Customize the formatting of individual element types.
    */
  var format: js.UndefOr[Formatters] = js.native
  /**
    *  By default links are translated the following
    *      <a href='link'>text</a> => becomes => text [link].
    *  If this option is set to true and link and text are the same,
    *  [link] will be hidden and only text visible.
    */
  var hideLinkHrefIfSameAsText: js.UndefOr[Boolean] = js.native
  /**
    *  Ignore all document links if true.
    */
  var ignoreHref: js.UndefOr[Boolean] = js.native
  /**
    *  Ignore all document images if true.
    */
  var ignoreImage: js.UndefOr[Boolean] = js.native
  /**
    *  Allows you to specify the server host for href attributes, where the links start at the root (/).
    *  For example, linkHrefBaseUrl = 'http://asdf.com' and <a href='/dir/subdir'>...</a>
    *  the link in the text will be http://asdf.com/dir/subdir.
    *  Keep in mind that linkHrefBaseUrl shouldn't end with a /.
    */
  var linkHrefBaseUrl: js.UndefOr[String] = js.native
  /**
    * describes how to wrap long words
    */
  var longWordSplit: js.UndefOr[AnonForceWrapOnLimit] = js.native
  /**
    *  Dont print brackets around the link if true
    */
  var noLinkBrackets: js.UndefOr[Boolean] = js.native
  /**
    *  By default, any newlines \n in a block of text will be removed.
    *  If true, these newlines will not be removed.
    */
  var preserveNewlines: js.UndefOr[Boolean] = js.native
  /**
    * convert the entire document if we don't find the tag we're looking for
    * if true
    */
  var returnDomByDefault: js.UndefOr[Boolean] = js.native
  /**
    *  By default, paragraphs are converted with two newlines (\n\n).
    *  Set to true to convert to a single newline.
    */
  var singleNewLineParagraphs: js.UndefOr[Boolean] = js.native
  /**
    *  Allows to select certain tables by the class or id attribute from the HTML
    *  document. This is necessary because the majority of HTML E-Mails uses a
    *  table based layout. Prefix your table selectors with an . for the class
    *  and with a # for the id attribute. All other tables are ignored.
    *  You can assign true to this attribute to select all tables. Default: []
    */
  var tables: js.UndefOr[js.Array[String] | Boolean] = js.native
  /**
    * defines the string that is used as item prefix for unordered lists `<ol>`.
    * Default: ' * '
    */
  var unorderedListItemPrefix: js.UndefOr[String] = js.native
  /**
    *  By default, headings (<h1>, <h2>, etc) are upper-cased.
    *  Set to false to leave headings as they are.
    */
  var uppercaseHeadings: js.UndefOr[Boolean] = js.native
  /**
    * Defines after how many chars a line break should follow in p elements.
    * Set to null or false to disable word-wrapping. Default: 80
    */
  var wordwrap: js.UndefOr[Double | `false` | Null] = js.native
}

object HtmlToTextOptions {
  @scala.inline
  def apply(): HtmlToTextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HtmlToTextOptions]
  }
  @scala.inline
  implicit class HtmlToTextOptionsOps[Self <: HtmlToTextOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseElement(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseElement")(js.undefined)
        ret
    }
    @scala.inline
    def withDecodeOptions(value: AnonIsAttributeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecodeOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: Formatters): Self = {
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
    def withHideLinkHrefIfSameAsText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideLinkHrefIfSameAsText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideLinkHrefIfSameAsText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideLinkHrefIfSameAsText")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreHref(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreHref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreHref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreHref")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreImage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreImage")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkHrefBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkHrefBaseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkHrefBaseUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkHrefBaseUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withLongWordSplit(value: AnonForceWrapOnLimit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longWordSplit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongWordSplit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longWordSplit")(js.undefined)
        ret
    }
    @scala.inline
    def withNoLinkBrackets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noLinkBrackets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoLinkBrackets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noLinkBrackets")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveNewlines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveNewlines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveNewlines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveNewlines")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnDomByDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnDomByDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnDomByDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnDomByDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleNewLineParagraphs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleNewLineParagraphs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleNewLineParagraphs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleNewLineParagraphs")(js.undefined)
        ret
    }
    @scala.inline
    def withTables(value: js.Array[String] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tables")(js.undefined)
        ret
    }
    @scala.inline
    def withUnorderedListItemPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unorderedListItemPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnorderedListItemPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unorderedListItemPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withUppercaseHeadings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uppercaseHeadings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUppercaseHeadings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uppercaseHeadings")(js.undefined)
        ret
    }
    @scala.inline
    def withWordwrap(value: Double | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordwrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWordwrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordwrap")(js.undefined)
        ret
    }
    @scala.inline
    def withWordwrapNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordwrap")(null)
        ret
    }
  }
  
}

