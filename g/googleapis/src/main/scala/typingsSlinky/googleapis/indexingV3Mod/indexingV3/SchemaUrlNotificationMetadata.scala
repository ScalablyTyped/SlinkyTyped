package typingsSlinky.googleapis.indexingV3Mod.indexingV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Summary of the most recent Indexing API notifications successfully
  * received, for a given URL.
  */
@js.native
trait SchemaUrlNotificationMetadata extends js.Object {
  /**
    * Latest notification received with type `URL_REMOVED`.
    */
  var latestRemove: js.UndefOr[SchemaUrlNotification] = js.native
  /**
    * Latest notification received with type `URL_UPDATED`.
    */
  var latestUpdate: js.UndefOr[SchemaUrlNotification] = js.native
  /**
    * URL to which this metadata refers.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaUrlNotificationMetadata {
  @scala.inline
  def apply(): SchemaUrlNotificationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlNotificationMetadata]
  }
  @scala.inline
  implicit class SchemaUrlNotificationMetadataOps[Self <: SchemaUrlNotificationMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLatestRemove(value: SchemaUrlNotification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestRemove")(js.undefined)
        ret
    }
    @scala.inline
    def withLatestUpdate(value: SchemaUrlNotification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

