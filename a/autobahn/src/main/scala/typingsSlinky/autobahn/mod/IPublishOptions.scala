package typingsSlinky.autobahn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPublishOptions extends js.Object {
  var acknowledge: js.UndefOr[Boolean] = js.native
  var disclose_me: js.UndefOr[Boolean] = js.native
  var eligible: js.UndefOr[js.Array[Double]] = js.native
  var eligible_authid: js.UndefOr[js.Array[String]] = js.native
  var eligible_authrole: js.UndefOr[js.Array[String]] = js.native
  var exclude: js.UndefOr[js.Array[Double]] = js.native
  var exclude_authid: js.UndefOr[js.Array[String]] = js.native
  var exclude_authrole: js.UndefOr[js.Array[String]] = js.native
  var exclude_me: js.UndefOr[Boolean] = js.native
  var retain: js.UndefOr[Boolean] = js.native
}

object IPublishOptions {
  @scala.inline
  def apply(): IPublishOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPublishOptions]
  }
  @scala.inline
  implicit class IPublishOptionsOps[Self <: IPublishOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcknowledge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acknowledge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcknowledge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acknowledge")(js.undefined)
        ret
    }
    @scala.inline
    def withDisclose_me(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disclose_me")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisclose_me: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disclose_me")(js.undefined)
        ret
    }
    @scala.inline
    def withEligible(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eligible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEligible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eligible")(js.undefined)
        ret
    }
    @scala.inline
    def withEligible_authid(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eligible_authid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEligible_authid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eligible_authid")(js.undefined)
        ret
    }
    @scala.inline
    def withEligible_authrole(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eligible_authrole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEligible_authrole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eligible_authrole")(js.undefined)
        ret
    }
    @scala.inline
    def withExclude(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.undefined)
        ret
    }
    @scala.inline
    def withExclude_authid(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude_authid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude_authid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude_authid")(js.undefined)
        ret
    }
    @scala.inline
    def withExclude_authrole(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude_authrole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude_authrole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude_authrole")(js.undefined)
        ret
    }
    @scala.inline
    def withExclude_me(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude_me")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude_me: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude_me")(js.undefined)
        ret
    }
    @scala.inline
    def withRetain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retain")(js.undefined)
        ret
    }
  }
  
}

