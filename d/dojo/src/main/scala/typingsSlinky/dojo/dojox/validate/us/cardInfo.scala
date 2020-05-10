package typingsSlinky.dojo.dojox.validate.us

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/validate/us._cardInfo.html
  *
  * A dictionary list of credit card abbreviations
  * A hash of valid CC abbreviations and regular expressions
  *
  * mc: Mastercard
  * ec: Eurocard
  * vi: Visa
  * ax: American Express
  * dc: Diners Club
  * bl: Carte Blanch
  * di: Discover
  * jcb: JCB
  * er: Enroute
  *
  */
@js.native
trait cardInfo extends js.Object {
  /**
    *
    */
  var ax: String = js.native
  /**
    *
    */
  var bl: String = js.native
  /**
    *
    */
  var dc: String = js.native
  /**
    *
    */
  var di: String = js.native
  /**
    *
    */
  var ec: String = js.native
  /**
    *
    */
  var er: String = js.native
  /**
    *
    */
  var jcb: String = js.native
  /**
    *
    */
  var mc: String = js.native
  /**
    *
    */
  var vi: String = js.native
}

object cardInfo {
  @scala.inline
  def apply(
    ax: String,
    bl: String,
    dc: String,
    di: String,
    ec: String,
    er: String,
    jcb: String,
    mc: String,
    vi: String
  ): cardInfo = {
    val __obj = js.Dynamic.literal(ax = ax.asInstanceOf[js.Any], bl = bl.asInstanceOf[js.Any], dc = dc.asInstanceOf[js.Any], di = di.asInstanceOf[js.Any], ec = ec.asInstanceOf[js.Any], er = er.asInstanceOf[js.Any], jcb = jcb.asInstanceOf[js.Any], mc = mc.asInstanceOf[js.Any], vi = vi.asInstanceOf[js.Any])
    __obj.asInstanceOf[cardInfo]
  }
  @scala.inline
  implicit class cardInfoOps[Self <: cardInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAx(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDi(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("di")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("er")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJcb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jcb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVi(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vi")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

