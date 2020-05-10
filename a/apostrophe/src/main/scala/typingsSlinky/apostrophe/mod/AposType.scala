package typingsSlinky.apostrophe.mod

import typingsSlinky.apostrophe.AnonForm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AposType extends js.Object {
  var bless: js.UndefOr[js.Function2[/* req */ js.Any, /* field */ js.Any, Unit]] = js.native
  var converters: AnonForm = js.native
  var empty: js.UndefOr[js.Function2[/* field */ js.Any, /* value */ js.Any, Unit]] = js.native
  var name: String = js.native
  def index(value: js.Any, field: js.Any, texts: js.Any): Unit = js.native
}

object AposType {
  @scala.inline
  def apply(converters: AnonForm, index: (js.Any, js.Any, js.Any) => Unit, name: String): AposType = {
    val __obj = js.Dynamic.literal(converters = converters.asInstanceOf[js.Any], index = js.Any.fromFunction3(index), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AposType]
  }
  @scala.inline
  implicit class AposTypeOps[Self <: AposType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConverters(value: AnonForm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("converters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: (js.Any, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBless(value: (/* req */ js.Any, /* field */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bless")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBless: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bless")(js.undefined)
        ret
    }
    @scala.inline
    def withEmpty(value: (/* field */ js.Any, /* value */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(js.undefined)
        ret
    }
  }
  
}

