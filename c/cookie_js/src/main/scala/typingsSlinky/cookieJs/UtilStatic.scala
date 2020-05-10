package typingsSlinky.cookieJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UtilStatic extends js.Object {
  def decode(value: String): String = js.native
  def encode(value: String): String = js.native
  def getKeys(value: js.Object): js.Array[_] = js.native
  def isArray(value: js.Any): Boolean = js.native
  def isObject(value: js.Any): Boolean = js.native
  def retrieve(x: String, y: String): String = js.native
  def toArray(args: js.Any*): js.Array[_] = js.native
}

object UtilStatic {
  @scala.inline
  def apply(
    decode: String => String,
    encode: String => String,
    getKeys: js.Object => js.Array[_],
    isArray: js.Any => Boolean,
    isObject: js.Any => Boolean,
    retrieve: (String, String) => String,
    toArray: /* repeated */ js.Any => js.Array[_]
  ): UtilStatic = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), getKeys = js.Any.fromFunction1(getKeys), isArray = js.Any.fromFunction1(isArray), isObject = js.Any.fromFunction1(isObject), retrieve = js.Any.fromFunction2(retrieve), toArray = js.Any.fromFunction1(toArray))
    __obj.asInstanceOf[UtilStatic]
  }
  @scala.inline
  implicit class UtilStaticOps[Self <: UtilStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecode(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEncode(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetKeys(value: js.Object => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKeys")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsArray(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isArray")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsObject(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isObject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRetrieve(value: (String, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retrieve")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withToArray(value: /* repeated */ js.Any => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toArray")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

