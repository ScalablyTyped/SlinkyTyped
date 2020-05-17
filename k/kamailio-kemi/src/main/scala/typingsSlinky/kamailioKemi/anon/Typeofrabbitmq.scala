package typingsSlinky.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofrabbitmq extends js.Object {
  def publish(exchange: String, routingkey: String, contenttype: String, messagebody: String): Double = js.native
  def publish_consume(exchange: String, routingkey: String, contenttype: String, messagebody: String, dpv: String): Double = js.native
}

object Typeofrabbitmq {
  @scala.inline
  def apply(
    publish: (String, String, String, String) => Double,
    publish_consume: (String, String, String, String, String) => Double
  ): Typeofrabbitmq = {
    val __obj = js.Dynamic.literal(publish = js.Any.fromFunction4(publish), publish_consume = js.Any.fromFunction5(publish_consume))
    __obj.asInstanceOf[Typeofrabbitmq]
  }
  @scala.inline
  implicit class TypeofrabbitmqOps[Self <: Typeofrabbitmq] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPublish(value: (String, String, String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publish")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withPublish_consume(value: (String, String, String, String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publish_consume")(js.Any.fromFunction5(value))
        ret
    }
  }
  
}

