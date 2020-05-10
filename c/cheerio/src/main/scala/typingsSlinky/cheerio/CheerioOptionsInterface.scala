package typingsSlinky.cheerio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheerioOptionsInterface extends js.Object {
  var _useHtmlParser2: js.UndefOr[Boolean] = js.native
  var decodeEntities: js.UndefOr[Boolean] = js.native
  var ignoreWhitespace: js.UndefOr[Boolean] = js.native
  var lowerCaseAttributeNames: js.UndefOr[Boolean] = js.native
  var lowerCaseTags: js.UndefOr[Boolean] = js.native
  var normalizeWhitespace: js.UndefOr[Boolean] = js.native
  var recognizeCDATA: js.UndefOr[Boolean] = js.native
  var recognizeSelfClosing: js.UndefOr[Boolean] = js.native
  var withEndIndices: js.UndefOr[Boolean] = js.native
  var withStartIndices: js.UndefOr[Boolean] = js.native
  // Document References
  // Cheerio https://github.com/cheeriojs/cheerio
  // HTMLParser2 https://github.com/fb55/htmlparser2/wiki/Parser-options
  // DomHandler https://github.com/fb55/DomHandler
  var xmlMode: js.UndefOr[Boolean] = js.native
}

object CheerioOptionsInterface {
  @scala.inline
  def apply(): CheerioOptionsInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheerioOptionsInterface]
  }
  @scala.inline
  implicit class CheerioOptionsInterfaceOps[Self <: CheerioOptionsInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_useHtmlParser2(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_useHtmlParser2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_useHtmlParser2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_useHtmlParser2")(js.undefined)
        ret
    }
    @scala.inline
    def withDecodeEntities(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeEntities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecodeEntities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeEntities")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreWhitespace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreWhitespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreWhitespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreWhitespace")(js.undefined)
        ret
    }
    @scala.inline
    def withLowerCaseAttributeNames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerCaseAttributeNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowerCaseAttributeNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerCaseAttributeNames")(js.undefined)
        ret
    }
    @scala.inline
    def withLowerCaseTags(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerCaseTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowerCaseTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerCaseTags")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalizeWhitespace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeWhitespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalizeWhitespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeWhitespace")(js.undefined)
        ret
    }
    @scala.inline
    def withRecognizeCDATA(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recognizeCDATA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecognizeCDATA: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recognizeCDATA")(js.undefined)
        ret
    }
    @scala.inline
    def withRecognizeSelfClosing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recognizeSelfClosing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecognizeSelfClosing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recognizeSelfClosing")(js.undefined)
        ret
    }
    @scala.inline
    def withWithEndIndices(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withEndIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithEndIndices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withEndIndices")(js.undefined)
        ret
    }
    @scala.inline
    def withWithStartIndices(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withStartIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithStartIndices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withStartIndices")(js.undefined)
        ret
    }
    @scala.inline
    def withXmlMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXmlMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlMode")(js.undefined)
        ret
    }
  }
  
}

