package typingsSlinky.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageBackgroundFill extends js.Object {
  /**
    * The background fill property state.
    *
    * Updating the fill on a page will implicitly update this field to
    * `RENDERED`, unless another value is specified in the same request. To
    * have no fill on a page, set this field to `NOT_RENDERED`. In this case,
    * any other fill fields set in the same request will be ignored.
    */
  var propertyState: js.UndefOr[String] = js.native
  /** Solid color fill. */
  var solidFill: js.UndefOr[SolidFill] = js.native
  /** Stretched picture fill. */
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

