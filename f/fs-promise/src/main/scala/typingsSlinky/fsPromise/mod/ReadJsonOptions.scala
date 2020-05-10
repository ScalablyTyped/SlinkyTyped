package typingsSlinky.fsPromise.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadJsonOptions extends js.Object {
  var encoding: String = js.native
  var flag: js.UndefOr[String] = js.native
  def reviver(key: js.Any, value: js.Any): js.Any = js.native
}

object ReadJsonOptions {
  @scala.inline
  def apply(encoding: String, reviver: (js.Any, js.Any) => js.Any): ReadJsonOptions = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], reviver = js.Any.fromFunction2(reviver))
    __obj.asInstanceOf[ReadJsonOptions]
  }
  @scala.inline
  implicit class ReadJsonOptionsOps[Self <: ReadJsonOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReviver(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviver")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFlag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flag")(js.undefined)
        ret
    }
  }
  
}

