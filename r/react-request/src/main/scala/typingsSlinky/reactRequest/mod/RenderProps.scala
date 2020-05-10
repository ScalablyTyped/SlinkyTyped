package typingsSlinky.reactRequest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderProps[T] extends FetchResponse[T] {
  var doFetch: DoFetch[T] = js.native
  var fetching: Boolean = js.native
  var requestName: String = js.native
}

object RenderProps {
  @scala.inline
  def apply[T](
    didUnmount: Boolean,
    doFetch: /* options */ js.UndefOr[DoFetchOptions] => js.Promise[FetchResponse[T]],
    failed: Boolean,
    fetching: Boolean,
    init: js.Any,
    requestKey: String,
    requestName: String,
    url: String
  ): RenderProps[T] = {
    val __obj = js.Dynamic.literal(didUnmount = didUnmount.asInstanceOf[js.Any], doFetch = js.Any.fromFunction1(doFetch), failed = failed.asInstanceOf[js.Any], fetching = fetching.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], requestKey = requestKey.asInstanceOf[js.Any], requestName = requestName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderProps[T]]
  }
  @scala.inline
  implicit class RenderPropsOps[Self[t] <: RenderProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDoFetch(value: /* options */ js.UndefOr[DoFetchOptions] => js.Promise[FetchResponse[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doFetch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFetching(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

