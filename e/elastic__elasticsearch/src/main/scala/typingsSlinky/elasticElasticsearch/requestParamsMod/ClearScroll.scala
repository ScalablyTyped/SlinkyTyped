package typingsSlinky.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearScroll[T] extends Generic {
  var body: js.UndefOr[T] = js.native
  var scroll_id: js.UndefOr[String | js.Array[String]] = js.native
}

object ClearScroll {
  @scala.inline
  def apply[T](): ClearScroll[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearScroll[T]]
  }
  @scala.inline
  implicit class ClearScrollOps[Self[t] <: ClearScroll[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withBody(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withScroll_id(value: String | js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScroll_id: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll_id")(js.undefined)
        ret
    }
  }
  
}

