package typingsSlinky.gapiClient.anon

import typingsSlinky.gapiClient.gapi.client.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Callback[T] extends js.Object {
  /**
    * Identifies the response for this request in the map of batch responses. If one is not provided, the system generates a random ID.
    */
  var id: String = js.native
  def callback(
    /**
    * is the response for this request only. Its format is defined by the API method being called.
    */
  individualResponse: Response[T],
    /**
    * is the raw batch ID-response map as a string. It contains all responses to all requests in the batch.
    */
  rawBatchResponse: String
  ): js.Any = js.native
}

object Callback {
  @scala.inline
  def apply[T](callback: (Response[T], String) => js.Any, id: String): Callback[T] = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Callback[T]]
  }
  @scala.inline
  implicit class CallbackOps[Self[t] <: Callback[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCallback(value: (Response[T], String) => js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withId(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

