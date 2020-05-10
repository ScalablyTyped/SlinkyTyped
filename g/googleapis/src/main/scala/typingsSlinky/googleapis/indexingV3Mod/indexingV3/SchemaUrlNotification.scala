package typingsSlinky.googleapis.indexingV3Mod.indexingV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `UrlNotification` is the resource used in all Indexing API calls. It
  * describes one event in the life cycle of a Web Document.
  */
@js.native
trait SchemaUrlNotification extends js.Object {
  /**
    * Creation timestamp for this notification. Users should _not_ specify it,
    * the field is ignored at the request time.
    */
  var notifyTime: js.UndefOr[String] = js.native
  /**
    * The URL life cycle event that Google is being notified about.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The object of this notification. The URL must be owned by the publisher
    * of this notification and, in case of `URL_UPDATED` notifications, it
    * _must_ be crawlable by Google.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaUrlNotification {
  @scala.inline
  def apply(): SchemaUrlNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlNotification]
  }
  @scala.inline
  implicit class SchemaUrlNotificationOps[Self <: SchemaUrlNotification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotifyTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotifyTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyTime")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
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

