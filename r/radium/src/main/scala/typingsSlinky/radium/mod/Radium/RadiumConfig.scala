package typingsSlinky.radium.mod.Radium

import org.scalajs.dom.raw.MediaQueryList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadiumConfig extends js.Object {
  /**
    * Allow to replace matchMedia function that Radium uses. The default one is window.matchMedia
    * @param mediaQuery
    */
  var matchMedia: js.UndefOr[js.Function1[/* mediaQuery */ String, MediaQueryList]] = js.native
  /**
    * List of plugins
    */
  var plugins: js.UndefOr[js.Array[_]] = js.native
  /**
    * Set the user agent passed to inline-style-prefixer to perform prefixing on style objects.
    * Mainly used during server rendering
    */
  var userAgent: js.UndefOr[String] = js.native
}

object RadiumConfig {
  @scala.inline
  def apply(): RadiumConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadiumConfig]
  }
  @scala.inline
  implicit class RadiumConfigOps[Self <: RadiumConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatchMedia(value: /* mediaQuery */ String => MediaQueryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchMedia")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMatchMedia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchMedia")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
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
  }
  
}

