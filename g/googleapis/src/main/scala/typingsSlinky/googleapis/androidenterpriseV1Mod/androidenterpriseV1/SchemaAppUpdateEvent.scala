package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event generated when a new version of an app is uploaded to Google Play.
  * Notifications are sent for new public versions only: alpha, beta, or canary
  * versions do not generate this event. To fetch up-to-date version history
  * for an app, use Products.Get on the EMM API.
  */
@js.native
trait SchemaAppUpdateEvent extends js.Object {
  /**
    * The id of the product (e.g. &quot;app:com.google.android.gm&quot;) that
    * was updated. This field will always be present.
    */
  var productId: js.UndefOr[String] = js.native
}

object SchemaAppUpdateEvent {
  @scala.inline
  def apply(): SchemaAppUpdateEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppUpdateEvent]
  }
  @scala.inline
  implicit class SchemaAppUpdateEventOps[Self <: SchemaAppUpdateEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProductId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(js.undefined)
        ret
    }
  }
  
}

