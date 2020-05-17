package typingsSlinky.blessed.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bools extends js.Object {
  var bools: js.Any = js.native
  var desc: String = js.native
  var header: DataSize = js.native
  var name: String = js.native
  var names: js.Array[String] = js.native
  var numbers: js.Any = js.native
  var strings: js.Any = js.native
}

object Bools {
  @scala.inline
  def apply(
    bools: js.Any,
    desc: String,
    header: DataSize,
    name: String,
    names: js.Array[String],
    numbers: js.Any,
    strings: js.Any
  ): Bools = {
    val __obj = js.Dynamic.literal(bools = bools.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], numbers = numbers.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bools]
  }
  @scala.inline
  implicit class BoolsOps[Self <: Bools] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBools(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeader(value: DataSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumbers(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrings(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

