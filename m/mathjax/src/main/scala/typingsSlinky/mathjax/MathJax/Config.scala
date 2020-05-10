package typingsSlinky.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var AsciiMath: js.UndefOr[AsciiMathInputProcessor] = js.native
  var CommonHTML: js.UndefOr[CommonHTMLOutputProcessor] = js.native
  var FontWarnings: js.UndefOr[typingsSlinky.mathjax.MathJax.FontWarnings] = js.native
  var `HTML-CSS`: js.UndefOr[HTMLCSSOutputProcessor] = js.native
  var MMLorHTML: js.UndefOr[MMLorHTMLConfiguration] = js.native
  var MatchWebFonts: js.UndefOr[typingsSlinky.mathjax.MathJax.MatchWebFonts] = js.native
  var MathEvents: js.UndefOr[typingsSlinky.mathjax.MathJax.MathEvents] = js.native
  var MathML: js.UndefOr[MathMLInputProcessor] = js.native
  var MathMenu: js.UndefOr[typingsSlinky.mathjax.MathJax.MathMenu] = js.native
  var MathZoom: js.UndefOr[typingsSlinky.mathjax.MathJax.MathZoom] = js.native
  var NativeMML: js.UndefOr[NativeMMLOutputProcessor] = js.native
  var SVG: js.UndefOr[SVGOutputProcessor] = js.native
  var Safe: js.UndefOr[typingsSlinky.mathjax.MathJax.Safe] = js.native
  var TeX: js.UndefOr[TeXInputProcessor] = js.native
  var asciimath2jax: js.UndefOr[Asciimath2jaxPreprocessor] = js.native
  /*A list of configuration files to load when MathJax starts up, e.g., to define local macros,
    * etc., and there is a sample config file named config/local/local.js. The default directory is the
    * MathJax/config directory. The MMLorHTML.js configuration is one such configuration file, and there are a
    * number of other pre-defined configurations (see Using a configuration file for more details).
    */
  var config: js.UndefOr[js.Array[String]] = js.native
  /*Normally MathJax will perform its startup commands (loading of configuration, styles, jax, and so on) as soon
    * as it can. If you expect to be doing additional configuration on the page, however, you may want to have it
    * wait until the page’s onload handler is called. If so, set this to "onload". You can also set this to
    * "configured", in which case, MathJax will delay its startup until you explicitly call
    * MathJax.Hub.Configured(). See Configuring MathJax after it is loaded for more details.
    */
  var delayStartupUntil: js.UndefOr[String] = js.native
  /*These two parameters control the alignment and shifting of displayed equations. The first can be "left",
    * "center", or "right", and determines the alignment of displayed equations. When the alignment is not "center",
    * the second determines an indentation from the left or right side for the displayed equations.*/
  var displayAlign: js.UndefOr[String] = js.native
  var displayIndent: js.UndefOr[String] = js.native
  /*This is a list of DOM element ID’s that are the ones to process for mathematics when any of the Hub typesetting
    * calls (Typeset(), Process(), Update(), etc.) are called with no element specified, and during MathJax’s initial
    * typesetting run when it starts up. This lets you restrict the processing to particular containers rather than
    * scanning the entire document for mathematics. If none are supplied, the complete document is processed.
    */
  var elements: js.UndefOr[js.Array[String]] = js.native
  /*This block contains settings that control how MathJax responds to unexpected errors while processing
    * mathematical equations. Rather than simply crash, MathJax can report an error and go on.
    */
  var errorSettings: js.UndefOr[ErrorSettings] = js.native
  /*A list of extensions to load at startup. The default directory is MathJax/extensions. The
    * tex2jax and mml2jax preprocessors can be listed here, as well as a FontWarnings extension that you can use to
    * inform your user that mathematics fonts are available that they can download to improve their experience of
    * your site.
    */
  var extensions: js.UndefOr[js.Array[String]] = js.native
  /*A list of input and output jax to initialize at startup. Their main code is loaded only when
    * they are actually used, so it is not inefficient to include jax that may not actually be used on the page.
    * These are found in the MathJax/jax directory.
    */
  var jax: js.UndefOr[js.Array[String]] = js.native
  var jsMath2jax: js.UndefOr[JSMath2jaxPreprocessor] = js.native
  /*This block contains settings for the mathematics contextual menu that act as the defaults for the user’s
    * settings in that menu.
    * There are also settings for format, renderer, font, mpContext, and mpMouse, but these are maintained by
    * MathJax and should not be set by the page author.
    */
  var menuSettings: js.UndefOr[MenuSettings] = js.native
  /*This value controls the verbosity of the messages in the lower left-hand corner. Set it to "none" to eliminate
    * all messages, or set it to "simple" to show “Loading...” and “Processing...” rather than showing the full file
    * name or the percentage of the mathematics processed.
    */
  var messageStyle: js.UndefOr[String] = js.native
  var mml2jax: js.UndefOr[MML2jaxPreprocessor] = js.native
  /*ince typesetting usually changes the vertical dimensions of the page, if the URL contains an anchor position,
    * then after the page is typeset, you may no longer be positioned at the correct position on the page. MathJax
    * can reposition to that location after it completes its initial typesetting of the page. This value controls
    * whether MathJax will reposition the browser to the #hash location from the page URL after typesetting for
    * the page.
    */
  var positionToHash: js.UndefOr[Boolean] = js.native
  var postJax: js.UndefOr[js.Any] = js.native
  /*Patterns to remove from before and after math script tags. If you are not using one of the preprocessors, you
    * need to insert something extra into your HTML file in order to avoid a bug in Internet Explorer. IE removes
    * spaces from the DOM that it thinks are redundant, and since a <script> tag usually doesn’t add content to the
    * page, if there is a space before and after a MathJax <script> tag, IE will remove the first space. When
    * MathJax inserts the typeset mathematics, this means there will be no space before it and the preceding text.
    * In order to avoid this, you should include some “guard characters” before or after the math SCRIPT tag; define
    * the patterns you want to use below. Note that these are used as part of a regular expression, so you will need
    * to quote special characters. Furthermore, since they are javascript strings, you must quote javascript special
    * characters as well. So to obtain a backslash, you must use \\ (doubled for javascript). For example, "\\["
    * represents the pattern \[ in the regular expression, or [ in the text of the web page. That means that if you
    * want an actual backslash in your guard characters, you need to use "\\\\" in order to get \\ in the regular
    * expression, and \ in the actual text. If both preJax and postJax are defined, both must be present in order
    * to be removed.
    *
    * See also the preRemoveClass comments below.
    *
    * Examples:
    *
    * preJax: "\\\\\\\\\" makes a double backslash the preJax text
    *
    * preJax: "\\[\\[", postJax: "\\]\\]" makes it so jax scripts must be enclosed in double brackets.
    */
  var preJax: js.UndefOr[js.Any] = js.native
  /*This is the CSS class name for math previews that will be removed preceding a MathJax SCRIPT tag. If the tag
    * just before the MathJax <script> tag is of this class, its contents are removed when MathJax processes the
    * <script> tag. This allows you to include a math preview in a form that will be displayed prior to MathJax
    * performing its typesetting. It also avoids the Internet Explorer space-removal bug, and can be used in place
    * of preJax and postJax if that is more convenient.
    *
    * For example
    *
    * <span class="MathJax_Preview">[math]</span><script  type="math/tex">...</script>
    * would display “[math]” in place of the math until MathJax is able to typeset it.
    */
  var preRemoveClass: js.UndefOr[String] = js.native
  /*These control whether to attach the MathJax contextual menu to the expressions typeset by MathJax. Since the
    * code for handling MathPlayer in Internet Explorer is somewhat delicate, it is controlled separately via
    * showMathMenuMSIE, but the latter is now deprecated in favor of the MathJax contextual menu settings for
    * MathPlayer (see below).
    *
    * If showMathMenu is true, then right-clicking (on Windows or Linux) or control-clicking (on Mac OS X) will
    * produce a MathJax menu that allows you to get the source of the mathematics in various formats, change the
    * size of the mathematics relative to the surrounding text, get information about MathJax, and configure other
    * MathJax settings.
    *
    * Set this to false to disable the menu. When true, the MathMenu configuration block determines the operation
    * of the menu. See the MathMenu options for more details.
    *
    * These values used to be listed in the separate output jax, but have been moved to this more central location
    * since they are shared by all output jax. MathJax will still honor their values from their original positions,
    * if they are set there.
    */
  var showMathMenu: js.UndefOr[Boolean] = js.native
  var showMathMenuMSIE: js.UndefOr[Boolean] = js.native
  /*This value controls whether the Processing Math: nn% messages are displayed in the lower left-hand corner.
    * Set to false to prevent those messages (though file loading and other messages will still be shown).
    */
  var showProcessingMessages: js.UndefOr[Boolean] = js.native
  /*Normally MathJax will typeset the mathematics on the page as soon as the page is loaded. If you want to delay
    * that process, in which case you will need to call MathJax.Hub.Typeset() yourself by hand, set this value to
    * true.
    */
  var skipStartupTypeset: js.UndefOr[Boolean] = js.native
  /*A list of CSS stylesheet files to be loaded when MathJax starts up. The default directory is
    * the MathJax/config directory.
    */
  var styleSheets: js.UndefOr[js.Array[String]] = js.native
  /*CSS styles to be defined dynamically at startup time. These are in the form selector:rules (see CSS Style
    * Objects for complete details).
    */
  var styles: js.UndefOr[js.Any] = js.native
  var tex2jax: js.UndefOr[TEX2jaxPreprocessor] = js.native
  @JSName("v1.0-compatible")
  var `v1Dot0-compatible`: js.UndefOr[Boolean] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsciiMath(value: AsciiMathInputProcessor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AsciiMath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsciiMath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AsciiMath")(js.undefined)
        ret
    }
    @scala.inline
    def withCommonHTML(value: CommonHTMLOutputProcessor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommonHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommonHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommonHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withFontWarnings(value: FontWarnings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontWarnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontWarnings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontWarnings")(js.undefined)
        ret
    }
    @scala.inline
    def `withHTML-CSS`(value: HTMLCSSOutputProcessor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTML-CSS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHTML-CSS`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTML-CSS")(js.undefined)
        ret
    }
    @scala.inline
    def withMMLorHTML(value: MMLorHTMLConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MMLorHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMMLorHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MMLorHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchWebFonts(value: MatchWebFonts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MatchWebFonts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchWebFonts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MatchWebFonts")(js.undefined)
        ret
    }
    @scala.inline
    def withMathEvents(value: MathEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MathEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMathEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MathEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withMathML(value: MathMLInputProcessor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MathML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMathML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MathML")(js.undefined)
        ret
    }
    @scala.inline
    def withMathMenu(value: MathMenu): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MathMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMathMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MathMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withMathZoom(value: MathZoom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MathZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMathZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MathZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withNativeMML(value: NativeMMLOutputProcessor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NativeMML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNativeMML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NativeMML")(js.undefined)
        ret
    }
    @scala.inline
    def withSVG(value: SVGOutputProcessor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSVG: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVG")(js.undefined)
        ret
    }
    @scala.inline
    def withSafe(value: Safe): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Safe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Safe")(js.undefined)
        ret
    }
    @scala.inline
    def withTeX(value: TeXInputProcessor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TeX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TeX")(js.undefined)
        ret
    }
    @scala.inline
    def withAsciimath2jax(value: Asciimath2jaxPreprocessor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asciimath2jax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsciimath2jax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asciimath2jax")(js.undefined)
        ret
    }
    @scala.inline
    def withConfig(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withDelayStartupUntil(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayStartupUntil")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayStartupUntil: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayStartupUntil")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayIndent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayIndent")(js.undefined)
        ret
    }
    @scala.inline
    def withElements(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elements")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorSettings(value: ErrorSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withJax(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jax")(js.undefined)
        ret
    }
    @scala.inline
    def withJsMath2jax(value: JSMath2jaxPreprocessor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsMath2jax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsMath2jax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsMath2jax")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuSettings(value: MenuSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withMml2jax(value: MML2jaxPreprocessor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mml2jax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMml2jax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mml2jax")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionToHash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionToHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionToHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionToHash")(js.undefined)
        ret
    }
    @scala.inline
    def withPostJax(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postJax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostJax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postJax")(js.undefined)
        ret
    }
    @scala.inline
    def withPreJax(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preJax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreJax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preJax")(js.undefined)
        ret
    }
    @scala.inline
    def withPreRemoveClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preRemoveClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreRemoveClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preRemoveClass")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMathMenu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMathMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMathMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMathMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMathMenuMSIE(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMathMenuMSIE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMathMenuMSIE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMathMenuMSIE")(js.undefined)
        ret
    }
    @scala.inline
    def withShowProcessingMessages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showProcessingMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowProcessingMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showProcessingMessages")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipStartupTypeset(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipStartupTypeset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipStartupTypeset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipStartupTypeset")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleSheets(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleSheets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleSheets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleSheets")(js.undefined)
        ret
    }
    @scala.inline
    def withStyles(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withTex2jax(value: TEX2jaxPreprocessor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tex2jax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTex2jax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tex2jax")(js.undefined)
        ret
    }
    @scala.inline
    def `withV1Dot0-compatible`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v1.0-compatible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutV1Dot0-compatible`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v1.0-compatible")(js.undefined)
        ret
    }
  }
  
}

