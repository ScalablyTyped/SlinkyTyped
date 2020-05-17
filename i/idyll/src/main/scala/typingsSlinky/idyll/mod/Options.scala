package typingsSlinky.idyll.mod

import typingsSlinky.idyll.anon.Compiler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Compiler options
    */
  var compiler: js.UndefOr[typingsSlinky.idyllCompiler.mod.Options] = js.native
  /**
    * The components directory
    */
  var components: js.UndefOr[Boolean] = js.native
  /**
    * Custom CSS file to include in output
    */
  var css: js.UndefOr[String] = js.native
  /**
    * The datasets directory
    */
  var datasets: js.UndefOr[String] = js.native
  /**
    * The default component directory
    * This corresponds to where the idyll-components package stays
    */
  var defaultComponents: js.UndefOr[Boolean] = js.native
  /**
    * used internally by IdyllInstance
    */
  var inputConfig: js.UndefOr[Compiler] = js.native
  /**
    * the idyll file to be compiled into
    */
  var inputFile: js.UndefOr[String] = js.native
  /**
    * The layout defined in idyll-layouts package
    */
  var layout: js.UndefOr[String] = js.native
  /**
    * Whether to minify output build
    */
  var minify: js.UndefOr[Boolean] = js.native
  /**
    * The output directory for compiled documents
    */
  var output: js.UndefOr[String] = js.native
  /**
    * Custom port to bind the local server to.
    */
  var port: js.UndefOr[Double] = js.native
  /**
    *
    * Pre-render HTML as part of the build
    */
  var ssr: js.UndefOr[Boolean] = js.native
  /**
    * Temporary directory used by idyll
    */
  var temp: js.UndefOr[String] = js.native
  /**
    * path to HTML template
    *
    */
  var template: js.UndefOr[String] = js.native
  /**
    * The theme defined in idyll-theme package
    */
  var theme: js.UndefOr[String] = js.native
  /**
    * Custom browserify transforms to apply.
    */
  var transform: js.UndefOr[js.Array[String]] = js.native
  /**
    * Monitor input files and rebuild on changes
    */
  var watch: js.UndefOr[Boolean] = js.native
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
    def withCompiler(value: typingsSlinky.idyllCompiler.mod.Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compiler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompiler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compiler")(js.undefined)
        ret
    }
    @scala.inline
    def withComponents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(js.undefined)
        ret
    }
    @scala.inline
    def withCss(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(js.undefined)
        ret
    }
    @scala.inline
    def withDatasets(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatasets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasets")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultComponents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultComponents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultComponents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultComponents")(js.undefined)
        ret
    }
    @scala.inline
    def withInputConfig(value: Compiler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withInputFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFile")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withMinify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minify")(js.undefined)
        ret
    }
    @scala.inline
    def withOutput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withSsr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssr")(js.undefined)
        ret
    }
    @scala.inline
    def withTemp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("temp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("temp")(js.undefined)
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
    def withTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
    @scala.inline
    def withWatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(js.undefined)
        ret
    }
  }
  
}

