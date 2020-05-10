package typingsSlinky.istanbulReports.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HtmlOptions extends js.Object {
  var linkMapper: LinkMapper = js.native
  var subdir: String = js.native
  var verbose: Boolean = js.native
}

object HtmlOptions {
  @scala.inline
  def apply(linkMapper: LinkMapper, subdir: String, verbose: Boolean): HtmlOptions = {
    val __obj = js.Dynamic.literal(linkMapper = linkMapper.asInstanceOf[js.Any], subdir = subdir.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlOptions]
  }
  @scala.inline
  implicit class HtmlOptionsOps[Self <: HtmlOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLinkMapper(value: LinkMapper): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkMapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubdir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

