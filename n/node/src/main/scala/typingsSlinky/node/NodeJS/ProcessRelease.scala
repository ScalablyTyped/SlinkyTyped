package typingsSlinky.node.NodeJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessRelease extends js.Object {
  var headersUrl: js.UndefOr[String] = js.native
  var libUrl: js.UndefOr[String] = js.native
  var lts: js.UndefOr[String] = js.native
  var name: String = js.native
  var sourceUrl: js.UndefOr[String] = js.native
}

object ProcessRelease {
  @scala.inline
  def apply(name: String): ProcessRelease = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessRelease]
  }
  @scala.inline
  implicit class ProcessReleaseOps[Self <: ProcessRelease] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeadersUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headersUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadersUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headersUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withLibUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("libUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLibUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("libUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withLts(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lts")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceUrl")(js.undefined)
        ret
    }
  }
  
}

