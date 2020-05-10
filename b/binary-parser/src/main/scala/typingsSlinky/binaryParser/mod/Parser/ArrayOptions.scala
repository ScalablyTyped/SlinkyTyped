package typingsSlinky.binaryParser.mod.Parser

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayOptions extends Options {
  var length: js.UndefOr[
    Double | String | (js.ThisFunction0[/* this */ typingsSlinky.binaryParser.mod.Parser[_], Double])
  ] = js.native
  var lengthInBytes: js.UndefOr[
    Double | String | (js.ThisFunction0[/* this */ typingsSlinky.binaryParser.mod.Parser[_], Double])
  ] = js.native
  var readUntil: js.UndefOr[String | (js.Function2[/* item */ Double, /* buffer */ Buffer, Boolean])] = js.native
  var `type`: String | typingsSlinky.binaryParser.mod.Parser[_] = js.native
}

object ArrayOptions {
  @scala.inline
  def apply(`type`: String | typingsSlinky.binaryParser.mod.Parser[_]): ArrayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayOptions]
  }
  @scala.inline
  implicit class ArrayOptionsOps[Self <: ArrayOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: String | typingsSlinky.binaryParser.mod.Parser[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(
      value: Double | String | (js.ThisFunction0[/* this */ typingsSlinky.binaryParser.mod.Parser[_], Double])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withLengthInBytes(
      value: Double | String | (js.ThisFunction0[/* this */ typingsSlinky.binaryParser.mod.Parser[_], Double])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lengthInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLengthInBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lengthInBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withReadUntilFunction2(value: (/* item */ Double, /* buffer */ Buffer) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readUntil")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withReadUntil(value: String | (js.Function2[/* item */ Double, /* buffer */ Buffer, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readUntil")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadUntil: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readUntil")(js.undefined)
        ret
    }
  }
  
}

