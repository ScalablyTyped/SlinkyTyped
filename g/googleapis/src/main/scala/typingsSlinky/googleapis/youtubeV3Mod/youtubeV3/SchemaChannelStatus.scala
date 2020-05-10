package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for the status part of a channel.
  */
@js.native
trait SchemaChannelStatus extends js.Object {
  /**
    * If true, then the user is linked to either a YouTube username or G+
    * account. Otherwise, the user doesn&#39;t have a public YouTube identity.
    */
  var isLinked: js.UndefOr[Boolean] = js.native
  /**
    * The long uploads status of this channel. See
    */
  var longUploadsStatus: js.UndefOr[String] = js.native
  /**
    * Privacy status of the channel.
    */
  var privacyStatus: js.UndefOr[String] = js.native
}

object SchemaChannelStatus {
  @scala.inline
  def apply(): SchemaChannelStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelStatus]
  }
  @scala.inline
  implicit class SchemaChannelStatusOps[Self <: SchemaChannelStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsLinked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLinked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLinked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLinked")(js.undefined)
        ret
    }
    @scala.inline
    def withLongUploadsStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longUploadsStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongUploadsStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longUploadsStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivacyStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacyStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivacyStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacyStatus")(js.undefined)
        ret
    }
  }
  
}

