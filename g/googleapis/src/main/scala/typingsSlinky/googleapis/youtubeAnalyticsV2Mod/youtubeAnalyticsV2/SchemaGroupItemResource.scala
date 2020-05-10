package typingsSlinky.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGroupItemResource extends js.Object {
  /**
    * The channel, video, playlist, or asset ID that YouTube uses to uniquely
    * identify the item that is being added to the group.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies the type of resource being added to the group.  Valid values
    * for this property are:  * `youtube#channel`  * `youtube#playlist`  *
    * `youtube#video`  * `youtubePartner#asset`
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaGroupItemResource {
  @scala.inline
  def apply(): SchemaGroupItemResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupItemResource]
  }
  @scala.inline
  implicit class SchemaGroupItemResourceOps[Self <: SchemaGroupItemResource] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

