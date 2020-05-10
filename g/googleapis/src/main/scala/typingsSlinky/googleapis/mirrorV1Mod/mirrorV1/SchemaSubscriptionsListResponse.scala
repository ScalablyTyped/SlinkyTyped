package typingsSlinky.googleapis.mirrorV1Mod.mirrorV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of Subscriptions. This is the response from the server to GET
  * requests on the subscription collection.
  */
@js.native
trait SchemaSubscriptionsListResponse extends js.Object {
  /**
    * The list of subscriptions.
    */
  var items: js.UndefOr[js.Array[SchemaSubscription]] = js.native
  /**
    * The type of resource. This is always mirror#subscriptionsList.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaSubscriptionsListResponse {
  @scala.inline
  def apply(): SchemaSubscriptionsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubscriptionsListResponse]
  }
  @scala.inline
  implicit class SchemaSubscriptionsListResponseOps[Self <: SchemaSubscriptionsListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[SchemaSubscription]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
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

