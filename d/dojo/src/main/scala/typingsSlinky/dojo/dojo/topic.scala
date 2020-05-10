package typingsSlinky.dojo.dojo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/topic.html
  *
  * Pubsub hub.
  *
  */
@js.native
trait topic extends js.Object {
  /**
    * Publishes a message to a topic on the pub/sub hub. All arguments after
    * the first will be passed to the subscribers, so any number of arguments
    * can be provided (not just event).
    *
    * @param topic The name of the topic to publish to
    * @param event An event to distribute to the topic listeners
    */
  def publish(topic: String, event: js.Object): js.Any = js.native
  /**
    * Subscribes to a topic on the pub/sub hub
    *
    * @param topic The topic to subscribe to
    * @param listener A function to call when a message is published to the given topic
    */
  def subscribe(topic: String, listener: js.Function): js.Any = js.native
}

object topic {
  @scala.inline
  def apply(publish: (String, js.Object) => js.Any, subscribe: (String, js.Function) => js.Any): topic = {
    val __obj = js.Dynamic.literal(publish = js.Any.fromFunction2(publish), subscribe = js.Any.fromFunction2(subscribe))
    __obj.asInstanceOf[topic]
  }
  @scala.inline
  implicit class topicOps[Self <: topic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPublish(value: (String, js.Object) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publish")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSubscribe(value: (String, js.Function) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

