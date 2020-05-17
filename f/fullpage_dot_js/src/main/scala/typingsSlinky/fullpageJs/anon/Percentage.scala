package typingsSlinky.fullpageJs.anon

import typingsSlinky.fullpageJs.fullpageJsStrings.cover
import typingsSlinky.fullpageJs.fullpageJsStrings.reveal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Percentage extends js.Object {
  var percentage: js.UndefOr[Double] = js.native
  var property: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[cover | reveal] = js.native
}

object Percentage {
  @scala.inline
  def apply(): Percentage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Percentage]
  }
  @scala.inline
  implicit class PercentageOps[Self <: Percentage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentage")(js.undefined)
        ret
    }
    @scala.inline
    def withProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: cover | reveal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

