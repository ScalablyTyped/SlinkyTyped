package typingsSlinky.instagramDashPrivateDashApi.distTypesMediaDotLikeDotOptionsMod

import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiNumbers.`0`
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiNumbers.`1`
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.like
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.unlike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined instagram-private-api.instagram-private-api/dist/types/media.like.options.LikeOrUnlikeBaseOptions & {  action  :'like' | 'unlike',   d ? :1 | 0} */
trait MediaLikeOrUnlikeOptions extends js.Object {
  var action: like | unlike
  var d: js.UndefOr[`1` | `0`] = js.undefined
  var mediaId: String
  var moduleInfo: LikeModuleInfoOption
}

object MediaLikeOrUnlikeOptions {
  @scala.inline
  def apply(action: like | unlike, mediaId: String, moduleInfo: LikeModuleInfoOption, d: `1` | `0` = null): MediaLikeOrUnlikeOptions = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], mediaId = mediaId.asInstanceOf[js.Any], moduleInfo = moduleInfo.asInstanceOf[js.Any])
    if (d != null) __obj.updateDynamic("d")(d.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaLikeOrUnlikeOptions]
  }
}

