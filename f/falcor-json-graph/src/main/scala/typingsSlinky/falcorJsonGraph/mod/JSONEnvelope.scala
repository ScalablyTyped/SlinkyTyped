package typingsSlinky.falcorJsonGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An envelope that wraps a JSON object.
  **/
@js.native
trait JSONEnvelope[T] extends js.Object {
  var json: T = js.native
}

object JSONEnvelope {
  @scala.inline
  def apply[T](json: T): JSONEnvelope[T] = {
    val __obj = js.Dynamic.literal(json = json.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONEnvelope[T]]
  }
  @scala.inline
  implicit class JSONEnvelopeOps[Self[t] <: JSONEnvelope[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withJson(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

