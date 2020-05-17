package typingsSlinky.osrsJsonApi.anon

import typingsSlinky.osrsJsonApi.mod.ge.TrendPriceObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Current extends js.Object {
  var current: TrendPriceObject = js.native
  var day180: TrendPriceObject = js.native
  var day30: TrendPriceObject = js.native
  var day90: TrendPriceObject = js.native
  var description: String = js.native
  var icon: String = js.native
  var icon_large: String = js.native
  var id: Double = js.native
  var members: Boolean = js.native
  var name: String = js.native
  var today: TrendPriceObject = js.native
  var `type`: String = js.native
  var typeIcon: String = js.native
}

object Current {
  @scala.inline
  def apply(
    current: TrendPriceObject,
    day180: TrendPriceObject,
    day30: TrendPriceObject,
    day90: TrendPriceObject,
    description: String,
    icon: String,
    icon_large: String,
    id: Double,
    members: Boolean,
    name: String,
    today: TrendPriceObject,
    `type`: String,
    typeIcon: String
  ): Current = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], day180 = day180.asInstanceOf[js.Any], day30 = day30.asInstanceOf[js.Any], day90 = day90.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], icon_large = icon_large.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], today = today.asInstanceOf[js.Any], typeIcon = typeIcon.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Current]
  }
  @scala.inline
  implicit class CurrentOps[Self <: Current] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrent(value: TrendPriceObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDay180(value: TrendPriceObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day180")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDay30(value: TrendPriceObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day30")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDay90(value: TrendPriceObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day90")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon_large(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon_large")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMembers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToday(value: TrendPriceObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("today")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeIcon")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

