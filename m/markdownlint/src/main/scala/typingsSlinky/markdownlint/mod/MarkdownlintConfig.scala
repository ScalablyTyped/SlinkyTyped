package typingsSlinky.markdownlint.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.markdownlint.anon.Allowdifferentnesting
import typingsSlinky.markdownlint.anon.Allowedelements
import typingsSlinky.markdownlint.anon.Brspaces
import typingsSlinky.markdownlint.anon.Codeblocks
import typingsSlinky.markdownlint.anon.Frontmattertitle
import typingsSlinky.markdownlint.anon.Headers
import typingsSlinky.markdownlint.anon.Indent
import typingsSlinky.markdownlint.anon.Level
import typingsSlinky.markdownlint.anon.Linesabove
import typingsSlinky.markdownlint.anon.Maximum
import typingsSlinky.markdownlint.anon.Names
import typingsSlinky.markdownlint.anon.Olmulti
import typingsSlinky.markdownlint.anon.Punctuation
import typingsSlinky.markdownlint.anon.Style
import typingsSlinky.markdownlint.anon.StyleString
import typingsSlinky.markdownlint.anon.`0`
import typingsSlinky.markdownlint.anon.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkdownlintConfig
  extends /* rule */ StringDictionary[js.UndefOr[String | Double | Boolean | StringDictionary[js.Any]]] {
  var `blanks-around-fences`: js.UndefOr[Boolean] = js.native
  var `blanks-around-headings`: js.UndefOr[Boolean | Linesabove] = js.native
  var `blanks-around-lists`: js.UndefOr[Boolean] = js.native
  var `blanks-around_headers`: js.UndefOr[Boolean | Linesabove] = js.native
  var `commands-show-output`: js.UndefOr[Boolean] = js.native
  /**
    * Default state for all rules.
    * @default true
    */
  var default: js.UndefOr[Boolean] = js.native
  var `fenced-code-language`: js.UndefOr[Boolean] = js.native
  /**
    * First heading should be a top level heading.
    * @deprecated
    * @see {"first-line-heading"}
    * @see {"first-line-h1"}
    */
  var `first-header-h1`: js.UndefOr[Boolean | Level] = js.native
  /**
    * First heading should be a top level heading.
    * @deprecated
    * @see {"first-line-heading"}
    * @see {"first-line-h1"}
    */
  var `first-heading-h1`: js.UndefOr[Boolean | Level] = js.native
  var `first-line-h1`: js.UndefOr[Frontmattertitle] = js.native
  var `first-line-heading`: js.UndefOr[Frontmattertitle] = js.native
  /**
    * Heading levels should only increment by one level at a time.
    *
    * This rule is triggered when you skip heading levels in a markdown document.
    */
  var `header-increment`: js.UndefOr[Boolean] = js.native
  var `header-start-left`: js.UndefOr[Boolean] = js.native
  /**
    * Heading style.
    * @default "consistent"
    */
  var `header-style`: js.UndefOr[Style] = js.native
  /**
    * Heading levels should only increment by one level at a time.
    *
    * This rule is triggered when you skip heading levels in a markdown document.
    */
  var `heading-increment`: js.UndefOr[Boolean] = js.native
  var `heading-start-left`: js.UndefOr[Boolean] = js.native
  /**
    * Heading style.
    * @default "consistent"
    */
  var `heading-style`: js.UndefOr[Style] = js.native
  var `hr-style`: js.UndefOr[StyleString] = js.native
  var `line-length`: js.UndefOr[Boolean | Headers] = js.native
  /**
    * Inconsistent indentation for list items at the same level
    */
  var `list-indent`: js.UndefOr[Boolean] = js.native
  var `list-marker-space`: js.UndefOr[Boolean | Olmulti] = js.native
  var `no-alt-text`: js.UndefOr[Boolean] = js.native
  var `no-bare-urls`: js.UndefOr[Boolean] = js.native
  var `no-blanks-blockquote`: js.UndefOr[Boolean] = js.native
  var `no-duplicate-header`: js.UndefOr[Boolean | Allowdifferentnesting] = js.native
  var `no-duplicate-heading`: js.UndefOr[Boolean | Allowdifferentnesting] = js.native
  var `no-emphasis-as-header`: js.UndefOr[Boolean | Punctuation] = js.native
  var `no-emphasis-as-heading`: js.UndefOr[Boolean | Punctuation] = js.native
  var `no-empty-links`: js.UndefOr[Boolean] = js.native
  var `no-hard-tabs`: js.UndefOr[Boolean | Codeblocks] = js.native
  var `no-inline-html`: js.UndefOr[Boolean | Allowedelements] = js.native
  var `no-missing-space-atx`: js.UndefOr[Boolean] = js.native
  var `no-missing-space-closed-atx`: js.UndefOr[Boolean] = js.native
  var `no-multiple-blanks`: js.UndefOr[Boolean | Maximum] = js.native
  var `no-multiple-space-atx`: js.UndefOr[Boolean] = js.native
  var `no-multiple-space-blockquote`: js.UndefOr[Boolean] = js.native
  var `no-multiple-space-closed-atx`: js.UndefOr[Boolean] = js.native
  var `no-reversed-links`: js.UndefOr[Boolean] = js.native
  var `no-space-in-code`: js.UndefOr[Boolean] = js.native
  var `no-space-in-emphasis`: js.UndefOr[Boolean] = js.native
  var `no-space-in-links`: js.UndefOr[Boolean] = js.native
  var `no-trailing-punctuation`: js.UndefOr[Boolean | Punctuation] = js.native
  var `no-trailing-spaces`: js.UndefOr[Boolean | Brspaces] = js.native
  var `ol-prefix`: js.UndefOr[Boolean | `1`] = js.native
  var `proper-names`: js.UndefOr[Names] = js.native
  var `required-headers`: js.UndefOr[js.Array[String]] = js.native
  var `required-headings`: js.UndefOr[js.Array[String]] = js.native
  var `single-h1`: js.UndefOr[Boolean | Frontmattertitle] = js.native
  var `single-title`: js.UndefOr[Boolean | Frontmattertitle] = js.native
  /**
    * This rule is triggered when list items are not indented by the configured number of spaces.
    * @default 2
    */
  var `ul-indent`: js.UndefOr[Boolean | Indent] = js.native
  /**
    * Consider starting bulleted lists at the beginning of the line.
    */
  var `ul-start-left`: js.UndefOr[Boolean] = js.native
  /**
    * This rule is triggered when the symbols used in the document for unordered list items do not match the configured unordered list style:
    *
    * ```md
    * * Item 1
    * + Item 2
    * - Item 3
    * ```
    *
    * @default "consistent"
    */
  var `ul-style`: js.UndefOr[`0`] = js.native
}

