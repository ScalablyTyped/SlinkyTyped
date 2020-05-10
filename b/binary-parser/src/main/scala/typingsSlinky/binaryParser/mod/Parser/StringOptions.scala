package typingsSlinky.binaryParser.mod.Parser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringOptions extends Options {
  var encoding: js.UndefOr[String] = js.native
  var greedy: js.UndefOr[Boolean] = js.native
  var length: js.UndefOr[
    Double | String | (js.ThisFunction0[/* this */ typingsSlinky.binaryParser.mod.Parser[_], Double])
  ] = js.native
  var stripNull: js.UndefOr[Boolean] = js.native
  var zeroTerminated: js.UndefOr[Boolean] = js.native
}

object StringOptions {
  @scala.inline
  def apply(): StringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringOptions]
  }
  @scala.inline
  implicit class StringOptionsOps[Self <: StringOptions] (val x: Self) extends AnyVal {
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
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withGreedy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greedy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreedy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greedy")(js.undefined)
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
    def withStripNull(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripNull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripNull")(js.undefined)
        ret
    }
    @scala.inline
    def withZeroTerminated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zeroTerminated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZeroTerminated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zeroTerminated")(js.undefined)
        ret
    }
  }
  
}

