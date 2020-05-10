package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details about a channel bulletin post.
  */
@js.native
trait SchemaActivityContentDetailsBulletin extends js.Object {
  /**
    * The resourceId object contains information that identifies the resource
    * associated with a bulletin post.
    */
  var resourceId: js.UndefOr[SchemaResourceId] = js.native
}

object SchemaActivityContentDetailsBulletin {
  @scala.inline
  def apply(): SchemaActivityContentDetailsBulletin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActivityContentDetailsBulletin]
  }
  @scala.inline
  implicit class SchemaActivityContentDetailsBulletinOps[Self <: SchemaActivityContentDetailsBulletin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceId(value: SchemaResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(js.undefined)
        ret
    }
  }
  
}

