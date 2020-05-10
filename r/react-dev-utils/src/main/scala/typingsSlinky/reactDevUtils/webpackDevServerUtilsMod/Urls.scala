package typingsSlinky.reactDevUtils.webpackDevServerUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Urls extends js.Object {
  var lanUrlForConfig: js.UndefOr[String] = js.native
  var lanUrlForTerminal: js.UndefOr[String] = js.native
  var localUrlForBrowser: String = js.native
  var localUrlForTerminal: String = js.native
}

object Urls {
  @scala.inline
  def apply(localUrlForBrowser: String, localUrlForTerminal: String): Urls = {
    val __obj = js.Dynamic.literal(localUrlForBrowser = localUrlForBrowser.asInstanceOf[js.Any], localUrlForTerminal = localUrlForTerminal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Urls]
  }
  @scala.inline
  implicit class UrlsOps[Self <: Urls] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocalUrlForBrowser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localUrlForBrowser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalUrlForTerminal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localUrlForTerminal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanUrlForConfig(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lanUrlForConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanUrlForConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lanUrlForConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withLanUrlForTerminal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lanUrlForTerminal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanUrlForTerminal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lanUrlForTerminal")(js.undefined)
        ret
    }
  }
  
}

