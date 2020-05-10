package typingsSlinky.reactRequest.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchProps[T] extends FetchRequestProps {
  var afterFetch: js.UndefOr[js.Function1[/* args */ FetchResponse[T], Unit]] = js.native
  var children: js.UndefOr[js.Function1[/* renderProps */ RenderProps[T], TagMod[Any]]] = js.native
  var responseType: js.UndefOr[ResponseType] = js.native
  var transformData: js.UndefOr[js.Function1[/* data */ js.Any, T]] = js.native
}

object FetchProps {
  @scala.inline
  def apply[T](url: String): FetchProps[T] = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchProps[T]]
  }
  @scala.inline
  implicit class FetchPropsOps[Self[t] <: FetchProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAfterFetch(value: /* args */ FetchResponse[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterFetch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterFetch: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterFetch")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: /* renderProps */ RenderProps[T] => TagMod[Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChildren: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseType(value: ResponseType): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseType: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformData(value: /* data */ js.Any => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransformData: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformData")(js.undefined)
        ret
    }
  }
  
}

