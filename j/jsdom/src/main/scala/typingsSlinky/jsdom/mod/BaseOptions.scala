package typingsSlinky.jsdom.mod

import typingsSlinky.jsdom.jsdomStrings.`outside-only`
import typingsSlinky.jsdom.jsdomStrings.dangerously
import typingsSlinky.jsdom.jsdomStrings.usable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseOptions extends js.Object {
  var beforeParse: js.UndefOr[js.Function1[/* window */ DOMWindow, Unit]] = js.native
  var cookieJar: js.UndefOr[CookieJar] = js.native
  /**
  		 * `includeNodeLocations` preserves the location info produced by the HTML parser,
  		 * allowing you to retrieve it with the nodeLocation() method (described below).
  		 *
  		 * It defaults to false to give the best performance,
  		 * and cannot be used with an XML content type since our XML parser does not support location info.
  		 *
  		 * @default false
  		 */
  var includeNodeLocations: js.UndefOr[Boolean] = js.native
  /**
  		 * jsdom does not have the capability to render visual content, and will act like a headless browser by default.
  		 * It provides hints to web pages through APIs such as document.hidden that their content is not visible.
  		 *
  		 * When the `pretendToBeVisual` option is set to `true`, jsdom will pretend that it is rendering and displaying
  		 * content.
  		 *
  		 * @default false
  		 */
  var pretendToBeVisual: js.UndefOr[Boolean] = js.native
  /**
  		 * referrer just affects the value read from document.referrer.
  		 * It defaults to no referrer (which reflects as the empty string).
  		 */
  var referrer: js.UndefOr[String] = js.native
  var resources: js.UndefOr[usable | ResourceLoader] = js.native
  var runScripts: js.UndefOr[dangerously | `outside-only`] = js.native
  /**
  		 * userAgent affects the value read from navigator.userAgent, as well as the User-Agent header sent while fetching subresources.
  		 *
  		 * @default
  		 * `Mozilla/5.0 (${process.platform}) AppleWebKit/537.36 (KHTML, like Gecko) jsdom/${jsdomVersion}`
  		 */
  var userAgent: js.UndefOr[String] = js.native
  var virtualConsole: js.UndefOr[VirtualConsole] = js.native
}

object BaseOptions {
  @scala.inline
  def apply(): BaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseOptions]
  }
  @scala.inline
  implicit class BaseOptionsOps[Self <: BaseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeforeParse(value: /* window */ DOMWindow => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeParse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeParse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeParse")(js.undefined)
        ret
    }
    @scala.inline
    def withCookieJar(value: CookieJar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieJar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookieJar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieJar")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeNodeLocations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeNodeLocations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeNodeLocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeNodeLocations")(js.undefined)
        ret
    }
    @scala.inline
    def withPretendToBeVisual(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pretendToBeVisual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPretendToBeVisual: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pretendToBeVisual")(js.undefined)
        ret
    }
    @scala.inline
    def withReferrer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferrer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrer")(js.undefined)
        ret
    }
    @scala.inline
    def withResources(value: usable | ResourceLoader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(js.undefined)
        ret
    }
    @scala.inline
    def withRunScripts(value: dangerously | `outside-only`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runScripts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunScripts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runScripts")(js.undefined)
        ret
    }
    @scala.inline
    def withUserAgent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualConsole(value: VirtualConsole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualConsole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualConsole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualConsole")(js.undefined)
        ret
    }
  }
  
}

