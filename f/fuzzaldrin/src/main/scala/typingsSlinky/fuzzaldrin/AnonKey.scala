package typingsSlinky.fuzzaldrin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonKey[K /* <: /* keyof T */ String */, T] extends js.Object {
  var key: K = js.native
  var maxResults: js.UndefOr[Double] = js.native
}

object AnonKey {
  @scala.inline
  def apply[K, T](key: K): AnonKey[K, T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKey[K, T]]
  }
  @scala.inline
  implicit class AnonKeyOps[Self[k, t] <: AnonKey[k, t], K, T] (val x: Self[K, T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, T]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, T]) with Other]
    @scala.inline
    def withKey(value: K): Self[K, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxResults(value: Double): Self[K, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self[K, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(js.undefined)
        ret
    }
  }
  
}

