package typingsSlinky.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identifier for a Photo.
  */
@js.native
trait SchemaPhotoId extends js.Object {
  /**
    * Required. A unique identifier for a photo.
    */
  var id: js.UndefOr[String] = js.native
}

object SchemaPhotoId {
  @scala.inline
  def apply(): SchemaPhotoId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPhotoId]
  }
  @scala.inline
  implicit class SchemaPhotoIdOps[Self <: SchemaPhotoId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
  }
  
}

