package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrimaryText extends js.Object {
  var primaryText: js.UndefOr[String] = js.native
  var secondaryText: js.UndefOr[String] = js.native
  var threshold: js.UndefOr[Double] = js.native
}

object PrimaryText {
  @scala.inline
  def apply(): PrimaryText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrimaryText]
  }
  @scala.inline
  implicit class PrimaryTextOps[Self <: PrimaryText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrimaryText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryText")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryText")(js.undefined)
        ret
    }
    @scala.inline
    def withThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(js.undefined)
        ret
    }
  }
  
}

