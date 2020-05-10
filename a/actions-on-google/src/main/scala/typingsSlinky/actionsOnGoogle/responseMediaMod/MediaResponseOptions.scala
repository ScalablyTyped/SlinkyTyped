package typingsSlinky.actionsOnGoogle.responseMediaMod

import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2MediaResponseMediaType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaResponseOptions extends js.Object {
  /**
    * Array of MediaObject held in the MediaResponse.
    * @public
    */
  var objects: js.Array[MediaObjectString] = js.native
  /**
    * Type of the media within this MediaResponse.
    * Defaults to 'AUDIO'
    * @public
    */
  var `type`: js.UndefOr[GoogleActionsV2MediaResponseMediaType] = js.native
}

object MediaResponseOptions {
  @scala.inline
  def apply(objects: js.Array[MediaObjectString]): MediaResponseOptions = {
    val __obj = js.Dynamic.literal(objects = objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaResponseOptions]
  }
  @scala.inline
  implicit class MediaResponseOptionsOps[Self <: MediaResponseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObjects(value: js.Array[MediaObjectString]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: GoogleActionsV2MediaResponseMediaType): Self = {
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

