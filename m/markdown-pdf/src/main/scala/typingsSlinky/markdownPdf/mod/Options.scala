package typingsSlinky.markdownPdf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Configuration options */
@js.native
trait Options extends js.Object {
  /** Path to custom CSS file, relative to current directory. */
  var cssPath: js.UndefOr[String] = js.native
  /** Current working directory. */
  var cwd: js.UndefOr[String] = js.native
  /** Path to custorm highlight CSS file (for code highlighting with highlight.js), relative to the current directory. */
  var highlightCssPath: js.UndefOr[String] = js.native
  /** If renderDelay option isn't set, this is the timeout (in ms) before the page is rendered in case the page.onLoadFinished event doesn't fire. */
  var loadTimeout: js.UndefOr[Double] = js.native
  /** Supported dimension units are: 'mm', 'cm', 'in', 'px' */
  var paperBorder: js.UndefOr[String] = js.native
  var paperFormat: js.UndefOr[PaperFormat] = js.native
  var paperOrientation: js.UndefOr[PaperOrientation] = js.native
  /** Path to the phantomjs library. */
  var phantomPath: js.UndefOr[String] = js.native
  /** A function that returns a through2 stream that transforms the HTML before it is converted to PDF. */
  var preProcessHtml: js.UndefOr[js.Function0[_]] = js.native
  /** A function that returns a through2 stream that transforms the markdown before it is converted to HTML. */
  var preProcessMd: js.UndefOr[js.Function0[_]] = js.native
  /** A config object that is passed to remarkable, the underlying markdown parser */
  var remarkable: js.UndefOr[js.Any] = js.native
  /** Delay (in ms) before the PDF is rendered. */
  var renderDelay: js.UndefOr[Double] = js.native
  /** Path to CommonJS module which sets the page header and footer (see runnings.js). */
  var runningsPath: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCssPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssPath")(js.undefined)
        ret
    }
    @scala.inline
    def withCwd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCwd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightCssPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightCssPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightCssPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightCssPath")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withPaperBorder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paperBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaperBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paperBorder")(js.undefined)
        ret
    }
    @scala.inline
    def withPaperFormat(value: PaperFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paperFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaperFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paperFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withPaperOrientation(value: PaperOrientation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paperOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaperOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paperOrientation")(js.undefined)
        ret
    }
    @scala.inline
    def withPhantomPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phantomPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhantomPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phantomPath")(js.undefined)
        ret
    }
    @scala.inline
    def withPreProcessHtml(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preProcessHtml")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPreProcessHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preProcessHtml")(js.undefined)
        ret
    }
    @scala.inline
    def withPreProcessMd(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preProcessMd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPreProcessMd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preProcessMd")(js.undefined)
        ret
    }
    @scala.inline
    def withRemarkable(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remarkable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemarkable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remarkable")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withRunningsPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runningsPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunningsPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runningsPath")(js.undefined)
        ret
    }
  }
  
}

