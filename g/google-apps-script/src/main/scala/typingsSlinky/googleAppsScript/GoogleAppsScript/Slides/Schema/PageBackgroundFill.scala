package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageBackgroundFill extends js.Object {
  var propertyState: js.UndefOr[String] = js.native
  var solidFill: js.UndefOr[SolidFill] = js.native
  var stretchedPictureFill: js.UndefOr[StretchedPictureFill] = js.native
}

object PageBackgroundFill {
  @scala.inline
  def apply(): PageBackgroundFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageBackgroundFill]
  }
  @scala.inline
  implicit class PageBackgroundFillOps[Self <: PageBackgroundFill] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPropertyState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropertyState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyState")(js.undefined)
        ret
    }
    @scala.inline
    def withSolidFill(value: SolidFill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solidFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSolidFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solidFill")(js.undefined)
        ret
    }
    @scala.inline
    def withStretchedPictureFill(value: StretchedPictureFill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretchedPictureFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStretchedPictureFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretchedPictureFill")(js.undefined)
        ret
    }
  }
  
}

