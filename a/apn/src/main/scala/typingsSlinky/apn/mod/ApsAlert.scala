package typingsSlinky.apn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApsAlert extends js.Object {
  var action: js.UndefOr[String] = js.native
  var `action-loc-key`: js.UndefOr[String] = js.native
  var body: js.UndefOr[String] = js.native
  var `loc-args`: js.UndefOr[js.Array[_]] = js.native
  var `loc-key`: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var `title-loc-args`: js.UndefOr[js.Array[_]] = js.native
  var `title-loc-key`: js.UndefOr[String] = js.native
}

object ApsAlert {
  @scala.inline
  def apply(): ApsAlert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApsAlert]
  }
  @scala.inline
  implicit class ApsAlertOps[Self <: ApsAlert] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def `withAction-loc-key`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action-loc-key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAction-loc-key`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action-loc-key")(js.undefined)
        ret
    }
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def `withLoc-args`(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc-args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLoc-args`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc-args")(js.undefined)
        ret
    }
    @scala.inline
    def `withLoc-key`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc-key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLoc-key`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc-key")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def `withTitle-loc-args`(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title-loc-args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTitle-loc-args`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title-loc-args")(js.undefined)
        ret
    }
    @scala.inline
    def `withTitle-loc-key`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title-loc-key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTitle-loc-key`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title-loc-key")(js.undefined)
        ret
    }
  }
  
}

