package typingsSlinky.gapiClientPubsub.gapi.client.pubsub

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientPubsub.AnonAccesstoken
import typingsSlinky.gapiClientPubsub.AnonBearertoken
import typingsSlinky.gapiClientPubsub.AnonCallback
import typingsSlinky.gapiClientPubsub.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicsResource extends js.Object {
  var subscriptions: SubscriptionsResource = js.native
  /** Creates the given topic with the given name. */
  def create(request: AnonBearertoken): Request_[Topic] = js.native
  /**
    * Deletes the topic with the given name. Returns `NOT_FOUND` if the topic
    * does not exist. After a topic is deleted, a new topic may be created with
    * the same name; this is an entirely new topic with none of the old
    * configuration or subscriptions. Existing subscriptions to this topic are
    * not deleted, but their `topic` field is set to `_deleted-topic_`.
    */
  def delete(request: AnonKey): Request_[js.Object] = js.native
  /** Gets the configuration of a topic. */
  def get(request: AnonKey): Request_[Topic] = js.native
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: AnonAccesstoken): Request_[Policy] = js.native
  /** Lists matching topics. */
  def list(request: AnonCallback): Request_[ListTopicsResponse] = js.native
  /**
    * Adds one or more messages to the topic. Returns `NOT_FOUND` if the topic
    * does not exist. The message payload must not be empty; it must contain
    * either a non-empty data field, or at least one attribute.
    */
  def publish(request: AnonKey): Request_[PublishResponse] = js.native
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: AnonAccesstoken): Request_[Policy] = js.native
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    *
    * Note: This operation is designed to be used for building permission-aware
    * UIs and command-line tools, not for authorization checking. This operation
    * may "fail open" without warning.
    */
  def testIamPermissions(request: AnonAccesstoken): Request_[TestIamPermissionsResponse] = js.native
}

object TopicsResource {
  @scala.inline
  def apply(
    create: AnonBearertoken => Request_[Topic],
    delete: AnonKey => Request_[js.Object],
    get: AnonKey => Request_[Topic],
    getIamPolicy: AnonAccesstoken => Request_[Policy],
    list: AnonCallback => Request_[ListTopicsResponse],
    publish: AnonKey => Request_[PublishResponse],
    setIamPolicy: AnonAccesstoken => Request_[Policy],
    subscriptions: SubscriptionsResource,
    testIamPermissions: AnonAccesstoken => Request_[TestIamPermissionsResponse]
  ): TopicsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), publish = js.Any.fromFunction1(publish), setIamPolicy = js.Any.fromFunction1(setIamPolicy), subscriptions = subscriptions.asInstanceOf[js.Any], testIamPermissions = js.Any.fromFunction1(testIamPermissions))
    __obj.asInstanceOf[TopicsResource]
  }
  @scala.inline
  implicit class TopicsResourceOps[Self <: TopicsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonBearertoken => Request_[Topic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonKey => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonKey => Request_[Topic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetIamPolicy(value: AnonAccesstoken => Request_[Policy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIamPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonCallback => Request_[ListTopicsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPublish(value: AnonKey => Request_[PublishResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publish")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIamPolicy(value: AnonAccesstoken => Request_[Policy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIamPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSubscriptions(value: SubscriptionsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestIamPermissions(value: AnonAccesstoken => Request_[TestIamPermissionsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testIamPermissions")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

