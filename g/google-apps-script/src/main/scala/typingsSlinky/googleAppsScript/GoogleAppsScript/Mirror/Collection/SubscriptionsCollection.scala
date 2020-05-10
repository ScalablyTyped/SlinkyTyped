package typingsSlinky.googleAppsScript.GoogleAppsScript.Mirror.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.Mirror.Schema.Subscription
import typingsSlinky.googleAppsScript.GoogleAppsScript.Mirror.Schema.SubscriptionsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionsCollection extends js.Object {
  // Creates a new subscription.
  def insert(resource: Subscription): Subscription = js.native
  // Retrieves a list of subscriptions for the authenticated user and service.
  def list(): SubscriptionsListResponse = js.native
  // Deletes a subscription.
  def remove(id: String): Unit = js.native
  // Updates an existing subscription in place.
  def update(resource: Subscription, id: String): Subscription = js.native
}

object SubscriptionsCollection {
  @scala.inline
  def apply(
    insert: Subscription => Subscription,
    list: () => SubscriptionsListResponse,
    remove: String => Unit,
    update: (Subscription, String) => Subscription
  ): SubscriptionsCollection = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction0(list), remove = js.Any.fromFunction1(remove), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[SubscriptionsCollection]
  }
  @scala.inline
  implicit class SubscriptionsCollectionOps[Self <: SubscriptionsCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsert(value: Subscription => Subscription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: () => SubscriptionsListResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemove(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: (Subscription, String) => Subscription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

