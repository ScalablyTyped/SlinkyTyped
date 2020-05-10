package typingsSlinky.googleAppsScript.GoogleAppsScript.Adsense.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdCode extends js.Object {
  var adCode: js.UndefOr[String] = js.native
  var ampBody: js.UndefOr[String] = js.native
  var ampHead: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
}

object AdCode {
  @scala.inline
  def apply(): AdCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdCode]
  }
  @scala.inline
  implicit class AdCodeOps[Self <: AdCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adCode")(js.undefined)
        ret
    }
    @scala.inline
    def withAmpBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ampBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmpBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ampBody")(js.undefined)
        ret
    }
    @scala.inline
    def withAmpHead(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ampHead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmpHead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ampHead")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

