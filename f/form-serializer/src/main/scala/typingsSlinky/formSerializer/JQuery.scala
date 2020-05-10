package typingsSlinky.formSerializer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
    * Serializes the selected form into JSON.
    */
  def serializeJSON(): String = js.native
  /**
    * Serializes the selected form into a JavaScript object.
    */
  def serializeObject(): js.Object = js.native
}

object JQuery {
  @scala.inline
  def apply(serializeJSON: () => String, serializeObject: () => js.Object): JQuery = {
    val __obj = js.Dynamic.literal(serializeJSON = js.Any.fromFunction0(serializeJSON), serializeObject = js.Any.fromFunction0(serializeObject))
    __obj.asInstanceOf[JQuery]
  }
  @scala.inline
  implicit class JQueryOps[Self <: JQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSerializeJSON(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializeJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSerializeObject(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializeObject")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

