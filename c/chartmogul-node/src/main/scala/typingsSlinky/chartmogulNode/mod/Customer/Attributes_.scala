package typingsSlinky.chartmogulNode.mod.Customer

import typingsSlinky.chartmogulNode.commonMod.Map
import typingsSlinky.chartmogulNode.commonMod.Strings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attributes_ extends js.Object {
  var clearbit: js.UndefOr[Map] = js.native
  var custom: js.UndefOr[Map] = js.native
  var stripe: js.UndefOr[Map] = js.native
  var tags: js.UndefOr[Strings] = js.native
}

object Attributes_ {
  @scala.inline
  def apply(): Attributes_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attributes_]
  }
  @scala.inline
  implicit class Attributes_Ops[Self <: Attributes_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearbit(value: Map): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearbit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearbit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearbit")(js.undefined)
        ret
    }
    @scala.inline
    def withCustom(value: Map): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(js.undefined)
        ret
    }
    @scala.inline
    def withStripe(value: Map): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripe")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Strings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

