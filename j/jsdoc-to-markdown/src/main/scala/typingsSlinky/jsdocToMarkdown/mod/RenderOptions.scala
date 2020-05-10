package typingsSlinky.jsdocToMarkdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderOptions extends js.Object {
  /**
    * Raw template data to use. Useful when you already have template data, obtained from .getTemplateData.
    * Either files, source or data must be supplied.
    */
  var data: js.UndefOr[js.Array[js.Object]] = js.native
  /**
    * Specifies the default language used in '@example' blocks (for syntax-highlighting purposes).
    * In gfm mode, each '@example' is wrapped in a fenced-code block. Example usage: --example-lang js.
    * Use the special value none for no specific language.
    * While using this option, you can override the supplied language
    * for any '@example' by specifying the @lang subtag,
    * e.g @example @lang hbs. Specifying @example @lang off will disable code blocks for that example.
    */
  var exampleLang: js.UndefOr[String] = js.native
  var globalIndexFormat: js.UndefOr[StyleListFormat] = js.native
  /**
    * The initial heading depth.
    * For example, with a value of 2 the top-level markdown headings look like "## The heading".
    */
  var headingDepth: js.UndefOr[Double] = js.native
  /**
    * handlebars helper files to override or extend the default set.
    */
  var helper: js.UndefOr[String | js.Array[String]] = js.native
  var memberIndexFormat: js.UndefOr[MemberIndexFormat] = js.native
  var moduleIndexFormat: js.UndefOr[StyleListFormat] = js.native
  /**
    * Format identifier names in the code style,
    * (i.e. format using backticks or <code></code>).
    */
  var nameFormat: js.UndefOr[String] = js.native
  /**
    * By default, dmd generates github-flavoured markdown.
    * Not all markdown parsers render gfm correctly.
    * If your generated docs look incorrect on sites other than Github
    * (e.g. npmjs.org) try enabling this option to disable Github-specific syntax.
    */
  var noGfm: js.UndefOr[Boolean] = js.native
  /**
    * Two options to render parameter lists: 'list' or 'table' (default).
    * Table format works well in most cases but switch to list if things begin to look crowded / squashed.
    */
  var paramListFormat: js.UndefOr[RenderListFormat] = js.native
  /**
    * handlebars partial files to override or extend the default set.
    */
  var partial: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Use an installed package containing helper and/or partial overrides.
    */
  var plugin: js.UndefOr[String | js.Array[String]] = js.native
  var propertyListFormat: js.UndefOr[RenderListFormat] = js.native
  /**
    * Put <hr> breaks between identifiers. Improves readability on bulky docs.
    */
  var seperators: js.UndefOr[Boolean] = js.native
  /**
    * The template the supplied documentation will be rendered into.
    * Use the default or supply your own template for full control over the output.
    */
  var template: js.UndefOr[String] = js.native
}

object RenderOptions {
  @scala.inline
  def apply(): RenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderOptions]
  }
  @scala.inline
  implicit class RenderOptionsOps[Self <: RenderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withExampleLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exampleLang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExampleLang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exampleLang")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalIndexFormat(value: StyleListFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalIndexFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalIndexFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalIndexFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadingDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headingDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadingDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headingDepth")(js.undefined)
        ret
    }
    @scala.inline
    def withHelper(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helper")(js.undefined)
        ret
    }
    @scala.inline
    def withMemberIndexFormat(value: MemberIndexFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberIndexFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemberIndexFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberIndexFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withModuleIndexFormat(value: StyleListFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleIndexFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModuleIndexFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleIndexFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withNameFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withNoGfm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noGfm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoGfm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noGfm")(js.undefined)
        ret
    }
    @scala.inline
    def withParamListFormat(value: RenderListFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramListFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParamListFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramListFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withPartial(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partial")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugin(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugin")(js.undefined)
        ret
    }
    @scala.inline
    def withPropertyListFormat(value: RenderListFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyListFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropertyListFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyListFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withSeperators(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seperators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeperators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seperators")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
  }
  
}