object MarkdownlintConfig {
  @scala.inline
  def apply(): MarkdownlintConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkdownlintConfig]
  }
  @scala.inline
  implicit class MarkdownlintConfigOps[Self <: MarkdownlintConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withBlanks-around-fences`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blanks-around-fences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBlanks-around-fences`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blanks-around-fences")(js.undefined)
        ret
    }
    @scala.inline
    def `withBlanks-around-headings`(value: Boolean | Linesabove): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blanks-around-headings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBlanks-around-headings`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blanks-around-headings")(js.undefined)
        ret
    }
    @scala.inline
    def `withBlanks-around-lists`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blanks-around-lists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBlanks-around-lists`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blanks-around-lists")(js.undefined)
        ret
    }
    @scala.inline
    def `withBlanks-around_headers`(value: Boolean | Linesabove): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blanks-around_headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBlanks-around_headers`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blanks-around_headers")(js.undefined)
        ret
    }
    @scala.inline
    def `withCommands-show-output`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands-show-output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCommands-show-output`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands-show-output")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def `withFenced-code-language`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fenced-code-language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFenced-code-language`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fenced-code-language")(js.undefined)
        ret
    }
    @scala.inline
    def `withFirst-header-h1`(value: Boolean | Level): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first-header-h1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFirst-header-h1`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first-header-h1")(js.undefined)
        ret
    }
    @scala.inline
    def `withFirst-heading-h1`(value: Boolean | Level): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first-heading-h1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFirst-heading-h1`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first-heading-h1")(js.undefined)
        ret
    }
    @scala.inline
    def `withFirst-line-h1`(value: Frontmattertitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first-line-h1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFirst-line-h1`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first-line-h1")(js.undefined)
        ret
    }
    @scala.inline
    def `withFirst-line-heading`(value: Frontmattertitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first-line-heading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFirst-line-heading`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first-line-heading")(js.undefined)
        ret
    }
    @scala.inline
    def `withHeader-increment`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header-increment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHeader-increment`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header-increment")(js.undefined)
        ret
    }
    @scala.inline
    def `withHeader-start-left`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header-start-left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHeader-start-left`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header-start-left")(js.undefined)
        ret
    }
    @scala.inline
    def `withHeader-style`(value: Style): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header-style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHeader-style`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header-style")(js.undefined)
        ret
    }
    @scala.inline
    def `withHeading-increment`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading-increment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHeading-increment`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading-increment")(js.undefined)
        ret
    }
    @scala.inline
    def `withHeading-start-left`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading-start-left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHeading-start-left`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading-start-left")(js.undefined)
        ret
    }
    @scala.inline
    def `withHeading-style`(value: Style): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading-style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHeading-style`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading-style")(js.undefined)
        ret
    }
    @scala.inline
    def `withHr-style`(value: StyleString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hr-style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHr-style`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hr-style")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-length`(value: Boolean | Headers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-length`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-length")(js.undefined)
        ret
    }
    @scala.inline
    def `withList-indent`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list-indent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutList-indent`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list-indent")(js.undefined)
        ret
    }
    @scala.inline
    def `withList-marker-space`(value: Boolean | Olmulti): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list-marker-space")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutList-marker-space`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list-marker-space")(js.undefined)
        ret
    }
    @scala.inline
    def `withNo-alt-text`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-alt-text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNo-alt-text`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-alt-text")(js.undefined)
        ret
    }
    @scala.inline
    def `withNo-bare-urls`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-bare-urls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNo-bare-urls`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-bare-urls")(js.undefined)
        ret
    }
    @scala.inline
    def `withNo-blanks-blockquote`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-blanks-blockquote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNo-blanks-blockquote`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-blanks-blockquote")(js.undefined)
        ret
    }
    @scala.inline
    def `withNo-duplicate-header`(value: Boolean | Allowdifferentnesting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-duplicate-header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNo-duplicate-header`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-duplicate-header")(js.undefined)
        ret
    }
    @scala.inline
    def `withNo-duplicate-heading`(value: Boolean | Allowdifferentnesting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-duplicate-heading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNo-duplicate-heading`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-duplicate-heading")(js.undefined)
        ret
    }
    @scala.inline
    def `withNo-emphasis-as-header`(value: Boolean | Punctuation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-emphasis-as-header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNo-emphasis-as-header`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-emphasis-as-header")(js.undefined)
        ret
    }
    @scala.inline
    def `withNo-emphasis-as-heading`(value: Boolean | Punctuation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-emphasis-as-heading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNo-emphasis-as-heading`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-emphasis-as-heading")(js.undefined)
        ret
    }
    @scala.inline
    def `withNo-empty-links`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-empty-links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNo-empty-links`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-empty-links")(js.undefined)
        ret
    }
    @scala.inline
    def `withNo-hard-tabs`(value: Boolean | Codeblocks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-hard-tabs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNo-hard-tabs`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-hard-tabs")(js.undefined)
        ret
    }
    @scala.inline
    def `withNo-inline-html`(value: Boolean | Allowedelements): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-inline-html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNo-inline-html`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-inline-html")(js.undefined)
        ret
    }
    @scala.inline
    def `withNo-missing-space-atx`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-missing-space-atx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNo-missing-space-atx`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-missing-space-atx")(js.undefined)
        ret
    }
    @scala.inline
    def `withNo-missing-space-closed-atx`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-missing-space-closed-atx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNo-missing-space-closed-atx`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-missing-space-closed-atx")(js.undefined)
        ret
    }
    @scala.inline
    def `withNo-multiple-blanks`(value: Boolean | Maximum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-multiple-blanks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNo-multiple-blanks`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-multiple-blanks")(js.undefined)
        ret
    }
    @scala.inline
    def `withNo-multiple-space-atx`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-multiple-space-atx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNo-multiple-space-atx`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-multiple-space-atx")(js.undefined)
        ret
    }
    @scala.inline
    def `withNo-multiple-space-blockquote`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-multiple-space-blockquote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNo-multiple-space-blockquote`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-multiple-space-blockquote")(js.undefined)
        ret
    }
    @scala.inline
    def `withNo-multiple-space-closed-atx`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-multiple-space-closed-atx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNo-multiple-space-closed-atx`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-multiple-space-closed-atx")(js.undefined)
        ret
    }
    @scala.inline
    def `withNo-reversed-links`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-reversed-links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNo-reversed-links`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-reversed-links")(js.undefined)
        ret
    }
    @scala.inline
    def `withNo-space-in-code`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-space-in-code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNo-space-in-code`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-space-in-code")(js.undefined)
        ret
    }
    @scala.inline
    def `withNo-space-in-emphasis`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-space-in-emphasis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNo-space-in-emphasis`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-space-in-emphasis")(js.undefined)
        ret
    }
    @scala.inline
    def `withNo-space-in-links`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-space-in-links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNo-space-in-links`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-space-in-links")(js.undefined)
        ret
    }
    @scala.inline
    def `withNo-trailing-punctuation`(value: Boolean | Punctuation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-trailing-punctuation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNo-trailing-punctuation`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-trailing-punctuation")(js.undefined)
        ret
    }
    @scala.inline
    def `withNo-trailing-spaces`(value: Boolean | Brspaces): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-trailing-spaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNo-trailing-spaces`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-trailing-spaces")(js.undefined)
        ret
    }
    @scala.inline
    def `withOl-prefix`(value: Boolean | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ol-prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOl-prefix`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ol-prefix")(js.undefined)
        ret
    }
    @scala.inline
    def `withProper-names`(value: Names): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proper-names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutProper-names`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proper-names")(js.undefined)
        ret
    }
    @scala.inline
    def `withRequired-headers`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required-headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutRequired-headers`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required-headers")(js.undefined)
        ret
    }
    @scala.inline
    def `withRequired-headings`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required-headings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutRequired-headings`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required-headings")(js.undefined)
        ret
    }
    @scala.inline
    def `withSingle-h1`(value: Boolean | Frontmattertitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("single-h1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSingle-h1`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("single-h1")(js.undefined)
        ret
    }
    @scala.inline
    def `withSingle-title`(value: Boolean | Frontmattertitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("single-title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSingle-title`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("single-title")(js.undefined)
        ret
    }
    @scala.inline
    def `withUl-indent`(value: Boolean | Indent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ul-indent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUl-indent`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ul-indent")(js.undefined)
        ret
    }
    @scala.inline
    def `withUl-start-left`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ul-start-left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUl-start-left`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ul-start-left")(js.undefined)
        ret
    }
    @scala.inline
    def `withUl-style`(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ul-style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUl-style`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ul-style")(js.undefined)
        ret
    }
  }
  
}

