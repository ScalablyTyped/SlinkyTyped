package typingsSlinky.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fetch[T] extends js.Object {
  var fetch: js.UndefOr[js.Array[String]] = js.native
  var insert: js.UndefOr[js.Function2[/* userId */ String, /* doc */ T, Boolean]] = js.native
  var remove: js.UndefOr[js.Function2[/* userId */ String, /* doc */ T, Boolean]] = js.native
  var transform: js.UndefOr[js.Function | Null] = js.native
  var update: js.UndefOr[
    js.Function4[
      /* userId */ String, 
      /* doc */ T, 
      /* fieldNames */ js.Array[String], 
      /* modifier */ js.Any, 
      Boolean
    ]
  ] = js.native
}

object Fetch {
  @scala.inline
  def apply[T](): Fetch[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fetch[T]]
  }
  @scala.inline
  implicit class FetchOps[Self[t] <: Fetch[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withFetch(value: js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetch: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(js.undefined)
        ret
    }
    @scala.inline
    def withInsert(value: (/* userId */ String, /* doc */ T) => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutInsert: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: (/* userId */ String, /* doc */ T) => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRemove: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: js.Function): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransform: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(null)
        ret
    }
    @scala.inline
    def withUpdate(
      value: (/* userId */ String, /* doc */ T, /* fieldNames */ js.Array[String], /* modifier */ js.Any) => Boolean
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutUpdate: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
  }
  
}

