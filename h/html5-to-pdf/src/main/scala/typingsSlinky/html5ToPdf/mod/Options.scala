package typingsSlinky.html5ToPdf.mod

import typingsSlinky.node.Buffer
import typingsSlinky.puppeteer.mod.LaunchOptions
import typingsSlinky.puppeteer.mod.PDFOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * A list of CSS or JS assets to include.
    */
  var include: js.UndefOr[js.Array[String | FileDef]] = js.native
  /**
    * Path to the input html as a String, or Buffer. If specified this will override inputPath.
    */
  var inputBody: js.UndefOr[String | Buffer] = js.native
  /**
    * Path to the input HTML.
    */
  var inputPath: js.UndefOr[String] = js.native
  /**
    * This object will be passed directly to `puppeteer`.
    */
  var launchOptions: js.UndefOr[LaunchOptions] = js.native
  /**
    * @deprecated Legacy Options.
    * See `options.pdf` for pdf options. Since some of these options are converted over to work with `puppeteer`,
    * this is automatically done if `options.pdf` is left empty.
    */
  var options: js.UndefOr[LegacyOptions] = js.native
  /**
    * Path to the output pdf file.
    */
  var outputPath: js.UndefOr[String] = js.native
  /**
    * This object will be passed directly to `puppeteer`.
    */
  var pdf: js.UndefOr[PDFOptions] = js.native
  /**
    * Delay in milliseconds before rendering the PDF (give HTML and CSS a chance to load).
    */
  var rendererDelay: js.UndefOr[Double] = js.native
  /**
    * The template to use when rendering the html.
    */
  var template: js.UndefOr[String] = js.native
  /**
    * The template to use for rendering the html. If this is set, it will use this instead of the template path.
    */
  var templateUrl: js.UndefOr[String] = js.native
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
    def withInclude(value: js.Array[String | FileDef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.undefined)
        ret
    }
    @scala.inline
    def withInputBody(value: String | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputBody")(js.undefined)
        ret
    }
    @scala.inline
    def withInputPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputPath")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchOptions(value: LaunchOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: LegacyOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputPath")(js.undefined)
        ret
    }
    @scala.inline
    def withPdf(value: PDFOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPdf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdf")(js.undefined)
        ret
    }
    @scala.inline
    def withRendererDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendererDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRendererDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendererDelay")(js.undefined)
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
    @scala.inline
    def withTemplateUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateUrl")(js.undefined)
        ret
    }
  }
  
}

