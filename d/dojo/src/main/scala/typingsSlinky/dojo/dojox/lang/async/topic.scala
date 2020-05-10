package typingsSlinky.dojo.dojox.lang.async

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/lang/async/topic.html
  *
  *
  */
@js.native
trait topic extends js.Object {
  /**
    *
    * @param topic
    */
  def failOn(topic: js.Any): Unit = js.native
  /**
    *
    * @param topic
    */
  def from(topic: js.Any): Unit = js.native
}

object topic {
  @scala.inline
  def apply(failOn: js.Any => Unit, from: js.Any => Unit): topic = {
    val __obj = js.Dynamic.literal(failOn = js.Any.fromFunction1(failOn), from = js.Any.fromFunction1(from))
    __obj.asInstanceOf[topic]
  }
  @scala.inline
  implicit class topicOps[Self <: topic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailOn(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFrom(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

