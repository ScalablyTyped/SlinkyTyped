package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateShapeRequest extends js.Object {
  var elementProperties: js.UndefOr[PageElementProperties] = js.native
  var objectId: js.UndefOr[String] = js.native
  var shapeType: js.UndefOr[String] = js.native
}

object CreateShapeRequest {
  @scala.inline
  def apply(): CreateShapeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateShapeRequest]
  }
  @scala.inline
  implicit class CreateShapeRequestOps[Self <: CreateShapeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElementProperties(value: PageElementProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementProperties")(js.undefined)
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
    def withShapeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShapeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeType")(js.undefined)
        ret
    }
  }
  
}

