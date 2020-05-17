package typingsSlinky.androiduix.android.os

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bundle extends js.Object {
  def containsKey(key: String): Boolean = js.native
  def get(key: String, defaultValue: js.Any): js.Any = js.native
  def put(key: String, value: js.Any): Unit = js.native
}

object Bundle {
  @scala.inline
  def apply(containsKey: String => Boolean, get: (String, js.Any) => js.Any, put: (String, js.Any) => Unit): Bundle = {
    val __obj = js.Dynamic.literal(containsKey = js.Any.fromFunction1(containsKey), get = js.Any.fromFunction2(get), put = js.Any.fromFunction2(put))
    __obj.asInstanceOf[Bundle]
  }
  @scala.inline
  implicit class BundleOps[Self <: Bundle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainsKey(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: (String, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPut(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("put")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

