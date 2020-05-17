package typingsSlinky.d3pie.anon

import typingsSlinky.d3pie.d3pie.ID3PieTextOptions
import typingsSlinky.d3pie.d3pieStrings.`pie-center`
import typingsSlinky.d3pie.d3pieStrings.`top-center`
import typingsSlinky.d3pie.d3pieStrings.`top-left`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Location extends js.Object {
  var location: js.UndefOr[`top-center` | `top-left` | `pie-center`] = js.native
  var subtitle: js.UndefOr[ID3PieTextOptions] = js.native
  var title: js.UndefOr[ID3PieTextOptions] = js.native
  var titleSubtitlePadding: js.UndefOr[Double] = js.native
}

object Location {
  @scala.inline
  def apply(): Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Location]
  }
  @scala.inline
  implicit class LocationOps[Self <: Location] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocation(value: `top-center` | `top-left` | `pie-center`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitle(value: ID3PieTextOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: ID3PieTextOptions): Self = {
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
    def withTitleSubtitlePadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleSubtitlePadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleSubtitlePadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleSubtitlePadding")(js.undefined)
        ret
    }
  }
  
}

