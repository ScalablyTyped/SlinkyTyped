package typingsSlinky.firefox

import typingsSlinky.std.DOMError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMRequest[T] extends js.Object {
  var error: DOMError = js.native
  var onerror: js.Function = js.native
  var onsuccess: js.Function = js.native
  var readyState: String = js.native
   // "done" or "pending"
  var result: T = js.native
}

object DOMRequest {
  @scala.inline
  def apply[T](error: DOMError, onerror: js.Function, onsuccess: js.Function, readyState: String, result: T): DOMRequest[T] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], onerror = onerror.asInstanceOf[js.Any], onsuccess = onsuccess.asInstanceOf[js.Any], readyState = readyState.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMRequest[T]]
  }
  @scala.inline
  implicit class DOMRequestOps[Self[t] <: DOMRequest[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withError(value: DOMError): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnerror(value: js.Function): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnsuccess(value: js.Function): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsuccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadyState(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readyState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

