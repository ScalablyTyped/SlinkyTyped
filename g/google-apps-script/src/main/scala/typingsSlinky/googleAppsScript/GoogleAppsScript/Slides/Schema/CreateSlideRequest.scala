package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSlideRequest extends js.Object {
  var insertionIndex: js.UndefOr[Double] = js.native
  var objectId: js.UndefOr[String] = js.native
  var placeholderIdMappings: js.UndefOr[js.Array[LayoutPlaceholderIdMapping]] = js.native
  var slideLayoutReference: js.UndefOr[LayoutReference] = js.native
}

object CreateSlideRequest {
  @scala.inline
  def apply(): CreateSlideRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSlideRequest]
  }
  @scala.inline
  implicit class CreateSlideRequestOps[Self <: CreateSlideRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsertionIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertionIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertionIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertionIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholderIdMappings(value: js.Array[LayoutPlaceholderIdMapping]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderIdMappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholderIdMappings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderIdMappings")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideLayoutReference(value: LayoutReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideLayoutReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideLayoutReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideLayoutReference")(js.undefined)
        ret
    }
  }
  
}

