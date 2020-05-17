package typingsSlinky.officeJs.OfficeExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the result for methods that return primitive types. The object's value property is retrieved from the document after `context.sync()` is invoked. */
@js.native
trait ClientResult[T] extends js.Object {
  /** The value of the result that is retrieved from the document after `context.sync()` is invoked. */
  var value: T = js.native
}

object ClientResult {
  @scala.inline
  def apply[T](value: T): ClientResult[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientResult[T]]
  }
  @scala.inline
  implicit class ClientResultOps[Self[t] <: ClientResult[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withValue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

