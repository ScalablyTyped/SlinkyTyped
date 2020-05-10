package typingsSlinky.karmaDetectBrowsers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KarmaDetectBrowsers extends js.Object {
  /** enable/disable, default is true */
  var enabled: js.UndefOr[Boolean] = js.native
  /** use headless mode, for browsers that support it, default is false */
  var preferHeadless: js.UndefOr[Boolean] = js.native
  /** enable/disable phantomjs support, default is true */
  var usePhantomJS: js.UndefOr[Boolean] = js.native
  /**
    * post processing of browsers list
    * here you can edit the list of browsers used by karma
    */
  def postDetection(availableBrowsers: js.Array[String]): js.Array[String] = js.native
}

object KarmaDetectBrowsers {
  @scala.inline
  def apply(postDetection: js.Array[String] => js.Array[String]): KarmaDetectBrowsers = {
    val __obj = js.Dynamic.literal(postDetection = js.Any.fromFunction1(postDetection))
    __obj.asInstanceOf[KarmaDetectBrowsers]
  }
  @scala.inline
  implicit class KarmaDetectBrowsersOps[Self <: KarmaDetectBrowsers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPostDetection(value: js.Array[String] => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postDetection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferHeadless(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferHeadless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferHeadless: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferHeadless")(js.undefined)
        ret
    }
    @scala.inline
    def withUsePhantomJS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePhantomJS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsePhantomJS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePhantomJS")(js.undefined)
        ret
    }
  }
  
}

