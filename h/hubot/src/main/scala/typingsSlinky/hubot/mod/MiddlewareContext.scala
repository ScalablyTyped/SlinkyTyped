package typingsSlinky.hubot.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MiddlewareContext[T /* <: Adapter */]
  extends /* key */ StringDictionary[js.Any] {
  var response: js.UndefOr[Response[T, Message]] = js.native
}

object MiddlewareContext {
  @scala.inline
  def apply[T](): MiddlewareContext[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MiddlewareContext[T]]
  }
  @scala.inline
  implicit class MiddlewareContextOps[Self[t] <: MiddlewareContext[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withResponse(value: Response[T, Message]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponse: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(js.undefined)
        ret
    }
  }
  
}

