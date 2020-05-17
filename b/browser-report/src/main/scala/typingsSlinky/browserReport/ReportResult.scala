package typingsSlinky.browserReport

import typingsSlinky.browserReport.anon.City
import typingsSlinky.browserReport.anon.Colors
import typingsSlinky.browserReport.anon.Layout
import typingsSlinky.browserReport.anon.Name
import typingsSlinky.browserReport.anon.Version
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportResult extends js.Object {
  var browser: Name = js.native
  var cookies: Boolean = js.native
  var country: City = js.native
  var flash: Version = js.native
  var ip: String = js.native
  @JSName("java")
  var java_ : Version = js.native
  var lang: js.Array[String] = js.native
  var os: Name = js.native
  var screen: Colors = js.native
  var scripts: Boolean = js.native
  var timestamp: String = js.native
  var userAgent: String = js.native
  var viewport: Layout = js.native
  var websockets: Boolean = js.native
}

object ReportResult {
  @scala.inline
  def apply(
    browser: Name,
    cookies: Boolean,
    country: City,
    flash: Version,
    ip: String,
    java_ : Version,
    lang: js.Array[String],
    os: Name,
    screen: Colors,
    scripts: Boolean,
    timestamp: String,
    userAgent: String,
    viewport: Layout,
    websockets: Boolean
  ): ReportResult = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], cookies = cookies.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], flash = flash.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], scripts = scripts.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any], websockets = websockets.asInstanceOf[js.Any])
    __obj.updateDynamic("java")(java_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportResult]
  }
  @scala.inline
  implicit class ReportResultOps[Self <: ReportResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowser(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCookies(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountry(value: City): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlash(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJava_(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("java")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLang(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOs(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreen(value: Colors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScripts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scripts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserAgent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewport(value: Layout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebsockets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websockets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

